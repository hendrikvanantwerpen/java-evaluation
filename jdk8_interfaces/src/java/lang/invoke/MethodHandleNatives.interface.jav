package java.lang.invoke;

import static java.lang.invoke.MethodHandleNatives.Constants.*;
import static java.lang.invoke.MethodHandleStatics.*;

class MethodHandleNatives {
  static native void init(MemberName self, Object ref) ;
  static native void expand(MemberName self) ;
  static native MemberName resolve(MemberName self, Class<?> caller) throws LinkageError, ClassNotFoundException ;
  static native int getMembers(Class<?> defc,String matchName,String matchSig,int matchFlags,Class<?> caller,int skip, MemberName [] results) ;
  static native long objectFieldOffset(MemberName self) ;
  static native long staticFieldOffset(MemberName self) ;
  static native Object staticFieldBase(MemberName self) ;
  static native Object getMemberVMInfo(MemberName self) ;
  static native int getConstant(int which) ;
  static final boolean COUNT_GWT;
  static native void setCallSiteTargetNormal(CallSite site, MethodHandle target) ;
  static native void setCallSiteTargetVolatile(CallSite site, MethodHandle target) ;
  static class Constants {
    Constants( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    static final int GC_COUNT_GWT, GC_LAMBDA_SUPPORT;
    static final int MN_IS_METHOD, MN_IS_CONSTRUCTOR, MN_IS_FIELD, MN_IS_TYPE, MN_CALLER_SENSITIVE, MN_REFERENCE_KIND_SHIFT, MN_REFERENCE_KIND_MASK, MN_SEARCH_SUPERCLASSES, MN_SEARCH_INTERFACES;
    static final int T_BOOLEAN, T_CHAR, T_FLOAT, T_DOUBLE, T_BYTE, T_SHORT, T_INT, T_LONG, T_OBJECT, T_VOID, T_ILLEGAL;
    static final byte CONSTANT_Utf8, CONSTANT_Integer, CONSTANT_Float, CONSTANT_Long, CONSTANT_Double, CONSTANT_Class, CONSTANT_String, CONSTANT_Fieldref, CONSTANT_Methodref, CONSTANT_InterfaceMethodref, CONSTANT_NameAndType, CONSTANT_MethodHandle, CONSTANT_MethodType, CONSTANT_InvokeDynamic, CONSTANT_LIMIT;
    static final char ACC_PUBLIC, ACC_PRIVATE, ACC_PROTECTED, ACC_STATIC, ACC_FINAL, ACC_SYNCHRONIZED, ACC_VOLATILE, ACC_TRANSIENT, ACC_NATIVE, ACC_INTERFACE, ACC_ABSTRACT, ACC_STRICT, ACC_SYNTHETIC, ACC_ANNOTATION, ACC_ENUM, ACC_SUPER, ACC_BRIDGE, ACC_VARARGS;
    static final byte REF_NONE, REF_getField, REF_getStatic, REF_putField, REF_putStatic, REF_invokeVirtual, REF_invokeStatic, REF_invokeSpecial, REF_newInvokeSpecial, REF_invokeInterface, REF_LIMIT;
  }
  static boolean refKindIsValid(int refKind) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  static boolean refKindIsField(byte refKind) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  static boolean refKindIsGetter(byte refKind) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static boolean refKindIsSetter(byte refKind) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static boolean refKindIsMethod(byte refKind) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static boolean refKindIsConstructor(byte refKind) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  static boolean refKindHasReceiver(byte refKind) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  static boolean refKindIsStatic(byte refKind) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static boolean refKindDoesDispatch(byte refKind) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  static String refKindName(byte refKind) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  static boolean verifyConstants( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  static MemberName linkCallSite(Object callerObj,Object bootstrapMethodObj,Object nameObj,Object typeObj,Object staticArguments, Object [] appendixResult) {
                                                                                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                            }
  static MemberName linkCallSiteImpl(Class<?> caller,MethodHandle bootstrapMethod,String name,MethodType type,Object staticArguments, Object [] appendixResult) {
                                                                                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                }
  static MemberName linkCallSiteTracing(Class<?> caller,MethodHandle bootstrapMethod,String name,MethodType type,Object staticArguments, Object [] appendixResult) {
                                                                                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                   }
  static MethodType findMethodHandleType(Class<?> rtype, Class<?> [] ptypes) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  static MemberName linkMethod(Class<?> callerClass,int refKind,Class<?> defc,String name,Object type, Object [] appendixResult) {
                                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                 }
  static MemberName linkMethodImpl(Class<?> callerClass,int refKind,Class<?> defc,String name,Object type, Object [] appendixResult) {
                                                                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                     }
  static MemberName linkMethodTracing(Class<?> callerClass,int refKind,Class<?> defc,String name,Object type, Object [] appendixResult) {
                                                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                        }
  static MethodHandle linkMethodHandleConstant(Class<?> callerClass,int refKind,Class<?> defc,String name, Object type) {
                                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                        }
  static boolean isCallerSensitive(MemberName mem) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  static boolean canBeCalledVirtual(MemberName mem) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  static boolean canBeCalledVirtual(MemberName symbolicRef, Class<?> definingClass) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
}