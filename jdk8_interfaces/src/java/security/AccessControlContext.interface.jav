package java.security;

import sun.security.util.Debug;

public final class AccessControlContext {
  static Debug getDebug( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public AccessControlContext(ProtectionDomain context[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessControlContext(AccessControlContext acc, DomainCombiner combiner) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  AccessControlContext(AccessControlContext acc,DomainCombiner combiner, boolean preauthorized) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  AccessControlContext(ProtectionDomain caller,DomainCombiner combiner,AccessControlContext parent,AccessControlContext context, Permission [] perms) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  AccessControlContext(ProtectionDomain context[], boolean isPrivileged) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  AccessControlContext(ProtectionDomain [] context, AccessControlContext privilegedContext) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ProtectionDomain [] getContext( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  boolean isPrivileged( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  DomainCombiner getAssignedCombiner( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public DomainCombiner getDomainCombiner( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  DomainCombiner getCombiner( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  boolean isAuthorized( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public void checkPermission(Permission perm) throws AccessControlException {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  AccessControlContext optimize( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
}