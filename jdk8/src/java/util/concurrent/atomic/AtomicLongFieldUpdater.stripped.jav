package java.util.concurrent.atomic;

import java.util.function.LongUnaryOperator;
import java.util.function.LongBinaryOperator;

public abstract class AtomicLongFieldUpdater<T> {
  public static <U> AtomicLongFieldUpdater<U> newUpdater(Class<U> tclass, String fieldName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  protected AtomicLongFieldUpdater( ) {
  }
  public abstract boolean compareAndSet(T obj,long expect, long update) ;
  public abstract boolean weakCompareAndSet(T obj,long expect, long update) ;
  public abstract void set(T obj, long newValue) ;
  public abstract void lazySet(T obj, long newValue) ;
  public abstract long get(T obj) ;
  public long getAndSet(T obj, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getAndIncrement(T obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getAndDecrement(T obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getAndAdd(T obj, long delta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long incrementAndGet(T obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long decrementAndGet(T obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long addAndGet(T obj, long delta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long getAndUpdate(T obj, LongUnaryOperator updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long updateAndGet(T obj, LongUnaryOperator updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long getAndAccumulate(T obj,long x, LongBinaryOperator accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final long accumulateAndGet(T obj,long x, LongBinaryOperator accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}