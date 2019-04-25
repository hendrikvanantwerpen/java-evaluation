package java.math;

import java.io.*;

public final class MathContext implements Serializable {
  public static final MathContext UNLIMITED;
  public static final MathContext DECIMAL32;
  public static final MathContext DECIMAL64;
  public static final MathContext DECIMAL128;
  public MathContext(int setPrecision) {
    this(setPrecision, DEFAULT_ROUNDINGMODE);
  }
  public MathContext(int setPrecision, RoundingMode setRoundingMode) {
  }
  public MathContext(String val) {
  }
  public int getPrecision( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public RoundingMode getRoundingMode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public java. lang. String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}