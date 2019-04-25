package java.rmi;

import java.rmi.registry.*;

public final class Naming {
  private Naming( ) {
  }
  public static Remote lookup(String name) throws NotBoundException, java. net. MalformedURLException, RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void bind(String name, Remote obj) throws AlreadyBoundException, java. net. MalformedURLException, RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void unbind(String name) throws RemoteException, NotBoundException, java. net. MalformedURLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void rebind(String name, Remote obj) throws RemoteException, java. net. MalformedURLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String [] list(String name) throws RemoteException, java. net. MalformedURLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}