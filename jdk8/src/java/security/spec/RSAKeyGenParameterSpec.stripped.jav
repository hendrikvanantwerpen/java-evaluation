package java.security.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public class RSAKeyGenParameterSpec implements AlgorithmParameterSpec {
  public static final BigInteger F0;
  public static final BigInteger F4;
  public RSAKeyGenParameterSpec(int keysize, BigInteger publicExponent) {
  }
  public int getKeysize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getPublicExponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}