package java.rmi;


public class ConnectIOException extends RemoteException {
  public ConnectIOException(String s) {
    super(s);
  }
  public ConnectIOException(String s, Exception ex) {
    super(s, ex);
  }
}