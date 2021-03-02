package java.lang;


public class ReflectiveOperationException extends Exception {
  static final long serialVersionUID;
  public ReflectiveOperationException( ) {
    super( );
  }
  public ReflectiveOperationException(String message) {
    super(message);
  }
  public ReflectiveOperationException(String message, Throwable cause) {
    super(message, cause);
  }
  public ReflectiveOperationException(Throwable cause) {
    super(cause);
  }
}