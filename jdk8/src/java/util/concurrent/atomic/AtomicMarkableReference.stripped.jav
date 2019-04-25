package java.util.concurrent.atomic;


public class AtomicMarkableReference<V> {
  public AtomicMarkableReference(V initialRef, boolean initialMark) {
  }
  public V getReference( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMarked( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public V get(boolean [] markHolder) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean weakCompareAndSet(V expectedReference,V newReference,boolean expectedMark, boolean newMark) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean compareAndSet(V expectedReference,V newReference,boolean expectedMark, boolean newMark) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void set(V newReference, boolean newMark) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean attemptMark(V expectedReference, boolean newMark) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}