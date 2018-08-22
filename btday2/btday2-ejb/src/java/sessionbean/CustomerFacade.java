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
import model.Customer;

/**
 *
 * @author Tuan anh
 */
@Stateless
public class CustomerFacade extends AbstractFacade<Customer> implements CustomerFacadeLocal {

    @PersistenceContext(unitName = "btday2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerFacade() {
        super(Customer.class);
    }
    @Override
    public boolean checkLogin(String username, String password){
        Query query = em.createNamedQuery("Customer.checkLogin");
   query.setParameter("username", username);
   query.setParameter("password", password);
        try {
            query.getSingleResult();
        } catch (Exception e) {
        }
        return false;
    }
    
}
