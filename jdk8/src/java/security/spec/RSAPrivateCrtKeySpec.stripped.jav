package java.security.spec;

import java.math.BigInteger;

public class RSAPrivateCrtKeySpec extends RSAPrivateKeySpec {
  public RSAPrivateCrtKeySpec(BigInteger modulus,BigInteger publicExponent,BigInteger privateExponent,BigInteger primeP,BigInteger primeQ,BigInteger primeExponentP,BigInteger primeExponentQ, BigInteger crtCoefficient) {
    super(modulus, privateExponent);
  }
  public BigInteger getPublicExponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getPrimeP( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getPrimeQ( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getPrimeExponentP( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getPrimeExponentQ( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getCrtCoefficient( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}