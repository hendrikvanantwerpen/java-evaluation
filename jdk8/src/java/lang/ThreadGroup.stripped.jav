package java.lang;


public class ThreadGroup implements Thread. UncaughtExceptionHandler {
  private ThreadGroup( ) {
  }
  public ThreadGroup(String name) {
    this(Thread. currentThread( ). getThreadGroup( ), name);
  }
  public ThreadGroup(ThreadGroup parent, String name) {
    this(checkParentAccess(parent), parent, name);
  }
  private ThreadGroup(Void unused,ThreadGroup parent, String name) {
  }
  public final String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final ThreadGroup getParent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getMaxPriority( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isDaemon( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean isDestroyed( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setDaemon(boolean daemon) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setMaxPriority(int pri) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean parentOf(ThreadGroup g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void checkAccess( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int activeCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int enumerate(Thread list[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int enumerate(Thread list[], boolean recurse) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int activeGroupCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int enumerate(ThreadGroup list[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int enumerate(ThreadGroup list[], boolean recurse) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void stop( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void interrupt( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void suspend( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void resume( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void destroy( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void list( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void uncaughtException(Thread t, Throwable e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean allowThreadSuspension(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}