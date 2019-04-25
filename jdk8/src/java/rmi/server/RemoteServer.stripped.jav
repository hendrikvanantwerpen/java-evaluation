package java.rmi.server;

import java.rmi.*;

public abstract class RemoteServer extends RemoteObject {
  protected RemoteServer( ) {
    super( );
  }
  protected RemoteServer(RemoteRef ref) {
    super(ref);
  }
  public static String getClientHost( ) throws ServerNotActiveException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void setLog(java. io. OutputStream out) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static java. io. PrintStream getLog( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}