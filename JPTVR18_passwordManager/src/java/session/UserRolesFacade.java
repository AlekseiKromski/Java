/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Role;
import entity.User;
import entity.UserRoles;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import utils.RoleUtil;

/**
 *
 * @author pupil
 */
@Stateless
public class UserRolesFacade extends AbstractFacade<UserRoles> {

    @EJB
    private RoleFacade roleFacade = new RoleFacade();
    
    
    @PersistenceContext(unitName = "JPTVR18_passwordManagerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserRolesFacade() {
        super(UserRoles.class);
    }
    
    public boolean checkRole(User user, String roleName){
        try {
            this.em.createQuery("SELECT ur FROM userRoles ur WHERE ur.role.name =: role AND ur.user = :user ")
                    .setParameter("role", roleName)
                    .setParameter("user", user)
                    .getSingleResult();
            return true;
        } catch (Exception e) {
            return false;

        }
    }

    public String getTopRole(User user) {
        List<UserRoles> userRoles = this.em.createQuery("SELECT ur FROM UserRoles ur WHERE ur.user = :user")
                .setParameter("user", user).getResultList();
        RoleUtil roleUtil = new RoleUtil();
        return roleUtil.checkTopRole(userRoles);
    }

    public void deleteAllUserRoles(User updateUser) {
        this.em.createQuery("DELETE FROM UserRoles ur WHERE ur.user = :updateUser")
                .setParameter("updateUser", updateUser).executeUpdate();
    }

    public void setNewRoleToUser(String new_role, User updateUser) {
        if(new_role.equals("ADMIN")){
            Role admin = this.roleFacade.getRole(new_role);
            UserRoles userRoles = new UserRoles();
            userRoles.setUser(updateUser);
            userRoles.setRole(admin);
            this.create(userRoles);
            Role user = this.roleFacade.getRole("USER");
            userRoles.setRole(user);
            this.create(userRoles);
        }
        if(new_role.equals("USER")){
            Role admin = this.roleFacade.getRole(new_role);
            UserRoles userRoles = new UserRoles();
            userRoles.setUser(updateUser);
            userRoles.setRole(admin);
            this.create(userRoles);
        }
    }
}
