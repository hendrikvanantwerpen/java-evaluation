package java.lang;

import java.lang.ref.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class ThreadLocal<T> {
  private final int threadLocalHashCode;
  private static AtomicInteger nextHashCode;
  private static final int HASH_INCREMENT;
  private static int nextHashCode( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  protected T initialValue( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public static <S> ThreadLocal<S> withInitial(Supplier<? extends S> supplier) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public ThreadLocal( ) {
  }
  public T get( ) {
                    throw new java . lang . RuntimeException ("Implementation stripped");
                  }
  private T setInitialValue( ) {
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
    private final Supplier<? extends T> supplier;
    SuppliedThreadLocal(Supplier<? extends T> supplier) {
    }
    protected T initialValue( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  }
  static class ThreadLocalMap {
    static class Entry extends WeakReference<ThreadLocal<?>> {
      Object value;
      Entry(ThreadLocal<?> k, Object v) {
        super(k);
      }
    }
    private static final int INITIAL_CAPACITY;
    private Entry [] table;
    private int size;
    private int threshold;
    private void setThreshold(int len) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    private static int nextIndex(int i, int len) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    private static int prevIndex(int i, int len) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    ThreadLocalMap(ThreadLocal<?> firstKey, Object firstValue) {
    }
    private ThreadLocalMap(ThreadLocalMap parentMap) {
    }
    private Entry getEntry(ThreadLocal<?> key) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    private Entry getEntryAfterMiss(ThreadLocal<?> key,int i, Entry e) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
    private void set(ThreadLocal<?> key, Object value) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    private void remove(ThreadLocal<?> key) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    private void replaceStaleEntry(ThreadLocal<?> key,Object value, int staleSlot) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    private int expungeStaleEntry(int staleSlot) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    private boolean cleanSomeSlots(int i, int n) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    private void rehash( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    private void resize( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    private void expungeStaleEntries( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  }
}