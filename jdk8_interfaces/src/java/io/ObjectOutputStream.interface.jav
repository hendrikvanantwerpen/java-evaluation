package java.io;

import java.io.ObjectStreamClass.WeakClassKey;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.io.SerialCallbackContext;

public class ObjectOutputStream extends OutputStream implements ObjectOutput, ObjectStreamConstants {
  private static class Caches {
    static final ConcurrentMap<WeakClassKey, Boolean> subclassAudits;
    static final ReferenceQueue<Class<?>> subclassAuditsQueue;
  }
  private final BlockDataOutputStream bout;
  private final HandleTable handles;
  private final ReplaceTable subs;
  private int protocol;
  private int depth;
  private byte [] primVals;
  private final boolean enableOverride;
  private boolean enableReplace;
  private SerialCallbackContext curContext;
  private PutFieldImpl curPut;
  private final DebugTraceInfoStack debugInfoStack;
  private static final boolean extendedDebugInfo;
  public ObjectOutputStream(OutputStream out) throws IOException{
  }
  protected ObjectOutputStream( ) throws IOException, SecurityException{
  }
  public void useProtocolVersion(int version) throws IOException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public final void writeObject(Object obj) throws IOException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  protected void writeObjectOverride(Object obj) throws IOException {
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
  protected void annotateClass(Class<?> cl) throws IOException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  protected void annotateProxyClass(Class<?> cl) throws IOException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  protected Object replaceObject(Object obj) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  protected boolean enableReplaceObject(boolean enable) throws SecurityException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  protected void writeStreamHeader( ) throws IOException {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  protected void writeClassDescriptor(ObjectStreamClass desc) throws IOException {
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
  protected void drain( ) throws IOException {
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
  private void verifySubclass( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  private static boolean auditSubclass(final Class<?> subcl) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private void clear( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  private void writeObject0(Object obj, boolean unshared) throws IOException {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  private void writeNull( ) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private void writeHandle(int handle) throws IOException {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  private void writeClass(Class<?> cl, boolean unshared) throws IOException {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  private void writeClassDesc(ObjectStreamClass desc, boolean unshared) throws IOException {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  private boolean isCustomSubclass( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  private void writeProxyDesc(ObjectStreamClass desc, boolean unshared) throws IOException {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  private void writeNonProxyDesc(ObjectStreamClass desc, boolean unshared) throws IOException {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
  private void writeString(String str, boolean unshared) throws IOException {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  private void writeArray(Object array,ObjectStreamClass desc, boolean unshared) throws IOException {
                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                    }
  private void writeEnum(Enum<?> en,ObjectStreamClass desc, boolean unshared) throws IOException {
                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                 }
  private void writeOrdinaryObject(Object obj,ObjectStreamClass desc, boolean unshared) throws IOException {
                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                           }
  private void writeExternalData(Externalizable obj) throws IOException {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  private void writeSerialData(Object obj, ObjectStreamClass desc) throws IOException {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  private void defaultWriteFields(Object obj, ObjectStreamClass desc) throws IOException {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
  private void writeFatalException(IOException ex) throws IOException {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  private static native void floatsToBytes(float [] src,int srcpos,byte [] dst,int dstpos, int nfloats) ;
  private static native void doublesToBytes(double [] src,int srcpos,byte [] dst,int dstpos, int ndoubles) ;
  private class PutFieldImpl extends PutField {
    private final ObjectStreamClass desc;
    private final byte [] primVals;
    private final Object [] objVals;
    PutFieldImpl(ObjectStreamClass desc) {
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
    private int getFieldOffset(String name, Class<?> type) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  private static class BlockDataOutputStream extends OutputStream implements DataOutput {
    private static final int MAX_BLOCK_SIZE;
    private static final int MAX_HEADER_SIZE;
    private static final int CHAR_BUF_SIZE;
    private final byte [] buf;
    private final byte [] hbuf;
    private final char [] cbuf;
    private boolean blkmode;
    private int pos;
    private final OutputStream out;
    private final DataOutputStream dout;
    BlockDataOutputStream(OutputStream out) {
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
    private void writeBlockHeader(int len) throws IOException {
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
    private void writeUTFBody(String s) throws IOException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  private static class HandleTable {
    private int size;
    private int threshold;
    private final float loadFactor;
    private int [] spine;
    private int [] next;
    private Object [] objs;
    HandleTable(int initialCapacity, float loadFactor) {
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
    private void insert(Object obj, int handle) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    private void growSpine( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    private void growEntries( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    private int hash(Object obj) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  private static class ReplaceTable {
    private final HandleTable htab;
    private Object [] reps;
    ReplaceTable(int initialCapacity, float loadFactor) {
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
    private void grow( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  }
  private static class DebugTraceInfoStack {
    private final List<String> stack;
    DebugTraceInfoStack( ) {
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