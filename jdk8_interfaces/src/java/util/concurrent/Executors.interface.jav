package java.util.concurrent;

import java.util.*;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;

public class Executors {
  public static ExecutorService newFixedThreadPool(int nThreads) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public static ExecutorService newWorkStealingPool(int parallelism) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  public static ExecutorService newWorkStealingPool( ) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public static ExecutorService newFixedThreadPool(int nThreads, ThreadFactory threadFactory) {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
  public static ExecutorService newSingleThreadExecutor( ) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  public static ExecutorService newCachedThreadPool( ) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public static ExecutorService newCachedThreadPool(ThreadFactory threadFactory) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public static ScheduledExecutorService newSingleThreadScheduledExecutor( ) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  public static ScheduledExecutorService newSingleThreadScheduledExecutor(ThreadFactory threadFactory) {
                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                       }
  public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize, ThreadFactory threadFactory) {
                                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                               }
  public static ExecutorService unconfigurableExecutorService(ExecutorService executor) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  public static ScheduledExecutorService unconfigurableScheduledExecutorService(ScheduledExecutorService executor) {
                                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                   }
  public static ThreadFactory defaultThreadFactory( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public static ThreadFactory privilegedThreadFactory( ) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public static <T> Callable<T> callable(Runnable task, T result) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public static Callable<Object> callable(Runnable task) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public static Callable<Object> callable(final PrivilegedAction<?> action) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public static Callable<Object> callable(final PrivilegedExceptionAction<?> action) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  public static <T> Callable<T> privilegedCallable(Callable<T> callable) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public static <T> Callable<T> privilegedCallableUsingCurrentClassLoader(Callable<T> callable) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  static final class RunnableAdapter<T> implements Callable<T> {
    final Runnable task;
    final T result;
    RunnableAdapter(Runnable task, T result) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public T call( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  }
  static final class PrivilegedCallable<T> implements Callable<T> {
    PrivilegedCallable(Callable<T> task) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public T call( ) throws Exception {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  static final class PrivilegedCallableUsingCurrentClassLoader<T> implements Callable<T> {
    PrivilegedCallableUsingCurrentClassLoader(Callable<T> task) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public T call( ) throws Exception {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  static class DefaultThreadFactory implements ThreadFactory {
    DefaultThreadFactory( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Thread newThread(Runnable r) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  }
  static class PrivilegedThreadFactory extends DefaultThreadFactory {
    PrivilegedThreadFactory( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Thread newThread(final Runnable r) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  }
  static class DelegatedExecutorService extends AbstractExecutorService {
    DelegatedExecutorService(ExecutorService executor) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void execute(Runnable command) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public void shutdown( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public List<Runnable> shutdownNow( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public boolean isShutdown( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public boolean isTerminated( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
    public Future<?> submit(Runnable task) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public <T> Future<T> submit(Callable<T> task) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    public <T> Future<T> submit(Runnable task, T result) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
                                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                              }
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks,long timeout, TimeUnit unit) throws InterruptedException {
                                                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                          }
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                    }
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks,long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                                                                                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                  }
  }
  static class FinalizableDelegatedExecutorService extends DelegatedExecutorService {
    FinalizableDelegatedExecutorService(ExecutorService executor) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  static class DelegatedScheduledExecutorService extends DelegatedExecutorService implements ScheduledExecutorService {
    DelegatedScheduledExecutorService(ScheduledExecutorService executor) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public ScheduledFuture<?> schedule(Runnable command,long delay, TimeUnit unit) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public <V> ScheduledFuture<V> schedule(Callable<V> callable,long delay, TimeUnit unit) {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,long initialDelay,long period, TimeUnit unit) {
                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                 }
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command,long initialDelay,long delay, TimeUnit unit) {
                                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                   }
  }
}