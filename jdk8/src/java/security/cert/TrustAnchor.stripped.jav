package java.security.cert;

import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

public class TrustAnchor {
  public TrustAnchor(X509Certificate trustedCert, byte [] nameConstraints) {
  }
  public TrustAnchor(X500Principal caPrincipal,PublicKey pubKey, byte [] nameConstraints) {
  }
  public TrustAnchor(String caName,PublicKey pubKey, byte [] nameConstraints) {
  }
  public final X509Certificate getTrustedCert( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final X500Principal getCA( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getCAName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final PublicKey getCAPublicKey( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final byte [] getNameConstraints( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}