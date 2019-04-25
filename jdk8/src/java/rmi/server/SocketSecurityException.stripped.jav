package java.rmi.server;


public class SocketSecurityException extends ExportException {
  public SocketSecurityException(String s) {
    super(s);
  }
  public SocketSecurityException(String s, Exception ex) {
    super(s, ex);
  }
}