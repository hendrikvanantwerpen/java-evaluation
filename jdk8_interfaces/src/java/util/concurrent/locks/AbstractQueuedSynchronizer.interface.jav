package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;
import java.util.Collection;
import java.util.Date;

public abstract class AbstractQueuedSynchronizer extends AbstractOwnableSynchronizer implements java. io. Serializable {
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
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Node(Thread thread, Node mode) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Node(Thread thread, int waitStatus) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  static final long spinForTimeoutThreshold;
  static void selfInterrupt( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  final boolean acquireQueued(final Node node, int arg) {
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
    public ConditionObject( ) {
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
  }
}