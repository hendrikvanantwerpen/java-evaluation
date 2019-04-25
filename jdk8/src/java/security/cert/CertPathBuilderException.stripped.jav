package java.security.cert;

import java.security.GeneralSecurityException;

public class CertPathBuilderException extends GeneralSecurityException {
  public CertPathBuilderException( ) {
    super( );
  }
  public CertPathBuilderException(String msg) {
    super(msg);
  }
  public CertPathBuilderException(Throwable cause) {
    super(cause);
  }
  public CertPathBuilderException(String msg, Throwable cause) {
    super(msg, cause);
  }
}