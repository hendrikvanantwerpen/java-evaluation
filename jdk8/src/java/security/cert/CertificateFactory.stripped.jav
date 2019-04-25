package java.security.cert;

import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.security.Provider;
import java.security.NoSuchProviderException;
import sun.security.jca.*;

public class CertificateFactory {
  protected CertificateFactory(CertificateFactorySpi certFacSpi,Provider provider, String type) {
  }
  public static final CertificateFactory getInstance(String type) throws CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final CertificateFactory getInstance(String type, String provider) throws CertificateException, NoSuchProviderException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final CertificateFactory getInstance(String type, Provider provider) throws CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Provider getProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Certificate generateCertificate(InputStream inStream) throws CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Iterator<String> getCertPathEncodings( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final CertPath generateCertPath(InputStream inStream) throws CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final CertPath generateCertPath(InputStream inStream, String encoding) throws CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final CertPath generateCertPath(List<? extends Certificate> certificates) throws CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Collection<? extends Certificate> generateCertificates(InputStream inStream) throws CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final CRL generateCRL(InputStream inStream) throws CRLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Collection<? extends CRL> generateCRLs(InputStream inStream) throws CRLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}