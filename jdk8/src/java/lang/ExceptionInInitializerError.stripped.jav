package java.lang;


public class ExceptionInInitializerError extends LinkageError {
  public ExceptionInInitializerError( ) {
  }
  public ExceptionInInitializerError(Throwable thrown) {
  }
  public ExceptionInInitializerError(String s) {
    super(s);
  }
  public Throwable getException( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable getCause( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}