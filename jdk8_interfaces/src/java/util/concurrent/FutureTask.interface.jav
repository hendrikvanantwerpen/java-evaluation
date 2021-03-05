package java.util.concurrent;


public class FutureTask<V> implements RunnableFuture<V> {
  public FutureTask(Callable<V> callable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FutureTask(Runnable runnable, V result) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCancelled( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public boolean isDone( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public boolean cancel(boolean mayInterruptIfRunning) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public V get( ) throws InterruptedException, ExecutionException {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                              }
  public void run( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  static final class WaitNode {
    volatile Thread thread;
    volatile WaitNode next;
    WaitNode( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
}