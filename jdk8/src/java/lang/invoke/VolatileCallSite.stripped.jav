package java.lang.invoke;


public class VolatileCallSite extends CallSite {
  public VolatileCallSite(MethodType type) {
    super(type);
  }
  public VolatileCallSite(MethodHandle target) {
    super(target);
  }
  public final MethodHandle getTarget( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTarget(MethodHandle newTarget) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final MethodHandle dynamicInvoker( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}