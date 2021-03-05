package java.lang.invoke;

import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import static java.lang.invoke.MethodHandleStatics.*;

public final class MethodType implements java. io. Serializable {
  MethodTypeForm form( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  Class<?> rtype( ) {
                      throw new java . lang . RuntimeException ("Implementation stripped");
                    }
  Class<?> [] ptypes( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  void setForm(MethodTypeForm f) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  static final int MAX_JVM_ARITY;
  static final int MAX_MH_ARITY;
  static final int MAX_MH_INVOKER_ARITY;
  static void checkSlotCount(int count) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  static final ConcurrentWeakInternSet<MethodType> internTable;
  static final Class<?> [] NO_PTYPES;
  public static MethodType methodType(Class<?> rtype, Class<?> [] ptypes) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public static MethodType methodType(Class<?> rtype, List<Class<?>> ptypes) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  public static MethodType methodType(Class<?> rtype,Class<?> ptype0, Class<?> ... ptypes) {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  public static MethodType methodType(Class<?> rtype) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public static MethodType methodType(Class<?> rtype, Class<?> ptype0) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public static MethodType methodType(Class<?> rtype, MethodType ptypes) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  static MethodType makeImpl(Class<?> rtype,Class<?> [] ptypes, boolean trusted) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public static MethodType genericMethodType(int objectArgCount, boolean finalArray) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  public static MethodType genericMethodType(int objectArgCount) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public MethodType changeParameterType(int num, Class<?> nptype) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public MethodType insertParameterTypes(int num, Class<?> ... ptypesToInsert) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public MethodType appendParameterTypes(Class<?> ... ptypesToInsert) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public MethodType insertParameterTypes(int num, List<Class<?>> ptypesToInsert) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public MethodType appendParameterTypes(List<Class<?>> ptypesToInsert) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  MethodType replaceParameterTypes(int start,int end, Class<?> ... ptypesToInsert) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  MethodType asSpreaderType(Class<?> arrayType, int arrayLength) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  Class<?> leadingReferenceParameter( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  MethodType asCollectorType(Class<?> arrayType, int arrayLength) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public MethodType dropParameterTypes(int start, int end) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public MethodType changeReturnType(Class<?> nrtype) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public boolean hasPrimitives( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean hasWrappers( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public MethodType erase( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  MethodType basicType( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  MethodType invokerType( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public MethodType generic( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  boolean isGeneric( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public MethodType wrap( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public MethodType unwrap( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public Class<?> parameterType(int num) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public int parameterCount( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public Class<?> returnType( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public List<Class<?>> parameterList( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  Class<?> lastParameterType( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public Class<?> [] parameterArray( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public boolean equals(Object x) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  boolean isViewableAs(MethodType newType, boolean keepInterfaces) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  boolean parametersAreViewableAs(MethodType newType, boolean keepInterfaces) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  boolean isConvertibleTo(MethodType newType) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  boolean explicitCastEquivalentToAsType(MethodType newType) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  static boolean canConvert(Class<?> src, Class<?> dst) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  int parameterSlotCount( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  Invokers invokers( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  int parameterSlotDepth(int num) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  int returnSlotCount( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public static MethodType fromMethodDescriptorString(String descriptor, ClassLoader loader) throws IllegalArgumentException, TypeNotPresentException {
                                                                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                      }
  public String toMethodDescriptorString( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  static String toFieldDescriptorString(Class<?> cls) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private static class ConcurrentWeakInternSet<T> {
    public ConcurrentWeakInternSet( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public T get(T elem) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public T add(T elem) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    private static class WeakEntry<T> extends WeakReference<T> {
      public final int hashcode;
      public WeakEntry(T key, ReferenceQueue<T> queue) {
        throw new java . lang . RuntimeException ("Implementation stripped");
      }
      public WeakEntry(T key) {
        throw new java . lang . RuntimeException ("Implementation stripped");
      }
      public boolean equals(Object obj) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
      public int hashCode( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    }
  }
}