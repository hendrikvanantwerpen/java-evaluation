package java.util.concurrent;


public class Semaphore implements java. io. Serializable {
  public Semaphore(int permits) {
  }
  public Semaphore(int permits, boolean fair) {
  }
  public void acquire( ) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void acquireUninterruptibly( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean tryAcquire( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean tryAcquire(long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void release( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void acquire(int permits) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void acquireUninterruptibly(int permits) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean tryAcquire(int permits) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean tryAcquire(int permits,long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void release(int permits) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int availablePermits( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int drainPermits( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFair( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean hasQueuedThreads( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getQueueLength( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}