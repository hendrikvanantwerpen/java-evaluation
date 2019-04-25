package java.rmi.server;

import java.rmi.Remote;
import java.rmi.NoSuchObjectException;

public abstract class RemoteObject implements Remote, java. io. Serializable {
  protected RemoteObject( ) {
  }
  protected RemoteObject(RemoteRef newref) {
  }
  public RemoteRef getRef( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Remote toStub(Remote obj) throws NoSuchObjectException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}