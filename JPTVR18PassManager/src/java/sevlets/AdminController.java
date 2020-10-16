/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevlets;

import entity.Role;
import entity.User;
import java.io.IOException;
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
import session.RoleFacade;
import session.UserFacade;
import session.UserRolesFacade;
import utils.MakeHash;

/**
 *
 * @author Melnikov
 */
@WebServlet(name = "AdminController", urlPatterns = {
    "/showListUsers",
    "/editUserRoles",
    "/updateUserRoles",
    
})
public class AdminController extends HttpServlet {
 @EJB
    private UserRolesFacade userRolesFacade;
 @EJB
    private UserFacade userFacade;
 @EJB
    private RoleFacade roleFacade;
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
        HttpSession session = request.getSession(false);
        if(session == null){
            request.setAttribute("info", "У вас нет прав для этого ресурса. Авторизуйтесь");
            request.getRequestDispatcher("/showFormLogin")
                .forward(request, response);
        }
        User user = (User) session.getAttribute("user");
        //UserManager userManager = new UserManager();
        if(!userRolesFacade.checkRole(user,"ADMIN")){
            request.setAttribute("info", "У вас нет прав для этого ресурса. Авторизуйтесь");
            request.getRequestDispatcher("/showFormLogin")
                .forward(request, response);
        }
        
        String path = request.getServletPath();
        switch (path) {
            case "/showListUsers":
                Map<User,String> usersMap = new HashMap<>();
                List<User> listUsers = userFacade.findAll();
                for (int i = 0; i < listUsers.size(); i++) {
                    User userForMap = listUsers.get(i);
                    String topRoleUserForMap = userRolesFacade.getTopRoleName(userForMap);
                    usersMap.put(userForMap, topRoleUserForMap);
                }
                request.setAttribute("usersMap", usersMap);
                
                request.getRequestDispatcher("/admin/showListUsers.jsp")
                        .forward(request, response);
                break;
            case "/editUserRoles":
                String userId = request.getParameter("userId");
                User editUser = userFacade.find(Long.parseLong(userId));
                if(editUser == null){
                    request.setAttribute("info", "Не найден пользователь с иднетификатором "+userId);
                    request.getRequestDispatcher("/admin/showListUsers.jsp")
                        .forward(request, response);
                    break;
                }
                request.setAttribute("editUser", editUser);
                List<Role> listRoles = roleFacade.findAll();
                request.setAttribute("listRoles", listRoles);
                String topRoleEditUser = userRolesFacade.getTopRoleName(editUser);
                request.setAttribute("topRoleEditUser", topRoleEditUser);
                
                request.getRequestDispatcher("/admin/editUserRolesForm.jsp")
                    .forward(request, response);
                break;
            case "/updateUserRoles":
                userId = request.getParameter("userId");
                String newLogin = request.getParameter("newLogin");
                String newPassword = request.getParameter("newPassword");
                String currentRole = request.getParameter("currentRole");
                String newRole = request.getParameter("newRole");
                if(newRole.equals(currentRole)){
                    request.setAttribute("info", "Роль не изменилась. Выберите другуюроль");
                    request.getRequestDispatcher("/admin/editUserRolesForm.jsp")
                        .forward(request, response);
                    break;
                }
                Role newRoleUpdateUser = roleFacade.find(Long.parseLong(newRole));
                if(userId == null){
                    request.setAttribute("info", "Не найден пользователь с иднетификатором "+userId);
                    request.getRequestDispatcher("/showListUsers")
                        .forward(request, response);
                    break;
                }
                User updateUser = userFacade.find(Long.parseLong(userId));
                userRolesFacade.deleteAllUserRoles(updateUser);
                userRolesFacade.setNewRoleToUser(newRoleUpdateUser,updateUser);
                updateUser.setLogin(newLogin);
                if(newPassword != null && !newPassword.isEmpty()){
                    MakeHash mh = new MakeHash();
                    String salts = mh.createSalts();
                    newPassword = mh.createHash(newPassword, salts);
                    updateUser.setPassword(newPassword);
                }
                userFacade.edit(updateUser);
                request.setAttribute("info", "Данные пользователя "+updateUser.getLogin()+" изменены");
                    request.getRequestDispatcher("/showListUsers")
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
