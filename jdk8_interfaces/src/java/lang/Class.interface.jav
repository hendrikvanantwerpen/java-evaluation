package java.lang;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Field;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.AnnotatedType;
import java.lang.ref.SoftReference;
import java.io.InputStream;
import java.io.ObjectStreamField;
import java.util.Collection;
import java.util.Set;
import java.util.Map;
import sun.misc.Unsafe;
import sun.reflect.ConstantPool;
import sun.reflect.ReflectionFactory;
import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.repository.ClassRepository;
import java.lang.annotation.Annotation;
import sun.reflect.annotation.*;

public final class Class<T> implements java. io. Serializable, GenericDeclaration, Type, AnnotatedElement {
  private static final int ANNOTATION;
  private static final int ENUM;
  private static final int SYNTHETIC;
  private static native void registerNatives( ) ;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  private Class(ClassLoader loader) {
  }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public String toGenericString( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public static Class<?> forName(String className) throws ClassNotFoundException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public static Class<?> forName(String name,boolean initialize, ClassLoader loader) throws ClassNotFoundException {
                                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                   }
  private static native Class<?> forName0(String name,boolean initialize,ClassLoader loader, Class<?> caller) throws ClassNotFoundException ;
  public T newInstance( ) throws InstantiationException, IllegalAccessException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  private volatile transient Constructor<T> cachedConstructor;
  private volatile transient Class<?> newInstanceCallerCache;
  public native boolean isInstance(Object obj) ;
  public native boolean isAssignableFrom(Class<?> cls) ;
  public native boolean isInterface( ) ;
  public native boolean isArray( ) ;
  public native boolean isPrimitive( ) ;
  public boolean isAnnotation( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public boolean isSynthetic( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public String getName( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  private transient String name;
  private native String getName0( ) ;
  public ClassLoader getClassLoader( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  ClassLoader getClassLoader0( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  private final ClassLoader classLoader;
  public TypeVariable<Class<T>> [] getTypeParameters( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public native Class<? super T> getSuperclass( ) ;
  public Type getGenericSuperclass( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public Package getPackage( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public Class<?> [] getInterfaces( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  private native Class<?> [] getInterfaces0( ) ;
  public Type [] getGenericInterfaces( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public native Class<?> getComponentType( ) ;
  public native int getModifiers( ) ;
  public native Object [] getSigners( ) ;
  native void setSigners(Object [] signers) ;
  public Method getEnclosingMethod( ) throws SecurityException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  private native Object [] getEnclosingMethod0( ) ;
  private EnclosingMethodInfo getEnclosingMethodInfo( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private final static class EnclosingMethodInfo {
    private Class<?> enclosingClass;
    private String name;
    private String descriptor;
    private EnclosingMethodInfo(Object [] enclosingInfo) {
    }
    boolean isPartial( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    boolean isConstructor( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    boolean isMethod( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    Class<?> getEnclosingClass( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    String getName( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
    String getDescriptor( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  }
  private static Class<?> toClass(Type o) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public Constructor<?> getEnclosingConstructor( ) throws SecurityException {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public Class<?> getDeclaringClass( ) throws SecurityException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  private native Class<?> getDeclaringClass0( ) ;
  public Class<?> getEnclosingClass( ) throws SecurityException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public String getSimpleName( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public String getTypeName( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  private static boolean isAsciiDigit(char c) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public String getCanonicalName( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public boolean isAnonymousClass( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public boolean isLocalClass( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public boolean isMemberClass( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private String getSimpleBinaryName( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private boolean isLocalOrAnonymousClass( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public Class<?> [] getClasses( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public Field [] getFields( ) throws SecurityException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public Method [] getMethods( ) throws SecurityException {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public Constructor<?> [] getConstructors( ) throws SecurityException {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public Field getField(String name) throws NoSuchFieldException, SecurityException {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public Method getMethod(String name, Class<?> ... parameterTypes) throws NoSuchMethodException, SecurityException {
                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                    }
  public Constructor<T> getConstructor(Class<?> ... parameterTypes) throws NoSuchMethodException, SecurityException {
                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                    }
  public Class<?> [] getDeclaredClasses( ) throws SecurityException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  public Field [] getDeclaredFields( ) throws SecurityException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public Method [] getDeclaredMethods( ) throws SecurityException {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public Constructor<?> [] getDeclaredConstructors( ) throws SecurityException {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public Field getDeclaredField(String name) throws NoSuchFieldException, SecurityException {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  public Method getDeclaredMethod(String name, Class<?> ... parameterTypes) throws NoSuchMethodException, SecurityException {
                                                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                            }
  public Constructor<T> getDeclaredConstructor(Class<?> ... parameterTypes) throws NoSuchMethodException, SecurityException {
                                                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                            }
  public InputStream getResourceAsStream(String name) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public java. net. URL getResource(String name) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  private static java. security. ProtectionDomain allPermDomain;
  public java. security. ProtectionDomain getProtectionDomain( ) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  private native java. security. ProtectionDomain getProtectionDomain0( ) ;
  static native Class<?> getPrimitiveClass(String name) ;
  private void checkMemberAccess(int which,Class<?> caller, boolean checkProxyInterfaces) {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  private void checkPackageAccess(final ClassLoader ccl, boolean checkProxyInterfaces) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
  private String resolveName(String name) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private static class Atomic {
    private static final Unsafe unsafe;
    private static final long reflectionDataOffset;
    private static final long annotationTypeOffset;
    private static final long annotationDataOffset;
    static {
             throw new java . lang . RuntimeException ("Implementation stripped");
           }
    private static long objectFieldOffset(Field [] fields, String fieldName) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
    static <T> boolean casReflectionData(Class<?> clazz,SoftReference<ReflectionData<T>> oldData, SoftReference<ReflectionData<T>> newData) {
                                                                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                            }
    static <T> boolean casAnnotationType(Class<?> clazz,AnnotationType oldType, AnnotationType newType) {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
    static <T> boolean casAnnotationData(Class<?> clazz,AnnotationData oldData, AnnotationData newData) {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
  }
  private static boolean useCaches;
  private static class ReflectionData<T> {
    volatile Field [] declaredFields;
    volatile Field [] publicFields;
    volatile Method [] declaredMethods;
    volatile Method [] publicMethods;
    volatile Constructor<T> [] declaredConstructors;
    volatile Constructor<T> [] publicConstructors;
    volatile Field [] declaredPublicFields;
    volatile Method [] declaredPublicMethods;
    volatile Class<?> [] interfaces;
    final int redefinedCount;
    ReflectionData(int redefinedCount) {
    }
  }
  private volatile transient SoftReference<ReflectionData<T>> reflectionData;
  private volatile transient int classRedefinedCount;
  private ReflectionData<T> reflectionData( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private ReflectionData<T> newReflectionData(SoftReference<ReflectionData<T>> oldReflectionData, int classRedefinedCount) {
                                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                           }
  private native String getGenericSignature0( ) ;
  private volatile transient ClassRepository genericInfo;
  private GenericsFactory getFactory( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private ClassRepository getGenericInfo( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  native byte [] getRawAnnotations( ) ;
  native byte [] getRawTypeAnnotations( ) ;
  static byte [] getExecutableTypeAnnotationBytes(Executable ex) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  native ConstantPool getConstantPool( ) ;
  private Field [] privateGetDeclaredFields(boolean publicOnly) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  private Field [] privateGetPublicFields(Set<Class<?>> traversedInterfaces) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  private static void addAll(Collection<Field> c, Field [] o) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  private Constructor<T> [] privateGetDeclaredConstructors(boolean publicOnly) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  private Method [] privateGetDeclaredMethods(boolean publicOnly) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  static class MethodArray {
    private Method [] methods;
    private int length;
    private int defaults;
    MethodArray( ) {
      this(20);
    }
    MethodArray(int initialSize) {
    }
    boolean hasDefaults( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    void add(Method m) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    void addAll(Method [] ma) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    void addAll(MethodArray ma) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    void addIfNotPresent(Method newMethod) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    void addAllIfNotPresent(MethodArray newMethods) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    void addInterfaceMethods(Method [] methods) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    int length( ) {
                    throw new java . lang . RuntimeException ("Implementation stripped");
                  }
    Method get(int i) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
    Method getFirst( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    void removeByNameAndDescriptor(Method toRemove) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    private void remove(int i) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    private boolean matchesNameAndDescriptor(Method m1, Method m2) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
    void compactAndTrim( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    void removeLessSpecifics( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    Method [] getArray( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    static boolean hasMoreSpecificClass(Method m1, Method m2) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  }
  private Method [] privateGetPublicMethods( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private static Field searchFields(Field [] fields, String name) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  private Field getField0(String name) throws NoSuchFieldException {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  private static Method searchMethods(Method [] methods,String name, Class<?> [] parameterTypes) {
                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                 }
  private Method getMethod0(String name,Class<?> [] parameterTypes, boolean includeStaticMethods) {
                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                  }
  private Method privateGetMethodRecursive(String name,Class<?> [] parameterTypes,boolean includeStaticMethods, MethodArray allInterfaceCandidates) {
                                                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                    }
  private Constructor<T> getConstructor0(Class<?> [] parameterTypes, int which) throws NoSuchMethodException {
                                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                             }
  private static boolean arrayContentsEq(Object [] a1, Object [] a2) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  private static Field [] copyFields(Field [] arg) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  private static Method [] copyMethods(Method [] arg) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private static <U> Constructor<U> [] copyConstructors(Constructor<U> [] arg) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  private native Field [] getDeclaredFields0(boolean publicOnly) ;
  private native Method [] getDeclaredMethods0(boolean publicOnly) ;
  private native Constructor<T> [] getDeclaredConstructors0(boolean publicOnly) ;
  private native Class<?> [] getDeclaredClasses0( ) ;
  private static String argumentTypesToString(Class<?> [] argTypes) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private static final long serialVersionUID;
  private static final ObjectStreamField [] serialPersistentFields;
  public boolean desiredAssertionStatus( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private static native boolean desiredAssertionStatus0(Class<?> clazz) ;
  public boolean isEnum( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  private static ReflectionFactory getReflectionFactory( ) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  private static ReflectionFactory reflectionFactory;
  private static boolean initted;
  private static void checkInitted( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public T [] getEnumConstants( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  T [] getEnumConstantsShared( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  private volatile transient T [] enumConstants;
  Map<String, T> enumConstantDirectory( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private volatile transient Map<String, T> enumConstantDirectory;
  public T cast(Object obj) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private String cannotCastMsg(Object obj) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public <U> Class<? extends U> asSubclass(Class<U> clazz) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public <A extends Annotation> A getAnnotation(Class<A> annotationClass) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  public <A extends Annotation> A [] getAnnotationsByType(Class<A> annotationClass) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public Annotation [] getAnnotations( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationClass) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  public <A extends Annotation> A [] getDeclaredAnnotationsByType(Class<A> annotationClass) {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  public Annotation [] getDeclaredAnnotations( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  private static class AnnotationData {
    final Map<Class<? extends Annotation>, Annotation> annotations;
    final Map<Class<? extends Annotation>, Annotation> declaredAnnotations;
    final int redefinedCount;
    AnnotationData(Map<Class<? extends Annotation>, Annotation> annotations,Map<Class<? extends Annotation>, Annotation> declaredAnnotations, int redefinedCount) {
    }
  }
  private volatile transient AnnotationData annotationData;
  private AnnotationData annotationData( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private AnnotationData createAnnotationData(int classRedefinedCount) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  private volatile transient AnnotationType annotationType;
  boolean casAnnotationType(AnnotationType oldType, AnnotationType newType) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  AnnotationType getAnnotationType( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  Map<Class<? extends Annotation>, Annotation> getDeclaredAnnotationMap( ) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  transient ClassValue. ClassValueMap classValueMap;
  public AnnotatedType getAnnotatedSuperclass( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public AnnotatedType [] getAnnotatedInterfaces( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
}