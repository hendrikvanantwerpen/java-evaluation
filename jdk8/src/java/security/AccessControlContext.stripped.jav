package java.security;


public final class AccessControlContext {
  public AccessControlContext(ProtectionDomain context[]) {
  }
  public AccessControlContext(AccessControlContext acc, DomainCombiner combiner) {
  }
  AccessControlContext(ProtectionDomain caller,DomainCombiner combiner,AccessControlContext parent,AccessControlContext context, Permission [] perms) {
  }
  AccessControlContext(ProtectionDomain context[], boolean isPrivileged) {
  }
  AccessControlContext(ProtectionDomain [] context, AccessControlContext privilegedContext) {
  }
  public DomainCombiner getDomainCombiner( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkPermission(Permission perm) throws AccessControlException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}