package java.security;

import java.io.Serializable;
import java.util.*;

public abstract class Identity implements Principal, Serializable {
  protected Identity( ) {
    this("restoring...");
  }
  public Identity(String name, IdentityScope scope) throws KeyManagementException{
    this(name);
  }
  public Identity(String name) {
  }
  public final String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final IdentityScope getScope( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PublicKey getPublicKey( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPublicKey(PublicKey key) throws KeyManagementException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setInfo(String info) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getInfo( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addCertificate(Certificate certificate) throws KeyManagementException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeCertificate(Certificate certificate) throws KeyManagementException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Certificate [] certificates( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean equals(Object identity) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString(boolean detailed) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}