package java.io;


public class WriteAbortedException extends ObjectStreamException {
  public Exception detail;
  public WriteAbortedException(String s, Exception ex) {
    super(s);
  }
  public String getMessage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable getCause( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}