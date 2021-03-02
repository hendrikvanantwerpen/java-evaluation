package java.lang.reflect;

import sun.reflect.FieldAccessor;
import sun.reflect.generics.repository.FieldRepository;
import sun.reflect.generics.factory.GenericsFactory;
import java.lang.annotation.Annotation;
import java.util.Map;

public final class Field extends AccessibleObject implements Member {
  private Class<?> clazz;
  private int slot;
  private String name;
  private Class<?> type;
  private int modifiers;
  private transient String signature;
  private transient FieldRepository genericInfo;
  private byte [] annotations;
  private FieldAccessor fieldAccessor;
  private FieldAccessor overrideFieldAccessor;
  private Field root;
  private String getGenericSignature( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private GenericsFactory getFactory( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private FieldRepository getGenericInfo( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  Field(Class<?> declaringClass,String name,Class<?> type,int modifiers,int slot,String signature, byte [] annotations) {
  }
  Field copy( ) {
                  throw new java . lang . RuntimeException ("Implementation stripped");
                }
  public Class<?> getDeclaringClass( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public String getName( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public int getModifiers( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean isEnumConstant( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public boolean isSynthetic( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public Class<?> getType( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public Type getGenericType( ) {
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
  public String toGenericString( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public Object get(Object obj) throws IllegalArgumentException, IllegalAccessException {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  public boolean getBoolean(Object obj) throws IllegalArgumentException, IllegalAccessException {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  public byte getByte(Object obj) throws IllegalArgumentException, IllegalAccessException {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  public char getChar(Object obj) throws IllegalArgumentException, IllegalAccessException {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  public short getShort(Object obj) throws IllegalArgumentException, IllegalAccessException {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  public int getInt(Object obj) throws IllegalArgumentException, IllegalAccessException {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  public long getLong(Object obj) throws IllegalArgumentException, IllegalAccessException {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  public float getFloat(Object obj) throws IllegalArgumentException, IllegalAccessException {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  public double getDouble(Object obj) throws IllegalArgumentException, IllegalAccessException {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
  public void set(Object obj, Object value) throws IllegalArgumentException, IllegalAccessException {
                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                    }
  public void setBoolean(Object obj, boolean z) throws IllegalArgumentException, IllegalAccessException {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
  public void setByte(Object obj, byte b) throws IllegalArgumentException, IllegalAccessException {
                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                  }
  public void setChar(Object obj, char c) throws IllegalArgumentException, IllegalAccessException {
                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                  }
  public void setShort(Object obj, short s) throws IllegalArgumentException, IllegalAccessException {
                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                    }
  public void setInt(Object obj, int i) throws IllegalArgumentException, IllegalAccessException {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  public void setLong(Object obj, long l) throws IllegalArgumentException, IllegalAccessException {
                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                  }
  public void setFloat(Object obj, float f) throws IllegalArgumentException, IllegalAccessException {
                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                    }
  public void setDouble(Object obj, double d) throws IllegalArgumentException, IllegalAccessException {
                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                      }
  private FieldAccessor getFieldAccessor(Object obj) throws IllegalAccessException {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  private FieldAccessor acquireFieldAccessor(boolean overrideFinalCheck) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  private FieldAccessor getFieldAccessor(boolean overrideFinalCheck) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  private void setFieldAccessor(FieldAccessor accessor, boolean overrideFinalCheck) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
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
  private native byte [] getTypeAnnotationBytes0( ) ;
  public AnnotatedType getAnnotatedType( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
}