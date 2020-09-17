/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.UserFacade;

/**
 *
 * @author pupil
 */
@WebServlet(name = "LoginController", urlPatterns = {"/showFormLogin","/login", "/logout", "/showFormCreateUser", "/createUser"})
public class LoginController extends HttpServlet {

    
    @EJB
    private UserFacade userFacade = new UserFacade();
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
        request.setCharacterEncoding("UTF-8");
        
        String path = request.getServletPath();
        switch(path){
            case "/showFormLogin":
                request.getRequestDispatcher("/showFormLogin.jsp").forward(request, response);
                break;
            case "/login":
                String login = request.getParameter("login");
                String password = request.getParameter("password");
                User user = this.userFacade.findByLogin(login);
                if(user == null){
                    request.setAttribute("info", "login or password is wrong");
                    request.getRequestDispatcher("/showFormLogin").forward(request, response);
                }else{
                    if(user.equals(user.getPassword())){
                        request.setAttribute("info", "login or password is wrong");
                        request.getRequestDispatcher("/showFormLogin").forward(request, response);
                    }else{
                        HttpSession session = request.getSession(true);
                        session.setAttribute("user", user);
                        request.setAttribute("info", "You has been loggined");
                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                    }
                }
                
                
                break;
            case "/logout":
                HttpSession session = request.getSession(false);
                if(session != null) session.invalidate();
                request.setAttribute("info", "You has been logouted");
               
                //request.getRequestDispatcher("/index.jsp").forward(request, response);
                
                //Make redirect
                response.sendRedirect(request.getContextPath() + "/?logout=true");
                break;
            case "/showFormCreateUser":
                request.getRequestDispatcher("/showFormCreateUser.jsp").forward(request, response);
                break;
            case "/createUser":
                String login_user = request.getParameter("login");
                String password_user = request.getParameter("password");
                User user_for_db = new User(login_user, password_user);
                this.userFacade.create(user_for_db);
                request.setAttribute("info", "your user has been created");
                request.getRequestDispatcher("index.jsp").forward(request, response);
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
