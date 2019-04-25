package java.security.spec;

import java.math.BigInteger;

public class ECParameterSpec implements AlgorithmParameterSpec {
  public ECParameterSpec(EllipticCurve curve,ECPoint g,BigInteger n, int h) {
  }
  public EllipticCurve getCurve( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ECPoint getGenerator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getOrder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getCofactor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}