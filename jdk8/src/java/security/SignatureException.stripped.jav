package java.security;


public class SignatureException extends GeneralSecurityException {
  public SignatureException( ) {
    super( );
  }
  public SignatureException(String msg) {
    super(msg);
  }
  public SignatureException(String message, Throwable cause) {
    super(message, cause);
  }
  public SignatureException(Throwable cause) {
    super(cause);
  }
}