/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entity.Role;
import entity.User;
import entity.UserRoles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import session.RoleFacade;
import session.UserRolesFacade;

/**
 *
 * @author yanikarp
 */
public class RoleUtil {
    
    @EJB
    private UserRolesFacade userRolesFacade = new UserRolesFacade();
    
    //Разместить роли по возрастанию
    private List<String> roles = Arrays.asList("ADMIN", "USER");
    private Map<String, List<String>> roles_tree = new HashMap<>();
    
    //Default user
    private String currentRole = "USER";

    //Constructor
    public RoleUtil() {
        //Init roles_tree
        List<String> admin_tree = Arrays.asList("ADMIN","USER");
        List<String> user_tree = Arrays.asList("USER");
        
        //Make roles_tree
        this.roles_tree.put("ADMIN", admin_tree);
        this.roles_tree.put("USER", user_tree);
        
    }
    
    //Getter for roles
    public List<String> getRoles() {
        return roles;
    }
    
    //Getter for currentRole
    public String getCurrentRole() {
        return currentRole;
    }
        
    //Getter for roles_tree
    public Map<String, List<String>> getRoles_tree() {
        return roles_tree;
    }

    //Setter for roles_tree
    public void setRoles_tree(Map<String, List<String>> roles_tree) {
        this.roles_tree = roles_tree;
    }

    //Setter for currrentRole
    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole;
    }
    
    public String checkTopRole(List<UserRoles> userRoles){
        
        boolean for_loop = true;
        
        //Перебор массива ролей пользователя
        for (String role : roles) {
            if(for_loop){
               for (UserRoles userRole : userRoles) {
                    if(role.equals(userRole.getRole().getName())){
                        setCurrentRole(userRole.getRole().getName());
                        for_loop = false;
                        break;
                    }
                } 
            } 
        }
        
        //Если ничего не смог найти
        return getCurrentRole();
    } 

    //Создаем роли на основе древа ролей
    public void changeRole(String new_role, User updateUser, RoleFacade rf, UserRolesFacade urf) {
        
        for (String role : this.roles_tree.keySet()) {
            if(new_role.equals(role)){
                List<String> tree = this.roles_tree.get(new_role);
                for (String el : tree){
                    Role db_role = rf.getRole(el);
                    UserRoles userRoles = new UserRoles();
                    userRoles.setUser(updateUser);
                    userRoles.setRole(db_role);
                    urf.create(userRoles);   
                }
            }
        }
    }
   
   
}
