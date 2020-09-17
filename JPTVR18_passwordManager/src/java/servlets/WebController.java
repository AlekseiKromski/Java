/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.Resource;
import entity.User;
import entity.UserResources;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.ResourceFacade;
import session.UserFacade;
import session.UserResourcesFacade;

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
    "/listUser",
    
    
})
public class WebController extends HttpServlet {

    @EJB
    private ResourceFacade resourceFacade = new ResourceFacade();
    @EJB
    private UserFacade userFacade = new UserFacade();
    @EJB
    private UserResourcesFacade userResourcesFacade = new UserResourcesFacade();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
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
        String path = request.getServletPath();
        switch(path){
            case "/showFormAddResource":
                request.setAttribute("info", "your resource has been created");
                request.getRequestDispatcher("/showFormAddResource.jsp").forward(request, response);
                break;
            case "/createResource":
                
                //Get params into form
                String name = request.getParameter("name");
                String url = request.getParameter("url");
                String login = request.getParameter("login");
                String password = request.getParameter("password");
                
                //Create resource Entity
                Resource resource = new Resource(name, url, login, password);
                this.resourceFacade.create(resource);
                
                //Write recourse and loggined user to userResource
                Date date = new GregorianCalendar().getTime();
                UserResources userResource = new UserResources(user, resource, date);
                this.userResourcesFacade.create(userResource);
                
                //Then we write object in DB, we will show .jsp page
                request.setAttribute("info", "your resource has been created");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                
                break;
            case "/listResource":
                List<Resource> listResources = this.resourceFacade.findByUser(user);
                request.setAttribute("listResources", listResources);
                request.getRequestDispatcher("/listResource.jsp").forward(request, response);
                break;
            case "/deleteResource":
                //Get id of resource
                String id_resource = request.getParameter("id");
                if(id_resource == null || id_resource.equals("")){
                    response.sendRedirect(request.getContextPath() + "/");
                }
                
                //Find delete resource in list
                Resource deleteResource = resourceFacade.find(Long.parseLong(id_resource));
                
                //Find all resources by user
                listResources = this.resourceFacade.findByUser(user);
                if(!listResources.contains(deleteResource)){
                    response.sendRedirect(request.getContextPath() + "/");
                }
                
                //Delete row in user_resources table 
                this.userResourcesFacade.removeByResource(deleteResource);
                
                //Delete user
                resourceFacade.remove(deleteResource);
                
                //Send data
                request.setAttribute("info", "your resource has been deleted");
                request.getRequestDispatcher("/listResource").forward(request, response);
                break;
            case "/showFormEditResource":
                
                break;
            case "/editResource":
                
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
