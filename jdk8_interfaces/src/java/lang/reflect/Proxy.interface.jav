package java.lang.reflect;

import java.lang.ref.WeakReference;
import java.util.function.BiFunction;

public class Proxy implements java. io. Serializable {
  public static Class<?> getProxyClass(ClassLoader loader, Class<?> ... interfaces) throws IllegalArgumentException {
                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                    }
  private static final class Key1 extends WeakReference<Class<?>> {
    Key1(Class<?> intf) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  private static final class Key2 extends WeakReference<Class<?>> {
    Key2(Class<?> intf1, Class<?> intf2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  private static final class KeyX {
    KeyX(Class<?> [] interfaces) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  private static final class KeyFactory implements BiFunction<ClassLoader, Class<?> [], Object> {
    public Object apply(ClassLoader classLoader, Class<?> [] interfaces) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  }
  private static final class ProxyClassFactory implements BiFunction<ClassLoader, Class<?> [], Class<?>> {
    public Class<?> apply(ClassLoader loader, Class<?> [] interfaces) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
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