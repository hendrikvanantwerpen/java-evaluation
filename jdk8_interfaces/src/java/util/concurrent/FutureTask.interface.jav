package java.util.concurrent;


public class FutureTask<V> implements RunnableFuture<V> {
  private volatile int state;
  private static final int NEW;
  private static final int COMPLETING;
  private static final int NORMAL;
  private static final int EXCEPTIONAL;
  private static final int CANCELLED;
  private static final int INTERRUPTING;
  private static final int INTERRUPTED;
  private Callable<V> callable;
  private Object outcome;
  private volatile Thread runner;
  private volatile WaitNode waiters;
  private V report(int s) throws ExecutionException {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public FutureTask(Callable<V> callable) {
  }
  public FutureTask(Runnable runnable, V result) {
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
  protected void done( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  protected void set(V v) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  protected void setException(Throwable t) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public void run( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  protected boolean runAndReset( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  private void handlePossibleCancellationInterrupt(int s) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  static final class WaitNode {
    volatile Thread thread;
    volatile WaitNode next;
    WaitNode( ) {
    }
  }
  private void finishCompletion( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  private int awaitDone(boolean timed, long nanos) throws InterruptedException {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  private void removeWaiter(WaitNode node) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private static final sun. misc. Unsafe UNSAFE;
  private static final long stateOffset;
  private static final long runnerOffset;
  private static final long waitersOffset;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
}