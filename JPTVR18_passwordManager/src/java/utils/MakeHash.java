/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pupil
 */
public class MakeHash {
    public String create(String password, String salt){
        password += salt;
        MessageDigest m;
        try {
            m = MessageDigest.getInstance("SHA-256");
            m.update(password.getBytes(),0,password.length());
            return new BigInteger(1,m.digest()).toString(16);        

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MakeHash.class.getName()).log(Level.SEVERE, "Алгоритм не поддерживается", ex);
            return null;
        }
        
    }
    
    public String createSalts(){
        Date date = new Date();
        String salt = Long.toString(date.getTime());
        MessageDigest m;
        try {
            m = MessageDigest.getInstance("SHA-256");
            m.update(salt.getBytes(),0,salt.length());
            return new BigInteger(1,m.digest()).toString(16);        

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MakeHash.class.getName()).log(Level.SEVERE, "Алгоритм не поддерживается", ex);
            return null;
        }
    }
}
