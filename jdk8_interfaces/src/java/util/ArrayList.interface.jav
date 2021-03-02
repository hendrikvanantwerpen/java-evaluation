package java.util;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java. io. Serializable {
  private static final long serialVersionUID;
  private static final int DEFAULT_CAPACITY;
  private static final Object [] EMPTY_ELEMENTDATA;
  private static final Object [] DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
  transient Object [] elementData;
  private int size;
  public ArrayList(int initialCapacity) {
  }
  public ArrayList( ) {
  }
  public ArrayList(Collection<? extends E> c) {
  }
  public void trimToSize( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void ensureCapacity(int minCapacity) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private static int calculateCapacity(Object [] elementData, int minCapacity) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  private void ensureCapacityInternal(int minCapacity) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private void ensureExplicitCapacity(int minCapacity) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private static final int MAX_ARRAY_SIZE;
  private void grow(int minCapacity) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private static int hugeCapacity(int minCapacity) {
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
  private void fastRemove(int index) {
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
  protected void removeRange(int fromIndex, int toIndex) {
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
  public boolean removeAll(Collection<?> c) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public boolean retainAll(Collection<?> c) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  private boolean batchRemove(Collection<?> c, boolean complement) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  private void writeObject(java. io. ObjectOutputStream s) throws java. io. IOException {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  private void readObject(java. io. ObjectInputStream s) throws java. io. IOException, ClassNotFoundException {
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
      super( );
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
    private final AbstractList<E> parent;
    private final int parentOffset;
    private final int offset;
    int size;
    SubList(AbstractList<E> parent,int offset,int fromIndex, int toIndex) {
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
    private final ArrayList<E> list;
    private int index;
    private int fence;
    private int expectedModCount;
    ArrayListSpliterator(ArrayList<E> list,int origin,int fence, int expectedModCount) {
    }
    private int getFence( ) {
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