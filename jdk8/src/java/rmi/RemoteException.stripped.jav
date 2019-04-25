package java.rmi;


public class RemoteException extends java. io. IOException {
  public Throwable detail;
  public RemoteException( ) {
  }
  public RemoteException(String s) {
    super(s);
  }
  public RemoteException(String s, Throwable cause) {
    super(s);
  }
  public String getMessage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable getCause( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}