package java.util.concurrent.atomic;

import java.io.Serializable;
import java.util.function.LongBinaryOperator;

public class LongAccumulator extends Striped64 implements Serializable {
  public LongAccumulator(LongBinaryOperator accumulatorFunction, long identity) {
  }
  public void accumulate(long x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long get( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getThenReset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long longValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int intValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float floatValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double doubleValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}