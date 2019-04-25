package java.security.cert;

import java.security.Provider;
import java.security.PublicKey;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.InvalidKeyException;
import java.security.SignatureException;

public abstract class Certificate implements java. io. Serializable {
  protected Certificate(String type) {
  }
  public final String getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract byte [] getEncoded( ) throws CertificateEncodingException ;
  public abstract void verify(PublicKey key) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException ;
  public abstract void verify(PublicKey key, String sigProvider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException ;
  public void verify(PublicKey key, Provider sigProvider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract String toString( ) ;
  public abstract PublicKey getPublicKey( ) ;
}