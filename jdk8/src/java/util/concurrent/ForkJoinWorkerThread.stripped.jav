package java.util.concurrent;

import java.security.AccessControlContext;

public class ForkJoinWorkerThread extends Thread {
  protected ForkJoinWorkerThread(ForkJoinPool pool) {
    super("aForkJoinWorkerThread");
  }
  ForkJoinWorkerThread(ForkJoinPool pool,ThreadGroup threadGroup, AccessControlContext acc) {
    super(threadGroup, null, "aForkJoinWorkerThread");
  }
  public ForkJoinPool getPool( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getPoolIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void run( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}