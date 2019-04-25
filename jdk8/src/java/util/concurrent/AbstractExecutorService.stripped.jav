package java.util.concurrent;

import java.util.*;

public abstract class AbstractExecutorService implements ExecutorService {
  public Future<?> submit(Runnable task) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> Future<T> submit(Runnable task, T result) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> Future<T> submit(Callable<T> task) {
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