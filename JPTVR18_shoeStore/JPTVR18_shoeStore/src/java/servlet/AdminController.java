/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entity.OrderProduct;
import entity.Product;
import entity.admin.User;
import facade.OrderProductFacade;
import facade.ProductFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yanikarp
 */
@WebServlet(name = "AdminController", urlPatterns = {
    "/admin/home",
    "/admin/deleteProduct",
    "/admin/createTreatment",
    "/admin/create",
    "/admin/orders",
    "/admin/deleteOrder",
    
   
})
public class AdminController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @EJB
    ProductFacade productFacade = new ProductFacade();
    
    @EJB
    OrderProductFacade orderProductFacade = new OrderProductFacade();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);
        if(session == null){
            response.sendRedirect(request.getContextPath() + "/admin/login");
            return;
        }
        User user = (User) session.getAttribute("user");
        if(user == null){
             response.sendRedirect(request.getContextPath() + "/admin/login");
            return;
        }
        String path = request.getServletPath();
        switch(path){
            case "/admin/home":
                String delete = request.getParameter("delete");
                if(delete != null){
                    if(delete.equals("success")){
                        request.setAttribute("delete", true);
                    }else if(delete.equals("error")){
                        request.setAttribute("delete", false);
                    }else{
                        request.setAttribute("delete", null);
                    }
                }
                
                String create = request.getParameter("create");
                if(create != null){
                    if(create.equals("success")){
                        request.setAttribute("create", true);
                    }else if(create.equals("error")){
                        request.setAttribute("create", false);
                    }else{
                        request.setAttribute("create", null);
                    }
                }
                
                //Get products
                List<Product> products = this.productFacade.getAllProducts();
                request.setAttribute("products", products);
                request.getRequestDispatcher("/admin/index.jsp").forward(request, response);
                break;
            case "/admin/deleteProduct":
                String id = request.getParameter("id");
                Product p = this.productFacade.find(new Long(id));
                this.productFacade.remove(p);
                response.sendRedirect(request.getContextPath() + "/admin/home?delete=success");
                break;
            case "/admin/create":
                request.getRequestDispatcher("/admin/create.jsp").forward(request, response);
                break;
            case "/admin/createTreatment":
                String title = request.getParameter("title");
                String text = request.getParameter("text");
                String category = request.getParameter("category");
                String price = request.getParameter("price");
                String img = request.getParameter("img");
                String align = request.getParameter("align");
                
                p = new Product(title,category,text,img, new Integer(price), align);
                this.productFacade.create(p);
                response.sendRedirect(request.getContextPath() + "/admin/home?create=success");
                break;

            case "/admin/orders":
                delete = request.getParameter("delete");
                if(delete != null){
                    if(delete.equals("success")){
                        request.setAttribute("delete", true);
                    }else if(delete.equals("error")){
                        request.setAttribute("delete", false);
                    }else{
                        request.setAttribute("delete", null);
                    }
                }

                List <OrderProduct> orders = this.orderProductFacade.getAllProductFacade();                
                request.setAttribute("orders", orders);
                request.getRequestDispatcher("/admin/orders.jsp").forward(request, response);
                break;
            case "/admin/deleteOrder":
                id = request.getParameter("id");
                OrderProduct op = this.orderProductFacade.find(new Long(id));
                this.orderProductFacade.remove(op);
                response.sendRedirect(request.getContextPath() + "/admin/orders?delete=success");
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
