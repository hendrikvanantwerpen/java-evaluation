package java.util.concurrent.atomic;

import java.util.function.IntUnaryOperator;
import java.util.function.IntBinaryOperator;

public abstract class AtomicIntegerFieldUpdater<T> {
  public static <U> AtomicIntegerFieldUpdater<U> newUpdater(Class<U> tclass, String fieldName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  protected AtomicIntegerFieldUpdater( ) {
  }
  public abstract boolean compareAndSet(T obj,int expect, int update) ;
  public abstract boolean weakCompareAndSet(T obj,int expect, int update) ;
  public abstract void set(T obj, int newValue) ;
  public abstract void lazySet(T obj, int newValue) ;
  public abstract int get(T obj) ;
  public int getAndSet(T obj, int newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getAndIncrement(T obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getAndDecrement(T obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getAndAdd(T obj, int delta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int incrementAndGet(T obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int decrementAndGet(T obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int addAndGet(T obj, int delta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndUpdate(T obj, IntUnaryOperator updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int updateAndGet(T obj, IntUnaryOperator updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getAndAccumulate(T obj,int x, IntBinaryOperator accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int accumulateAndGet(T obj,int x, IntBinaryOperator accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}