package java.lang.ref;


public class PhantomReference<T> extends Reference<T> {
  public T get( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PhantomReference(T referent, ReferenceQueue<? super T> q) {
    super(referent, q);
  }
}