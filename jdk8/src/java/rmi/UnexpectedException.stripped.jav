package java.rmi;


public class UnexpectedException extends RemoteException {
  public UnexpectedException(String s) {
    super(s);
  }
  public UnexpectedException(String s, Exception ex) {
    super(s, ex);
  }
}