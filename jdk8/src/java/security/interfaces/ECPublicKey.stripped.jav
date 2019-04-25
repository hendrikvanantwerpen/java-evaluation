package java.security.interfaces;

import java.security.PublicKey;
import java.security.spec.ECPoint;

public interface ECPublicKey extends PublicKey, ECKey {
  static final long serialVersionUID
  ;
  ECPoint getW( ) ;
}