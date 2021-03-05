package java.io;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentMap;

public class ObjectStreamClass implements Serializable {
  public static final ObjectStreamField [] NO_FIELDS;
  private static class Caches {
    static final ConcurrentMap<WeakClassKey, Reference<?>> localDescs;
    static final ConcurrentMap<FieldReflectorKey, Reference<?>> reflectors;
  }
  private static class ExceptionInfo {
    ExceptionInfo(String cn, String msg) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    InvalidClassException newInvalidClassException( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  }
  public static ObjectStreamClass lookup(Class<?> cl) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public static ObjectStreamClass lookupAny(Class<?> cl) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public String getName( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public long getSerialVersionUID( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public Class<?> forClass( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public ObjectStreamField [] getFields( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public ObjectStreamField getField(String name) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  static ObjectStreamClass lookup(Class<?> cl, boolean all) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  private static class EntryFuture {
    synchronized boolean set(Object entry) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    synchronized Object get( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    Thread getOwner( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  }
  ObjectStreamClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  void initProxy(Class<?> cl,ClassNotFoundException resolveEx, ObjectStreamClass superDesc) throws InvalidClassException {
                                                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                         }
  void initNonProxy(ObjectStreamClass model,Class<?> cl,ClassNotFoundException resolveEx, ObjectStreamClass superDesc) throws InvalidClassException {
                                                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                    }
  void readNonProxy(ObjectInputStream in) throws IOException, ClassNotFoundException {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  void writeNonProxy(ObjectOutputStream out) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  ClassNotFoundException getResolveException( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  final void checkInitialized( ) throws InvalidClassException {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  void checkDeserialize( ) throws InvalidClassException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  void checkSerialize( ) throws InvalidClassException {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  void checkDefaultSerialize( ) throws InvalidClassException {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  ObjectStreamClass getSuperDesc( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  ObjectStreamClass getLocalDesc( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  ObjectStreamField [] getFields(boolean copy) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  ObjectStreamField getField(String name, Class<?> type) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  boolean isProxy( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  boolean isEnum( ) {
                      throw new java . lang . RuntimeException ("Implementation stripped");
                    }
  boolean isExternalizable( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  boolean isSerializable( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  boolean hasBlockExternalData( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  boolean hasWriteObjectData( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  boolean isInstantiable( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  boolean hasWriteObjectMethod( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  boolean hasReadObjectMethod( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  boolean hasReadObjectNoDataMethod( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  boolean hasWriteReplaceMethod( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  boolean hasReadResolveMethod( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  Object newInstance( ) throws InstantiationException, InvocationTargetException, UnsupportedOperationException {
                                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                }
  void invokeWriteObject(Object obj, ObjectOutputStream out) throws IOException, UnsupportedOperationException {
                                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                               }
  void invokeReadObject(Object obj, ObjectInputStream in) throws ClassNotFoundException, IOException, UnsupportedOperationException {
                                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                    }
  void invokeReadObjectNoData(Object obj) throws IOException, UnsupportedOperationException {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  Object invokeWriteReplace(Object obj) throws IOException, UnsupportedOperationException {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  Object invokeReadResolve(Object obj) throws IOException, UnsupportedOperationException {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
  static class ClassDataSlot {
    final ObjectStreamClass desc;
    final boolean hasData;
    ClassDataSlot(ObjectStreamClass desc, boolean hasData) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  ClassDataSlot [] getClassDataLayout( ) throws InvalidClassException {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  int getPrimDataSize( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  int getNumObjFields( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  void getPrimFieldValues(Object obj, byte [] buf) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  void setPrimFieldValues(Object obj, byte [] buf) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  void getObjFieldValues(Object obj, Object [] vals) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  void setObjFieldValues(Object obj, Object [] vals) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  private static class MemberSignature {
    public final Member member;
    public final String name;
    public final String signature;
    public MemberSignature(Field field) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MemberSignature(Constructor<?> cons) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MemberSignature(Method meth) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  private static class FieldReflector {
    FieldReflector(ObjectStreamField [] fields) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    ObjectStreamField [] getFields( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    void getPrimFieldValues(Object obj, byte [] buf) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    void setPrimFieldValues(Object obj, byte [] buf) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    void getObjFieldValues(Object obj, Object [] vals) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    void setObjFieldValues(Object obj, Object [] vals) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  }
  private static class FieldReflectorKey extends WeakReference<Class<?>> {
    FieldReflectorKey(Class<?> cl,ObjectStreamField [] fields, ReferenceQueue<Class<?>> queue) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  static void processQueue(ReferenceQueue<Class<?>> queue, ConcurrentMap<? extends WeakReference<Class<?>>, ?> map) {
                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                    }
  static class WeakClassKey extends WeakReference<Class<?>> {
    WeakClassKey(Class<?> cl, ReferenceQueue<Class<?>> refQueue) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
}