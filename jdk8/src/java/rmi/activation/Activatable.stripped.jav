package java.rmi.activation;

import java.rmi.MarshalledObject;
import java.rmi.NoSuchObjectException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.activation.UnknownGroupException;
import java.rmi.activation.UnknownObjectException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.RemoteServer;

public abstract class Activatable extends RemoteServer {
  protected Activatable(String location,MarshalledObject<?> data,boolean restart, int port) throws ActivationException, RemoteException{
    super( );
  }
  protected Activatable(String location,MarshalledObject<?> data,boolean restart,int port,RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws ActivationException, RemoteException{
    super( );
  }
  protected Activatable(ActivationID id, int port) throws RemoteException{
    super( );
  }
  protected Activatable(ActivationID id,int port,RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException{
    super( );
  }
  public static Remote register(ActivationDesc desc) throws UnknownGroupException, ActivationException, RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean inactive(ActivationID id) throws UnknownObjectException, ActivationException, RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void unregister(ActivationID id) throws UnknownObjectException, ActivationException, RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ActivationID exportObject(Remote obj,String location,MarshalledObject<?> data,boolean restart, int port) throws ActivationException, RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ActivationID exportObject(Remote obj,String location,MarshalledObject<?> data,boolean restart,int port,RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws ActivationException, RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Remote exportObject(Remote obj,ActivationID id, int port) throws RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Remote exportObject(Remote obj,ActivationID id,int port,RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean unexportObject(Remote obj, boolean force) throws NoSuchObjectException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}