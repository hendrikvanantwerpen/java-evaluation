package java.util;

import java.io.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import sun.misc.Unsafe;

public class Random implements java. io. Serializable {
  static final long serialVersionUID;
  private final AtomicLong seed;
  private static final long multiplier;
  private static final long addend;
  private static final long mask;
  private static final double DOUBLE_UNIT;
  static final String BadBound;
  static final String BadRange;
  static final String BadSize;
  public Random( ) {
    this(seedUniquifier( ) ^ System. nanoTime( ));
  }
  private static long seedUniquifier( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private static final AtomicLong seedUniquifier;
  public Random(long seed) {
  }
  private static long initialScramble(long seed) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  synchronized public void setSeed(long seed) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  protected int next(int bits) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public void nextBytes(byte [] bytes) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  final long internalNextLong(long origin, long bound) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  final int internalNextInt(int origin, int bound) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  final double internalNextDouble(double origin, double bound) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public int nextInt( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public int nextInt(int bound) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public long nextLong( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public boolean nextBoolean( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public float nextFloat( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public double nextDouble( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  private double nextNextGaussian;
  private boolean haveNextNextGaussian;
  synchronized public double nextGaussian( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public IntStream ints(long streamSize) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public IntStream ints( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public IntStream ints(long streamSize,int randomNumberOrigin, int randomNumberBound) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
  public IntStream ints(int randomNumberOrigin, int randomNumberBound) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public LongStream longs(long streamSize) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public LongStream longs( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public LongStream longs(long streamSize,long randomNumberOrigin, long randomNumberBound) {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  public LongStream longs(long randomNumberOrigin, long randomNumberBound) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  public DoubleStream doubles(long streamSize) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public DoubleStream doubles( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public DoubleStream doubles(long streamSize,double randomNumberOrigin, double randomNumberBound) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
  public DoubleStream doubles(double randomNumberOrigin, double randomNumberBound) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  static final class RandomIntsSpliterator implements Spliterator. OfInt {
    final Random rng;
    long index;
    final long fence;
    final int origin;
    final int bound;
    RandomIntsSpliterator(Random rng,long index,long fence,int origin, int bound) {
    }
    public RandomIntsSpliterator trySplit( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public long estimateSize( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public int characteristics( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    public boolean tryAdvance(IntConsumer consumer) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public void forEachRemaining(IntConsumer consumer) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  }
  static final class RandomLongsSpliterator implements Spliterator. OfLong {
    final Random rng;
    long index;
    final long fence;
    final long origin;
    final long bound;
    RandomLongsSpliterator(Random rng,long index,long fence,long origin, long bound) {
    }
    public RandomLongsSpliterator trySplit( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public long estimateSize( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public int characteristics( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    public boolean tryAdvance(LongConsumer consumer) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    public void forEachRemaining(LongConsumer consumer) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  }
  static final class RandomDoublesSpliterator implements Spliterator. OfDouble {
    final Random rng;
    long index;
    final long fence;
    final double origin;
    final double bound;
    RandomDoublesSpliterator(Random rng,long index,long fence,double origin, double bound) {
    }
    public RandomDoublesSpliterator trySplit( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    public long estimateSize( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public int characteristics( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    public boolean tryAdvance(DoubleConsumer consumer) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    public void forEachRemaining(DoubleConsumer consumer) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  }
  private static final ObjectStreamField [] serialPersistentFields;
  private void readObject(java. io. ObjectInputStream s) throws java. io. IOException, ClassNotFoundException {
                                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                              }
  synchronized private void writeObject(ObjectOutputStream s) throws IOException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  private static final Unsafe unsafe;
  private static final long seedOffset;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  private void resetSeed(long seedVal) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
}