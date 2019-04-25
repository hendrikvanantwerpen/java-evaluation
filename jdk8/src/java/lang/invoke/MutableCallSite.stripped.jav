package java.lang.invoke;


public class MutableCallSite extends CallSite {
  public MutableCallSite(MethodType type) {
    super(type);
  }
  public MutableCallSite(MethodHandle target) {
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
  public static void syncAll(MutableCallSite [] sites) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}