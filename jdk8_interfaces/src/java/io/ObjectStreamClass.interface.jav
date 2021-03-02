package java.io;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.security.ProtectionDomain;
import java.util.concurrent.ConcurrentMap;
import sun.misc.Unsafe;
import sun.reflect.ReflectionFactory;

public class ObjectStreamClass implements Serializable {
  public static final ObjectStreamField [] NO_FIELDS;
  private static final long serialVersionUID;
  private static final ObjectStreamField [] serialPersistentFields;
  private static boolean disableSerialConstructorChecks;
  private static final ReflectionFactory reflFactory;
  private static class Caches {
    static final ConcurrentMap<WeakClassKey, Reference<?>> localDescs;
    static final ConcurrentMap<FieldReflectorKey, Reference<?>> reflectors;
    private static final ReferenceQueue<Class<?>> localDescsQueue;
    private static final ReferenceQueue<Class<?>> reflectorsQueue;
  }
  private Class<?> cl;
  private String name;
  private volatile Long suid;
  private boolean isProxy;
  private boolean isEnum;
  private boolean serializable;
  private boolean externalizable;
  private boolean hasWriteObjectData;
  private boolean hasBlockExternalData;
  private static class ExceptionInfo {
    private final String className;
    private final String message;
    ExceptionInfo(String cn, String msg) {
    }
    InvalidClassException newInvalidClassException( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  }
  private ClassNotFoundException resolveEx;
  private ExceptionInfo deserializeEx;
  private ExceptionInfo serializeEx;
  private ExceptionInfo defaultSerializeEx;
  private ObjectStreamField [] fields;
  private int primDataSize;
  private int numObjFields;
  private FieldReflector fieldRefl;
  private volatile ClassDataSlot [] dataLayout;
  private Constructor<?> cons;
  private ProtectionDomain [] domains;
  private Method writeObjectMethod;
  private Method readObjectMethod;
  private Method readObjectNoDataMethod;
  private Method writeReplaceMethod;
  private Method readResolveMethod;
  private ObjectStreamClass localDesc;
  private ObjectStreamClass superDesc;
  private boolean initialized;
  private static native void initNative( ) ;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
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
    private static final Object unset;
    private final Thread owner;
    private Object entry;
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
  private ObjectStreamClass(final Class<?> cl) {
  }
  ObjectStreamClass( ) {
  }
  private ProtectionDomain noPermissionsDomain( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  private ProtectionDomain [] getProtectionDomains(Constructor<?> cons, Class<?> cl) {
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
  private final void requireInitialized( ) {
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
    }
  }
  ClassDataSlot [] getClassDataLayout( ) throws InvalidClassException {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  private ClassDataSlot [] getClassDataLayout0( ) throws InvalidClassException {
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
  private void computeFieldOffsets( ) throws InvalidClassException {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  private ObjectStreamClass getVariantFor(Class<?> cl) throws InvalidClassException {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  private static Constructor<?> getExternalizableConstructor(Class<?> cl) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  private static boolean superHasAccessibleConstructor(Class<?> cl) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private static Constructor<?> getSerializableConstructor(Class<?> cl) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  private static Method getInheritableMethod(Class<?> cl,String name,Class<?> [] argTypes, Class<?> returnType) {
                                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                }
  private static Method getPrivateMethod(Class<?> cl,String name,Class<?> [] argTypes, Class<?> returnType) {
                                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                            }
  private static boolean packageEquals(Class<?> cl1, Class<?> cl2) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  private static String getPackageName(Class<?> cl) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  private static boolean classNamesEqual(String name1, String name2) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  private static String getClassSignature(Class<?> cl) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private static String getMethodSignature(Class<?> [] paramTypes, Class<?> retType) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  private static void throwMiscException(Throwable th) throws IOException {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  private static ObjectStreamField [] getSerialFields(Class<?> cl) throws InvalidClassException {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  private static ObjectStreamField [] getDeclaredSerialFields(Class<?> cl) throws InvalidClassException {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
  private static ObjectStreamField [] getDefaultSerialFields(Class<?> cl) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  private static Long getDeclaredSUID(Class<?> cl) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  private static long computeDefaultSUID(Class<?> cl) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private native static boolean hasStaticInitializer(Class<?> cl) ;
  private static class MemberSignature {
    public final Member member;
    public final String name;
    public final String signature;
    public MemberSignature(Field field) {
    }
    public MemberSignature(Constructor<?> cons) {
    }
    public MemberSignature(Method meth) {
    }
  }
  private static class FieldReflector {
    private static final Unsafe unsafe;
    private final ObjectStreamField [] fields;
    private final int numPrimFields;
    private final long [] readKeys;
    private final long [] writeKeys;
    private final int [] offsets;
    private final char [] typeCodes;
    private final Class<?> [] types;
    FieldReflector(ObjectStreamField [] fields) {
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
  private static FieldReflector getReflector(ObjectStreamField [] fields, ObjectStreamClass localDesc) throws InvalidClassException {
                                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                    }
  private static class FieldReflectorKey extends WeakReference<Class<?>> {
    private final String [] sigs;
    private final int hash;
    private final boolean nullClass;
    FieldReflectorKey(Class<?> cl,ObjectStreamField [] fields, ReferenceQueue<Class<?>> queue) {
      super(cl, queue);
    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  private static ObjectStreamField [] matchFields(ObjectStreamField [] fields, ObjectStreamClass localDesc) throws InvalidClassException {
                                                                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                         }
  static void processQueue(ReferenceQueue<Class<?>> queue, ConcurrentMap<? extends WeakReference<Class<?>>, ?> map) {
                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                    }
  static class WeakClassKey extends WeakReference<Class<?>> {
    private final int hash;
    WeakClassKey(Class<?> cl, ReferenceQueue<Class<?>> refQueue) {
      super(cl, refQueue);
    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
}