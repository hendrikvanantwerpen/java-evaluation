package java.lang.reflect;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;

public class Proxy implements java. io. Serializable {
  private static final long serialVersionUID;
  private static final Class<?> [] constructorParams;
  private static final WeakCache<ClassLoader, Class<?> [], Class<?>> proxyClassCache;
  protected InvocationHandler h;
  private Proxy( ) {
  }
  protected Proxy(InvocationHandler h) {
  }
  public static Class<?> getProxyClass(ClassLoader loader, Class<?> ... interfaces) throws IllegalArgumentException {
                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                    }
  private static void checkProxyAccess(Class<?> caller,ClassLoader loader, Class<?> ... interfaces) {
                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                    }
  private static Class<?> getProxyClass0(ClassLoader loader, Class<?> ... interfaces) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  private static final Object key0;
  private static final class Key1 extends WeakReference<Class<?>> {
    private final int hash;
    Key1(Class<?> intf) {
      super(intf);
    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  private static final class Key2 extends WeakReference<Class<?>> {
    private final int hash;
    private final WeakReference<Class<?>> ref2;
    Key2(Class<?> intf1, Class<?> intf2) {
      super(intf1);
    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  private static final class KeyX {
    private final int hash;
    private final WeakReference<Class<?>> [] refs;
    @SuppressWarnings("unchecked") KeyX(Class<?> [] interfaces) {
    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    private static boolean equals(WeakReference<Class<?>> [] refs1, WeakReference<Class<?>> [] refs2) {
                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                      }
  }
  private static final class KeyFactory implements BiFunction<ClassLoader, Class<?> [], Object> {
    public Object apply(ClassLoader classLoader, Class<?> [] interfaces) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  }
  private static final class ProxyClassFactory implements BiFunction<ClassLoader, Class<?> [], Class<?>> {
    private static final String proxyClassNamePrefix;
    private static final AtomicLong nextUniqueNumber;
    public Class<?> apply(ClassLoader loader, Class<?> [] interfaces) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  }
  public static Object newProxyInstance(ClassLoader loader,Class<?> [] interfaces, InvocationHandler h) throws IllegalArgumentException {
                                                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                        }
  private static void checkNewProxyPermission(Class<?> caller, Class<?> proxyClass) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public static boolean isProxyClass(Class<?> cl) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public static InvocationHandler getInvocationHandler(Object proxy) throws IllegalArgumentException {
                                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                     }
  private static native Class<?> defineClass0(ClassLoader loader,String name,byte [] b,int off, int len) ;
}