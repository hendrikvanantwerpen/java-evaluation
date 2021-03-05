package java.lang.ref;

import java.util.function.Consumer;

public class ReferenceQueue<T> {
  public ReferenceQueue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private static class Null<S> extends ReferenceQueue<S> {
    boolean enqueue(Reference<? extends S> r) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  }
  static ReferenceQueue<Object> NULL;
  static ReferenceQueue<Object> ENQUEUED;
  static private class Lock {
  }
  boolean enqueue(Reference<? extends T> r) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public Reference<? extends T> poll( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public Reference<? extends T> remove(long timeout) throws IllegalArgumentException, InterruptedException {
                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                           }
  public Reference<? extends T> remove( ) throws InterruptedException {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  void forEach(Consumer<? super Reference<? extends T>> action) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
}