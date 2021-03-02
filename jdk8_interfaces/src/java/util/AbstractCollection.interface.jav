package java.util;


public abstract class AbstractCollection<E> implements Collection<E> {
  protected AbstractCollection( ) {
  }
  public abstract Iterator<E> iterator( ) ;
  public abstract int size( ) ;
  public boolean isEmpty( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean contains(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public Object [] toArray( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public <T> T [] toArray(T [] a) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private static final int MAX_ARRAY_SIZE;
  private static <T> T [] finishToArray(T [] r, Iterator<?> it) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  private static int hugeCapacity(int minCapacity) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public boolean add(E e) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public boolean remove(Object o) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean containsAll(Collection<?> c) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public boolean addAll(Collection<? extends E> c) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public boolean removeAll(Collection<?> c) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public boolean retainAll(Collection<?> c) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}