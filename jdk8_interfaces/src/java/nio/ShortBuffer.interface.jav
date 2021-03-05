package java.nio;


public abstract class ShortBuffer extends Buffer implements Comparable<ShortBuffer> {
  final short [] hb;
  final int offset;
  boolean isReadOnly;
  ShortBuffer(int mark,int pos,int lim,int cap,short [] hb, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ShortBuffer(int mark,int pos,int lim, int cap) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ShortBuffer allocate(int capacity) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public static ShortBuffer wrap(short [] array,int offset, int length) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public static ShortBuffer wrap(short [] array) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public abstract ShortBuffer slice( ) ;
  public abstract ShortBuffer duplicate( ) ;
  public abstract ShortBuffer asReadOnlyBuffer( ) ;
  public abstract short get( ) ;
  public abstract ShortBuffer put(short s) ;
  public abstract short get(int index) ;
  public abstract ShortBuffer put(int index, short s) ;
  public ShortBuffer get(short [] dst,int offset, int length) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public ShortBuffer get(short [] dst) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public ShortBuffer put(ShortBuffer src) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public ShortBuffer put(short [] src,int offset, int length) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public final ShortBuffer put(short [] src) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public final boolean hasArray( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public final short [] array( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public final int arrayOffset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public abstract ShortBuffer compact( ) ;
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
  public int compareTo(ShortBuffer that) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public abstract ByteOrder order( ) ;
}