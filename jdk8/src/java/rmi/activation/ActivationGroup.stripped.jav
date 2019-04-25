package java.rmi.activation;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.activation.UnknownObjectException;
import java.rmi.server.UnicastRemoteObject;

public abstract class ActivationGroup extends UnicastRemoteObject implements ActivationInstantiator {
  protected ActivationGroup(ActivationGroupID groupID) throws RemoteException{
    super( );
  }
  public boolean inactiveObject(ActivationID id) throws ActivationException, UnknownObjectException, RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void activeObject(ActivationID id, Remote obj) throws ActivationException, UnknownObjectException, RemoteException ;
  public static synchronized ActivationGroup createGroup(ActivationGroupID id,final ActivationGroupDesc desc, long incarnation) throws ActivationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized ActivationGroupID currentGroupID( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized void setSystem(ActivationSystem system) throws ActivationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized ActivationSystem getSystem( ) throws ActivationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}