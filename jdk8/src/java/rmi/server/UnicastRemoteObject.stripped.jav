package java.rmi.server;

import java.rmi.*;

public class UnicastRemoteObject extends RemoteServer {
  protected UnicastRemoteObject( ) throws RemoteException{
    this(0);
  }
  protected UnicastRemoteObject(int port) throws RemoteException{
  }
  protected UnicastRemoteObject(int port,RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException{
  }
  public Object clone( ) throws CloneNotSupportedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static RemoteStub exportObject(Remote obj) throws RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Remote exportObject(Remote obj, int port) throws RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Remote exportObject(Remote obj,int port,RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean unexportObject(Remote obj, boolean force) throws java. rmi. NoSuchObjectException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}