package java.lang;


public class ClassNotFoundException extends ReflectiveOperationException {
  public ClassNotFoundException( ) {
    super((Throwable ) null);
  }
  public ClassNotFoundException(String s) {
    super(s, null);
  }
  public ClassNotFoundException(String s, Throwable ex) {
    super(s, null);
  }
  public Throwable getException( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable getCause( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}