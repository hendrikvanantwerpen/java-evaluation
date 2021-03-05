package java.util.concurrent;

import java.util.*;

public class ScheduledThreadPoolExecutor extends ThreadPoolExecutor implements ScheduledExecutorService {
  final long now( ) {
                      throw new java . lang . RuntimeException ("Implementation stripped");
                    }
  private class ScheduledFutureTask<V> extends FutureTask<V> implements RunnableScheduledFuture<V> {
    RunnableScheduledFuture<V> outerTask;
    int heapIndex;
    ScheduledFutureTask(Runnable r,V result, long ns) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    ScheduledFutureTask(Runnable r,V result,long ns, long period) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    ScheduledFutureTask(Callable<V> callable, long ns) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public long getDelay(TimeUnit unit) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public int compareTo(Delayed other) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public boolean isPeriodic( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public boolean cancel(boolean mayInterruptIfRunning) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public void run( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  }
  boolean canRunInCurrentRunState(boolean periodic) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  void reExecutePeriodic(RunnableScheduledFuture<?> task) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  void onShutdown( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  public ScheduledThreadPoolExecutor(int corePoolSize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ScheduledThreadPoolExecutor(int corePoolSize, RejectedExecutionHandler handler) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ScheduledThreadPoolExecutor(int corePoolSize,ThreadFactory threadFactory, RejectedExecutionHandler handler) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  long triggerTime(long delay) {
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
  public void execute(Runnable command) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public Future<?> submit(Runnable task) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public <T> Future<T> submit(Runnable task, T result) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public <T> Future<T> submit(Callable<T> task) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean value) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public boolean getContinueExistingPeriodicTasksAfterShutdownPolicy( ) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean value) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public boolean getExecuteExistingDelayedTasksAfterShutdownPolicy( ) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public void setRemoveOnCancelPolicy(boolean value) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public boolean getRemoveOnCancelPolicy( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public void shutdown( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public List<Runnable> shutdownNow( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public BlockingQueue<Runnable> getQueue( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  static class DelayedWorkQueue extends AbstractQueue<Runnable> implements BlockingQueue<Runnable> {
    public boolean contains(Object x) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public boolean remove(Object x) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean isEmpty( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public int remainingCapacity( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public RunnableScheduledFuture<?> peek( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public boolean offer(Runnable x) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public void put(Runnable e) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public boolean add(Runnable e) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public boolean offer(Runnable e,long timeout, TimeUnit unit) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    public RunnableScheduledFuture<?> poll( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public RunnableScheduledFuture<?> take( ) throws InterruptedException {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
    public RunnableScheduledFuture<?> poll(long timeout, TimeUnit unit) throws InterruptedException {
                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                    }
    public void clear( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public int drainTo(Collection<? super Runnable> c) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    public int drainTo(Collection<? super Runnable> c, int maxElements) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
    public Object [] toArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public <T> T [] toArray(T [] a) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public Iterator<Runnable> iterator( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    private class Itr implements Iterator<Runnable> {
      final RunnableScheduledFuture<?> [] array;
      int cursor;
      int lastRet;
      Itr(RunnableScheduledFuture<?> [] array) {
        throw new java . lang . RuntimeException ("Implementation stripped");
      }
      public boolean hasNext( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
      public Runnable next( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
      public void remove( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    }
  }
}