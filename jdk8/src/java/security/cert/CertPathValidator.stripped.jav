package java.security.cert;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import sun.security.jca.*;

public class CertPathValidator {
  protected CertPathValidator(CertPathValidatorSpi validatorSpi,Provider provider, String algorithm) {
  }
  public static CertPathValidator getInstance(String algorithm) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static CertPathValidator getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static CertPathValidator getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Provider getProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getAlgorithm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final CertPathValidatorResult validate(CertPath certPath, CertPathParameters params) throws CertPathValidatorException, InvalidAlgorithmParameterException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static String getDefaultType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final CertPathChecker getRevocationChecker( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}