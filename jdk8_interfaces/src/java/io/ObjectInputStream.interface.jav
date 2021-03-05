package java.io;

import java.io.ObjectStreamClass.WeakClassKey;
import java.lang.ref.ReferenceQueue;
import java.security.AccessControlContext;
import java.util.concurrent.ConcurrentMap;
import sun.misc.ObjectInputFilter;

public class ObjectInputStream extends InputStream implements ObjectInput, ObjectStreamConstants {
  private static class Caches {
    static final ConcurrentMap<WeakClassKey, Boolean> subclassAudits;
    static final ReferenceQueue<Class<?>> subclassAuditsQueue;
    static final boolean SET_FILTER_AFTER_READ;
    static final int PROXY_INTERFACE_LIMIT;
  }
  private static class Logging {
  }
  public ObjectInputStream(InputStream in) throws IOException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Object readObject( ) throws IOException, ClassNotFoundException {
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
  String readTypeString( ) throws IOException {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private class GetFieldImpl extends GetField {
    GetFieldImpl(ObjectStreamClass desc) {
      throw new java . lang . RuntimeException ("Implementation stripped");
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
  }
  private static class ValidationList {
    private static class Callback {
      final ObjectInputValidation obj;
      final int priority;
      Callback next;
      final AccessControlContext acc;
      Callback(ObjectInputValidation obj,int priority,Callback next, AccessControlContext acc) {
        throw new java . lang . RuntimeException ("Implementation stripped");
      }
    }
    ValidationList( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
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
      throw new java . lang . RuntimeException ("Implementation stripped");
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
    PeekInputStream(InputStream in) {
      throw new java . lang . RuntimeException ("Implementation stripped");
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
    BlockDataInputStream(InputStream in) {
      throw new java . lang . RuntimeException ("Implementation stripped");
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
    long getBytesRead( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  }
  private static class HandleTable {
    byte [] status;
    Object [] entries;
    HandleList [] deps;
    int lowDep;
    int size;
    HandleTable(int initialCapacity) {
      throw new java . lang . RuntimeException ("Implementation stripped");
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
    private static class HandleList {
      public HandleList( ) {
        throw new java . lang . RuntimeException ("Implementation stripped");
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
}