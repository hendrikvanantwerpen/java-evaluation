package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReadWriteLock;

public class StampedLock implements java. io. Serializable {
  private static final long serialVersionUID;
  private static final int NCPU;
  private static final int SPINS;
  private static final int HEAD_SPINS;
  private static final int MAX_HEAD_SPINS;
  private static final int OVERFLOW_YIELD_RATE;
  private static final int LG_READERS;
  private static final long RUNIT;
  private static final long WBIT;
  private static final long RBITS;
  private static final long RFULL;
  private static final long ABITS;
  private static final long SBITS;
  private static final long ORIGIN;
  private static final long INTERRUPTED;
  private static final int WAITING;
  private static final int CANCELLED;
  private static final int RMODE;
  private static final int WMODE;
  static final class WNode {
    volatile WNode prev;
    volatile WNode next;
    volatile WNode cowait;
    volatile Thread thread;
    volatile int status;
    final int mode;
    WNode(int m, WNode p) {
    }
  }
  private transient volatile WNode whead;
  private transient volatile WNode wtail;
  transient ReadLockView readLockView;
  transient WriteLockView writeLockView;
  transient ReadWriteLockView readWriteLockView;
  private transient volatile long state;
  private transient int readerOverflow;
  public StampedLock( ) {
  }
  public long writeLock( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public long tryWriteLock( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public long tryWriteLock(long time, TimeUnit unit) throws InterruptedException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public long writeLockInterruptibly( ) throws InterruptedException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  public long readLock( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public long tryReadLock( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public long tryReadLock(long time, TimeUnit unit) throws InterruptedException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  public long readLockInterruptibly( ) throws InterruptedException {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public long tryOptimisticRead( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public boolean validate(long stamp) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public void unlockWrite(long stamp) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public void unlockRead(long stamp) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public void unlock(long stamp) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public long tryConvertToWriteLock(long stamp) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public long tryConvertToReadLock(long stamp) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public long tryConvertToOptimisticRead(long stamp) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public boolean tryUnlockWrite( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public boolean tryUnlockRead( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private int getReadLockCount(long s) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public boolean isWriteLocked( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean isReadLocked( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public int getReadLockCount( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public Lock asReadLock( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public Lock asWriteLock( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public ReadWriteLock asReadWriteLock( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  final class ReadLockView implements Lock {
    public void lock( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public void lockInterruptibly( ) throws InterruptedException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    public boolean tryLock( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
    public void unlock( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public Condition newCondition( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  }
  final class WriteLockView implements Lock {
    public void lock( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public void lockInterruptibly( ) throws InterruptedException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    public boolean tryLock( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
    public void unlock( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public Condition newCondition( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  }
  final class ReadWriteLockView implements ReadWriteLock {
    public Lock readLock( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public Lock writeLock( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  }
  final void unstampedUnlockWrite( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  final void unstampedUnlockRead( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  private void readObject(java. io. ObjectInputStream s) throws java. io. IOException, ClassNotFoundException {
                                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                              }
  private long tryIncReaderOverflow(long s) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  private long tryDecReaderOverflow(long s) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  private void release(WNode h) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  private long acquireWrite(boolean interruptible, long deadline) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  private long acquireRead(boolean interruptible, long deadline) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  private long cancelWaiter(WNode node,WNode group, boolean interrupted) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  private static final sun. misc. Unsafe U;
  private static final long STATE;
  private static final long WHEAD;
  private static final long WTAIL;
  private static final long WNEXT;
  private static final long WSTATUS;
  private static final long WCOWAIT;
  private static final long PARKBLOCKER;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
}