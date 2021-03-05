package java.lang.invoke;

import java.lang.reflect.Method;
import static java.lang.invoke.MethodHandleNatives.Constants.*;
import static java.lang.invoke.LambdaForm.*;
import static java.lang.invoke.MethodTypeForm.*;
import static java.lang.invoke.MethodHandleStatics.*;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

class DirectMethodHandle extends MethodHandle {
  final MemberName member;
  static DirectMethodHandle make(byte refKind,Class<?> receiver, MemberName member) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  static DirectMethodHandle make(Class<?> receiver, MemberName member) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  static DirectMethodHandle make(MemberName member) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  static DirectMethodHandle make(Method method) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  static DirectMethodHandle make(Field field) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  BoundMethodHandle rebind( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  MethodHandle copyWith(MethodType mt, LambdaForm lf) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  String internalProperties( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  MemberName internalMemberName( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  static Object findDirectMethodHandle(Name name) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  static Object internalMemberName(Object mh) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  static Object internalMemberNameEnsureInit(Object mh) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  static boolean shouldBeInitialized(MemberName member) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private static class EnsureInitialized extends ClassValue<WeakReference<Thread>> {
    static final EnsureInitialized INSTANCE;
  }
  static void ensureInitialized(Object mh) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  static class Special extends DirectMethodHandle {
    boolean isInvokeSpecial( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    MethodHandle copyWith(MethodType mt, LambdaForm lf) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  }
  static class Interface extends DirectMethodHandle {
    MethodHandle copyWith(MethodType mt, LambdaForm lf) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
    Object checkReceiver(Object recv) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  static class Constructor extends DirectMethodHandle {
    final MemberName initMethod;
    final Class<?> instanceClass;
    MethodHandle copyWith(MethodType mt, LambdaForm lf) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  }
  static Object constructorMethod(Object mh) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  static Object allocateInstance(Object mh) throws InstantiationException {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  static class Accessor extends DirectMethodHandle {
    final Class<?> fieldType;
    final int fieldOffset;
    Object checkCast(Object obj) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    MethodHandle copyWith(MethodType mt, LambdaForm lf) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  }
  static long fieldOffset(Object accessorObj) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  static Object checkBase(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  static class StaticAccessor extends DirectMethodHandle {
    Object checkCast(Object obj) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    MethodHandle copyWith(MethodType mt, LambdaForm lf) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  }
  static Object nullCheck(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  static Object staticBase(Object accessorObj) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static long staticOffset(Object accessorObj) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static Object checkCast(Object mh, Object obj) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  Object checkCast(Object obj) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  private static class Lazy {
    static final NamedFunction NF_internalMemberName, NF_internalMemberNameEnsureInit, NF_ensureInitialized, NF_fieldOffset, NF_checkBase, NF_staticBase, NF_staticOffset, NF_checkCast, NF_allocateInstance, NF_constructorMethod, NF_checkReceiver;
  }
}