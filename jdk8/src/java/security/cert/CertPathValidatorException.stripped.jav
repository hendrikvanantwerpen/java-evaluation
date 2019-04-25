package java.security.cert;

import java.security.GeneralSecurityException;

public class CertPathValidatorException extends GeneralSecurityException {
  public CertPathValidatorException( ) {
    this(null, null);
  }
  public CertPathValidatorException(String msg) {
    this(msg, null);
  }
  public CertPathValidatorException(Throwable cause) {
    this(cause == null ? null : cause. toString( ), cause);
  }
  public CertPathValidatorException(String msg, Throwable cause) {
    this(msg, cause, null, -1);
  }
  public CertPathValidatorException(String msg,Throwable cause,CertPath certPath, int index) {
    this(msg, cause, certPath, index, BasicReason.UNSPECIFIED);
  }
  public CertPathValidatorException(String msg,Throwable cause,CertPath certPath,int index, Reason reason) {
    super(msg, cause);
  }
  public CertPath getCertPath( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Reason getReason( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static interface Reason extends java. io. Serializable {
  }
  public static enum BasicReason implements Reason {
    UNSPECIFIED, EXPIRED, NOT_YET_VALID, REVOKED, UNDETERMINED_REVOCATION_STATUS, INVALID_SIGNATURE, ALGORITHM_CONSTRAINED
  }
}