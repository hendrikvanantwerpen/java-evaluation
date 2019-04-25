package java.util.concurrent;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ForkJoinPool extends AbstractExecutorService {
  public static interface ForkJoinWorkerThreadFactory {
    public ForkJoinWorkerThread newThread(ForkJoinPool pool) ;
  }
  public static final ForkJoinWorkerThreadFactory defaultForkJoinWorkerThreadFactory;
  public ForkJoinPool( ) {
    this(Math. min(MAX_CAP, Runtime. getRuntime( ). availableProcessors( )), defaultForkJoinWorkerThreadFactory, null, false);
  }
  public ForkJoinPool(int parallelism) {
    this(parallelism, defaultForkJoinWorkerThreadFactory, null, false);
  }
  public ForkJoinPool(int parallelism,ForkJoinWorkerThreadFactory factory,UncaughtExceptionHandler handler, boolean asyncMode) {
    this(checkParallelism(parallelism), checkFactory(factory), handler, asyncMode ? FIFO_QUEUE : LIFO_QUEUE, "ForkJoinPool-" + nextPoolId( ) + "-worker-");
  }
  private ForkJoinPool(int parallelism,ForkJoinWorkerThreadFactory factory,UncaughtExceptionHandler handler,int mode, String workerNamePrefix) {
  }
  public static ForkJoinPool commonPool( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> T invoke(ForkJoinTask<T> task) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void execute(ForkJoinTask<?> task) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void execute(Runnable task) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> ForkJoinTask<T> submit(ForkJoinTask<T> task) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> ForkJoinTask<T> submit(Callable<T> task) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> ForkJoinTask<T> submit(Runnable task, T result) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ForkJoinTask<?> submit(Runnable task) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ForkJoinWorkerThreadFactory getFactory( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public UncaughtExceptionHandler getUncaughtExceptionHandler( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getParallelism( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int getCommonPoolParallelism( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getPoolSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getAsyncMode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRunningThreadCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getActiveThreadCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isQuiescent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getStealCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getQueuedTaskCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getQueuedSubmissionCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasQueuedSubmissions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void shutdown( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<Runnable> shutdownNow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isTerminated( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isTerminating( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isShutdown( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean awaitQuiescence(long timeout, TimeUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static interface ManagedBlocker {
    boolean block( ) throws InterruptedException ;
    boolean isReleasable( ) ;
  }
  public static void managedBlock(ManagedBlocker blocker) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}