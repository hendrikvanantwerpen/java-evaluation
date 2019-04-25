package java.lang.invoke;

import java.lang.reflect.*;

public class MethodHandleProxies {
  private MethodHandleProxies( ) {
  }
  public static <T> T asInterfaceInstance(final Class<T> intfc, final MethodHandle target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isWrapperInstance(Object x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle wrapperInstanceTarget(Object x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Class<?> wrapperInstanceType(Object x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}