package java.security.spec;

import java.math.BigInteger;

public class EllipticCurve {
  public EllipticCurve(ECField field,BigInteger a, BigInteger b) {
    this(field, a, b, null);
  }
  public EllipticCurve(ECField field,BigInteger a,BigInteger b, byte [] seed) {
  }
  public ECField getField( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getA( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getB( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getSeed( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}