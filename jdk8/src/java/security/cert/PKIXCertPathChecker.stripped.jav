package java.security.cert;

import java.util.Collection;
import java.util.Set;

public abstract class PKIXCertPathChecker implements CertPathChecker, Cloneable {
  protected PKIXCertPathChecker( ) {
  }
  public abstract void init(boolean forward) throws CertPathValidatorException ;
  public abstract boolean isForwardCheckingSupported( ) ;
  public abstract Set<String> getSupportedExtensions( ) ;
  public abstract void check(Certificate cert, Collection<String> unresolvedCritExts) throws CertPathValidatorException ;
  public void check(Certificate cert) throws CertPathValidatorException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}