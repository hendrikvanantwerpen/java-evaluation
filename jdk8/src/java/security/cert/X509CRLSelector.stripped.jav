package java.security.cert;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import javax.security.auth.x500.X500Principal;

public class X509CRLSelector implements CRLSelector {
  public X509CRLSelector( ) {
  }
  public void setIssuers(Collection<X500Principal> issuers) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setIssuerNames(Collection<?> names) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addIssuer(X500Principal issuer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addIssuerName(String name) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addIssuerName(byte [] name) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMinCRLNumber(BigInteger minCRL) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMaxCRLNumber(BigInteger maxCRL) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDateAndTime(Date dateAndTime) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCertificateChecking(X509Certificate cert) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Collection<X500Principal> getIssuers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Collection<Object> getIssuerNames( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getMinCRL( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getMaxCRL( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Date getDateAndTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public X509Certificate getCertificateChecking( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean match(CRL crl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}