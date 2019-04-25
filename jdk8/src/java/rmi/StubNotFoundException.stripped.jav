package java.rmi;


public class StubNotFoundException extends RemoteException {
  public StubNotFoundException(String s) {
    super(s);
  }
  public StubNotFoundException(String s, Exception ex) {
    super(s, ex);
  }
}