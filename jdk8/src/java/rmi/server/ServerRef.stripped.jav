package java.rmi.server;

import java.rmi.*;

public interface ServerRef extends RemoteRef {
  static final long serialVersionUID
  ;
  RemoteStub exportObject(Remote obj, Object data) throws RemoteException ;
  String getClientHost( ) throws ServerNotActiveException ;
}