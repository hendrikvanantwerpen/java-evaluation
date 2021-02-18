package java.lang;

import java.lang.ref.*;

public class ThreadLocal<T> {
  static final class SuppliedThreadLocal<T> extends ThreadLocal<T> {
  }
  static class ThreadLocalMap {
    static class Entry extends WeakReference<ThreadLocal<?>> {
    }
  }
}