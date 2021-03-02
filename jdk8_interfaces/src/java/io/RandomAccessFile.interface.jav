package java.io;

import java.nio.channels.FileChannel;

public class RandomAccessFile implements DataOutput, DataInput, Closeable {
  private FileDescriptor fd;
  private FileChannel channel;
  private boolean rw;
  private final String path;
  private Object closeLock;
  private volatile boolean closed;
  private static final int O_RDONLY;
  private static final int O_RDWR;
  private static final int O_SYNC;
  private static final int O_DSYNC;
  public RandomAccessFile(String name, String mode) throws FileNotFoundException{
    this(name != null ? new File (name) : null, mode);
  }
  public RandomAccessFile(File file, String mode) throws FileNotFoundException{
  }
  public final FileDescriptor getFD( ) throws IOException {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public final FileChannel getChannel( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  private native void open0(String name, int mode) throws FileNotFoundException ;
  private void open(String name, int mode) throws FileNotFoundException {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public int read( ) throws IOException {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private native int read0( ) throws IOException ;
  private native int readBytes(byte b[],int off, int len) throws IOException ;
  public int read(byte b[],int off, int len) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public int read(byte b[]) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public final void readFully(byte b[]) throws IOException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public final void readFully(byte b[],int off, int len) throws IOException {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public int skipBytes(int n) throws IOException {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public void write(int b) throws IOException {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private native void write0(int b) throws IOException ;
  private native void writeBytes(byte b[],int off, int len) throws IOException ;
  public void write(byte b[]) throws IOException {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public void write(byte b[],int off, int len) throws IOException {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public native long getFilePointer( ) throws IOException ;
  public void seek(long pos) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  private native void seek0(long pos) throws IOException ;
  public native long length( ) throws IOException ;
  public native void setLength(long newLength) throws IOException ;
  public void close( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public final boolean readBoolean( ) throws IOException {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public final byte readByte( ) throws IOException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public final int readUnsignedByte( ) throws IOException {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public final short readShort( ) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public final int readUnsignedShort( ) throws IOException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public final char readChar( ) throws IOException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public final int readInt( ) throws IOException {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public final long readLong( ) throws IOException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public final float readFloat( ) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public final double readDouble( ) throws IOException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public final String readLine( ) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public final String readUTF( ) throws IOException {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public final void writeBoolean(boolean v) throws IOException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public final void writeByte(int v) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public final void writeShort(int v) throws IOException {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public final void writeChar(int v) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public final void writeInt(int v) throws IOException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public final void writeLong(long v) throws IOException {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public final void writeFloat(float v) throws IOException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public final void writeDouble(double v) throws IOException {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public final void writeBytes(String s) throws IOException {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public final void writeChars(String s) throws IOException {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public final void writeUTF(String str) throws IOException {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  private static native void initIDs( ) ;
  private native void close0( ) throws IOException ;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
}