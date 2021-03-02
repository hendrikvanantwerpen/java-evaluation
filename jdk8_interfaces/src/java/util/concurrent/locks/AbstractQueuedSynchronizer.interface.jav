package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;
import java.util.Collection;
import java.util.Date;
import sun.misc.Unsafe;

public abstract class AbstractQueuedSynchronizer extends AbstractOwnableSynchronizer implements java. io. Serializable {
  private static final long serialVersionUID;
  protected AbstractQueuedSynchronizer( ) {
  }
  static final class Node {
    static final Node SHARED;
    static final Node EXCLUSIVE;
    static final int CANCELLED;
    static final int SIGNAL;
    static final int CONDITION;
    static final int PROPAGATE;
    volatile int waitStatus;
    volatile Node prev;
    volatile Node next;
    volatile Thread thread;
    Node nextWaiter;
    final boolean isShared( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    final Node predecessor( ) throws NullPointerException {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
    Node( ) {
    }
    Node(Thread thread, Node mode) {
    }
    Node(Thread thread, int waitStatus) {
    }
  }
  private transient volatile Node head;
  private transient volatile Node tail;
  private volatile int state;
  protected final int getState( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  protected final void setState(int newState) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  protected final boolean compareAndSetState(int expect, int update) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  static final long spinForTimeoutThreshold;
  private Node enq(final Node node) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  private Node addWaiter(Node mode) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  private void setHead(Node node) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private void unparkSuccessor(Node node) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private void doReleaseShared( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private void setHeadAndPropagate(Node node, int propagate) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private void cancelAcquire(Node node) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private static boolean shouldParkAfterFailedAcquire(Node pred, Node node) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  static void selfInterrupt( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  private final boolean parkAndCheckInterrupt( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  final boolean acquireQueued(final Node node, int arg) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private void doAcquireInterruptibly(int arg) throws InterruptedException {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  private boolean doAcquireNanos(int arg, long nanosTimeout) throws InterruptedException {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
  private void doAcquireShared(int arg) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private void doAcquireSharedInterruptibly(int arg) throws InterruptedException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  private boolean doAcquireSharedNanos(int arg, long nanosTimeout) throws InterruptedException {
                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                               }
  protected boolean tryAcquire(int arg) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  protected boolean tryRelease(int arg) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  protected int tryAcquireShared(int arg) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  protected boolean tryReleaseShared(int arg) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  protected boolean isHeldExclusively( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public final void acquire(int arg) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public final void acquireInterruptibly(int arg) throws InterruptedException {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public final boolean tryAcquireNanos(int arg, long nanosTimeout) throws InterruptedException {
                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                               }
  public final boolean release(int arg) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public final void acquireShared(int arg) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public final void acquireSharedInterruptibly(int arg) throws InterruptedException {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public final boolean tryAcquireSharedNanos(int arg, long nanosTimeout) throws InterruptedException {
                                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                     }
  public final boolean releaseShared(int arg) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public final boolean hasQueuedThreads( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public final boolean hasContended( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public final Thread getFirstQueuedThread( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private Thread fullGetFirstQueuedThread( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public final boolean isQueued(Thread thread) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  final boolean apparentlyFirstQueuedIsExclusive( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public final boolean hasQueuedPredecessors( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public final int getQueueLength( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public final Collection<Thread> getQueuedThreads( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public final Collection<Thread> getExclusiveQueuedThreads( ) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public final Collection<Thread> getSharedQueuedThreads( ) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  final boolean isOnSyncQueue(Node node) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  private boolean findNodeFromTail(Node node) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  final boolean transferForSignal(Node node) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  final boolean transferAfterCancelledWait(Node node) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  final int fullyRelease(Node node) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public final boolean owns(ConditionObject condition) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public final boolean hasWaiters(ConditionObject condition) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public final int getWaitQueueLength(ConditionObject condition) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public final Collection<Thread> getWaitingThreads(ConditionObject condition) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public class ConditionObject implements Condition, java. io. Serializable {
    private static final long serialVersionUID;
    private transient Node firstWaiter;
    private transient Node lastWaiter;
    public ConditionObject( ) {
    }
    private Node addConditionWaiter( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    private void doSignal(Node first) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    private void doSignalAll(Node first) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    private void unlinkCancelledWaiters( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public final void signal( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public final void signalAll( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void awaitUninterruptibly( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    private static final int REINTERRUPT;
    private static final int THROW_IE;
    private int checkInterruptWhileWaiting(Node node) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    private void reportInterruptAfterWait(int interruptMode) throws InterruptedException {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
    public final void await( ) throws InterruptedException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    public final long awaitNanos(long nanosTimeout) throws InterruptedException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
    public final boolean awaitUntil(Date deadline) throws InterruptedException {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
    public final boolean await(long time, TimeUnit unit) throws InterruptedException {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
    final boolean isOwnedBy(AbstractQueuedSynchronizer sync) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
    protected final boolean hasWaiters( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    protected final int getWaitQueueLength( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    protected final Collection<Thread> getWaitingThreads( ) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  }
  private static final Unsafe unsafe;
  private static final long stateOffset;
  private static final long headOffset;
  private static final long tailOffset;
  private static final long waitStatusOffset;
  private static final long nextOffset;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  private final boolean compareAndSetHead(Node update) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private final boolean compareAndSetTail(Node expect, Node update) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private static final boolean compareAndSetWaitStatus(Node node,int expect, int update) {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
  private static final boolean compareAndSetNext(Node node,Node expect, Node update) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
}