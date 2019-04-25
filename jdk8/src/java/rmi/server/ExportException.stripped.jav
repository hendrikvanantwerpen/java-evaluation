package java.rmi.server;


public class ExportException extends java. rmi. RemoteException {
  public ExportException(String s) {
    super(s);
  }
  public ExportException(String s, Exception ex) {
    super(s, ex);
  }
}