package java.util;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java. io. Serializable {
  transient Object [] elementData;
  public ArrayList(int initialCapacity) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ArrayList( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ArrayList(Collection<? extends E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void trimToSize( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void ensureCapacity(int minCapacity) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public int size( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  public boolean isEmpty( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean contains(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int indexOf(Object o) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public int lastIndexOf(Object o) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public Object clone( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public Object [] toArray( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public <T> T [] toArray(T [] a) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  E elementData(int index) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public E get(int index) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public E set(int index, E element) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public boolean add(E e) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public void add(int index, E element) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public E remove(int index) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean remove(Object o) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public boolean addAll(Collection<? extends E> c) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public boolean addAll(int index, Collection<? extends E> c) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public boolean removeAll(Collection<?> c) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public boolean retainAll(Collection<?> c) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public ListIterator<E> listIterator(int index) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public ListIterator<E> listIterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public Iterator<E> iterator( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  private class Itr implements Iterator<E> {
    int cursor;
    int lastRet;
    int expectedModCount;
    Itr( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean hasNext( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public E next( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
    public void remove( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public void forEachRemaining(Consumer<? super E> consumer) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
    final void checkForComodification( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  private class ListItr extends Itr implements ListIterator<E> {
    ListItr(int index) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean hasPrevious( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    public int nextIndex( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public int previousIndex( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public E previous( ) {
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
  static void subListRangeCheck(int fromIndex,int toIndex, int size) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  private class SubList extends AbstractList<E> implements RandomAccess {
    int size;
    SubList(AbstractList<E> parent,int offset,int fromIndex, int toIndex) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public E set(int index, E e) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public E get(int index) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public void add(int index, E e) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public E remove(int index) {
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
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  public void forEach(Consumer<? super E> action) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public Spliterator<E> spliterator( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  static final class ArrayListSpliterator<E> implements Spliterator<E> {
    ArrayListSpliterator(ArrayList<E> list,int origin,int fence, int expectedModCount) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public ArrayListSpliterator<E> trySplit( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public boolean tryAdvance(Consumer<? super E> action) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
    public void forEachRemaining(Consumer<? super E> action) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
    public long estimateSize( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public int characteristics( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  public boolean removeIf(Predicate<? super E> filter) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public void replaceAll(UnaryOperator<E> operator) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public void sort(Comparator<? super E> c) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
}