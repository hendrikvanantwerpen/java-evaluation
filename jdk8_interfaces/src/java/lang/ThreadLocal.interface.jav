package java.lang;

import java.lang.ref.*;
import java.util.function.Supplier;

public class ThreadLocal<T> {
  public static <S> ThreadLocal<S> withInitial(Supplier<? extends S> supplier) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public ThreadLocal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T get( ) {
                    throw new java . lang . RuntimeException ("Implementation stripped");
                  }
  public void set(T value) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public void remove( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  ThreadLocalMap getMap(Thread t) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  void createMap(Thread t, T firstValue) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  static ThreadLocalMap createInheritedMap(ThreadLocalMap parentMap) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  T childValue(T parentValue) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  static final class SuppliedThreadLocal<T> extends ThreadLocal<T> {
    SuppliedThreadLocal(Supplier<? extends T> supplier) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  static class ThreadLocalMap {
    static class Entry extends WeakReference<ThreadLocal<?>> {
      Object value;
      Entry(ThreadLocal<?> k, Object v) {
        throw new java . lang . RuntimeException ("Implementation stripped");
      }
    }
    ThreadLocalMap(ThreadLocal<?> firstKey, Object firstValue) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
}