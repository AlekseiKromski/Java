/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.admin.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author yanikarp
 */
@Stateless
public class UserFacade extends AbstractFacade<User> {

    @PersistenceContext(unitName = "JPTVR18_shoeStorePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }

    public User findByLogin(String login) {
        try{
            return (User) this.em.createQuery("SELECT u FROM User u WHERE u.login = :login").setParameter("login", login).getSingleResult();
        }catch(Exception e){
            return null;
        }
    }

    public List<User> getAllUsers() {
        return this.em.createQuery("SELECT u FROM User u").getResultList();
    }

    public boolean updateData(Long id, String login, String password) {
        
        this.em.createQuery("UPDATE User u SET u.login = :login, u.password = :password WHERE u.id  = :id")
                .setParameter("login", login)
                .setParameter("password", password)
                .setParameter("id", id).executeUpdate();
        
        return true;

    }
    
}
