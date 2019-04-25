package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;

public class ReentrantLock implements Lock, java. io. Serializable {
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