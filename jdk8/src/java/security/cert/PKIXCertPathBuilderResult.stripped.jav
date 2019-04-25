package java.security.cert;

import java.security.PublicKey;

public class PKIXCertPathBuilderResult extends PKIXCertPathValidatorResult implements CertPathBuilderResult {
  public PKIXCertPathBuilderResult(CertPath certPath,TrustAnchor trustAnchor,PolicyNode policyTree, PublicKey subjectPublicKey) {
    super(trustAnchor, policyTree, subjectPublicKey);
  }
  public CertPath getCertPath( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}