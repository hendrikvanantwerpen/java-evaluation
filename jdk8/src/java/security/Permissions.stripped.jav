package java.security;

import java.util.Enumeration;
import java.io.Serializable;

public final class Permissions extends PermissionCollection implements Serializable {
  public Permissions( ) {
  }
  public void add(Permission permission) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean implies(Permission permission) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Enumeration<Permission> elements( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}