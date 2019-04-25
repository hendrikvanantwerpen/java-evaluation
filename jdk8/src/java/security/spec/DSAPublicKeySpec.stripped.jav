package java.security.spec;

import java.math.BigInteger;

public class DSAPublicKeySpec implements KeySpec {
  public DSAPublicKeySpec(BigInteger y,BigInteger p,BigInteger q, BigInteger g) {
  }
  public BigInteger getY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getP( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getQ( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getG( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}