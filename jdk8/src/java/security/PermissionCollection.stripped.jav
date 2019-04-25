package java.security;

import java.util.*;

public abstract class PermissionCollection implements java. io. Serializable {
  public abstract void add(Permission permission) ;
  public abstract boolean implies(Permission permission) ;
  public abstract Enumeration<Permission> elements( ) ;
  public void setReadOnly( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isReadOnly( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}