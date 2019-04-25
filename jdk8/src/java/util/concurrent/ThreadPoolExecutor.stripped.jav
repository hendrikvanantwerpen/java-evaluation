package java.util.concurrent;

import java.util.*;

public class ThreadPoolExecutor extends AbstractExecutorService {
  public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit, BlockingQueue<Runnable> workQueue) {
    this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, Executors. defaultThreadFactory( ), defaultHandler);
  }
  public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit,BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
    this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, defaultHandler);
  }
  public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit,BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
    this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, Executors. defaultThreadFactory( ), handler);
  }
  public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit,BlockingQueue<Runnable> workQueue,ThreadFactory threadFactory, RejectedExecutionHandler handler) {
  }
  public void execute(Runnable command) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void shutdown( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<Runnable> shutdownNow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isShutdown( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isTerminating( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isTerminated( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setThreadFactory(ThreadFactory threadFactory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThreadFactory getThreadFactory( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setRejectedExecutionHandler(RejectedExecutionHandler handler) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public RejectedExecutionHandler getRejectedExecutionHandler( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCorePoolSize(int corePoolSize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getCorePoolSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean prestartCoreThread( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int prestartAllCoreThreads( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean allowsCoreThreadTimeOut( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void allowCoreThreadTimeOut(boolean value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMaximumPoolSize(int maximumPoolSize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMaximumPoolSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setKeepAliveTime(long time, TimeUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getKeepAliveTime(TimeUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BlockingQueue<Runnable> getQueue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean remove(Runnable task) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void purge( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getPoolSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getActiveCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getLargestPoolSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getTaskCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getCompletedTaskCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static class CallerRunsPolicy implements RejectedExecutionHandler {
    public CallerRunsPolicy( ) {
    }
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class AbortPolicy implements RejectedExecutionHandler {
    public AbortPolicy( ) {
    }
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class DiscardPolicy implements RejectedExecutionHandler {
    public DiscardPolicy( ) {
    }
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class DiscardOldestPolicy implements RejectedExecutionHandler {
    public DiscardOldestPolicy( ) {
    }
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
}