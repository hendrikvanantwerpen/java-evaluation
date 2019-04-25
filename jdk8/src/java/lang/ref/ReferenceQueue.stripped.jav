package java.lang.ref;


public class ReferenceQueue<T> {
  public ReferenceQueue( ) {
  }
  ;
  public Reference<? extends T> poll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Reference<? extends T> remove(long timeout) throws IllegalArgumentException, InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Reference<? extends T> remove( ) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}