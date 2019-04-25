package java.security.cert;

import java.math.BigInteger;
import java.security.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.security.auth.x500.X500Principal;

public abstract class X509Certificate extends Certificate implements X509Extension {
  protected X509Certificate( ) {
    super("X.509");
  }
  public abstract void checkValidity( ) throws CertificateExpiredException, CertificateNotYetValidException ;
  public abstract void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException ;
  public abstract int getVersion( ) ;
  public abstract BigInteger getSerialNumber( ) ;
  public abstract Principal getIssuerDN( ) ;
  public X500Principal getIssuerX500Principal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Principal getSubjectDN( ) ;
  public X500Principal getSubjectX500Principal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Date getNotBefore( ) ;
  public abstract Date getNotAfter( ) ;
  public abstract byte [] getTBSCertificate( ) throws CertificateEncodingException ;
  public abstract byte [] getSignature( ) ;
  public abstract String getSigAlgName( ) ;
  public abstract String getSigAlgOID( ) ;
  public abstract byte [] getSigAlgParams( ) ;
  public abstract boolean [] getIssuerUniqueID( ) ;
  public abstract boolean [] getSubjectUniqueID( ) ;
  public abstract boolean [] getKeyUsage( ) ;
  public List<String> getExtendedKeyUsage( ) throws CertificateParsingException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int getBasicConstraints( ) ;
  public Collection<List<?>> getSubjectAlternativeNames( ) throws CertificateParsingException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Collection<List<?>> getIssuerAlternativeNames( ) throws CertificateParsingException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void verify(PublicKey key, Provider sigProvider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}