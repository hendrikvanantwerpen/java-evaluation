package java.lang.ref;


public abstract class Reference<T> {
  private T referent;
  volatile ReferenceQueue<? super T> queue;
  volatile Reference next;
  transient private Reference<T> discovered;
  static private class Lock {
  }
  private static Lock lock;
  private static Reference<Object> pending;
  private static class ReferenceHandler extends Thread {
    private static void ensureClassInitialized(Class<?> clazz) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
    static {
             throw new java . lang . RuntimeException ("Implementation stripped");
           }
    ReferenceHandler(ThreadGroup g, String name) {
      super(g, name);
    }
    public void run( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  }
  static boolean tryHandlePending(boolean waitForNotify) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  static {
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
    this(referent, null);
  }
  Reference(T referent, ReferenceQueue<? super T> queue) {
  }
}