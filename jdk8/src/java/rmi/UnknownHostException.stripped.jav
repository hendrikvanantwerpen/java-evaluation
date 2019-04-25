package java.rmi;


public class UnknownHostException extends RemoteException {
  public UnknownHostException(String s) {
    super(s);
  }
  public UnknownHostException(String s, Exception ex) {
    super(s, ex);
  }
}