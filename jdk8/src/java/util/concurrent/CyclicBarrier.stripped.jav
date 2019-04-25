package java.util.concurrent;


public class CyclicBarrier {
  public CyclicBarrier(int parties, Runnable barrierAction) {
  }
  public CyclicBarrier(int parties) {
    this(parties, null);
  }
  public int getParties( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int await( ) throws InterruptedException, BrokenBarrierException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int await(long timeout, TimeUnit unit) throws InterruptedException, BrokenBarrierException, TimeoutException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isBroken( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNumberWaiting( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}