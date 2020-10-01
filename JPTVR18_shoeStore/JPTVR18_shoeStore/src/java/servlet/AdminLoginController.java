/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entity.admin.User;
import facade.UserFacade;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AdminLoginController", urlPatterns = {
    "/admin/login",
    "/admin/logout",
    "/admin/loginTreatment",
})
public class AdminLoginController extends HttpServlet {

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
    UserFacade userFacade = new UserFacade();
        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String path = request.getServletPath();
        switch(path){
            case "/admin/login":
                 
                String login = request.getParameter("login");
                if(login != null){
                    if(login.equals("error")){
                        request.setAttribute("login", true);
                    }else{
                        request.setAttribute("login", null);
                    }
                }
                
                request.getRequestDispatcher("/admin/login.jsp").forward(request, response);
                break;
            case "/admin/loginTreatment":
                login = request.getParameter("email");
                String password = request.getParameter("password");
                
                User user = this.userFacade.findByLogin(login);
                if(user == null){
                    response.sendRedirect(request.getContextPath() + "/admin/login?login=error");
                }else{
                    if(user.getPassword().equals(password)){
                        HttpSession session = request.getSession(true);
                        session.setAttribute("user", user);
                        response.sendRedirect(request.getContextPath() + "/admin/home");
                    }else{
                        response.sendRedirect(request.getContextPath() + "/admin/login?login=error");
                    }
                }
                break;
            case "/admin/logout":

                HttpSession session = request.getSession(false);
                if(session != null) session.invalidate();
                response.sendRedirect(request.getContextPath() + "/admin/login");    
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
