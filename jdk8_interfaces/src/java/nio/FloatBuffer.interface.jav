package java.nio;


public abstract class FloatBuffer extends Buffer implements Comparable<FloatBuffer> {
  final float [] hb;
  final int offset;
  boolean isReadOnly;
  FloatBuffer(int mark,int pos,int lim,int cap,float [] hb, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  FloatBuffer(int mark,int pos,int lim, int cap) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static FloatBuffer allocate(int capacity) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public static FloatBuffer wrap(float [] array,int offset, int length) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public static FloatBuffer wrap(float [] array) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public abstract FloatBuffer slice( ) ;
  public abstract FloatBuffer duplicate( ) ;
  public abstract FloatBuffer asReadOnlyBuffer( ) ;
  public abstract float get( ) ;
  public abstract FloatBuffer put(float f) ;
  public abstract float get(int index) ;
  public abstract FloatBuffer put(int index, float f) ;
  public FloatBuffer get(float [] dst,int offset, int length) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public FloatBuffer get(float [] dst) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public FloatBuffer put(FloatBuffer src) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public FloatBuffer put(float [] src,int offset, int length) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public final FloatBuffer put(float [] src) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public final boolean hasArray( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public final float [] array( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public final int arrayOffset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public abstract FloatBuffer compact( ) ;
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
  public int compareTo(FloatBuffer that) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public abstract ByteOrder order( ) ;
}