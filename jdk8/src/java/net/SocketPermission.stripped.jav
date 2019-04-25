package java.net;

import java.security.Permission;
import java.security.PermissionCollection;

public final class SocketPermission extends Permission implements java. io. Serializable {
  public SocketPermission(String host, String action) {
    super(getHost(host));
  }
  SocketPermission(String host, int mask) {
    super(getHost(host));
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