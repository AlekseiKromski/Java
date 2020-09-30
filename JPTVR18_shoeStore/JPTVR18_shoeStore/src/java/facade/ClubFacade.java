/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Club;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author yanikarp
 */
@Stateless
public class ClubFacade extends AbstractFacade<Club> {

    @PersistenceContext(unitName = "JPTVR18_shoeStorePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClubFacade() {
        super(Club.class);
    }

    public boolean findByEmail(String email) {
        List pos = this.em.createQuery("SELECT c FROM Club c WHERE c.email = :email").setParameter("email", email).getResultList();
        System.out.println(pos);
        if(pos.size() <= 0){
            return true;
        }else{
          return false;  
        }
        
    }
    
}
