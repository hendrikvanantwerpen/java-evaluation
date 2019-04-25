package java.util.concurrent.atomic;


public class AtomicStampedReference<V> {
  public AtomicStampedReference(V initialRef, int initialStamp) {
  }
  public V getReference( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getStamp( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public V get(int [] stampHolder) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean weakCompareAndSet(V expectedReference,V newReference,int expectedStamp, int newStamp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean compareAndSet(V expectedReference,V newReference,int expectedStamp, int newStamp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void set(V newReference, int newStamp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean attemptStamp(V expectedReference, int newStamp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}