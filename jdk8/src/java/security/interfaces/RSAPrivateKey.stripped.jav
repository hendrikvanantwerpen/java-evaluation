package java.security.interfaces;

import java.math.BigInteger;

public interface RSAPrivateKey extends java. security. PrivateKey, RSAKey {
  static final long serialVersionUID
  ;
  public BigInteger getPrivateExponent( ) ;
}