/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevlets;

import entity.Role;
import utils.MakeHash;
import entity.User;
import entity.UserRoles;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.RoleFacade;
import session.UserFacade;
import session.UserRolesFacade;

/**
 *
 * @author Melnikov
 */
@WebServlet(name = "UserController", loadOnStartup = 1, urlPatterns = {
    "/index",
    "/showFormAddUser",
    "/createUser",
    "/showFormLogin",
    "/login",
    "/logout"
})

public class UserController extends HttpServlet {
    @EJB
    private UserFacade userFacade;
    @EJB
    private RoleFacade roleFacade;
    @EJB
    private UserRolesFacade userRolesFacade;

    @Override
    public void init() throws ServletException {
        int countRoles = roleFacade.count();
        if(countRoles > 0) return;
        MakeHash mh = new MakeHash();
        String salts = mh.createSalts();
        String password = mh.createHash("123123", salts);
        User admin = new User("admin", password, salts);
        userFacade.create(admin);
        UserRoles userRoles = new UserRoles();
        userRoles.setUser(admin);
        Role roleUser = new Role("ADMIN");
        roleFacade.create(roleUser);
        userRoles.setRole(roleUser);
        userRolesFacade.create(userRoles);
        roleUser = new Role("USER");
        roleFacade.create(roleUser);
        userRoles.setRole(roleUser);
        userRolesFacade.create(userRoles);
    }
    
    
    
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
        String path = request.getServletPath();
        switch (path) {
            case "/index":
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                break;
            case "/showFormLogin":
                request.getRequestDispatcher("/systemPages/showFormLogin.jsp")
                        .forward(request, response);
                break;
            case "/login":
                String login = request.getParameter("login");
                String password = request.getParameter("password");
                User user = userFacade.findByLogin(login);
                if(user == null){
                    request.setAttribute("info", "Нет такого логина или пароля");
                    request.getRequestDispatcher("/showFormLogin")
                        .forward(request, response);
                }
                MakeHash mh = new MakeHash();
                String encriptPassword = mh.createHash(password,user.getSalts());
                if(!encriptPassword.equals(user.getPassword())){
                    request.setAttribute("info", "Нет такого логина или пароля");
                    request.getRequestDispatcher("/showFormLogin")
                        .forward(request, response);
                }
                HttpSession session = request.getSession(true);
                session.setAttribute("user", user);
                request.setAttribute("info", "Привет, "+user.getLogin());
                request.setAttribute("user", user);
                String topRoleCurrnetUser = userRolesFacade.getTopRoleName(user);
                request.setAttribute("topRoleCurrnetUser", topRoleCurrnetUser);
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                break;
            case "/logout":
                session = request.getSession(false);
                if(session != null) session.invalidate();
                request.setAttribute("info", "Вы вышли");
                response.sendRedirect("index.jsp");
                break;
            case "/showFormAddUser":
                request.getRequestDispatcher("/pages/showFormAddUser.jsp")
                        .forward(request, response);
                break;
            case "/createUser":
                login = request.getParameter("login");
                password = request.getParameter("password");
                MakeHash makeHash = new MakeHash();
                String salts = makeHash.createSalts();
                String encodingPassword = makeHash.createHash(password, salts);
                user = new User(login,encodingPassword,salts);
                userFacade.create(user);
                Role role = roleFacade.getRole("USER");
                UserRoles userRoles = new UserRoles(user, role);
                userRolesFacade.create(userRoles);
                request.setAttribute("info", "Добавлен пользователь с логином "+user.getLogin());
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
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
