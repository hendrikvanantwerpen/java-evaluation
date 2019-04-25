package java.rmi;


public class ConnectException extends RemoteException {
  public ConnectException(String s) {
    super(s);
  }
  public ConnectException(String s, Exception ex) {
    super(s, ex);
  }
}