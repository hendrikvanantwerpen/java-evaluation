package java.security.cert;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class PKIXRevocationChecker extends PKIXCertPathChecker {
  protected PKIXRevocationChecker( ) {
  }
  public void setOcspResponder(URI uri) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URI getOcspResponder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOcspResponderCert(X509Certificate cert) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public X509Certificate getOcspResponderCert( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOcspExtensions(List<Extension> extensions) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<Extension> getOcspExtensions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOcspResponses(Map<X509Certificate, byte []> responses) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map<X509Certificate, byte []> getOcspResponses( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOptions(Set<Option> options) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<Option> getOptions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract List<CertPathValidatorException> getSoftFailExceptions( ) ;
  public PKIXRevocationChecker clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public enum Option {
    ONLY_END_ENTITY, PREFER_CRLS, NO_FALLBACK, SOFT_FAIL
  }
}