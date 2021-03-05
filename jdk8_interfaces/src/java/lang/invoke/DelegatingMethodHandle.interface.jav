package java.lang.invoke;

import static java.lang.invoke.LambdaForm.*;
import static java.lang.invoke.MethodHandleStatics.*;

abstract class DelegatingMethodHandle extends MethodHandle {
  abstract MethodHandle asTypeUncached(MethodType newType) ;
  MemberName internalMemberName( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  boolean isInvokeSpecial( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  Class<?> internalCallerClass( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  MethodHandle copyWith(MethodType mt, LambdaForm lf) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  String internalProperties( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  BoundMethodHandle rebind( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  static LambdaForm makeReinvokerForm(MethodHandle target,int whichCache,Object constraint, NamedFunction getTargetFn) {
                                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                       }
  static LambdaForm makeReinvokerForm(MethodHandle target,int whichCache,Object constraint,String debugString,boolean forceInline,NamedFunction getTargetFn, NamedFunction preActionFn) {
                                                                                                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                                        }
  static final NamedFunction NF_getTarget;
}