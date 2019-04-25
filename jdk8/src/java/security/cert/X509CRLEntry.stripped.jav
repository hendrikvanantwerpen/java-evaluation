package java.security.cert;

import java.math.BigInteger;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public abstract class X509CRLEntry implements X509Extension {
  public boolean equals(Object other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract byte [] getEncoded( ) throws CRLException ;
  public abstract BigInteger getSerialNumber( ) ;
  public X500Principal getCertificateIssuer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Date getRevocationDate( ) ;
  public abstract boolean hasExtensions( ) ;
  public abstract String toString( ) ;
  public CRLReason getRevocationReason( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}