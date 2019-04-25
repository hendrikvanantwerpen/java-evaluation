package java.security.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

public interface ECPrivateKey extends PrivateKey, ECKey {
  static final long serialVersionUID
  ;
  BigInteger getS( ) ;
}