/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Demoserver;

/**
 *
 * @author Tuan anh
 */
@Stateless
public class DemoserverFacade extends AbstractFacade<Demoserver> implements DemoserverFacadeLocal {

    @PersistenceContext(unitName = "btday2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DemoserverFacade() {
        super(Demoserver.class);
    }
        @Override
    public boolean checkLogin(String username, String password){
        Query query = em.createNamedQuery("Demoserver.checkLogin");
   query.setParameter("username", username);
   query.setParameter("password", password);
        try {
            query.getSingleResult();
        } catch (Exception e) {
        }
        return false;
    }
}
