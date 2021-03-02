package sun.rmi.transport;

import java.rmi.RemoteException;

public interface Channel {
  public Connection newConnection( ) throws RemoteException ;
  public Endpoint getEndpoint( ) ;
  public void free(Connection conn, boolean reuse) throws RemoteException ;
}