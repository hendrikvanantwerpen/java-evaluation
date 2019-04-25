package java.security;

import java.io.*;

public abstract class Signer extends Identity {
  protected Signer( ) {
    super( );
  }
  public Signer(String name) {
    super(name);
  }
  public Signer(String name, IdentityScope scope) throws KeyManagementException{
    super(name, scope);
  }
  public PrivateKey getPrivateKey( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setKeyPair(KeyPair pair) throws InvalidParameterException, KeyException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}