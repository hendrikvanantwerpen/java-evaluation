package java.util.concurrent;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CopyOnWriteArrayList<E> implements List<E>, RandomAccess, Cloneable, java. io. Serializable {
  final transient ReentrantLock lock;
  final Object [] getArray( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  final void setArray(Object [] a) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public CopyOnWriteArrayList( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CopyOnWriteArrayList(Collection<? extends E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CopyOnWriteArrayList(E [] toCopyIn) {
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
  public int indexOf(E e, int index) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public int lastIndexOf(Object o) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public int lastIndexOf(E e, int index) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public Object clone( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public Object [] toArray( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public <T> T [] toArray(T a[]) {
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
  void removeRange(int fromIndex, int toIndex) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public boolean addIfAbsent(E e) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean containsAll(Collection<?> c) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public boolean removeAll(Collection<?> c) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public boolean retainAll(Collection<?> c) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public int addAllAbsent(Collection<? extends E> c) {
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
  public void forEach(Consumer<? super E> action) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
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
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean equals(Object o) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public Iterator<E> iterator( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public ListIterator<E> listIterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public ListIterator<E> listIterator(int index) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public Spliterator<E> spliterator( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  static final class COWIterator<E> implements ListIterator<E> {
    public boolean hasNext( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean hasPrevious( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    public E next( ) {
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
    public void remove( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public void set(E e) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public void add(E e) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public void forEachRemaining(Consumer<? super E> action) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  }
  public List<E> subList(int fromIndex, int toIndex) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  private static class COWSubList<E> extends AbstractList<E> implements RandomAccess {
    COWSubList(CopyOnWriteArrayList<E> list,int fromIndex, int toIndex) {
      throw new java . lang . RuntimeException ("Implementation stripped");
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
    public void clear( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public E remove(int index) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public boolean remove(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public Iterator<E> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public ListIterator<E> listIterator(int index) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    public List<E> subList(int fromIndex, int toIndex) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    public void forEach(Consumer<? super E> action) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public void replaceAll(UnaryOperator<E> operator) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public void sort(Comparator<? super E> c) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public boolean removeAll(Collection<?> c) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public boolean retainAll(Collection<?> c) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public boolean removeIf(Predicate<? super E> filter) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  private static class COWSubListIterator<E> implements ListIterator<E> {
    COWSubListIterator(List<E> l,int index,int offset, int size) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean hasNext( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public E next( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
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
    public void remove( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public void set(E e) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public void add(E e) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public void forEachRemaining(Consumer<? super E> action) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  }
}