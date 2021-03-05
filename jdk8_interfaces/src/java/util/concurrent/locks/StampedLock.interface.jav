package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReadWriteLock;

public class StampedLock implements java. io. Serializable {
  static final class WNode {
    volatile WNode prev;
    volatile WNode next;
    volatile WNode cowait;
    volatile Thread thread;
    volatile int status;
    final int mode;
    WNode(int m, WNode p) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  transient ReadLockView readLockView;
  transient WriteLockView writeLockView;
  transient ReadWriteLockView readWriteLockView;
  public StampedLock( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
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
}