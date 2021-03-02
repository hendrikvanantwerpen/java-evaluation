package java.util.concurrent;

import java.security.AccessControlContext;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;

public class ThreadPoolExecutor extends AbstractExecutorService {
  private final AtomicInteger ctl;
  private static final int COUNT_BITS;
  private static final int CAPACITY;
  private static final int RUNNING;
  private static final int SHUTDOWN;
  private static final int STOP;
  private static final int TIDYING;
  private static final int TERMINATED;
  private static int runStateOf(int c) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  private static int workerCountOf(int c) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private static int ctlOf(int rs, int wc) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private static boolean runStateLessThan(int c, int s) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private static boolean runStateAtLeast(int c, int s) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private static boolean isRunning(int c) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private boolean compareAndIncrementWorkerCount(int expect) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private boolean compareAndDecrementWorkerCount(int expect) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private void decrementWorkerCount( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  private final BlockingQueue<Runnable> workQueue;
  private final ReentrantLock mainLock;
  private final HashSet<Worker> workers;
  private final Condition termination;
  private int largestPoolSize;
  private long completedTaskCount;
  private volatile ThreadFactory threadFactory;
  private volatile RejectedExecutionHandler handler;
  private volatile long keepAliveTime;
  private volatile boolean allowCoreThreadTimeOut;
  private volatile int corePoolSize;
  private volatile int maximumPoolSize;
  private static final RejectedExecutionHandler defaultHandler;
  private static final RuntimePermission shutdownPerm;
  private final AccessControlContext acc;
  private final class Worker extends AbstractQueuedSynchronizer implements Runnable {
    private static final long serialVersionUID;
    final Thread thread;
    Runnable firstTask;
    volatile long completedTasks;
    Worker(Runnable firstTask) {
    }
    public void run( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    protected boolean isHeldExclusively( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    protected boolean tryAcquire(int unused) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    protected boolean tryRelease(int unused) {
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
  private void advanceRunState(int targetState) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  final void tryTerminate( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  private void checkShutdownAccess( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  private void interruptWorkers( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  private void interruptIdleWorkers(boolean onlyOne) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  private void interruptIdleWorkers( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  private static final boolean ONLY_ONE;
  final void reject(Runnable command) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  void onShutdown( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  final boolean isRunningOrShutdown(boolean shutdownOK) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private List<Runnable> drainQueue( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  private boolean addWorker(Runnable firstTask, boolean core) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  private void addWorkerFailed(Worker w) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  private void processWorkerExit(Worker w, boolean completedAbruptly) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  private Runnable getTask( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  final void runWorker(Worker w) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit, BlockingQueue<Runnable> workQueue) {
    this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, Executors. defaultThreadFactory( ), defaultHandler);
  }
  public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit,BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
    this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, defaultHandler);
  }
  public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit,BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
    this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, Executors. defaultThreadFactory( ), handler);
  }
  public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit,BlockingQueue<Runnable> workQueue,ThreadFactory threadFactory, RejectedExecutionHandler handler) {
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
  protected void finalize( ) {
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
  protected void beforeExecute(Thread t, Runnable r) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  protected void afterExecute(Runnable r, Throwable t) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  protected void terminated( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public static class CallerRunsPolicy implements RejectedExecutionHandler {
    public CallerRunsPolicy( ) {
    }
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  }
  public static class AbortPolicy implements RejectedExecutionHandler {
    public AbortPolicy( ) {
    }
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  }
  public static class DiscardPolicy implements RejectedExecutionHandler {
    public DiscardPolicy( ) {
    }
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  }
  public static class DiscardOldestPolicy implements RejectedExecutionHandler {
    public DiscardOldestPolicy( ) {
    }
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  }
}