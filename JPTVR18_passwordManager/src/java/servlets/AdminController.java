/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.UserFacade;
import session.UserRolesFacade;

/**
 *
 * @author pupil
 */
@WebServlet(name = "AdminController", urlPatterns = {
    "/showListUsers"
})
public class AdminController extends HttpServlet {

    @EJB
    private UserRolesFacade userRolesFacade = new UserRolesFacade();
    
    @EJB
    private UserFacade userFacade = new UserFacade();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession(false);
        if(session == null){
            request.setAttribute("info", "No permission");
            request.getRequestDispatcher("/showFormLogin.jsp").forward(request, response);
        }
        User user = (User) session.getAttribute("user");
        if(user == null){
            request.setAttribute("info", "No permission");
            request.getRequestDispatcher("/showFormLogin").forward(request, response);
        }
        if(this.userRolesFacade.checkRole(user,"ADMIN")){
            request.setAttribute("info", "No permission");
            request.getRequestDispatcher("/index").forward(request, response);
        }
        
        String path = request.getServletPath();
        switch(path){
            case "/showListUsers":
                List<User> users = this.userFacade.findAll();
                Map<User,String> usersMap = new HashMap<>();
                for (int i = 0; i < users.size(); i++) {
                    User userForMap = users.get(i);
                    String topRoleUser = this.userRolesFacade.getTopRole(userForMap);
                    usersMap.put(userForMap, topRoleUser);
                    
                }
                String topRoleCurrentUser = this.userRolesFacade.getTopRole(user);

                request.setAttribute("usersMap", usersMap);
                request.getRequestDispatcher("/admin/showListUsers.jsp").forward(request, response);
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
