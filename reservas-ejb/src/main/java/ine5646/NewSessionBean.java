/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
public class NewSessionBean implements INewSessionBean{
    
    @PersistenceContext
    private EntityManager em;
   
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
