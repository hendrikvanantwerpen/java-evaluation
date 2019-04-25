package java.security.cert;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.InvalidKeyException;
import java.security.SignatureException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

public abstract class X509CRL extends CRL implements X509Extension {
  protected X509CRL( ) {
    super("X.509");
  }
  public boolean equals(Object other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract byte [] getEncoded( ) throws CRLException ;
  public abstract void verify(PublicKey key) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException ;
  public abstract void verify(PublicKey key, String sigProvider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException ;
  public void verify(PublicKey key, Provider sigProvider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int getVersion( ) ;
  public abstract Principal getIssuerDN( ) ;
  public X500Principal getIssuerX500Principal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Date getThisUpdate( ) ;
  public abstract Date getNextUpdate( ) ;
  public abstract X509CRLEntry getRevokedCertificate(BigInteger serialNumber) ;
  public X509CRLEntry getRevokedCertificate(X509Certificate certificate) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Set<? extends X509CRLEntry> getRevokedCertificates( ) ;
  public abstract byte [] getTBSCertList( ) throws CRLException ;
  public abstract byte [] getSignature( ) ;
  public abstract String getSigAlgName( ) ;
  public abstract String getSigAlgOID( ) ;
  public abstract byte [] getSigAlgParams( ) ;
}