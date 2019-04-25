package java.security.spec;

import java.math.BigInteger;

public class RSAMultiPrimePrivateCrtKeySpec extends RSAPrivateKeySpec {
  public RSAMultiPrimePrivateCrtKeySpec(BigInteger modulus,BigInteger publicExponent,BigInteger privateExponent,BigInteger primeP,BigInteger primeQ,BigInteger primeExponentP,BigInteger primeExponentQ,BigInteger crtCoefficient, RSAOtherPrimeInfo [] otherPrimeInfo) {
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
  public RSAOtherPrimeInfo [] getOtherPrimeInfo( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}