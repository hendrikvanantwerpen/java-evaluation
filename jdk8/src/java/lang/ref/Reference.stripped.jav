package java.lang.ref;


public abstract class Reference<T> {
  ;
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