/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entity.Role;
import entity.UserRoles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author yanikarp
 */
public class RoleUtil {
    //Разместить роли по возрастанию
    private List<String> roles = Arrays.asList("ADMIN", "USER");
    private String currentRole = "USER";

    //Getter for roles
    public List<String> getRoles() {
        return roles;
    }
    
    //Getter for currentRole
    public String getCurrentRole() {
        return currentRole;
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
   
   
}
