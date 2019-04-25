package java.util.concurrent.atomic;

import java.util.function.IntUnaryOperator;
import java.util.function.IntBinaryOperator;

public class AtomicInteger extends Number implements java. io. Serializable {
  public AtomicInteger(int initialValue) {
  }
  public AtomicInteger( ) {
  }
  public final int get( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void set(int newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void lazySet(int newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndSet(int newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean compareAndSet(int expect, int update) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean weakCompareAndSet(int expect, int update) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndIncrement( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndDecrement( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndAdd(int delta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int incrementAndGet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int decrementAndGet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int addAndGet(int delta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndUpdate(IntUnaryOperator updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int updateAndGet(IntUnaryOperator updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndAccumulate(int x, IntBinaryOperator accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int accumulateAndGet(int x, IntBinaryOperator accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
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
}