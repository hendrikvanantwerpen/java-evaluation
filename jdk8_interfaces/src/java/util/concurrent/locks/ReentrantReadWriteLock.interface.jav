package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;
import java.util.Collection;

public class ReentrantReadWriteLock implements ReadWriteLock, java. io. Serializable {
  private static final long serialVersionUID;
  private final ReentrantReadWriteLock. ReadLock readerLock;
  private final ReentrantReadWriteLock. WriteLock writerLock;
  final Sync sync;
  public ReentrantReadWriteLock( ) {
    this(false);
  }
  public ReentrantReadWriteLock(boolean fair) {
  }
  public ReentrantReadWriteLock. WriteLock writeLock( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public ReentrantReadWriteLock. ReadLock readLock( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  abstract static class Sync extends AbstractQueuedSynchronizer {
    private static final long serialVersionUID;
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
    private transient ThreadLocalHoldCounter readHolds;
    private transient HoldCounter cachedHoldCounter;
    private transient Thread firstReader;
    private transient int firstReaderHoldCount;
    Sync( ) {
    }
    abstract boolean readerShouldBlock( ) ;
    abstract boolean writerShouldBlock( ) ;
    protected final boolean tryRelease(int releases) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    protected final boolean tryAcquire(int acquires) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    protected final boolean tryReleaseShared(int unused) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    private IllegalMonitorStateException unmatchedUnlockException( ) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
    protected final int tryAcquireShared(int unused) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    final int fullTryAcquireShared(Thread current) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    final boolean tryWriteLock( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    final boolean tryReadLock( ) {
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
    private void readObject(java. io. ObjectInputStream s) throws java. io. IOException, ClassNotFoundException {
                                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                }
    final int getCount( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  }
  static final class NonfairSync extends Sync {
    private static final long serialVersionUID;
    final boolean writerShouldBlock( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    final boolean readerShouldBlock( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  }
  static final class FairSync extends Sync {
    private static final long serialVersionUID;
    final boolean writerShouldBlock( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    final boolean readerShouldBlock( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  }
  public static class ReadLock implements Lock, java. io. Serializable {
    private static final long serialVersionUID;
    private final Sync sync;
    protected ReadLock(ReentrantReadWriteLock lock) {
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
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  public static class WriteLock implements Lock, java. io. Serializable {
    private static final long serialVersionUID;
    private final Sync sync;
    protected WriteLock(ReentrantReadWriteLock lock) {
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
  protected Thread getOwner( ) {
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
  protected Collection<Thread> getQueuedWriterThreads( ) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  protected Collection<Thread> getQueuedReaderThreads( ) {
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
  static final long getThreadId(Thread thread) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private static final sun. misc. Unsafe UNSAFE;
  private static final long TID_OFFSET;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
}