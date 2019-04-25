package java.security;

import java.lang.reflect.*;
import java.security.cert.*;

public final class UnresolvedPermission extends Permission implements java. io. Serializable {
  public UnresolvedPermission(String type,String name,String actions, java. security. cert. Certificate certs[]) {
    super(type);
  }
  public boolean implies(Permission p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getActions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getUnresolvedType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getUnresolvedName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getUnresolvedActions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public java. security. cert. Certificate [] getUnresolvedCerts( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PermissionCollection newPermissionCollection( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}