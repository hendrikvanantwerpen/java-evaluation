package java.util.concurrent;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ForkJoinPool extends AbstractExecutorService {
  public static interface ForkJoinWorkerThreadFactory {
    public ForkJoinWorkerThread newThread(ForkJoinPool pool) ;
  }
  static final class DefaultForkJoinWorkerThreadFactory implements ForkJoinWorkerThreadFactory {
    public final ForkJoinWorkerThread newThread(ForkJoinPool pool) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  }
  static final class EmptyTask extends ForkJoinTask<Void> {
    EmptyTask( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final Void getRawResult( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public final void setRawResult(Void x) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public final boolean exec( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final int SMASK;
  static final int MAX_CAP;
  static final int EVENMASK;
  static final int SQMASK;
  static final int SCANNING;
  static final int INACTIVE;
  static final int SS_SEQ;
  static final int MODE_MASK;
  static final int LIFO_QUEUE;
  static final int FIFO_QUEUE;
  static final int SHARED_QUEUE;
  static final class WorkQueue {
    static final int INITIAL_QUEUE_CAPACITY;
    static final int MAXIMUM_QUEUE_CAPACITY;
    volatile int scanState;
    int stackPred;
    int nsteals;
    int hint;
    int config;
    volatile int qlock;
    volatile int base;
    int top;
    ForkJoinTask<?> [] array;
    final ForkJoinPool pool;
    final ForkJoinWorkerThread owner;
    volatile Thread parker;
    volatile ForkJoinTask<?> currentJoin;
    volatile ForkJoinTask<?> currentSteal;
    WorkQueue(ForkJoinPool pool, ForkJoinWorkerThread owner) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    final int getPoolIndex( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    final int queueSize( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    final boolean isEmpty( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    final void push(ForkJoinTask<?> task) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    final ForkJoinTask<?> [] growArray( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    final ForkJoinTask<?> pop( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    final ForkJoinTask<?> pollAt(int b) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    final ForkJoinTask<?> poll( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    final ForkJoinTask<?> nextLocalTask( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    final ForkJoinTask<?> peek( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    final boolean tryUnpush(ForkJoinTask<?> t) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    final void cancelAll( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    final void pollAndExecAll( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    final void execLocalTasks( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    final void runTask(ForkJoinTask<?> task) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    final void transferStealCount(ForkJoinPool p) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    final boolean tryRemoveAndExec(ForkJoinTask<?> task) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    final CountedCompleter<?> popCC(CountedCompleter<?> task, int mode) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
    final int pollAndExecCC(CountedCompleter<?> task) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    final boolean isApparentlyUnblocked( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  }
  public static final ForkJoinWorkerThreadFactory defaultForkJoinWorkerThreadFactory;
  static final ForkJoinPool common;
  static final int commonParallelism;
  volatile long ctl;
  volatile int runState;
  final int config;
  int indexSeed;
  volatile WorkQueue [] workQueues;
  final ForkJoinWorkerThreadFactory factory;
  final UncaughtExceptionHandler ueh;
  final String workerNamePrefix;
  volatile AtomicLong stealCounter;
  final WorkQueue registerWorker(ForkJoinWorkerThread wt) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  final void deregisterWorker(ForkJoinWorkerThread wt, Throwable ex) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  final void signalWork(WorkQueue [] ws, WorkQueue q) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  final void runWorker(WorkQueue w) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  final int helpComplete(WorkQueue w,CountedCompleter<?> task, int maxTasks) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  final int awaitJoin(WorkQueue w,ForkJoinTask<?> task, long deadline) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  final void helpQuiescePool(WorkQueue w) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  final ForkJoinTask<?> nextTaskFor(WorkQueue w) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  static int getSurplusQueuedTaskCount( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  final void externalPush(ForkJoinTask<?> task) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  static WorkQueue commonSubmitterQueue( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  final boolean tryExternalUnpush(ForkJoinTask<?> task) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  final int externalHelpComplete(CountedCompleter<?> task, int maxTasks) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public ForkJoinPool( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ForkJoinPool(int parallelism) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ForkJoinPool(int parallelism,ForkJoinWorkerThreadFactory factory,UncaughtExceptionHandler handler, boolean asyncMode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ForkJoinPool commonPool( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public <T> T invoke(ForkJoinTask<T> task) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public void execute(ForkJoinTask<?> task) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public void execute(Runnable task) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public <T> ForkJoinTask<T> submit(ForkJoinTask<T> task) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public <T> ForkJoinTask<T> submit(Callable<T> task) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public <T> ForkJoinTask<T> submit(Runnable task, T result) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public ForkJoinTask<?> submit(Runnable task) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  public ForkJoinWorkerThreadFactory getFactory( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public UncaughtExceptionHandler getUncaughtExceptionHandler( ) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public int getParallelism( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public static int getCommonPoolParallelism( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public int getPoolSize( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean getAsyncMode( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public int getRunningThreadCount( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public int getActiveThreadCount( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public boolean isQuiescent( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public long getStealCount( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public long getQueuedTaskCount( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int getQueuedSubmissionCount( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public boolean hasQueuedSubmissions( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void shutdown( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public List<Runnable> shutdownNow( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public boolean isTerminated( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public boolean isTerminating( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean isShutdown( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  public boolean awaitQuiescence(long timeout, TimeUnit unit) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  static void quiesceCommonPool( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public static interface ManagedBlocker {
    boolean block( ) throws InterruptedException ;
    boolean isReleasable( ) ;
  }
  public static void managedBlock(ManagedBlocker blocker) throws InterruptedException {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  static final class InnocuousForkJoinWorkerThreadFactory implements ForkJoinWorkerThreadFactory {
    public final ForkJoinWorkerThread newThread(ForkJoinPool pool) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  }
}