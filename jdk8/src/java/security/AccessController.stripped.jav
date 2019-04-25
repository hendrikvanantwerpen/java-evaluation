package java.security;


public final class AccessController {
  private AccessController( ) {
  }
  public static native <T> T doPrivileged(PrivilegedAction<T> action) ;
  public static <T> T doPrivilegedWithCombiner(PrivilegedAction<T> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static native <T> T doPrivileged(PrivilegedAction<T> action, AccessControlContext context) ;
  public static <T> T doPrivileged(PrivilegedAction<T> action,AccessControlContext context, Permission ... perms) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> T doPrivilegedWithCombiner(PrivilegedAction<T> action,AccessControlContext context, Permission ... perms) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static native <T> T doPrivileged(PrivilegedExceptionAction<T> action) throws PrivilegedActionException ;
  public static <T> T doPrivilegedWithCombiner(PrivilegedExceptionAction<T> action) throws PrivilegedActionException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static native <T> T doPrivileged(PrivilegedExceptionAction<T> action, AccessControlContext context) throws PrivilegedActionException ;
  public static <T> T doPrivileged(PrivilegedExceptionAction<T> action,AccessControlContext context, Permission ... perms) throws PrivilegedActionException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> T doPrivilegedWithCombiner(PrivilegedExceptionAction<T> action,AccessControlContext context, Permission ... perms) throws PrivilegedActionException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AccessControlContext getContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void checkPermission(Permission perm) throws AccessControlException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}