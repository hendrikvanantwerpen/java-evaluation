package java.util.concurrent.locks;


public class LockSupport {
  private LockSupport( ) {
  }
  public static void unpark(Thread thread) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void park(Object blocker) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void parkNanos(Object blocker, long nanos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void parkUntil(Object blocker, long deadline) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Object getBlocker(Thread t) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void park( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void parkNanos(long nanos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void parkUntil(long deadline) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}