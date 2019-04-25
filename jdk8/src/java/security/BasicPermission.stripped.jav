package java.security;


public abstract class BasicPermission extends Permission implements java. io. Serializable {
  public BasicPermission(String name) {
    super(name);
  }
  public BasicPermission(String name, String actions) {
    super(name);
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