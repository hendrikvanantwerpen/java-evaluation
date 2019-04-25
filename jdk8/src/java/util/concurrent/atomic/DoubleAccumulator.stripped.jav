package java.util.concurrent.atomic;

import java.io.Serializable;
import java.util.function.DoubleBinaryOperator;

public class DoubleAccumulator extends Striped64 implements Serializable {
  public DoubleAccumulator(DoubleBinaryOperator accumulatorFunction, double identity) {
  }
  public void accumulate(double x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double get( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getThenReset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double doubleValue( ) {
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
}