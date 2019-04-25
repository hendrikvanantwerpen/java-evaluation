package java.security;


public class UnrecoverableKeyException extends UnrecoverableEntryException {
  public UnrecoverableKeyException( ) {
    super( );
  }
  public UnrecoverableKeyException(String msg) {
    super(msg);
  }
}