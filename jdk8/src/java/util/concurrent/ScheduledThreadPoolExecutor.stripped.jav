package java.util.concurrent;

import java.util.*;

public class ScheduledThreadPoolExecutor extends ThreadPoolExecutor implements ScheduledExecutorService {
  public ScheduledThreadPoolExecutor(int corePoolSize) {
    super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS, new DelayedWorkQueue ( ));
  }
  public ScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory) {
    super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS, new DelayedWorkQueue ( ), threadFactory);
  }
  public ScheduledThreadPoolExecutor(int corePoolSize, RejectedExecutionHandler handler) {
    super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS, new DelayedWorkQueue ( ), handler);
  }
  public ScheduledThreadPoolExecutor(int corePoolSize,ThreadFactory threadFactory, RejectedExecutionHandler handler) {
    super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS, new DelayedWorkQueue ( ), threadFactory, handler);
  }
  public ScheduledFuture<?> schedule(Runnable command,long delay, TimeUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <V> ScheduledFuture<V> schedule(Callable<V> callable,long delay, TimeUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,long initialDelay,long period, TimeUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command,long initialDelay,long delay, TimeUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void execute(Runnable command) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Future<?> submit(Runnable task) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> Future<T> submit(Runnable task, T result) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> Future<T> submit(Callable<T> task) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getContinueExistingPeriodicTasksAfterShutdownPolicy( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getExecuteExistingDelayedTasksAfterShutdownPolicy( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setRemoveOnCancelPolicy(boolean value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getRemoveOnCancelPolicy( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void shutdown( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<Runnable> shutdownNow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BlockingQueue<Runnable> getQueue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}