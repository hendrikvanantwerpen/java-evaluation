package java.util.concurrent.atomic;

import java.util.function.LongUnaryOperator;
import java.util.function.LongBinaryOperator;

public class AtomicLongArray implements java. io. Serializable {
  public AtomicLongArray(int length) {
  }
  public AtomicLongArray(long [] array) {
  }
  public final int length( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long get(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void set(int i, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void lazySet(int i, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long getAndSet(int i, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean compareAndSet(int i,long expect, long update) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean weakCompareAndSet(int i,long expect, long update) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long getAndIncrement(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long getAndDecrement(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long getAndAdd(int i, long delta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long incrementAndGet(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long decrementAndGet(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long addAndGet(int i, long delta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long getAndUpdate(int i, LongUnaryOperator updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long updateAndGet(int i, LongUnaryOperator updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long getAndAccumulate(int i,long x, LongBinaryOperator accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long accumulateAndGet(int i,long x, LongBinaryOperator accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}