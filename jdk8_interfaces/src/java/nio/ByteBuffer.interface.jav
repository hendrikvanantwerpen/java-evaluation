package java.nio;


public abstract class ByteBuffer extends Buffer implements Comparable<ByteBuffer> {
  final byte [] hb;
  final int offset;
  boolean isReadOnly;
  ByteBuffer(int mark,int pos,int lim,int cap,byte [] hb, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ByteBuffer(int mark,int pos,int lim, int cap) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ByteBuffer allocateDirect(int capacity) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public static ByteBuffer allocate(int capacity) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public static ByteBuffer wrap(byte [] array,int offset, int length) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public static ByteBuffer wrap(byte [] array) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public abstract ByteBuffer slice( ) ;
  public abstract ByteBuffer duplicate( ) ;
  public abstract ByteBuffer asReadOnlyBuffer( ) ;
  public abstract byte get( ) ;
  public abstract ByteBuffer put(byte b) ;
  public abstract byte get(int index) ;
  public abstract ByteBuffer put(int index, byte b) ;
  public ByteBuffer get(byte [] dst,int offset, int length) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public ByteBuffer get(byte [] dst) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public ByteBuffer put(ByteBuffer src) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public ByteBuffer put(byte [] src,int offset, int length) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public final ByteBuffer put(byte [] src) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public final boolean hasArray( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public final byte [] array( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public final int arrayOffset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public abstract ByteBuffer compact( ) ;
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
  public int compareTo(ByteBuffer that) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  boolean bigEndian;
  boolean nativeByteOrder;
  public final ByteOrder order( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public final ByteBuffer order(ByteOrder bo) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  abstract byte _get(int i) ;
  abstract void _put(int i, byte b) ;
  public abstract char getChar( ) ;
  public abstract ByteBuffer putChar(char value) ;
  public abstract char getChar(int index) ;
  public abstract ByteBuffer putChar(int index, char value) ;
  public abstract CharBuffer asCharBuffer( ) ;
  public abstract short getShort( ) ;
  public abstract ByteBuffer putShort(short value) ;
  public abstract short getShort(int index) ;
  public abstract ByteBuffer putShort(int index, short value) ;
  public abstract ShortBuffer asShortBuffer( ) ;
  public abstract int getInt( ) ;
  public abstract ByteBuffer putInt(int value) ;
  public abstract int getInt(int index) ;
  public abstract ByteBuffer putInt(int index, int value) ;
  public abstract IntBuffer asIntBuffer( ) ;
  public abstract long getLong( ) ;
  public abstract ByteBuffer putLong(long value) ;
  public abstract long getLong(int index) ;
  public abstract ByteBuffer putLong(int index, long value) ;
  public abstract LongBuffer asLongBuffer( ) ;
  public abstract float getFloat( ) ;
  public abstract ByteBuffer putFloat(float value) ;
  public abstract float getFloat(int index) ;
  public abstract ByteBuffer putFloat(int index, float value) ;
  public abstract FloatBuffer asFloatBuffer( ) ;
  public abstract double getDouble( ) ;
  public abstract ByteBuffer putDouble(double value) ;
  public abstract double getDouble(int index) ;
  public abstract ByteBuffer putDouble(int index, double value) ;
  public abstract DoubleBuffer asDoubleBuffer( ) ;
}