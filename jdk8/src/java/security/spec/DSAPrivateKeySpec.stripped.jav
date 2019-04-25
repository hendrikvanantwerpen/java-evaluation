package java.security.spec;

import java.math.BigInteger;

public class DSAPrivateKeySpec implements KeySpec {
  public DSAPrivateKeySpec(BigInteger x,BigInteger p,BigInteger q, BigInteger g) {
  }
  public BigInteger getX( ) {
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