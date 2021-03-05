package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;

public class ReentrantLock implements Lock, java. io. Serializable {
  abstract static class Sync extends AbstractQueuedSynchronizer {
    abstract void lock( ) ;
    final boolean nonfairTryAcquire(int acquires) {
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
  }
  static final class NonfairSync extends Sync {
    final void lock( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  }
  static final class FairSync extends Sync {
    final void lock( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  }
  public ReentrantLock( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ReentrantLock(boolean fair) {
    throw new java . lang . RuntimeException ("Implementation stripped");
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
  public final boolean hasQueuedThreads( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public final boolean hasQueuedThread(Thread thread) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public final int getQueueLength( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public boolean hasWaiters(Condition condition) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public int getWaitQueueLength(Condition condition) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}