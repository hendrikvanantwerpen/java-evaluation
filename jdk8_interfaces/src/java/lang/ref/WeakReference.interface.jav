package java.lang.ref;


public class WeakReference<T> extends Reference<T> {
  public WeakReference(T referent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WeakReference(T referent, ReferenceQueue<? super T> q) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}