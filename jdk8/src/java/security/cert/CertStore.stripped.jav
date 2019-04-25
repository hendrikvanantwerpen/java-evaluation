package java.security.cert;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;
import sun.security.jca.*;

public class CertStore {
  protected CertStore(CertStoreSpi storeSpi,Provider provider,String type, CertStoreParameters params) {
  }
  public final Collection<? extends Certificate> getCertificates(CertSelector selector) throws CertStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Collection<? extends CRL> getCRLs(CRLSelector selector) throws CertStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static CertStore getInstance(String type, CertStoreParameters params) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static CertStore getInstance(String type,CertStoreParameters params, String provider) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static CertStore getInstance(String type,CertStoreParameters params, Provider provider) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final CertStoreParameters getCertStoreParameters( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Provider getProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static String getDefaultType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}