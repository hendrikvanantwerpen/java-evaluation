package java.lang.invoke;


public class ConstantCallSite extends CallSite {
  public ConstantCallSite(MethodHandle target) {
    super(target);
  }
  protected ConstantCallSite(MethodType targetType, MethodHandle createTargetHook) throws Throwable{
    super(targetType, createTargetHook);
  }
  public final MethodHandle getTarget( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setTarget(MethodHandle ignore) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final MethodHandle dynamicInvoker( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}