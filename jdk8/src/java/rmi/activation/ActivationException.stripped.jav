package java.rmi.activation;


public class ActivationException extends Exception {
  public Throwable detail;
  public ActivationException( ) {
  }
  public ActivationException(String s) {
    super(s);
  }
  public ActivationException(String s, Throwable cause) {
    super(s);
  }
  public String getMessage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable getCause( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}