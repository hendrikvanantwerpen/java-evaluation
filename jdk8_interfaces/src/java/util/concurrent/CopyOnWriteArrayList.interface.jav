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
  private static final long serialVersionUID;
  final transient ReentrantLock lock;
  private transient volatile Object [] array;
  final Object [] getArray( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  final void setArray(Object [] a) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public CopyOnWriteArrayList( ) {
  }
  public CopyOnWriteArrayList(Collection<? extends E> c) {
  }
  public CopyOnWriteArrayList(E [] toCopyIn) {
  }
  public int size( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  public boolean isEmpty( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private static boolean eq(Object o1, Object o2) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  private static int indexOf(Object o,Object [] elements,int index, int fence) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  private static int lastIndexOf(Object o,Object [] elements, int index) {
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
  private E get(Object [] a, int index) {
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
  private boolean remove(Object o,Object [] snapshot, int index) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  void removeRange(int fromIndex, int toIndex) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public boolean addIfAbsent(E e) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private boolean addIfAbsent(E e, Object [] snapshot) {
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
  private void writeObject(java. io. ObjectOutputStream s) throws java. io. IOException {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  private void readObject(java. io. ObjectInputStream s) throws java. io. IOException, ClassNotFoundException {
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
    private final Object [] snapshot;
    private int cursor;
    private COWIterator(Object [] elements, int initialCursor) {
    }
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
    private final CopyOnWriteArrayList<E> l;
    private final int offset;
    private int size;
    private Object [] expectedArray;
    COWSubList(CopyOnWriteArrayList<E> list,int fromIndex, int toIndex) {
    }
    private void checkForComodification( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    private void rangeCheck(int index) {
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
    private final ListIterator<E> it;
    private final int offset;
    private final int size;
    COWSubListIterator(List<E> l,int index,int offset, int size) {
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
  private void resetLock( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private static final sun. misc. Unsafe UNSAFE;
  private static final long lockOffset;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
}