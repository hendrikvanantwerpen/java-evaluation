package java.security.spec;

import java.math.BigInteger;

public class RSAPublicKeySpec implements KeySpec {
  public RSAPublicKeySpec(BigInteger modulus, BigInteger publicExponent) {
  }
  public BigInteger getModulus( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getPublicExponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}