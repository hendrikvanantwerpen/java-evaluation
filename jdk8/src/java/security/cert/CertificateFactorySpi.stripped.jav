package java.security.cert;

import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class CertificateFactorySpi {
  public abstract Certificate engineGenerateCertificate(InputStream inStream) throws CertificateException ;
  public CertPath engineGenerateCertPath(InputStream inStream) throws CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CertPath engineGenerateCertPath(InputStream inStream, String encoding) throws CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CertPath engineGenerateCertPath(List<? extends Certificate> certificates) throws CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<String> engineGetCertPathEncodings( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Collection<? extends Certificate> engineGenerateCertificates(InputStream inStream) throws CertificateException ;
  public abstract CRL engineGenerateCRL(InputStream inStream) throws CRLException ;
  public abstract Collection<? extends CRL> engineGenerateCRLs(InputStream inStream) throws CRLException ;
}