package java.util.concurrent;


public class ExecutorCompletionService<V> implements CompletionService<V> {
  public ExecutorCompletionService(Executor executor) {
  }
  public ExecutorCompletionService(Executor executor, BlockingQueue<Future<V>> completionQueue) {
  }
  public Future<V> submit(Callable<V> task) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Future<V> submit(Runnable task, V result) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Future<V> take( ) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Future<V> poll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Future<V> poll(long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}