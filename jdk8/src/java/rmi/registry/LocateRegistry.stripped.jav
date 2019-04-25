package java.rmi.registry;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;

public final class LocateRegistry {
  private LocateRegistry( ) {
  }
  public static Registry getRegistry( ) throws RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Registry getRegistry(int port) throws RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Registry getRegistry(String host) throws RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Registry getRegistry(String host, int port) throws RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Registry getRegistry(String host,int port, RMIClientSocketFactory csf) throws RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Registry createRegistry(int port) throws RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Registry createRegistry(int port,RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}