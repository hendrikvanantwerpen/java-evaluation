package java.lang.ref;


public class SoftReference<T> extends Reference<T> {
  static private long clock;
  private long timestamp;
  public SoftReference(T referent) {
    super(referent);
  }
  public SoftReference(T referent, ReferenceQueue<? super T> q) {
    super(referent, q);
  }
  public T get( ) {
                    throw new java . lang . RuntimeException ("Implementation stripped");
                  }
}