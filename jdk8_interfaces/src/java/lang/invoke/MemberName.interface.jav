package java.lang.invoke;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Member;
import java.util.List;
import static java.lang.invoke.MethodHandleNatives.Constants.*;
import static java.lang.invoke.MethodHandleStatics.*;

final class MemberName implements Member, Cloneable {
  public Class<?> getDeclaringClass( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public ClassLoader getClassLoader( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public String getName( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public MethodType getMethodOrFieldType( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public MethodType getMethodType( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public MethodType getInvocationType( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public Class<?> [] getParameterTypes( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public Class<?> getReturnType( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public Class<?> getFieldType( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public Object getType( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public String getSignature( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public int getModifiers( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public byte getReferenceKind( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  boolean referenceKindIsConsistentWith(int originalRefKind) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public boolean isMethodHandleInvoke( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public static boolean isMethodHandleInvokeName(String name) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public boolean isStatic( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean isPublic( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean isPrivate( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public boolean isProtected( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public boolean isFinal( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean canBeStaticallyBound( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public boolean isVolatile( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public boolean isAbstract( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public boolean isNative( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  static final int BRIDGE;
  static final int VARARGS;
  static final int SYNTHETIC;
  static final int ANNOTATION;
  static final int ENUM;
  public boolean isBridge( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean isVarargs( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public boolean isSynthetic( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  static final String CONSTRUCTOR_NAME;
  static final int RECOGNIZED_MODIFIERS;
  static final int IS_METHOD, IS_CONSTRUCTOR, IS_FIELD, IS_TYPE, CALLER_SENSITIVE;
  static final int ALL_ACCESS;
  static final int ALL_KINDS;
  static final int IS_INVOCABLE;
  static final int IS_FIELD_OR_METHOD;
  static final int SEARCH_ALL_SUPERS;
  public boolean isInvocable( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public boolean isFieldOrMethod( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public boolean isMethod( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean isConstructor( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean isField( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean isType( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public boolean isPackage( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public boolean isCallerSensitive( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public boolean isAccessibleFrom(Class<?> lookupClass) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public MemberName(Method m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MemberName(Method m, boolean wantSpecial) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MemberName asSpecial( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public MemberName asConstructor( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public MemberName asNormalOriginal( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public MemberName(Constructor<?> ctor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MemberName(Field fld) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MemberName(Field fld, boolean makeSetter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isGetter( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean isSetter( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public MemberName asSetter( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public MemberName(Class<?> type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static MemberName makeMethodHandleInvoke(String name, MethodType type) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  static MemberName makeMethodHandleInvoke(String name,MethodType type, int mods) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  MemberName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MemberName getDefinition( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public boolean equals(Object that) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public boolean equals(MemberName that) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public MemberName(Class<?> defClass,String name,Class<?> type, byte refKind) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MemberName(Class<?> defClass,String name,MethodType type, byte refKind) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MemberName(byte refKind,Class<?> defClass,String name, Object type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasReceiverTypeDispatch( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public boolean isResolved( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  void checkForTypeAlias(Class<?> refc) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public IllegalAccessException makeAccessException(String message, Object from) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public ReflectiveOperationException makeAccessException( ) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  static Factory getFactory( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  static class Factory {
    static Factory INSTANCE;
    List<MemberName> getMembers(Class<?> defc,String matchName,Object matchType,int matchFlags, Class<?> lookupClass) {
                                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                      }
    public <NoSuchMemberException extends ReflectiveOperationException> MemberName resolveOrFail(byte refKind,MemberName m,Class<?> lookupClass, Class<NoSuchMemberException> nsmClass) throws IllegalAccessException, NoSuchMemberException {
                                                                                                                                                                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                                                                                             }
    public MemberName resolveOrNull(byte refKind,MemberName m, Class<?> lookupClass) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
    public List<MemberName> getMethods(Class<?> defc,boolean searchSupers, Class<?> lookupClass) {
                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                 }
    public List<MemberName> getMethods(Class<?> defc,boolean searchSupers,String name,MethodType type, Class<?> lookupClass) {
                                                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                             }
    public List<MemberName> getConstructors(Class<?> defc, Class<?> lookupClass) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
    public List<MemberName> getFields(Class<?> defc,boolean searchSupers, Class<?> lookupClass) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
    public List<MemberName> getFields(Class<?> defc,boolean searchSupers,String name,Class<?> type, Class<?> lookupClass) {
                                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                          }
    public List<MemberName> getNestedTypes(Class<?> defc,boolean searchSupers, Class<?> lookupClass) {
                                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                     }
  }
}