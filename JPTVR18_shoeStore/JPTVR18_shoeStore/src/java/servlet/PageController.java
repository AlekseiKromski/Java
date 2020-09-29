/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entity.Product;
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
})
public class PageController extends HttpServlet {

    @EJB
    ProductFacade productFacade = new ProductFacade();
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
                   Product p = new Product("tets","te","te","te",2,"left");
                   this.productFacade.create(p); 
                }
                request.getRequestDispatcher("about.jsp").forward(request, response);
                break;
            case "/contact":
                
                request.getRequestDispatcher("contact.jsp").forward(request, response);
                break;
            case "/shoes":
                
                request.getRequestDispatcher("shoes.jsp").forward(request, response);
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
