package java.security;


public class AccessControlException extends SecurityException {
  public AccessControlException(String s) {
    super(s);
  }
  public AccessControlException(String s, Permission p) {
    super(s);
  }
  public Permission getPermission( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}