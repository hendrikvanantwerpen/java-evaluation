package java.security;

import java.util.Enumeration;

public abstract class IdentityScope extends Identity {
  protected IdentityScope( ) {
    this("restoring...");
  }
  public IdentityScope(String name) {
    super(name);
  }
  public IdentityScope(String name, IdentityScope scope) throws KeyManagementException{
    super(name, scope);
  }
  public static IdentityScope getSystemScope( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int size( ) ;
  public abstract Identity getIdentity(String name) ;
  public Identity getIdentity(Principal principal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Identity getIdentity(PublicKey key) ;
  public abstract void addIdentity(Identity identity) throws KeyManagementException ;
  public abstract void removeIdentity(Identity identity) throws KeyManagementException ;
  public abstract Enumeration<Identity> identities( ) ;
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}