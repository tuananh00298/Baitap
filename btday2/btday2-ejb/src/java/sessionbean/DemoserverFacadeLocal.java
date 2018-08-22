/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import java.util.List;
import javax.ejb.Local;
import model.Demoserver;

/**
 *
 * @author Tuan anh
 */
@Local
public interface DemoserverFacadeLocal {

    void create(Demoserver demoserver);

    void edit(Demoserver demoserver);

    void remove(Demoserver demoserver);

    Demoserver find(Object id);

    List<Demoserver> findAll();

    List<Demoserver> findRange(int[] range);

    int count();
    boolean checkLogin(String name, String password);
}
