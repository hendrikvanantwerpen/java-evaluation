package java.security;

import java.io.*;
import java.security.cert.CertPath;

public final class CodeSigner implements Serializable {
  public CodeSigner(CertPath signerCertPath, Timestamp timestamp) {
  }
  public CertPath getSignerCertPath( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Timestamp getTimestamp( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}