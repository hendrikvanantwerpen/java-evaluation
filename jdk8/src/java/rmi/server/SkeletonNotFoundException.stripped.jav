package java.rmi.server;

import java.rmi.RemoteException;

public class SkeletonNotFoundException extends RemoteException {
  public SkeletonNotFoundException(String s) {
    super(s);
  }
  public SkeletonNotFoundException(String s, Exception ex) {
    super(s, ex);
  }
}