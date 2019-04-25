package java.security.spec;

import java.math.BigInteger;

public class RSAPrivateKeySpec implements KeySpec {
  public RSAPrivateKeySpec(BigInteger modulus, BigInteger privateExponent) {
  }
  public BigInteger getModulus( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getPrivateExponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}