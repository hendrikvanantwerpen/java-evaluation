package java.security.spec;

import java.math.BigInteger;

public class DSAParameterSpec implements AlgorithmParameterSpec, java. security. interfaces. DSAParams {
  public DSAParameterSpec(BigInteger p,BigInteger q, BigInteger g) {
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