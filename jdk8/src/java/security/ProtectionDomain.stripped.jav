package java.security;


public class ProtectionDomain {
  public ProtectionDomain(CodeSource codesource, PermissionCollection permissions) {
  }
  public ProtectionDomain(CodeSource codesource,PermissionCollection permissions,ClassLoader classloader, Principal [] principals) {
  }
  public final CodeSource getCodeSource( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final ClassLoader getClassLoader( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Principal [] getPrincipals( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final PermissionCollection getPermissions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean implies(Permission permission) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}