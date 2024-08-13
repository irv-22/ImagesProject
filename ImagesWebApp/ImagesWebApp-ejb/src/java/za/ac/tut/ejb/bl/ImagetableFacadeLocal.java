/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entites.Imagetable;

/**
 *
 * @author hp
 */
@Local
public interface ImagetableFacadeLocal {

    void create(Imagetable imagetable);

    void edit(Imagetable imagetable);

    void remove(Imagetable imagetable);

    Imagetable find(Object id);

    List<Imagetable> findAll();

    List<Imagetable> findRange(int[] range);

    int count();
    
}
