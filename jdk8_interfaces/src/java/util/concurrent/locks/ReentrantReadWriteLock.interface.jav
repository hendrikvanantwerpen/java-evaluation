package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;

public class ReentrantReadWriteLock implements ReadWriteLock, java. io. Serializable {
  final Sync sync;
  public ReentrantReadWriteLock( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ReentrantReadWriteLock(boolean fair) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ReentrantReadWriteLock. WriteLock writeLock( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public ReentrantReadWriteLock. ReadLock readLock( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  abstract static class Sync extends AbstractQueuedSynchronizer {
    static final int SHARED_SHIFT;
    static final int SHARED_UNIT;
    static final int MAX_COUNT;
    static final int EXCLUSIVE_MASK;
    static int sharedCount(int c) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    static int exclusiveCount(int c) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    static final class HoldCounter {
      int count;
      final long tid;
    }
    static final class ThreadLocalHoldCounter extends ThreadLocal<HoldCounter> {
      public HoldCounter initialValue( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    }
    Sync( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    abstract boolean readerShouldBlock( ) ;
    abstract boolean writerShouldBlock( ) ;
    final int fullTryAcquireShared(Thread current) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    final boolean tryWriteLock( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    final boolean tryReadLock( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    final ConditionObject newCondition( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    final Thread getOwner( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    final int getReadLockCount( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    final boolean isWriteLocked( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    final int getWriteHoldCount( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    final int getReadHoldCount( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    final int getCount( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  }
  static final class NonfairSync extends Sync {
    final boolean writerShouldBlock( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    final boolean readerShouldBlock( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  }
  static final class FairSync extends Sync {
    final boolean writerShouldBlock( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    final boolean readerShouldBlock( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  }
  public static class ReadLock implements Lock, java. io. Serializable {
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
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  public static class WriteLock implements Lock, java. io. Serializable {
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
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean isHeldByCurrentThread( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public int getHoldCount( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  }
  public final boolean isFair( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public int getReadLockCount( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public boolean isWriteLocked( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean isWriteLockedByCurrentThread( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public int getWriteHoldCount( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public int getReadHoldCount( ) {
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
  static final long getThreadId(Thread thread) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
}