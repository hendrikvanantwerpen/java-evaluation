package java.lang.ref;


public class SoftReference<T> extends Reference<T> {
  public SoftReference(T referent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SoftReference(T referent, ReferenceQueue<? super T> q) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T get( ) {
                    throw new java . lang . RuntimeException ("Implementation stripped");
                  }
}