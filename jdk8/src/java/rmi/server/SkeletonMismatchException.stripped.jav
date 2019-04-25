package java.rmi.server;

import java.rmi.RemoteException;

public class SkeletonMismatchException extends RemoteException {
  @Deprecated public SkeletonMismatchException(String s) {
    super(s);
  }
}