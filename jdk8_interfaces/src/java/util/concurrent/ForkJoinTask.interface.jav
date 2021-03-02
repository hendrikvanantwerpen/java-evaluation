package java.util.concurrent;

import java.io.Serializable;
import java.util.Collection;
import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

public abstract class ForkJoinTask<V> implements Future<V>, Serializable {
  volatile int status;
  static final int DONE_MASK;
  static final int NORMAL;
  static final int CANCELLED;
  static final int EXCEPTIONAL;
  static final int SIGNAL;
  static final int SMASK;
  private int setCompletion(int completion) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  final int doExec( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  final void internalWait(long timeout) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private int externalAwaitDone( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  private int externalInterruptibleAwaitDone( ) throws InterruptedException {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  private int doJoin( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  private int doInvoke( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  private static final ExceptionNode [] exceptionTable;
  private static final ReentrantLock exceptionTableLock;
  private static final ReferenceQueue<Object> exceptionTableRefQueue;
  private static final int EXCEPTION_MAP_CAPACITY;
  static final class ExceptionNode extends WeakReference<ForkJoinTask<?>> {
    final Throwable ex;
    ExceptionNode next;
    final long thrower;
    final int hashCode;
    ExceptionNode(ForkJoinTask<?> task,Throwable ex, ExceptionNode next) {
      super(task, exceptionTableRefQueue);
    }
  }
  final int recordExceptionalCompletion(Throwable ex) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private int setExceptionalCompletion(Throwable ex) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  void internalPropagateException(Throwable ex) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  static final void cancelIgnoringExceptions(ForkJoinTask<?> t) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  private void clearExceptionalCompletion( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private Throwable getThrowableException( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private static void expungeStaleExceptions( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  static final void helpExpungeStaleExceptions( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  static void rethrow(Throwable ex) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  static <T extends Throwable> void uncheckedThrow(Throwable t) throws T {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  private void reportException(int s) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public final ForkJoinTask<V> fork( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public final V join( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public final V invoke( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public static void invokeAll(ForkJoinTask<?> t1, ForkJoinTask<?> t2) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public static void invokeAll(ForkJoinTask<?> ... tasks) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public static <T extends ForkJoinTask<?>> Collection<T> invokeAll(Collection<T> tasks) {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
  public boolean cancel(boolean mayInterruptIfRunning) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public final boolean isDone( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public final boolean isCancelled( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public final boolean isCompletedAbnormally( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public final boolean isCompletedNormally( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public final Throwable getException( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public void completeExceptionally(Throwable ex) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public void complete(V value) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public final void quietlyComplete( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public final V get( ) throws InterruptedException, ExecutionException {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public final V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                    }
  public final void quietlyJoin( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public final void quietlyInvoke( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public static void helpQuiesce( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public void reinitialize( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public static ForkJoinPool getPool( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public static boolean inForkJoinPool( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public boolean tryUnfork( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public static int getQueuedTaskCount( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public static int getSurplusQueuedTaskCount( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public abstract V getRawResult( ) ;
  protected abstract void setRawResult(V value) ;
  protected abstract boolean exec( ) ;
  protected static ForkJoinTask<?> peekNextLocalTask( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  protected static ForkJoinTask<?> pollNextLocalTask( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  protected static ForkJoinTask<?> pollTask( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public final short getForkJoinTaskTag( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public final short setForkJoinTaskTag(short tag) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public final boolean compareAndSetForkJoinTaskTag(short e, short tag) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  static final class AdaptedRunnable<T> extends ForkJoinTask<T> implements RunnableFuture<T> {
    final Runnable runnable;
    T result;
    AdaptedRunnable(Runnable runnable, T result) {
    }
    public final T getRawResult( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void setRawResult(T v) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public final boolean exec( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public final void run( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    private static final long serialVersionUID;
  }
  static final class AdaptedRunnableAction extends ForkJoinTask<Void> implements RunnableFuture<Void> {
    final Runnable runnable;
    AdaptedRunnableAction(Runnable runnable) {
    }
    public final Void getRawResult( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public final void setRawResult(Void v) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public final boolean exec( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public final void run( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    private static final long serialVersionUID;
  }
  static final class RunnableExecuteAction extends ForkJoinTask<Void> {
    final Runnable runnable;
    RunnableExecuteAction(Runnable runnable) {
    }
    public final Void getRawResult( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public final void setRawResult(Void v) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public final boolean exec( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    void internalPropagateException(Throwable ex) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    private static final long serialVersionUID;
  }
  static final class AdaptedCallable<T> extends ForkJoinTask<T> implements RunnableFuture<T> {
    final Callable<? extends T> callable;
    T result;
    AdaptedCallable(Callable<? extends T> callable) {
    }
    public final T getRawResult( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void setRawResult(T v) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public final boolean exec( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public final void run( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    private static final long serialVersionUID;
  }
  public static ForkJoinTask<?> adapt(Runnable runnable) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public static <T> ForkJoinTask<T> adapt(Runnable runnable, T result) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public static <T> ForkJoinTask<T> adapt(Callable<? extends T> callable) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  private static final long serialVersionUID;
  private void writeObject(java. io. ObjectOutputStream s) throws java. io. IOException {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  private void readObject(java. io. ObjectInputStream s) throws java. io. IOException, ClassNotFoundException {
                                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                              }
  private static final sun. misc. Unsafe U;
  private static final long STATUS;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
}