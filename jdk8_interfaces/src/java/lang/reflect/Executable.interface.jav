package java.lang.reflect;

import java.lang.annotation.*;
import java.util.Map;
import sun.reflect.generics.repository.ConstructorRepository;

public abstract class Executable extends AccessibleObject implements Member, GenericDeclaration {
  Executable( ) {
  }
  abstract byte [] getAnnotationBytes( ) ;
  abstract Executable getRoot( ) ;
  abstract boolean hasGenericInformation( ) ;
  abstract ConstructorRepository getGenericInfo( ) ;
  boolean equalParamTypes(Class<?> [] params1, Class<?> [] params2) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  Annotation [] [] parseParameterAnnotations(byte [] parameterAnnotations) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  void separateWithCommas(Class<?> [] types, StringBuilder sb) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  void printModifiersIfNonzero(StringBuilder sb,int mask, boolean isDefault) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  String sharedToString(int modifierMask,boolean isDefault,Class<?> [] parameterTypes, Class<?> [] exceptionTypes) {
                                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                   }
  abstract void specificToStringHeader(StringBuilder sb) ;
  String sharedToGenericString(int modifierMask, boolean isDefault) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  abstract void specificToGenericStringHeader(StringBuilder sb) ;
  public abstract Class<?> getDeclaringClass( ) ;
  public abstract String getName( ) ;
  public abstract int getModifiers( ) ;
  public abstract TypeVariable<?> [] getTypeParameters( ) ;
  public abstract Class<?> [] getParameterTypes( ) ;
  public int getParameterCount( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public Type [] getGenericParameterTypes( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  Type [] getAllGenericParameterTypes( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public Parameter [] getParameters( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  private Parameter [] synthesizeAllParams( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private void verifyParameters(final Parameter [] parameters) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  private Parameter [] privateGetParameters( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  boolean hasRealParameterData( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private transient volatile boolean hasRealParameterData;
  private transient volatile Parameter [] parameters;
  private native Parameter [] getParameters0( ) ;
  native byte [] getTypeAnnotationBytes0( ) ;
  byte [] getTypeAnnotationBytes( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public abstract Class<?> [] getExceptionTypes( ) ;
  public Type [] getGenericExceptionTypes( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public abstract String toGenericString( ) ;
  public boolean isVarArgs( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public boolean isSynthetic( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public abstract Annotation [] [] getParameterAnnotations( ) ;
  Annotation [] [] sharedGetParameterAnnotations(Class<?> [] parameterTypes, byte [] parameterAnnotations) {
                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                           }
  abstract void handleParameterNumberMismatch(int resultLength, int numParameters) ;
  public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public <T extends Annotation> T [] getAnnotationsByType(Class<T> annotationClass) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public Annotation [] getDeclaredAnnotations( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  private transient volatile Map<Class<? extends Annotation>, Annotation> declaredAnnotations;
  private Map<Class<? extends Annotation>, Annotation> declaredAnnotations( ) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public abstract AnnotatedType getAnnotatedReturnType( ) ;
  AnnotatedType getAnnotatedReturnType0(Type returnType) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public AnnotatedType getAnnotatedReceiverType( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public AnnotatedType [] getAnnotatedParameterTypes( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public AnnotatedType [] getAnnotatedExceptionTypes( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
}