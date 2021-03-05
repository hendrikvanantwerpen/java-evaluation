package java.util.concurrent;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.*;

public class ThreadPoolExecutor extends AbstractExecutorService {
  private final class Worker extends AbstractQueuedSynchronizer implements Runnable {
    final Thread thread;
    Runnable firstTask;
    volatile long completedTasks;
    Worker(Runnable firstTask) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void run( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public void lock( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public boolean tryLock( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public void unlock( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public boolean isLocked( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    void interruptIfStarted( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  }
  final void tryTerminate( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  final void reject(Runnable command) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  void onShutdown( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  final boolean isRunningOrShutdown(boolean shutdownOK) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  final void runWorker(Worker w) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit, BlockingQueue<Runnable> workQueue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit,BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit,BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit,BlockingQueue<Runnable> workQueue,ThreadFactory threadFactory, RejectedExecutionHandler handler) {
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
  public boolean isTerminating( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean isTerminated( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  public void setThreadFactory(ThreadFactory threadFactory) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public ThreadFactory getThreadFactory( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public void setRejectedExecutionHandler(RejectedExecutionHandler handler) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public RejectedExecutionHandler getRejectedExecutionHandler( ) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public void setCorePoolSize(int corePoolSize) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public int getCorePoolSize( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public boolean prestartCoreThread( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  void ensurePrestart( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public int prestartAllCoreThreads( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public boolean allowsCoreThreadTimeOut( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public void allowCoreThreadTimeOut(boolean value) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public void setMaximumPoolSize(int maximumPoolSize) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public int getMaximumPoolSize( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public void setKeepAliveTime(long time, TimeUnit unit) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public long getKeepAliveTime(TimeUnit unit) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public BlockingQueue<Runnable> getQueue( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public boolean remove(Runnable task) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public void purge( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public int getPoolSize( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public int getActiveCount( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public int getLargestPoolSize( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public long getTaskCount( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public long getCompletedTaskCount( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public static class CallerRunsPolicy implements RejectedExecutionHandler {
    public CallerRunsPolicy( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  }
  public static class AbortPolicy implements RejectedExecutionHandler {
    public AbortPolicy( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  }
  public static class DiscardPolicy implements RejectedExecutionHandler {
    public DiscardPolicy( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  }
  public static class DiscardOldestPolicy implements RejectedExecutionHandler {
    public DiscardOldestPolicy( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  }
}