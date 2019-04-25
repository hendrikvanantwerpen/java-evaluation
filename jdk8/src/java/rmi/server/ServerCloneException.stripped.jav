package java.rmi.server;


public class ServerCloneException extends CloneNotSupportedException {
  public Exception detail;
  public ServerCloneException(String s) {
    super(s);
  }
  public ServerCloneException(String s, Exception cause) {
    super(s);
  }
  public String getMessage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable getCause( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}