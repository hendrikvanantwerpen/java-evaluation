package java.lang.invoke;

import static java.lang.invoke.MethodHandleStatics.*;
import static java.lang.invoke.MethodHandleNatives.Constants.*;
import static java.lang.invoke.LambdaForm.*;

class Invokers {
  static final int INV_EXACT, INV_GENERIC, INV_BASIC, INV_LIMIT;
  Invokers(MethodType targetType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  MethodHandle exactInvoker( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  MethodHandle genericInvoker( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  MethodHandle basicInvoker( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  static MemberName invokeBasicMethod(MethodType basicType) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  MethodHandle spreadInvoker(int leadingArgCount) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  static MemberName methodHandleInvokeLinkerMethod(String name,MethodType mtype, Object [] appendixResult) {
                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                           }
  static WrongMethodTypeException newWrongMethodTypeException(MethodType actual, MethodType expected) {
                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                      }
  static void checkExactType(Object mhObj, Object expectedObj) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  static Object checkGenericType(Object mhObj, Object expectedObj) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  static MemberName linkToCallSiteMethod(MethodType mtype) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  static MemberName linkToTargetMethod(MethodType mtype) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  static Object getCallSiteTarget(Object site) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static void checkCustomized(Object o) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  static void maybeCustomize(MethodHandle mh) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private static class Lazy {
  }
}