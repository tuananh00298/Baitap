/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Tuan anh
 */
@Local
public interface TbdoitacFacadeLocal {

    void create(Tbdoitac tbdoitac);

    void edit(Tbdoitac tbdoitac);

    void remove(Tbdoitac tbdoitac);

    Tbdoitac find(Object id);

    List<Tbdoitac> findAll();

    List<Tbdoitac> findRange(int[] range);
    Tbdoitac CheckAccount(int id);
    String Payment(int id, String code);

    int count();
    
}
