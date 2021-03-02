package java.io;


public class IOException extends Exception {
  static final long serialVersionUID;
  public IOException( ) {
    super( );
  }
  public IOException(String message) {
    super(message);
  }
  public IOException(String message, Throwable cause) {
    super(message, cause);
  }
  public IOException(Throwable cause) {
    super(cause);
  }
}