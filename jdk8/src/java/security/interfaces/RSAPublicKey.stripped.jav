package java.security.interfaces;

import java.math.BigInteger;

public interface RSAPublicKey extends java. security. PublicKey, RSAKey {
  static final long serialVersionUID
  ;
  public BigInteger getPublicExponent( ) ;
}