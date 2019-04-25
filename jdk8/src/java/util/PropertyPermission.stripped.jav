package java.util;

import java.security.*;

public final class PropertyPermission extends BasicPermission {
  public PropertyPermission(String name, String actions) {
    super(name, actions);
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