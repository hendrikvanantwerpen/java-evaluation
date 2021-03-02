package java.util.concurrent.atomic;

import java.util.function.LongUnaryOperator;
import java.util.function.LongBinaryOperator;
import sun.misc.Unsafe;

public class AtomicLong extends Number implements java. io. Serializable {
  private static final long serialVersionUID;
  private static final Unsafe unsafe;
  private static final long valueOffset;
  static final boolean VM_SUPPORTS_LONG_CAS;
  private static native boolean VMSupportsCS8( ) ;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  private volatile long value;
  public AtomicLong(long initialValue) {
  }
  public AtomicLong( ) {
  }
  public final long get( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public final void set(long newValue) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public final void lazySet(long newValue) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public final long getAndSet(long newValue) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public final boolean compareAndSet(long expect, long update) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public final boolean weakCompareAndSet(long expect, long update) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public final long getAndIncrement( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public final long getAndDecrement( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public final long getAndAdd(long delta) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public final long incrementAndGet( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public final long decrementAndGet( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public final long addAndGet(long delta) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public final long getAndUpdate(LongUnaryOperator updateFunction) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public final long updateAndGet(LongUnaryOperator updateFunction) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public final long getAndAccumulate(long x, LongBinaryOperator accumulatorFunction) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  public final long accumulateAndGet(long x, LongBinaryOperator accumulatorFunction) {
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