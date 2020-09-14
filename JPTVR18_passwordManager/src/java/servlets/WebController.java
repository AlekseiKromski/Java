/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.Resource;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.ResourceFacade;
import session.UserFacade;

/**
 *
 * @author pupil
 */
@WebServlet(name = "WebController", urlPatterns = {
    "/showFormAddResource",
    "/createResource",
    "/listResource",
    "/deleteResource",
    "/showFormEditResource",
    "/editResource",
    "/showFormCreateUser",
    "/createUser",
    "/listUser",
    
    
})
public class WebController extends HttpServlet {

    @EJB
    private ResourceFacade resourceFacade = new ResourceFacade();
    @EJB
    private UserFacade userFacade = new UserFacade();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String path = request.getServletPath();
        switch(path){
            case "/showFormAddResource":
                request.getRequestDispatcher("/showFormAddResource.jsp").forward(request, response);
                break;
            case "/createResource":
                
                //Get params into form
                String name = request.getParameter("name");
                String url = request.getParameter("url");
                String login = request.getParameter("login");
                String password = request.getParameter("password");
                
                //Create Entity
                Resource resource = new Resource(name, url, login, password);
                
                //Write variable to DB
                this.resourceFacade.create(resource);
                
                //Then we write object in DB, we will show .jsp page
                request.setAttribute("info", "your resource has been created");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                
                break;
            case "/listResource":
                request.setAttribute("resources", this.resourceFacade.findAll() );
                request.getRequestDispatcher("/listResource.jsp").forward(request, response);
                break;
            case "/deleteResource":
                
                break;
            case "/showFormEditResource":
                
                break;
            case "/editResource":
                
                break;
            case "/showFormCreateUser":
                request.getRequestDispatcher("/showFormCreateUser.jsp").forward(request, response);
                break;
            case "/createUser":
                String name_user = request.getParameter("name");
                String login_user = request.getParameter("login");
                User user = new User(name_user, login_user);
                this.userFacade.create(user);
                request.setAttribute("info", "your user has been created");
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case "/listUser":
                
                request.setAttribute("users", this.userFacade.findAll() );
                request.getRequestDispatcher("listUsers.jsp").forward(request, response);
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
