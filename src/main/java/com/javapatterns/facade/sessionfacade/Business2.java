/* Generated by Together */

package com.javapatterns.facade.sessionfacade;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;
import javax.ejb.EJBException;

public interface Business2 extends EJBObject {
    void BusinessMethod1() throws RemoteException, EJBException ;

    void BusinessMethod2()throws RemoteException, EJBException;

    void BusinessMethod3() throws RemoteException, EJBException ;

    /** @link dependency */
    /*#Business1Bean lnkSession1Bean;*/
}
