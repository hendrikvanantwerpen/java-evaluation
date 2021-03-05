package java.io;

import java.io.ObjectStreamClass.WeakClassKey;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;

public class ObjectOutputStream extends OutputStream implements ObjectOutput, ObjectStreamConstants {
  private static class Caches {
    static final ConcurrentMap<WeakClassKey, Boolean> subclassAudits;
    static final ReferenceQueue<Class<?>> subclassAuditsQueue;
  }
  public ObjectOutputStream(OutputStream out) throws IOException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void useProtocolVersion(int version) throws IOException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public final void writeObject(Object obj) throws IOException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public void writeUnshared(Object obj) throws IOException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public void defaultWriteObject( ) throws IOException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public ObjectOutputStream. PutField putFields( ) throws IOException {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public void writeFields( ) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public void reset( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public void write(int val) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public void write(byte [] buf) throws IOException {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public void write(byte [] buf,int off, int len) throws IOException {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  public void flush( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public void close( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public void writeBoolean(boolean val) throws IOException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public void writeByte(int val) throws IOException {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public void writeShort(int val) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public void writeChar(int val) throws IOException {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public void writeInt(int val) throws IOException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public void writeLong(long val) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public void writeFloat(float val) throws IOException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public void writeDouble(double val) throws IOException {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public void writeBytes(String str) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public void writeChars(String str) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public void writeUTF(String str) throws IOException {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public static abstract class PutField {
    public abstract void put(String name, boolean val) ;
    public abstract void put(String name, byte val) ;
    public abstract void put(String name, char val) ;
    public abstract void put(String name, short val) ;
    public abstract void put(String name, int val) ;
    public abstract void put(String name, long val) ;
    public abstract void put(String name, float val) ;
    public abstract void put(String name, double val) ;
    public abstract void put(String name, Object val) ;
    public abstract void write(ObjectOutput out) throws IOException ;
  }
  int getProtocolVersion( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  void writeTypeString(String str) throws IOException {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private class PutFieldImpl extends PutField {
    PutFieldImpl(ObjectStreamClass desc) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void put(String name, boolean val) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public void put(String name, byte val) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public void put(String name, char val) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public void put(String name, short val) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public void put(String name, int val) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public void put(String name, float val) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public void put(String name, long val) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public void put(String name, double val) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public void put(String name, Object val) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public void write(ObjectOutput out) throws IOException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    void writeFields( ) throws IOException {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  }
  private static class BlockDataOutputStream extends OutputStream implements DataOutput {
    BlockDataOutputStream(OutputStream out) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    boolean setBlockDataMode(boolean mode) throws IOException {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
    boolean getBlockDataMode( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public void write(int b) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    public void write(byte [] b) throws IOException {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public void write(byte [] b,int off, int len) throws IOException {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
    public void flush( ) throws IOException {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public void close( ) throws IOException {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    void write(byte [] b,int off,int len, boolean copy) throws IOException {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    void drain( ) throws IOException {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public void writeBoolean(boolean v) throws IOException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    public void writeByte(int v) throws IOException {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public void writeChar(int v) throws IOException {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public void writeShort(int v) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    public void writeInt(int v) throws IOException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    public void writeFloat(float v) throws IOException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    public void writeLong(long v) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    public void writeDouble(double v) throws IOException {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public void writeBytes(String s) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
    public void writeChars(String s) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
    public void writeUTF(String s) throws IOException {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    void writeBooleans(boolean [] v,int off, int len) throws IOException {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
    void writeChars(char [] v,int off, int len) throws IOException {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
    void writeShorts(short [] v,int off, int len) throws IOException {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
    void writeInts(int [] v,int off, int len) throws IOException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    void writeFloats(float [] v,int off, int len) throws IOException {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
    void writeLongs(long [] v,int off, int len) throws IOException {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
    void writeDoubles(double [] v,int off, int len) throws IOException {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
    long getUTFLength(String s) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    void writeUTF(String s, long utflen) throws IOException {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
    void writeLongUTF(String s) throws IOException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    void writeLongUTF(String s, long utflen) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  }
  private static class HandleTable {
    HandleTable(int initialCapacity, float loadFactor) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    int assign(Object obj) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    int lookup(Object obj) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    void clear( ) {
                    throw new java . lang . RuntimeException ("Implementation stripped");
                  }
    int size( ) {
                  throw new java . lang . RuntimeException ("Implementation stripped");
                }
  }
  private static class ReplaceTable {
    ReplaceTable(int initialCapacity, float loadFactor) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    void assign(Object obj, Object rep) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    Object lookup(Object obj) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    void clear( ) {
                    throw new java . lang . RuntimeException ("Implementation stripped");
                  }
    int size( ) {
                  throw new java . lang . RuntimeException ("Implementation stripped");
                }
  }
  private static class DebugTraceInfoStack {
    DebugTraceInfoStack( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    void clear( ) {
                    throw new java . lang . RuntimeException ("Implementation stripped");
                  }
    void pop( ) {
                  throw new java . lang . RuntimeException ("Implementation stripped");
                }
    void push(String entry) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
}