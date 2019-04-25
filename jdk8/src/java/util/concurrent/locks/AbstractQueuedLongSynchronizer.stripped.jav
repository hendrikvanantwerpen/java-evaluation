package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;
import java.util.Collection;
import java.util.Date;

public abstract class AbstractQueuedLongSynchronizer extends AbstractOwnableSynchronizer implements java. io. Serializable {
  protected AbstractQueuedLongSynchronizer( ) {
  }
  public final void acquire(long arg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void acquireInterruptibly(long arg) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean tryAcquireNanos(long arg, long nanosTimeout) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean release(long arg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void acquireShared(long arg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void acquireSharedInterruptibly(long arg) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean tryAcquireSharedNanos(long arg, long nanosTimeout) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean releaseShared(long arg) {
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
  }
}