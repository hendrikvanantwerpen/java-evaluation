package java.nio;


public abstract class DoubleBuffer extends Buffer implements Comparable<DoubleBuffer> {
  final double [] hb;
  final int offset;
  boolean isReadOnly;
  DoubleBuffer(int mark,int pos,int lim,int cap,double [] hb, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  DoubleBuffer(int mark,int pos,int lim, int cap) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static DoubleBuffer allocate(int capacity) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public static DoubleBuffer wrap(double [] array,int offset, int length) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public static DoubleBuffer wrap(double [] array) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public abstract DoubleBuffer slice( ) ;
  public abstract DoubleBuffer duplicate( ) ;
  public abstract DoubleBuffer asReadOnlyBuffer( ) ;
  public abstract double get( ) ;
  public abstract DoubleBuffer put(double d) ;
  public abstract double get(int index) ;
  public abstract DoubleBuffer put(int index, double d) ;
  public DoubleBuffer get(double [] dst,int offset, int length) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public DoubleBuffer get(double [] dst) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public DoubleBuffer put(DoubleBuffer src) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public DoubleBuffer put(double [] src,int offset, int length) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public final DoubleBuffer put(double [] src) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public final boolean hasArray( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public final double [] array( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public final int arrayOffset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public abstract DoubleBuffer compact( ) ;
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
  public int compareTo(DoubleBuffer that) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public abstract ByteOrder order( ) ;
}