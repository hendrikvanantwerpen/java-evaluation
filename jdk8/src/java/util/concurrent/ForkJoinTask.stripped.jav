package java.util.concurrent;

import java.io.Serializable;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class ForkJoinTask<V> implements Future<V>, Serializable {
  public final ForkJoinTask<V> fork( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final V join( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final V invoke( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void invokeAll(ForkJoinTask<?> t1, ForkJoinTask<?> t2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void invokeAll(ForkJoinTask<?> ... tasks) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T extends ForkJoinTask<?>> Collection<T> invokeAll(Collection<T> tasks) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean cancel(boolean mayInterruptIfRunning) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isDone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isCancelled( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isCompletedAbnormally( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isCompletedNormally( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Throwable getException( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void completeExceptionally(Throwable ex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void complete(V value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void quietlyComplete( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final V get( ) throws InterruptedException, ExecutionException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void quietlyJoin( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void quietlyInvoke( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void helpQuiesce( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reinitialize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ForkJoinPool getPool( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean inForkJoinPool( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean tryUnfork( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int getQueuedTaskCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int getSurplusQueuedTaskCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract V getRawResult( ) ;
  public final short getForkJoinTaskTag( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final short setForkJoinTaskTag(short tag) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean compareAndSetForkJoinTaskTag(short e, short tag) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ForkJoinTask<?> adapt(Runnable runnable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> ForkJoinTask<T> adapt(Runnable runnable, T result) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> ForkJoinTask<T> adapt(Callable<? extends T> callable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}