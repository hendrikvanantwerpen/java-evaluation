package java.io;

import java.io.ObjectStreamClass.WeakClassKey;
import java.lang.ref.ReferenceQueue;
import java.security.AccessControlContext;
import java.util.HashMap;
import java.util.concurrent.ConcurrentMap;
import sun.misc.ObjectInputFilter;
import sun.misc.ObjectStreamClassValidator;
import sun.util.logging.PlatformLogger;

public class ObjectInputStream extends InputStream implements ObjectInput, ObjectStreamConstants {
  private static final int NULL_HANDLE;
  private static final Object unsharedMarker;
  private static final HashMap<String, Class<?>> primClasses;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  private static class Caches {
    static final ConcurrentMap<WeakClassKey, Boolean> subclassAudits;
    static final ReferenceQueue<Class<?>> subclassAuditsQueue;
    static final boolean SET_FILTER_AFTER_READ;
    static final int PROXY_INTERFACE_LIMIT;
    private static boolean privilegedGetProperty(String theProp) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    private static int privilegedGetIntegerProperty(String theProp, int defaultValue) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  }
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  private static class Logging {
    private static final PlatformLogger traceLogger;
    private static final PlatformLogger infoLogger;
    static {
             throw new java . lang . RuntimeException ("Implementation stripped");
           }
  }
  private final BlockDataInputStream bin;
  private final ValidationList vlist;
  private long depth;
  private long totalObjectRefs;
  private boolean closed;
  private final HandleTable handles;
  private int passHandle;
  private boolean defaultDataEnd;
  private byte [] primVals;
  private final boolean enableOverride;
  private boolean enableResolve;
  private SerialCallbackContext curContext;
  private ObjectInputFilter serialFilter;
  public ObjectInputStream(InputStream in) throws IOException{
  }
  protected ObjectInputStream( ) throws IOException, SecurityException{
  }
  public final Object readObject( ) throws IOException, ClassNotFoundException {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  private String readString( ) throws IOException {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  private final Object readObject(Class<?> type) throws IOException, ClassNotFoundException {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  protected Object readObjectOverride( ) throws IOException, ClassNotFoundException {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public Object readUnshared( ) throws IOException, ClassNotFoundException {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  public void defaultReadObject( ) throws IOException, ClassNotFoundException {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public ObjectInputStream. GetField readFields( ) throws IOException, ClassNotFoundException {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
  public void registerValidation(ObjectInputValidation obj, int prio) throws NotActiveException, InvalidObjectException {
                                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                        }
  protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
                                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                     }
  protected Class<?> resolveProxyClass(String [] interfaces) throws IOException, ClassNotFoundException {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
  protected Object resolveObject(Object obj) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  protected boolean enableResolveObject(boolean enable) throws SecurityException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  protected void readStreamHeader( ) throws IOException, StreamCorruptedException {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  protected ObjectStreamClass readClassDescriptor( ) throws IOException, ClassNotFoundException {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  public int read( ) throws IOException {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public int read(byte [] buf,int off, int len) throws IOException {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public int available( ) throws IOException {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public void close( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public boolean readBoolean( ) throws IOException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public byte readByte( ) throws IOException {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public int readUnsignedByte( ) throws IOException {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public char readChar( ) throws IOException {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public short readShort( ) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public int readUnsignedShort( ) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public int readInt( ) throws IOException {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public long readLong( ) throws IOException {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public float readFloat( ) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public double readDouble( ) throws IOException {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public void readFully(byte [] buf) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public void readFully(byte [] buf,int off, int len) throws IOException {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public int skipBytes(int len) throws IOException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public String readLine( ) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public String readUTF( ) throws IOException {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private final ObjectInputFilter getInternalObjectInputFilter( ) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  private final void setInternalObjectInputFilter(ObjectInputFilter filter) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  private void filterCheck(Class<?> clazz, int arrayLength) throws InvalidClassException {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
  private void checkArray(Class<?> arrayType, int arrayLength) throws InvalidClassException {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  public static abstract class GetField {
    public abstract ObjectStreamClass getObjectStreamClass( ) ;
    public abstract boolean defaulted(String name) throws IOException ;
    public abstract boolean get(String name, boolean val) throws IOException ;
    public abstract byte get(String name, byte val) throws IOException ;
    public abstract char get(String name, char val) throws IOException ;
    public abstract short get(String name, short val) throws IOException ;
    public abstract int get(String name, int val) throws IOException ;
    public abstract long get(String name, long val) throws IOException ;
    public abstract float get(String name, float val) throws IOException ;
    public abstract double get(String name, double val) throws IOException ;
    public abstract Object get(String name, Object val) throws IOException ;
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
  private Object readObject0(Class<?> type, boolean unshared) throws IOException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  private Object checkResolve(Object obj) throws IOException {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  String readTypeString( ) throws IOException {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private Object readNull( ) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  private Object readHandle(boolean unshared) throws IOException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  private Class<?> readClass(boolean unshared) throws IOException {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  private ObjectStreamClass readClassDesc(boolean unshared) throws IOException {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  private boolean isCustomSubclass( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  private ObjectStreamClass readProxyDesc(boolean unshared) throws IOException {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  private ObjectStreamClass readNonProxyDesc(boolean unshared) throws IOException {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  private String readString(boolean unshared) throws IOException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  private Object readArray(boolean unshared) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  private Enum<?> readEnum(boolean unshared) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  private Object readOrdinaryObject(boolean unshared) throws IOException {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  private void readExternalData(Externalizable obj, ObjectStreamClass desc) throws IOException {
                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                               }
  private void readSerialData(Object obj, ObjectStreamClass desc) throws IOException {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  private void skipCustomData( ) throws IOException {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  private void defaultReadFields(Object obj, ObjectStreamClass desc) throws IOException {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  private IOException readFatalException( ) throws IOException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  private void handleReset( ) throws StreamCorruptedException {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  private static native void bytesToFloats(byte [] src,int srcpos,float [] dst,int dstpos, int nfloats) ;
  private static native void bytesToDoubles(byte [] src,int srcpos,double [] dst,int dstpos, int ndoubles) ;
  private static ClassLoader latestUserDefinedLoader( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private class GetFieldImpl extends GetField {
    private final ObjectStreamClass desc;
    private final byte [] primVals;
    private final Object [] objVals;
    private final int [] objHandles;
    GetFieldImpl(ObjectStreamClass desc) {
    }
    public ObjectStreamClass getObjectStreamClass( ) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    public boolean defaulted(String name) throws IOException {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
    public boolean get(String name, boolean val) throws IOException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
    public byte get(String name, byte val) throws IOException {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
    public char get(String name, char val) throws IOException {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
    public short get(String name, short val) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
    public int get(String name, int val) throws IOException {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
    public float get(String name, float val) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
    public long get(String name, long val) throws IOException {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
    public double get(String name, double val) throws IOException {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    public Object get(String name, Object val) throws IOException {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    void readFields( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    private int getFieldOffset(String name, Class<?> type) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  private static class ValidationList {
    private static class Callback {
      final ObjectInputValidation obj;
      final int priority;
      Callback next;
      final AccessControlContext acc;
      Callback(ObjectInputValidation obj,int priority,Callback next, AccessControlContext acc) {
      }
    }
    private Callback list;
    ValidationList( ) {
    }
    void register(ObjectInputValidation obj, int priority) throws InvalidObjectException {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
    void doCallbacks( ) throws InvalidObjectException {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public void clear( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  }
  static class FilterValues implements ObjectInputFilter. FilterInfo {
    final Class<?> clazz;
    final long arrayLength;
    final long totalObjectRefs;
    final long depth;
    final long streamBytes;
    public FilterValues(Class<?> clazz,long arrayLength,long totalObjectRefs,long depth, long streamBytes) {
    }
    public Class<?> serialClass( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public long arrayLength( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public long references( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public long depth( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public long streamBytes( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  }
  private static class PeekInputStream extends InputStream {
    private final InputStream in;
    private int peekb;
    private long totalBytesRead;
    PeekInputStream(InputStream in) {
    }
    int peek( ) throws IOException {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public int read( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public int read(byte [] b,int off, int len) throws IOException {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
    void readFully(byte [] b,int off, int len) throws IOException {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    public long skip(long n) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    public int available( ) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public void close( ) throws IOException {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public long getBytesRead( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  }
  private class BlockDataInputStream extends InputStream implements DataInput {
    private static final int MAX_BLOCK_SIZE;
    private static final int MAX_HEADER_SIZE;
    private static final int CHAR_BUF_SIZE;
    private static final int HEADER_BLOCKED;
    private final byte [] buf;
    private final byte [] hbuf;
    private final char [] cbuf;
    private boolean blkmode;
    private int pos;
    private int end;
    private int unread;
    private final PeekInputStream in;
    private final DataInputStream din;
    BlockDataInputStream(InputStream in) {
    }
    boolean setBlockDataMode(boolean newmode) throws IOException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    boolean getBlockDataMode( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    void skipBlockData( ) throws IOException {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    private int readBlockHeader(boolean canBlock) throws IOException {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
    private void refill( ) throws IOException {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    int currentBlockRemaining( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    int peek( ) throws IOException {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    byte peekByte( ) throws IOException {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public int read( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public int read(byte [] b,int off, int len) throws IOException {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
    public long skip(long len) throws IOException {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    public int available( ) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public void close( ) throws IOException {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    int read(byte [] b,int off,int len, boolean copy) throws IOException {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
    public void readFully(byte [] b) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
    public void readFully(byte [] b,int off, int len) throws IOException {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
    public void readFully(byte [] b,int off,int len, boolean copy) throws IOException {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
    public int skipBytes(int n) throws IOException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    public boolean readBoolean( ) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    public byte readByte( ) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public int readUnsignedByte( ) throws IOException {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public char readChar( ) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public short readShort( ) throws IOException {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    public int readUnsignedShort( ) throws IOException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    public int readInt( ) throws IOException {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public float readFloat( ) throws IOException {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    public long readLong( ) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public double readDouble( ) throws IOException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    public String readUTF( ) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    public String readLine( ) throws IOException {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    void readBooleans(boolean [] v,int off, int len) throws IOException {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
    void readChars(char [] v,int off, int len) throws IOException {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    void readShorts(short [] v,int off, int len) throws IOException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
    void readInts(int [] v,int off, int len) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
    void readFloats(float [] v,int off, int len) throws IOException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
    void readLongs(long [] v,int off, int len) throws IOException {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    void readDoubles(double [] v,int off, int len) throws IOException {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
    String readLongUTF( ) throws IOException {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    private String readUTFBody(long utflen) throws IOException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
    private long readUTFSpan(StringBuilder sbuf, long utflen) throws IOException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
    private int readUTFChar(StringBuilder sbuf, long utflen) throws IOException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
    long getBytesRead( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  }
  private static class HandleTable {
    private static final byte STATUS_OK;
    private static final byte STATUS_UNKNOWN;
    private static final byte STATUS_EXCEPTION;
    byte [] status;
    Object [] entries;
    HandleList [] deps;
    int lowDep;
    int size;
    HandleTable(int initialCapacity) {
    }
    int assign(Object obj) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    void markDependency(int dependent, int target) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    void markException(int handle, ClassNotFoundException ex) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
    void finish(int handle) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    void setObject(int handle, Object obj) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    Object lookupObject(int handle) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    ClassNotFoundException lookupException(int handle) {
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
    private static class HandleList {
      private int [] list;
      private int size;
      public HandleList( ) {
      }
      public void add(int handle) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
      public int get(int index) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
      public int size( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    }
  }
  private static Object cloneArray(Object array) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  private void validateDescriptor(ObjectStreamClass descriptor) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  private volatile ObjectStreamClassValidator validator;
  private static void setValidator(ObjectInputStream ois, ObjectStreamClassValidator validator) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
}