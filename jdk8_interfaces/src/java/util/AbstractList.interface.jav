package java.util;


public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {
  protected AbstractList( ) {
  }
  public boolean add(E e) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  abstract public E get(int index) ;
  public E set(int index, E element) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public void add(int index, E element) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public E remove(int index) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public int indexOf(Object o) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public int lastIndexOf(Object o) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public boolean addAll(int index, Collection<? extends E> c) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public Iterator<E> iterator( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public ListIterator<E> listIterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public ListIterator<E> listIterator(final int index) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private class Itr implements Iterator<E> {
    int cursor;
    int lastRet;
    int expectedModCount;
    public boolean hasNext( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public E next( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
    public void remove( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    final void checkForComodification( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  private class ListItr extends Itr implements ListIterator<E> {
    ListItr(int index) {
    }
    public boolean hasPrevious( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    public E previous( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public int nextIndex( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public int previousIndex( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public void set(E e) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public void add(E e) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  }
  public List<E> subList(int fromIndex, int toIndex) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public boolean equals(Object o) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  protected void removeRange(int fromIndex, int toIndex) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  protected transient int modCount;
  private void rangeCheckForAdd(int index) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private String outOfBoundsMsg(int index) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
}
class SubList<E> extends AbstractList<E> {
  private final AbstractList<E> l;
  private final int offset;
  private int size;
  SubList(AbstractList<E> list,int fromIndex, int toIndex) {
  }
  public E set(int index, E element) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public E get(int index) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public int size( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  public void add(int index, E element) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public E remove(int index) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  protected void removeRange(int fromIndex, int toIndex) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public boolean addAll(Collection<? extends E> c) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public boolean addAll(int index, Collection<? extends E> c) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public Iterator<E> iterator( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public ListIterator<E> listIterator(final int index) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public List<E> subList(int fromIndex, int toIndex) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  private void rangeCheck(int index) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private void rangeCheckForAdd(int index) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private String outOfBoundsMsg(int index) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private void checkForComodification( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
}
class RandomAccessSubList<E> extends SubList<E> implements RandomAccess {
  RandomAccessSubList(AbstractList<E> list,int fromIndex, int toIndex) {
    super(list, fromIndex, toIndex);
  }
  public List<E> subList(int fromIndex, int toIndex) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
}