package java.net;

import java.security.Permission;

public final class URLPermission extends Permission {
  public URLPermission(String url, String actions) {
    super(url);
  }
  public URLPermission(String url) {
    this(url, "*:*");
  }
  public String getActions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean implies(Permission p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}