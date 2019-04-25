package java.security.cert;

import java.util.Date;
import java.util.Map;
import javax.security.auth.x500.X500Principal;

public class CertificateRevokedException extends CertificateException {
  public CertificateRevokedException(Date revocationDate,CRLReason reason,X500Principal authority, Map<String, Extension> extensions) {
  }
  public Date getRevocationDate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CRLReason getRevocationReason( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public X500Principal getAuthorityName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Date getInvalidityDate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map<String, Extension> getExtensions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getMessage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}