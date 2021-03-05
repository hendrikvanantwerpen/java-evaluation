package java.nio;


public abstract class LongBuffer extends Buffer implements Comparable<LongBuffer> {
  final long [] hb;
  final int offset;
  boolean isReadOnly;
  LongBuffer(int mark,int pos,int lim,int cap,long [] hb, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  LongBuffer(int mark,int pos,int lim, int cap) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LongBuffer allocate(int capacity) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public static LongBuffer wrap(long [] array,int offset, int length) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public static LongBuffer wrap(long [] array) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public abstract LongBuffer slice( ) ;
  public abstract LongBuffer duplicate( ) ;
  public abstract LongBuffer asReadOnlyBuffer( ) ;
  public abstract long get( ) ;
  public abstract LongBuffer put(long l) ;
  public abstract long get(int index) ;
  public abstract LongBuffer put(int index, long l) ;
  public LongBuffer get(long [] dst,int offset, int length) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public LongBuffer get(long [] dst) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public LongBuffer put(LongBuffer src) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public LongBuffer put(long [] src,int offset, int length) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public final LongBuffer put(long [] src) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public final boolean hasArray( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public final long [] array( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public final int arrayOffset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public abstract LongBuffer compact( ) ;
  public abstract boolean isDirect( ) ;
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public boolean equals(Object ob) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public int compareTo(LongBuffer that) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public abstract ByteOrder order( ) ;
}