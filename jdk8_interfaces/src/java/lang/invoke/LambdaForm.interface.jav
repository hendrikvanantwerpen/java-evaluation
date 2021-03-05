package java.lang.invoke;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.List;
import sun.invoke.util.Wrapper;
import java.lang.reflect.Field;
import static java.lang.invoke.LambdaForm.BasicType.*;
import static java.lang.invoke.MethodHandleStatics.*;
import static java.lang.invoke.MethodHandleNatives.Constants.*;

class LambdaForm {
  final int arity;
  final int result;
  final boolean forceInline;
  final MethodHandle customized;
  final Name [] names;
  final String debugName;
  MemberName vmentry;
  volatile Object transformCache;
  public static final int VOID_RESULT, LAST_RESULT;
  enum BasicType {
    ;  static final BasicType [] ALL_TYPES;
       static final BasicType [] ARG_TYPES;
       static final int ARG_TYPE_LIMIT;
       static final int TYPE_LIMIT;
       char basicTypeChar( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
       Class<?> basicTypeClass( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
       Wrapper basicTypeWrapper( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
       int basicTypeSlots( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
       static BasicType basicType(byte type) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
       static BasicType basicType(char type) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
       static BasicType basicType(Wrapper type) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
       static BasicType basicType(Class<?> type) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
       static char basicTypeChar(Class<?> type) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
       static BasicType [] basicTypes(List<Class<?>> types) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
       static BasicType [] basicTypes(String types) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
       static byte [] basicTypesOrd(BasicType [] btypes) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
       static boolean isBasicTypeChar(char c) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
       static boolean isArgBasicTypeChar(char c) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  }
  LambdaForm(String debugName,int arity,Name [] names, int result) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  LambdaForm(String debugName,int arity,Name [] names,int result,boolean forceInline, MethodHandle customized) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  LambdaForm(String debugName,int arity, Name [] names) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  LambdaForm(String debugName,int arity,Name [] names, boolean forceInline) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  LambdaForm(String debugName,Name [] formals,Name [] temps, Name result) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  LambdaForm(String debugName,Name [] formals,Name [] temps,Name result, boolean forceInline) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  LambdaForm customize(MethodHandle mh) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  LambdaForm uncustomize( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  boolean nameRefsAreLegal( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  BasicType returnType( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  BasicType parameterType(int n) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  Name parameter(int n) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  Object parameterConstraint(int n) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  int arity( ) {
                 throw new java . lang . RuntimeException ("Implementation stripped");
               }
  int expressionCount( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  MethodType methodType( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  final String basicTypeSignature( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  static int signatureArity(String sig) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  static BasicType signatureReturn(String sig) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static boolean isValidSignature(String sig) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  static MethodType signatureType(String sig) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public void prepare( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  MemberName compileToBytecode( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  static Object interpret_L(MethodHandle mh) throws Throwable {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  static Object interpret_L(MethodHandle mh, Object x1) throws Throwable {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  static Object interpret_L(MethodHandle mh,Object x1, Object x2) throws Throwable {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  Object interpretWithArguments(Object ... argumentValues) throws Throwable {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  Object interpretName(Name name, Object [] values) throws Throwable {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  Object interpretWithArgumentsTracing(Object ... argumentValues) throws Throwable {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  static void traceInterpreter(String event,Object obj, Object ... args) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  static void traceInterpreter(String event, Object obj) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public boolean equals(LambdaForm that) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  LambdaFormEditor editor( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  boolean contains(Name name) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  LambdaForm addArguments(int pos, BasicType ... types) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  LambdaForm addArguments(int pos, List<Class<?>> types) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  LambdaForm permuteArguments(int skip,int [] reorder, BasicType [] types) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  static boolean permutedTypesMatch(int [] reorder,BasicType [] types,Name [] names, int skip) {
                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                               }
  static class NamedFunction {
    final MemberName member;
    MethodHandle resolvedHandle;
    MethodHandle invoker;
    NamedFunction(MethodHandle resolvedHandle) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    NamedFunction(MemberName member, MethodHandle resolvedHandle) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    NamedFunction(MethodType basicInvokerType) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    NamedFunction(Method method) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    NamedFunction(Field field) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    NamedFunction(MemberName member) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    MethodHandle resolvedHandle( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    void resolve( ) {
                      throw new java . lang . RuntimeException ("Implementation stripped");
                    }
    public boolean equals(Object other) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    static void initializeInvokers( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    static Object invoke__V(MethodHandle mh, Object [] a) throws Throwable {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    static Object invoke_L_V(MethodHandle mh, Object [] a) throws Throwable {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
    static Object invoke_LL_V(MethodHandle mh, Object [] a) throws Throwable {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
    static Object invoke_LLL_V(MethodHandle mh, Object [] a) throws Throwable {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
    static Object invoke_LLLL_V(MethodHandle mh, Object [] a) throws Throwable {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
    static Object invoke_LLLLL_V(MethodHandle mh, Object [] a) throws Throwable {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
    static Object invoke__L(MethodHandle mh, Object [] a) throws Throwable {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    static Object invoke_L_L(MethodHandle mh, Object [] a) throws Throwable {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
    static Object invoke_LL_L(MethodHandle mh, Object [] a) throws Throwable {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
    static Object invoke_LLL_L(MethodHandle mh, Object [] a) throws Throwable {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
    static Object invoke_LLLL_L(MethodHandle mh, Object [] a) throws Throwable {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
    static Object invoke_LLLLL_L(MethodHandle mh, Object [] a) throws Throwable {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
    static final MethodType INVOKER_METHOD_TYPE;
    Object invokeWithArguments(Object ... arguments) throws Throwable {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
    Object invokeWithArgumentsTracing(Object [] arguments) throws Throwable {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
    MethodType methodType( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    MemberName member( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    Class<?> memberDeclaringClassOrNull( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    BasicType returnType( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    BasicType parameterType(int n) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    int arity( ) {
                   throw new java . lang . RuntimeException ("Implementation stripped");
                 }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean isIdentity( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public boolean isConstantZero( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public MethodHandleImpl. Intrinsic intrinsicName( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  }
  public static String basicTypeSignature(MethodType type) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public static String shortenSignature(String signature) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  static final class Name {
    final BasicType type;
    final NamedFunction function;
    final Object constraint;
    final Object [] arguments;
    Name(MethodHandle function, Object ... arguments) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Name(MethodType functionType, Object ... arguments) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Name(MemberName function, Object ... arguments) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Name(NamedFunction function, Object ... arguments) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Name(int index, BasicType type) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Name(BasicType type) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    BasicType type( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
    int index( ) {
                   throw new java . lang . RuntimeException ("Implementation stripped");
                 }
    boolean initIndex(int i) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    char typeChar( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
    void resolve( ) {
                      throw new java . lang . RuntimeException ("Implementation stripped");
                    }
    Name newIndex(int i) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    Name cloneWithIndex(int i) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    Name withConstraint(Object constraint) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    Name replaceName(Name oldName, Name newName) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    Name replaceNames(Name [] oldNames,Name [] newNames,int start, int end) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
    void internArguments( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    boolean isParam( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    boolean isConstantZero( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public String debugString( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public String paramString( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public String exprString( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    static boolean typesMatch(BasicType parameterType, Object object) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
    int lastUseIndex(Name n) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    int useCount(Name n) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    boolean contains(Name n) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public boolean equals(Name that) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public boolean equals(Object x) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  }
  int lastUseIndex(Name n) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  int useCount(Name n) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  static Name argument(int which, char type) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  static Name argument(int which, BasicType type) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  static Name internArgument(Name n) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  static Name [] arguments(int extra, String types) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  static Name [] arguments(int extra, char ... types) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  static Name [] arguments(int extra, List<Class<?>> types) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  static Name [] arguments(int extra, Class<?> ... types) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  static Name [] arguments(int extra, MethodType types) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  static final int INTERNED_ARGUMENT_LIMIT;
  static LambdaForm identityForm(BasicType type) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  static LambdaForm zeroForm(BasicType type) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  static NamedFunction identity(BasicType type) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  static NamedFunction constantZero(BasicType type) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  @interface Compiled {
  }
  @interface Hidden {
  }
}