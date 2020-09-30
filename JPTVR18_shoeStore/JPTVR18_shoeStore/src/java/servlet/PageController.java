/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entity.Club;
import entity.Message;
import entity.OrderProduct;
import entity.Product;
import facade.ClubFacade;
import facade.MessageFacade;
import facade.OrderProductFacade;
import facade.OrderProductFacade;
import facade.ProductFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yanikarp
 */
@WebServlet(name = "PageController", urlPatterns = {
    "/home",
    "/about",
    "/shoes",
    "/contact",
    "/sendMessage",
    "/detail",
    "/order",
    "/orderProduct",
    "/join",
    "/sendJoin",
})
public class PageController extends HttpServlet {

    @EJB
    ProductFacade productFacade = new ProductFacade();
    
    @EJB
    MessageFacade messageFacade = new MessageFacade();
    
    @EJB
    OrderProductFacade orderProductFacade = new OrderProductFacade();
    
    @EJB
    ClubFacade clubFacade = new ClubFacade();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String path = request.getServletPath();
        switch(path){
            case "/home":
                //Check our parameter
                String send = request.getParameter("send");
                if(send != null){
                    if(send.equals("success")){
                        request.setAttribute("send", true);
                    }else if(send.equals("error")){
                        request.setAttribute("send", false);
                    }else{
                        request.setAttribute("send", null);
                    }
                }
                String order_notification = request.getParameter("order");
                if(order_notification != null){
                    if(order_notification.equals("success")){
                        request.setAttribute("order", true);
                    }else if(order_notification.equals("error")){
                        request.setAttribute("order", false);
                    }else{
                        request.setAttribute("order", null);
                    }
                }
                String join = request.getParameter("join");
                if(join != null){
                    if(join.equals("success")){
                        request.setAttribute("join", true);
                    }else if(join.equals("error")){
                        request.setAttribute("join", false);
                    }else{
                        request.setAttribute("join", null);
                    }
                }
                
                
                // _2 - prefix limit
                List<Product> products_8 = this.productFacade.findByLimit(8);
                ArrayList <Product> product1 = new ArrayList<>();
                ArrayList <Product> product2 = new ArrayList<>();
                for (int i = 0; i < products_8.size(); i++) {
                    if(i < products_8.size() / 2){
                        product1.add(products_8.get(i));
                    }else{
                        product2.add(products_8.get(i));
                    }
                }
                
                //Make new array list
                ArrayList<ArrayList <Product>> list = new ArrayList<>();
                list.add(product1);
                list.add(product2);
                
                //Get top shoes 2 array 
                List<Product> products_2 = this.productFacade.findByLimit(2);

                request.setAttribute("topshoes", list);
                request.setAttribute("topshoes2", products_2);
                request.getRequestDispatcher("home.jsp").forward(request, response);
                break;
            case "/about":
                for(int i = 1; i <=8; i++){
                   Product p = new Product("tets","te","te","img/shoes/Ultraboost_20_Shoes_Black_FX3602_01_standard.jpg",2,"left");
                   this.productFacade.create(p); 
                }
                request.getRequestDispatcher("about.jsp").forward(request, response);
                break;
            case "/contact":
                
                request.getRequestDispatcher("contact.jsp").forward(request, response);
                break;
            case "/shoes":
                request.setAttribute("products", this.productFacade.findAll());
                request.getRequestDispatcher("shoes.jsp").forward(request, response);
                break;
            case "/detail":
                String id = request.getParameter("id");
                Product p = this.productFacade.find(new Long(id));
                request.setAttribute("product", p);
                request.getRequestDispatcher("details.jsp").forward(request, response);
                break;
            case "/order":
                id = request.getParameter("id");
                p = this.productFacade.find(new Long(id));
                request.setAttribute("product", p);
                request.getRequestDispatcher("order.jsp").forward(request, response);
                break;
            case "/join":
                request.getRequestDispatcher("join.jsp").forward(request, response);
                break;
                
            //Post
            case "/sendMessage":
                String email = request.getParameter("email");
                String message = request.getParameter("message");
                this.messageFacade.create(new Message(email, message));
                //Something checks
                //.....
                
                response.sendRedirect(request.getContextPath() + "/home?send=success");
                break;
                
            case "/sendJoin":
                email = request.getParameter("email");
                if(this.clubFacade.findByEmail(email)){
                    int key = (int) (Math.random() * (9999999 - 0 + 1) + 0);
                    this.clubFacade.create(new Club(email, key));
                    response.sendRedirect(request.getContextPath() + "/home?join=success");
                }else{
                    response.sendRedirect(request.getContextPath() + "/home?join=error");
                }
                
                break;
                
            case "/orderProduct":
                //Get ordered product 
                id = request.getParameter("id");
                p = this.productFacade.find(new Long(id));
                
                //Get post user data
                String first_name = request.getParameter("firstName");
                String second_name = request.getParameter("secondName");
                String name = first_name + " " + second_name;
                
                email = request.getParameter("email");
                String phone = request.getParameter("phone");
                String address = request.getParameter("address");
                
                //Make order object
                OrderProduct orderProduct = new OrderProduct(p,address, email, phone, name);
                
                //Push order to db
                this.orderProductFacade.create(orderProduct);
                
                //Make success notification and redirect to /home
                response.sendRedirect(request.getContextPath() + "/home?order=success");
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
