/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.math.BigInteger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Tuan anh
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> implements AccountFacadeLocal {

    @PersistenceContext(unitName = "EJBank-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFacade() {
        super(Account.class);
    }
      @Override
    public Account CheckAccount(int id){
        Query query = em.createNamedQuery("Account.findbyAccountId");
        query.setParameter("accountid", id);
        try {
            return (Account)query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
  @Override
    public String Payment(int id, double total){
    
        if (CheckAccount(id)!=null) {
            Account acc = CheckAccount(id);
            int pay = (int) (acc.getBalance().intValue() - total);
            acc.setBalance(Double.valueOf(pay));
            return "Customer "+ acc.getAccountname()+ "payment success: you balance now is: "+ acc.getBalance().toString();
            
                 
        }
        return "payment fail";
    }
    
}
