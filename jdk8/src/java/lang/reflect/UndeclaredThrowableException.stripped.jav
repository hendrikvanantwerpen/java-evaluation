package java.lang.reflect;


public class UndeclaredThrowableException extends RuntimeException {
  public UndeclaredThrowableException(Throwable undeclaredThrowable) {
    super((Throwable ) null);
  }
  public UndeclaredThrowableException(Throwable undeclaredThrowable, String s) {
    super(s, null);
  }
  public Throwable getUndeclaredThrowable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable getCause( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}