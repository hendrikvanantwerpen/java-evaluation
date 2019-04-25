package java.util.concurrent.atomic;

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class AtomicReferenceArray<E> implements java. io. Serializable {
  public AtomicReferenceArray(int length) {
  }
  public AtomicReferenceArray(E [] array) {
  }
  public final int length( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final E get(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void set(int i, E newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void lazySet(int i, E newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final E getAndSet(int i, E newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean compareAndSet(int i,E expect, E update) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean weakCompareAndSet(int i,E expect, E update) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final E getAndUpdate(int i, UnaryOperator<E> updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final E updateAndGet(int i, UnaryOperator<E> updateFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final E getAndAccumulate(int i,E x, BinaryOperator<E> accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final E accumulateAndGet(int i,E x, BinaryOperator<E> accumulatorFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}