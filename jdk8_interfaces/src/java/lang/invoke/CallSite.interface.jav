package java.lang.invoke;


abstract public class CallSite {
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  MethodHandle target;
  CallSite(MethodType type) {
  }
  CallSite(MethodHandle target) {
  }
  CallSite(MethodType targetType, MethodHandle createTargetHook) throws Throwable{
    this(targetType);
  }
  public MethodType type( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public abstract MethodHandle getTarget( ) ;
  public abstract void setTarget(MethodHandle newTarget) ;
  void checkTargetChange(MethodHandle oldTarget, MethodHandle newTarget) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  private static WrongMethodTypeException wrongTargetType(MethodHandle target, MethodType type) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  public abstract MethodHandle dynamicInvoker( ) ;
  MethodHandle makeDynamicInvoker( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private static final MethodHandle GET_TARGET;
  private static final MethodHandle THROW_UCS;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  private static Object uninitializedCallSite(Object ... ignore) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  private MethodHandle makeUninitializedCallSite(MethodType targetType) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  private static final long TARGET_OFFSET;
  static {
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
  private static Object maybeReBox(Object x) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private static void maybeReBoxElements(Object [] xa) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
}