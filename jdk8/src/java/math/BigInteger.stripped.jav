package java.math;

import java.util.Random;

public class BigInteger extends Number implements Comparable<BigInteger> {
  public BigInteger(byte [] val) {
  }
  private BigInteger(int [] val) {
  }
  public BigInteger(int signum, byte [] magnitude) {
  }
  private BigInteger(int signum, int [] magnitude) {
  }
  public BigInteger(String val, int radix) {
  }
  BigInteger(char [] val,int sign, int len) {
  }
  public BigInteger(String val) {
    this(val, 10);
  }
  public BigInteger(int numBits, Random rnd) {
    this(1, randomBits(numBits, rnd));
  }
  public BigInteger(int bitLength,int certainty, Random rnd) {
  }
  public static BigInteger probablePrime(int bitLength, Random rnd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger nextProbablePrime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  BigInteger(int [] magnitude, int signum) {
  }
  private BigInteger(byte [] magnitude, int signum) {
  }
  public static BigInteger valueOf(long val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private BigInteger(long val) {
  }
  public static final BigInteger ZERO;
  public static final BigInteger ONE;
  public static final BigInteger TEN;
  public BigInteger add(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger subtract(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger multiply(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger divide(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger [] divideAndRemainder(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger remainder(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger pow(int exponent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger gcd(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger abs( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger negate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int signum( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger mod(BigInteger m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger modPow(BigInteger exponent, BigInteger m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger modInverse(BigInteger m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger shiftLeft(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger shiftRight(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger and(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger or(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger xor(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger not( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger andNot(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean testBit(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger setBit(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger clearBit(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger flipBit(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getLowestSetBit( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int bitLength( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int bitCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isProbablePrime(int certainty) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger min(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger max(BigInteger val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString(int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] toByteArray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int intValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long longValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float floatValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double doubleValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long longValueExact( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int intValueExact( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public short shortValueExact( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte byteValueExact( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}