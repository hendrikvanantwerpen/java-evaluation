package java.lang.reflect;


public class Proxy implements java. io. Serializable {
  private Proxy( ) {
  }
  protected Proxy(InvocationHandler h) {
  }
  public static Class<?> getProxyClass(ClassLoader loader, Class<?> ... interfaces) throws IllegalArgumentException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Object newProxyInstance(ClassLoader loader,Class<?> [] interfaces, InvocationHandler h) throws IllegalArgumentException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isProxyClass(Class<?> cl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static InvocationHandler getInvocationHandler(Object proxy) throws IllegalArgumentException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}