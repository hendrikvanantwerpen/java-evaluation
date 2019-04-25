package java.security.interfaces;

import java.math.BigInteger;

public interface DSAPublicKey extends DSAKey, java. security. PublicKey {
  static final long serialVersionUID
  ;
  public BigInteger getY( ) ;
}