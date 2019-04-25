package java.rmi.activation;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class ActivationID implements Serializable {
  public ActivationID(Activator activator) {
  }
  public Remote activate(boolean force) throws ActivationException, UnknownObjectException, RemoteException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}