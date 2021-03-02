package java.util.concurrent;


public abstract class CountedCompleter<T> extends ForkJoinTask<T> {
  private static final long serialVersionUID;
  final CountedCompleter<?> completer;
  volatile int pending;
  protected CountedCompleter(CountedCompleter<?> completer, int initialPendingCount) {
  }
  protected CountedCompleter(CountedCompleter<?> completer) {
  }
  protected CountedCompleter( ) {
  }
  public abstract void compute( ) ;
  public void onCompletion(CountedCompleter<?> caller) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public boolean onExceptionalCompletion(Throwable ex, CountedCompleter<?> caller) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  public final CountedCompleter<?> getCompleter( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public final int getPendingCount( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public final void setPendingCount(int count) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public final void addToPendingCount(int delta) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public final boolean compareAndSetPendingCount(int expected, int count) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public final int decrementPendingCountUnlessZero( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public final CountedCompleter<?> getRoot( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public final void tryComplete( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public final void propagateCompletion( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public void complete(T rawResult) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public final CountedCompleter<?> firstComplete( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public final CountedCompleter<?> nextComplete( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public final void quietlyCompleteRoot( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public final void helpComplete(int maxTasks) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  void internalPropagateException(Throwable ex) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  protected final boolean exec( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public T getRawResult( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  protected void setRawResult(T t) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  private static final sun. misc. Unsafe U;
  private static final long PENDING;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
}