package java.lang.reflect;

import sun.reflect.ConstructorAccessor;
import sun.reflect.generics.repository.ConstructorRepository;
import sun.reflect.generics.factory.GenericsFactory;
import java.lang.annotation.Annotation;

public final class Constructor<T> extends Executable {
  private Class<T> clazz;
  private int slot;
  private Class<?> [] parameterTypes;
  private Class<?> [] exceptionTypes;
  private int modifiers;
  private transient String signature;
  private transient ConstructorRepository genericInfo;
  private byte [] annotations;
  private byte [] parameterAnnotations;
  private GenericsFactory getFactory( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  ConstructorRepository getGenericInfo( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private volatile ConstructorAccessor constructorAccessor;
  private Constructor<T> root;
  Executable getRoot( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  Constructor(Class<T> declaringClass,Class<?> [] parameterTypes,Class<?> [] checkedExceptions,int modifiers,int slot,String signature,byte [] annotations, byte [] parameterAnnotations) {
  }
  Constructor<T> copy( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  boolean hasGenericInformation( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  byte [] getAnnotationBytes( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public Class<T> getDeclaringClass( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public String getName( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public int getModifiers( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public TypeVariable<Constructor<T>> [] getTypeParameters( ) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public Class<?> [] getParameterTypes( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public int getParameterCount( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public Type [] getGenericParameterTypes( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public Class<?> [] getExceptionTypes( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public Type [] getGenericExceptionTypes( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  void specificToStringHeader(StringBuilder sb) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public String toGenericString( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  void specificToGenericStringHeader(StringBuilder sb) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public T newInstance(Object ... initargs) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                                                                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                       }
  public boolean isVarArgs( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public boolean isSynthetic( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  private ConstructorAccessor acquireConstructorAccessor( ) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  ConstructorAccessor getConstructorAccessor( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  void setConstructorAccessor(ConstructorAccessor accessor) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  int getSlot( ) {
                   throw new java . lang . RuntimeException ("Implementation stripped");
                 }
  String getSignature( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  byte [] getRawAnnotations( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  byte [] getRawParameterAnnotations( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public Annotation [] getDeclaredAnnotations( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public Annotation [] [] getParameterAnnotations( ) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  void handleParameterNumberMismatch(int resultLength, int numParameters) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public AnnotatedType getAnnotatedReturnType( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public AnnotatedType getAnnotatedReceiverType( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
}