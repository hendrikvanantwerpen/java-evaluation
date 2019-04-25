package java.security.cert;

import java.security.PublicKey;

public class PKIXCertPathValidatorResult implements CertPathValidatorResult {
  public PKIXCertPathValidatorResult(TrustAnchor trustAnchor,PolicyNode policyTree, PublicKey subjectPublicKey) {
  }
  public TrustAnchor getTrustAnchor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PolicyNode getPolicyTree( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PublicKey getPublicKey( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}