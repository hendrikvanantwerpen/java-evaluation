package java.util.concurrent.atomic;

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public abstract class AtomicReferenceFieldUpdater<T,V> {
  public static <U,W> AtomicReferenceFieldUpdater<U, W> newUpdater(Class<U> tclass,Class<W> vclass, String fieldName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  protected AtomicReferenceFieldUpdater( ) {
  }
  public abstract boolean compareAndSet(T obj,V expect, V update) ;
  public abstract boolean weakCompareAndSet(T obj,V expect, V update) ;
  public abstract void set(T obj, V newValue) ;
  public abstract void lazySet(T obj, V newValue) ;
  public abstract V get(T obj) ;
  public V getAndSet(T obj, V newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final V getAndUpdate(T obj, UnaryOperator<V> updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final V updateAndGet(T obj, UnaryOperator<V> updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final V getAndAccumulate(T obj,V x, BinaryOperator<V> accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final V accumulateAndGet(T obj,V x, BinaryOperator<V> accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}