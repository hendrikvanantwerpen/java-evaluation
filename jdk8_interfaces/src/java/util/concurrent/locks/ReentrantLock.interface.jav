package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;
import java.util.Collection;

public class ReentrantLock implements Lock, java. io. Serializable {
  private static final long serialVersionUID;
  private final Sync sync;
  abstract static class Sync extends AbstractQueuedSynchronizer {
    private static final long serialVersionUID;
    abstract void lock( ) ;
    final boolean nonfairTryAcquire(int acquires) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    protected final boolean tryRelease(int releases) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    protected final boolean isHeldExclusively( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    final ConditionObject newCondition( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    final Thread getOwner( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    final int getHoldCount( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    final boolean isLocked( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    private void readObject(java. io. ObjectInputStream s) throws java. io. IOException, ClassNotFoundException {
                                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                }
  }
  static final class NonfairSync extends Sync {
    private static final long serialVersionUID;
    final void lock( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    protected final boolean tryAcquire(int acquires) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  }
  static final class FairSync extends Sync {
    private static final long serialVersionUID;
    final void lock( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    protected final boolean tryAcquire(int acquires) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  }
  public ReentrantLock( ) {
  }
  public ReentrantLock(boolean fair) {
  }
  public void lock( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  public void lockInterruptibly( ) throws InterruptedException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public boolean tryLock( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  public void unlock( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public Condition newCondition( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public int getHoldCount( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean isHeldByCurrentThread( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public boolean isLocked( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public final boolean isFair( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  protected Thread getOwner( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public final boolean hasQueuedThreads( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public final boolean hasQueuedThread(Thread thread) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public final int getQueueLength( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  protected Collection<Thread> getQueuedThreads( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public boolean hasWaiters(Condition condition) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public int getWaitQueueLength(Condition condition) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  protected Collection<Thread> getWaitingThreads(Condition condition) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}