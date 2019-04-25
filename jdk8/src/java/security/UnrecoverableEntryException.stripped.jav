package java.security;


public class UnrecoverableEntryException extends GeneralSecurityException {
  public UnrecoverableEntryException( ) {
    super( );
  }
  public UnrecoverableEntryException(String msg) {
    super(msg);
  }
}