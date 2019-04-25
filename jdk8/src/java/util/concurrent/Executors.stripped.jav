package java.util.concurrent;

import java.util.*;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;

public class Executors {
  public static ExecutorService newFixedThreadPool(int nThreads) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ExecutorService newWorkStealingPool(int parallelism) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ExecutorService newWorkStealingPool( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ExecutorService newFixedThreadPool(int nThreads, ThreadFactory threadFactory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ExecutorService newSingleThreadExecutor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ExecutorService newCachedThreadPool( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ExecutorService newCachedThreadPool(ThreadFactory threadFactory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ScheduledExecutorService newSingleThreadScheduledExecutor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ScheduledExecutorService newSingleThreadScheduledExecutor(ThreadFactory threadFactory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize, ThreadFactory threadFactory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ExecutorService unconfigurableExecutorService(ExecutorService executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ScheduledExecutorService unconfigurableScheduledExecutorService(ScheduledExecutorService executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ThreadFactory defaultThreadFactory( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ThreadFactory privilegedThreadFactory( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Callable<T> callable(Runnable task, T result) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Callable<Object> callable(Runnable task) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Callable<Object> callable(final PrivilegedAction<?> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Callable<Object> callable(final PrivilegedExceptionAction<?> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Callable<T> privilegedCallable(Callable<T> callable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Callable<T> privilegedCallableUsingCurrentClassLoader(Callable<T> callable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private Executors( ) {
  }
}