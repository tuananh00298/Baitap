/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import model.Demoserver;
import sessionbean.DemoserverFacadeLocal;

/**
 *
 * @author Tuan anh
 */
@WebService(serviceName = "TestDemo")
public class TestDemo {

    @EJB
    private DemoserverFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "demoserver") Demoserver demoserver) {
        ejbRef.create(demoserver);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "demoserver") Demoserver demoserver) {
        ejbRef.edit(demoserver);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "demoserver") Demoserver demoserver) {
        ejbRef.remove(demoserver);
    }

    @WebMethod(operationName = "find")
    public Demoserver find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Demoserver> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Demoserver> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "checkLogin")
    public boolean checkLogin(@WebParam(name = "name") String name, @WebParam(name = "password") String password) {
        return ejbRef.checkLogin(name, password);
    }
    
}
