package java.security.interfaces;

import java.math.BigInteger;

public interface DSAPrivateKey extends DSAKey, java. security. PrivateKey {
  static final long serialVersionUID
  ;
  public BigInteger getX( ) ;
}