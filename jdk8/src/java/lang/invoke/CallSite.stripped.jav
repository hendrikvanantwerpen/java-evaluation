package java.lang.invoke;


abstract public class CallSite {
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
  public abstract MethodHandle dynamicInvoker( ) ;
}