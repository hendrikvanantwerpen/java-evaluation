package java.lang.ref;


public abstract class Reference<T> {
  volatile ReferenceQueue<? super T> queue;
  volatile Reference next;
  static private class Lock {
  }
  private static class ReferenceHandler extends Thread {
    ReferenceHandler(ThreadGroup g, String name) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void run( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  }
  static boolean tryHandlePending(boolean waitForNotify) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public T get( ) {
                    throw new java . lang . RuntimeException ("Implementation stripped");
                  }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public boolean isEnqueued( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public boolean enqueue( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  Reference(T referent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  Reference(T referent, ReferenceQueue<? super T> queue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}