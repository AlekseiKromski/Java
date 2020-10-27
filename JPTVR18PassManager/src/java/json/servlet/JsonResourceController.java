    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.servlet;

import entity.Resource;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.ResourceFacade;
import session.UserFacade;
import session.UserRolesFacade;
import utils.MakeHash;
import utils.ResourceJsonBuilder;
import utils.UserJsonBuilder;

/**
 *
 * @author pupil
 */
@WebServlet(name = "JsonResourceController", urlPatterns = {"/createResourceByJson", "/createUserByJson", "/loginInByJson"})
public class JsonResourceController extends HttpServlet {

    @EJB
    private  ResourceFacade resourceFacade = new ResourceFacade();
    
    @EJB
    private  UserFacade userFacade = new UserFacade();
    
    @EJB
    private UserRolesFacade userRolesFacade = new UserRolesFacade();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            JsonReader jr = Json.createReader(request.getReader());
            JsonObjectBuilder job = Json.createObjectBuilder();
            String json = null;
            String path = request.getServletPath();
            switch(path){
                case "/createResourceByJson":
                    JsonObject jb = jr.readObject();
                    String name = jb.getString("name");           
                    String url = jb.getString("url");
                    String login = jb.getString("login");
                    String password = jb.getString("password");
                    if(name == null){
                        job.add("info", "Заполните поля");
                        json = job.build().toString();
                    }
                    Resource resource = new Resource(name, url, login, password);
                    this.resourceFacade.create(resource);
                    ResourceJsonBuilder resourceJsonBuilder = new ResourceJsonBuilder();
                    job.add("info", "Ресурс добавлен");
                    json = job.build().toString();
                    break;
                case "/createUserByJson":
                    jb = jr.readObject();
                    login = jb.getString("login");
                    password = jb.getString("password");
                    if(login == null && password == null){
                        job.add("info", "Заполните поля");
                        json = job.build().toString();
                    }
                   
                    MakeHash makeHash = new MakeHash();
                    String salts = makeHash.createSalts();
                    String encodingPassword = makeHash.createHash(password, salts);
                    User user = new User(login,encodingPassword,salts);
                    this.userFacade.create(user);
                    job.add("info", "Ресурс добавлен");
                    json = job.build().toString();
                    break;
                case "/loginInByJson":
                    jb = jr.readObject();
                    login = jb.getString("login");
                    password = jb.getString("login");
                    user = userFacade.findByLogin(login);
                    
                    if(user == null){
                        job.add("info", "Данного пользователя нет");
                        json = job.build().toString();
                    }
                    MakeHash mh = new MakeHash();
                    String encriptPassword = mh.createHash(password,user.getSalts());
                    if(!encriptPassword.equals(user.getPassword())){
                        job.add("info", "Нет такого логина или пароля");
                        json = job.build().toString();
                    }
                    HttpSession session = request.getSession(true);
                    session.setAttribute("user", user);
                    
                    String session_id = session.getId();
                    String role_user = this.userRolesFacade.getTopRoleName(user);
                    UserJsonBuilder ujb = new UserJsonBuilder();
                    job.add("info", "Вы были авторезированы");
                    job.add("data", ujb.createJsonUser(user, session_id, role_user));
                    json = job.build().toString();
                    break;
                    
            }
            if(!"".equals(json)){
                try(PrintWriter out = response.getWriter()){
                    out.println(json);
                    out.flush();
                }
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
