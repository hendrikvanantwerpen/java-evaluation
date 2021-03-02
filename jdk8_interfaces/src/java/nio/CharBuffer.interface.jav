package java.nio;

import java.io.IOException;
import java.util.stream.IntStream;

public abstract class CharBuffer extends Buffer implements Comparable<CharBuffer>, Appendable, CharSequence, Readable {
  final char [] hb;
  final int offset;
  boolean isReadOnly;
  CharBuffer(int mark,int pos,int lim,int cap,char [] hb, int offset) {
    super(mark, pos, lim, cap);
  }
  CharBuffer(int mark,int pos,int lim, int cap) {
    this(mark, pos, lim, cap, null, 0);
  }
  public static CharBuffer allocate(int capacity) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public static CharBuffer wrap(char [] array,int offset, int length) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public static CharBuffer wrap(char [] array) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public int read(CharBuffer target) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public static CharBuffer wrap(CharSequence csq,int start, int end) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  public static CharBuffer wrap(CharSequence csq) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public abstract CharBuffer slice( ) ;
  public abstract CharBuffer duplicate( ) ;
  public abstract CharBuffer asReadOnlyBuffer( ) ;
  public abstract char get( ) ;
  public abstract CharBuffer put(char c) ;
  public abstract char get(int index) ;
  abstract char getUnchecked(int index) ;
  public abstract CharBuffer put(int index, char c) ;
  public CharBuffer get(char [] dst,int offset, int length) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public CharBuffer get(char [] dst) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public CharBuffer put(CharBuffer src) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public CharBuffer put(char [] src,int offset, int length) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public final CharBuffer put(char [] src) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public CharBuffer put(String src,int start, int end) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public final CharBuffer put(String src) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public final boolean hasArray( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public final char [] array( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public final int arrayOffset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public abstract CharBuffer compact( ) ;
  public abstract boolean isDirect( ) ;
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public boolean equals(Object ob) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  private static boolean equals(char x, char y) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public int compareTo(CharBuffer that) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private static int compare(char x, char y) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  abstract String toString(int start, int end) ;
  public final int length( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public final char charAt(int index) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public abstract CharBuffer subSequence(int start, int end) ;
  public CharBuffer append(CharSequence csq) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public CharBuffer append(CharSequence csq,int start, int end) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public CharBuffer append(char c) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public abstract ByteOrder order( ) ;
  public IntStream chars( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}