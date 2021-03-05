package java.nio;


public abstract class IntBuffer extends Buffer implements Comparable<IntBuffer> {
  final int [] hb;
  final int offset;
  boolean isReadOnly;
  IntBuffer(int mark,int pos,int lim,int cap,int [] hb, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  IntBuffer(int mark,int pos,int lim, int cap) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static IntBuffer allocate(int capacity) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public static IntBuffer wrap(int [] array,int offset, int length) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  public static IntBuffer wrap(int [] array) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public abstract IntBuffer slice( ) ;
  public abstract IntBuffer duplicate( ) ;
  public abstract IntBuffer asReadOnlyBuffer( ) ;
  public abstract int get( ) ;
  public abstract IntBuffer put(int i) ;
  public abstract int get(int index) ;
  public abstract IntBuffer put(int index, int i) ;
  public IntBuffer get(int [] dst,int offset, int length) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public IntBuffer get(int [] dst) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public IntBuffer put(IntBuffer src) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public IntBuffer put(int [] src,int offset, int length) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public final IntBuffer put(int [] src) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public final boolean hasArray( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public final int [] array( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public final int arrayOffset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public abstract IntBuffer compact( ) ;
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
  public int compareTo(IntBuffer that) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public abstract ByteOrder order( ) ;
}