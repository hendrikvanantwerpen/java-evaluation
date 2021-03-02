package java.util.concurrent;

import java.util.*;

public abstract class AbstractExecutorService implements ExecutorService {
  protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T value) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
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
  private <T> T doInvokeAny(Collection<? extends Callable<T>> tasks,boolean timed, long nanos) throws InterruptedException, ExecutionException, TimeoutException {
                                                                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                 }
  public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
                                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                  }
  public <T> T invokeAny(Collection<? extends Callable<T>> tasks,long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                                                                                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                }
  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
                                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                            }
  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks,long timeout, TimeUnit unit) throws InterruptedException {
                                                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                        }
}