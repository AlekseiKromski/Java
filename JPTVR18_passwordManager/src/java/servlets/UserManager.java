/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.User;
import entity.User;
import javax.ejb.EJB;
import session.UserRolesFacade;

/**
 *
 * @author pupil
 */
class UserManager {

    @EJB UserRolesFacade userRolesFacade;
    
    public boolean isRole(User user, String roleName) {
        
        return userRolesFacade.checkRole(user,roleName);
    }
    
}
