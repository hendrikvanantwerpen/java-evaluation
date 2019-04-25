package java.util.concurrent.atomic;

import java.util.function.IntUnaryOperator;
import java.util.function.IntBinaryOperator;

public class AtomicIntegerArray implements java. io. Serializable {
  public AtomicIntegerArray(int length) {
  }
  public AtomicIntegerArray(int [] array) {
  }
  public final int length( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int get(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void set(int i, int newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void lazySet(int i, int newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndSet(int i, int newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean compareAndSet(int i,int expect, int update) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean weakCompareAndSet(int i,int expect, int update) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndIncrement(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndDecrement(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndAdd(int i, int delta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int incrementAndGet(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int decrementAndGet(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int addAndGet(int i, int delta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndUpdate(int i, IntUnaryOperator updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int updateAndGet(int i, IntUnaryOperator updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndAccumulate(int i,int x, IntBinaryOperator accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int accumulateAndGet(int i,int x, IntBinaryOperator accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}