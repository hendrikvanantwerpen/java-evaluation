package java.security;

import sun.misc.JavaSecurityAccess;

public class ProtectionDomain {
  private static class JavaSecurityAccessImpl implements JavaSecurityAccess {
    public <T> T doIntersectionPrivilege(PrivilegedAction<T> action,final AccessControlContext stack, final AccessControlContext context) {
                                                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                          }
    public <T> T doIntersectionPrivilege(PrivilegedAction<T> action, AccessControlContext context) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
  }
  final Key key;
  public ProtectionDomain(CodeSource codesource, PermissionCollection permissions) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ProtectionDomain(CodeSource codesource,PermissionCollection permissions,ClassLoader classloader, Principal [] principals) {
    throw new java . lang . RuntimeException ("Implementation stripped");
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
  boolean impliesCreateAccessControlContext( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  final class Key {
  }
}