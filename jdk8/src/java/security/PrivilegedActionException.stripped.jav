package java.security;


public class PrivilegedActionException extends Exception {
  public PrivilegedActionException(Exception exception) {
    super((Throwable ) null);
  }
  public Exception getException( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable getCause( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}