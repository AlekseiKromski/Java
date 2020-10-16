/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Resource;
import entity.UserResources;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Melnikov
 */
@Stateless
public class UserResourcesFacade extends AbstractFacade<UserResources> {
@EJB private ResourceFacade resourceFacade;
    @PersistenceContext(unitName = "JPTVR18PathManagerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserResourcesFacade() {
        super(UserResources.class);
    }

    public void removeByResource(Resource deleteResource) {
        em.createQuery("DELETE FROM UserResources ur WHERE ur.resource = :resource")
                .setParameter("resource", deleteResource)
                .executeUpdate();
    }
}
