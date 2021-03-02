package java.util;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.stream.IntStream;

public class BitSet implements Cloneable, java. io. Serializable {
  private final static int ADDRESS_BITS_PER_WORD;
  private final static int BITS_PER_WORD;
  private final static int BIT_INDEX_MASK;
  private static final long WORD_MASK;
  private static final ObjectStreamField [] serialPersistentFields;
  private long [] words;
  private transient int wordsInUse;
  private transient boolean sizeIsSticky;
  private static final long serialVersionUID;
  private static int wordIndex(int bitIndex) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private void checkInvariants( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private void recalculateWordsInUse( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public BitSet( ) {
  }
  public BitSet(int nbits) {
  }
  private void initWords(int nbits) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  private BitSet(long [] words) {
  }
  public static BitSet valueOf(long [] longs) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public static BitSet valueOf(LongBuffer lb) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public static BitSet valueOf(byte [] bytes) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public static BitSet valueOf(ByteBuffer bb) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public byte [] toByteArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public long [] toLongArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  private void ensureCapacity(int wordsRequired) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  private void expandTo(int wordIndex) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  private static void checkRange(int fromIndex, int toIndex) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public void flip(int bitIndex) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public void flip(int fromIndex, int toIndex) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public void set(int bitIndex) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public void set(int bitIndex, boolean value) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public void set(int fromIndex, int toIndex) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public void set(int fromIndex,int toIndex, boolean value) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public void clear(int bitIndex) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public void clear(int fromIndex, int toIndex) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public boolean get(int bitIndex) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public BitSet get(int fromIndex, int toIndex) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public int nextSetBit(int fromIndex) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public int nextClearBit(int fromIndex) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public int previousSetBit(int fromIndex) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public int previousClearBit(int fromIndex) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public int length( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public boolean isEmpty( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean intersects(BitSet set) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public int cardinality( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void and(BitSet set) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public void or(BitSet set) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public void xor(BitSet set) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public void andNot(BitSet set) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public int size( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public Object clone( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  private void trimToSize( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  private void writeObject(ObjectOutputStream s) throws IOException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public IntStream stream( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
}