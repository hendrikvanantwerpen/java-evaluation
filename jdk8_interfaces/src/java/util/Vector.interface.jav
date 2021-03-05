package java.util;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java. io. Serializable {
  public Vector(int initialCapacity, int capacityIncrement) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Vector(int initialCapacity) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Vector( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Vector(Collection<? extends E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void copyInto(Object [] anArray) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public synchronized void trimToSize( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public synchronized void ensureCapacity(int minCapacity) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public synchronized void setSize(int newSize) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public synchronized int capacity( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public synchronized int size( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public synchronized boolean isEmpty( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public Enumeration<E> elements( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public boolean contains(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int indexOf(Object o) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public synchronized int indexOf(Object o, int index) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public synchronized int lastIndexOf(Object o) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public synchronized int lastIndexOf(Object o, int index) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public synchronized E elementAt(int index) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public synchronized E firstElement( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public synchronized E lastElement( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public synchronized void setElementAt(E obj, int index) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public synchronized void removeElementAt(int index) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public synchronized void insertElementAt(E obj, int index) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public synchronized void addElement(E obj) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public synchronized boolean removeElement(Object obj) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public synchronized void removeAllElements( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public synchronized Object clone( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public synchronized Object [] toArray( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public synchronized <T> T [] toArray(T [] a) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  E elementData(int index) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public synchronized E get(int index) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public synchronized E set(int index, E element) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public synchronized boolean add(E e) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public boolean remove(Object o) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public void add(int index, E element) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public synchronized E remove(int index) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public synchronized boolean containsAll(Collection<?> c) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public synchronized boolean addAll(Collection<? extends E> c) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public synchronized boolean removeAll(Collection<?> c) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public synchronized boolean retainAll(Collection<?> c) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public synchronized boolean addAll(int index, Collection<? extends E> c) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  public synchronized boolean equals(Object o) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public synchronized int hashCode( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public synchronized String toString( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public synchronized List<E> subList(int fromIndex, int toIndex) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public synchronized ListIterator<E> listIterator(int index) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public synchronized ListIterator<E> listIterator( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public synchronized Iterator<E> iterator( ) {
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
    public void forEachRemaining(Consumer<? super E> action) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
    final void checkForComodification( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  final class ListItr extends Itr implements ListIterator<E> {
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
  public synchronized void forEach(Consumer<? super E> action) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public synchronized boolean removeIf(Predicate<? super E> filter) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  public synchronized void replaceAll(UnaryOperator<E> operator) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public synchronized void sort(Comparator<? super E> c) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public Spliterator<E> spliterator( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  static final class VectorSpliterator<E> implements Spliterator<E> {
    VectorSpliterator(Vector<E> list,Object [] array,int origin,int fence, int expectedModCount) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Spliterator<E> trySplit( ) {
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
}