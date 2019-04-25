package java.awt;


public class HeadlessException extends UnsupportedOperationException {
  public HeadlessException( ) {
  }
  public HeadlessException(String msg) {
    super(msg);
  }
  public String getMessage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}