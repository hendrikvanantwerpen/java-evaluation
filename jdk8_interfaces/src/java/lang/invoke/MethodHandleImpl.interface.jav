package java.lang.invoke;

import sun.invoke.empty.Empty;
import static java.lang.invoke.LambdaForm.*;
import static java.lang.invoke.MethodHandleStatics.*;

abstract class MethodHandleImpl {
  static void initStatics( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  static MethodHandle makeArrayElementAccessor(Class<?> arrayClass, boolean isSetter) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  static final class ArrayAccessor {
    static final int GETTER_INDEX, SETTER_INDEX, INDEX_LIMIT;
    static final ClassValue<MethodHandle []> TYPED_ACCESSORS;
    static final MethodHandle OBJECT_ARRAY_GETTER, OBJECT_ARRAY_SETTER;
    static int getElementI(int [] a, int i) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    static long getElementJ(long [] a, int i) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    static float getElementF(float [] a, int i) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    static double getElementD(double [] a, int i) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    static boolean getElementZ(boolean [] a, int i) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    static byte getElementB(byte [] a, int i) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    static short getElementS(short [] a, int i) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    static char getElementC(char [] a, int i) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    static Object getElementL(Object [] a, int i) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    static void setElementI(int [] a,int i, int x) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    static void setElementJ(long [] a,int i, long x) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    static void setElementF(float [] a,int i, float x) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    static void setElementD(double [] a,int i, double x) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    static void setElementZ(boolean [] a,int i, boolean x) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    static void setElementB(byte [] a,int i, byte x) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    static void setElementS(short [] a,int i, short x) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    static void setElementC(char [] a,int i, char x) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    static void setElementL(Object [] a,int i, Object x) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    static String name(Class<?> arrayClass, boolean isSetter) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
    static MethodType type(Class<?> arrayClass, boolean isSetter) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    static MethodType correctType(Class<?> arrayClass, boolean isSetter) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
    static MethodHandle getAccessor(Class<?> arrayClass, boolean isSetter) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  }
  static MethodHandle makePairwiseConvert(MethodHandle target,MethodType srcType,boolean strict, boolean monobox) {
                                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                  }
  static MethodHandle makePairwiseConvertByEditor(MethodHandle target,MethodType srcType,boolean strict, boolean monobox) {
                                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                          }
  static MethodHandle makePairwiseConvertIndirect(MethodHandle target,MethodType srcType,boolean strict, boolean monobox) {
                                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                          }
  static <T,U> T castReference(Class<? extends T> t, U x) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  static Object [] computeValueConversions(MethodType srcType,MethodType dstType,boolean strict, boolean monobox) {
                                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                  }
  static MethodHandle makePairwiseConvert(MethodHandle target,MethodType srcType, boolean strict) {
                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                  }
  static Object valueConversion(Class<?> src,Class<?> dst,boolean strict, boolean monobox) {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  static MethodHandle makeVarargsCollector(MethodHandle target, Class<?> arrayType) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  private static final class AsVarargsCollector extends DelegatingMethodHandle {
    AsVarargsCollector(MethodHandle target, Class<?> arrayType) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    AsVarargsCollector(MethodType type,MethodHandle target, Class<?> arrayType) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean isVarargsCollector( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public MethodHandle asFixedArity( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    MethodHandle setVarargs(MemberName member) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public MethodHandle asTypeUncached(MethodType newType) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean viewAsTypeChecks(MethodType newType, boolean strict) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  }
  static MethodHandle makeSpreadArguments(MethodHandle target,Class<?> spreadArgType,int spreadArgPos, int spreadArgCount) {
                                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                           }
  static void checkSpreadArgument(Object av, int n) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  static class Lazy {
    static final NamedFunction NF_checkSpreadArgument;
    static final NamedFunction NF_guardWithCatch;
    static final NamedFunction NF_throwException;
    static final NamedFunction NF_profileBoolean;
    static final MethodHandle MH_castReference;
    static final MethodHandle MH_selectAlternative;
    static final MethodHandle MH_copyAsPrimitiveArray;
    static final MethodHandle MH_fillNewTypedArray;
    static final MethodHandle MH_fillNewArray;
    static final MethodHandle MH_arrayIdentity;
  }
  static MethodHandle makeCollectArguments(MethodHandle target,MethodHandle collector,int collectArgPos, boolean retainOriginalArgs) {
                                                                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                     }
  static MethodHandle selectAlternative(boolean testResult,MethodHandle target, MethodHandle fallback) {
                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                       }
  static boolean profileBoolean(boolean result, int [] counters) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  static MethodHandle makeGuardWithTest(MethodHandle test,MethodHandle target, MethodHandle fallback) {
                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                      }
  static MethodHandle profile(MethodHandle target) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  static MethodHandle makeBlockInlningWrapper(MethodHandle target) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  static class CountingWrapper extends DelegatingMethodHandle {
    public MethodHandle asTypeUncached(MethodType newType) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean countDown( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    static void maybeStopCounting(Object o1) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    static final NamedFunction NF_maybeStopCounting;
  }
  static LambdaForm makeGuardWithTestForm(MethodType basicType) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  static MethodHandle makeGuardWithCatch(MethodHandle target,Class<? extends Throwable> exType, MethodHandle catcher) {
                                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                      }
  static Object guardWithCatch(MethodHandle target,Class<? extends Throwable> exType,MethodHandle catcher, Object ... av) throws Throwable {
                                                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                           }
  static MethodHandle throwException(MethodType type) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  static <T extends Throwable> Empty throwException(T t) throws T {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  static MethodHandle [] FAKE_METHOD_HANDLE_INVOKE;
  static MethodHandle fakeMethodHandleInvoke(MemberName method) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  static MethodHandle bindCaller(MethodHandle mh, Class<?> hostClass) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  private static class BindCaller {
    static MethodHandle bindCaller(MethodHandle mh, Class<?> hostClass) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
    private static class T {
      static void init( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
      static Object invoke_V(MethodHandle vamh, Object [] args) throws Throwable {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
    }
  }
  private static final class WrappedMember extends DelegatingMethodHandle {
    MemberName internalMemberName( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    Class<?> internalCallerClass( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    boolean isInvokeSpecial( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public MethodHandle asTypeUncached(MethodType newType) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static MethodHandle makeWrappedMember(MethodHandle target,MemberName member, boolean isInvokeSpecial) {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
  enum Intrinsic {
  }
  private static final class IntrinsicMethodHandle extends DelegatingMethodHandle {
    IntrinsicMethodHandle(MethodHandle target, Intrinsic intrinsicName) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Intrinsic intrinsicName( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public MethodHandle asTypeUncached(MethodType newType) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    String internalProperties( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public MethodHandle asCollector(Class<?> arrayType, int arrayLength) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  }
  static MethodHandle makeIntrinsic(MethodHandle target, Intrinsic intrinsicName) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  static MethodHandle makeIntrinsic(MethodType type,LambdaForm form, Intrinsic intrinsicName) {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
  static MethodHandle varargsArray(int nargs) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  static <T> T [] identity(T [] x) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  static final int MAX_JVM_ARITY;
  static MethodHandle varargsArray(Class<?> arrayType, int nargs) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  static void assertSame(Object mh1, Object mh2) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
}