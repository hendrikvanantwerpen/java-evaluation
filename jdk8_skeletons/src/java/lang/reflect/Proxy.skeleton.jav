package java.lang.reflect;

import java.lang.ref.WeakReference;
import java.util.function.BiFunction;

public class Proxy implements java. io. Serializable {
  private static final class Key1 extends WeakReference<Class<?>> {
  }
  private static final class Key2 extends WeakReference<Class<?>> {
  }
  private static final class KeyX {
  }
  private static final class KeyFactory implements BiFunction<ClassLoader, Class<?> [], Object> {
  }
  private static final class ProxyClassFactory implements BiFunction<ClassLoader, Class<?> [], Class<?>> {
  }
}