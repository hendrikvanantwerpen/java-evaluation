package java.security.spec;

import java.math.BigInteger;

public class ECPrivateKeySpec implements KeySpec {
  public ECPrivateKeySpec(BigInteger s, ECParameterSpec params) {
  }
  public BigInteger getS( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ECParameterSpec getParams( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}