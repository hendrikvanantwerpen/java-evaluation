package java.util.concurrent.atomic;

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import sun.misc.Unsafe;

public class AtomicReference<V> implements java. io. Serializable {
  private static final long serialVersionUID;
  private static final Unsafe unsafe;
  private static final long valueOffset;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  private volatile V value;
  public AtomicReference(V initialValue) {
  }
  public AtomicReference( ) {
  }
  public final V get( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public final void set(V newValue) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public final void lazySet(V newValue) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public final boolean compareAndSet(V expect, V update) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public final boolean weakCompareAndSet(V expect, V update) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public final V getAndSet(V newValue) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public final V getAndUpdate(UnaryOperator<V> updateFunction) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public final V updateAndGet(UnaryOperator<V> updateFunction) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public final V getAndAccumulate(V x, BinaryOperator<V> accumulatorFunction) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public final V accumulateAndGet(V x, BinaryOperator<V> accumulatorFunction) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}