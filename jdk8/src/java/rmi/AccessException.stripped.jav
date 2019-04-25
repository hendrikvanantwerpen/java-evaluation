package java.rmi;


public class AccessException extends java. rmi. RemoteException {
  public AccessException(String s) {
    super(s);
  }
  public AccessException(String s, Exception ex) {
    super(s, ex);
  }
}