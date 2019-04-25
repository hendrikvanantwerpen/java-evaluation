package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class StampedLock implements java. io. Serializable {
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
}