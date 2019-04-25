package java.security;

import java.security.*;

public final class AllPermission extends Permission {
  public AllPermission( ) {
    super("<all permissions>");
  }
  public AllPermission(String name, String actions) {
    this( );
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
  public PermissionCollection newPermissionCollection( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}