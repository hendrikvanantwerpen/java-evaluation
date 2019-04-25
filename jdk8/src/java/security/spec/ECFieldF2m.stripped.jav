package java.security.spec;

import java.math.BigInteger;

public class ECFieldF2m implements ECField {
  public ECFieldF2m(int m) {
  }
  public ECFieldF2m(int m, BigInteger rp) {
  }
  public ECFieldF2m(int m, int [] ks) {
  }
  public int getFieldSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getM( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getReductionPolynomial( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getMidTermsOfReductionPolynomial( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}