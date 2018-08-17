/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Tuan anh
 */
@Stateless
public class TbdoitacFacade extends AbstractFacade<Tbdoitac> implements TbdoitacFacadeLocal {

    @PersistenceContext(unitName = "EJBank-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbdoitacFacade() {
        super(Tbdoitac.class);
    }
    @Override
    public Tbdoitac CheckAccount(int id){
        Query query = em.createNamedQuery("Tbdoitac.findbyID");
        query.setParameter("id", id);
        try {
            return (Tbdoitac)query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    public String Payment(int id, String code){
    
        if (CheckAccount(id)!=null) {
            Tbdoitac tb = CheckAccount(id);
            String pay = "alo " + tb.getCodeDt();
        }
        return "payment fail";
    }
}
