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
import java.util.Map;
import sun.reflect.ConstantPool;
import java.lang.annotation.Annotation;
import sun.reflect.annotation.*;

public final class Class<T> implements java. io. Serializable, GenericDeclaration, Type, AnnotatedElement {
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
  public T newInstance( ) throws InstantiationException, IllegalAccessException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
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
  public ClassLoader getClassLoader( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  ClassLoader getClassLoader0( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
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
  private final static class EnclosingMethodInfo {
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
  public Constructor<?> getEnclosingConstructor( ) throws SecurityException {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public Class<?> getDeclaringClass( ) throws SecurityException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public Class<?> getEnclosingClass( ) throws SecurityException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public String getSimpleName( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public String getTypeName( ) {
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
  public java. security. ProtectionDomain getProtectionDomain( ) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  static native Class<?> getPrimitiveClass(String name) ;
  private static class Atomic {
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
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  native byte [] getRawAnnotations( ) ;
  native byte [] getRawTypeAnnotations( ) ;
  static byte [] getExecutableTypeAnnotationBytes(Executable ex) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  native ConstantPool getConstantPool( ) ;
  static class MethodArray {
    MethodArray( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    MethodArray(int initialSize) {
      throw new java . lang . RuntimeException ("Implementation stripped");
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
  public boolean desiredAssertionStatus( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public boolean isEnum( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public T [] getEnumConstants( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  T [] getEnumConstantsShared( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  Map<String, T> enumConstantDirectory( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public T cast(Object obj) {
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
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
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