package java.security.cert;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Set;

public class PKIXBuilderParameters extends PKIXParameters {
  public PKIXBuilderParameters(Set<TrustAnchor> trustAnchors, CertSelector targetConstraints) throws InvalidAlgorithmParameterException{
    super(trustAnchors);
  }
  public PKIXBuilderParameters(KeyStore keystore, CertSelector targetConstraints) throws KeyStoreException, InvalidAlgorithmParameterException{
    super(keystore);
  }
  public void setMaxPathLength(int maxPathLength) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMaxPathLength( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}