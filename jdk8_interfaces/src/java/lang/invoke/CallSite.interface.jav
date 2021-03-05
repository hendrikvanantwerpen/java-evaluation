package java.lang.invoke;

import static java.lang.invoke.MethodHandleStatics.*;

abstract public class CallSite {
  MethodHandle target;
  CallSite(MethodType type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  CallSite(MethodHandle target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  CallSite(MethodType targetType, MethodHandle createTargetHook) throws Throwable{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodType type( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public abstract MethodHandle getTarget( ) ;
  public abstract void setTarget(MethodHandle newTarget) ;
  void checkTargetChange(MethodHandle oldTarget, MethodHandle newTarget) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public abstract MethodHandle dynamicInvoker( ) ;
  MethodHandle makeDynamicInvoker( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  void setTargetNormal(MethodHandle newTarget) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  MethodHandle getTargetVolatile( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  void setTargetVolatile(MethodHandle newTarget) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  static CallSite makeSite(MethodHandle bootstrapMethod,String name,MethodType type,Object info, Class<?> callerClass) {
                                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                       }
}