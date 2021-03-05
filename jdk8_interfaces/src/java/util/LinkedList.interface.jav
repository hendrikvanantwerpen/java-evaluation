package java.util;

import java.util.function.Consumer;

public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java. io. Serializable {
  transient int size;
  transient Node<E> first;
  transient Node<E> last;
  public LinkedList( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LinkedList(Collection<? extends E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  void linkLast(E e) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  void linkBefore(E e, Node<E> succ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  E unlink(Node<E> x) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  public E getFirst( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public E getLast( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  public E removeFirst( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public E removeLast( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public void addFirst(E e) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void addLast(E e) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public boolean contains(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int size( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  public boolean add(E e) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public boolean remove(Object o) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean addAll(Collection<? extends E> c) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public boolean addAll(int index, Collection<? extends E> c) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public E get(int index) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public E set(int index, E element) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public void add(int index, E element) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public E remove(int index) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  Node<E> node(int index) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public int indexOf(Object o) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public int lastIndexOf(Object o) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public E peek( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
  public E element( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  public E poll( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
  public E remove( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  public boolean offer(E e) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean offerFirst(E e) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public boolean offerLast(E e) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public E peekFirst( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public E peekLast( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public E pollFirst( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public E pollLast( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public void push(E e) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public E pop( ) {
                    throw new java . lang . RuntimeException ("Implementation stripped");
                  }
  public boolean removeFirstOccurrence(Object o) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public boolean removeLastOccurrence(Object o) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public ListIterator<E> listIterator(int index) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  private class ListItr implements ListIterator<E> {
    ListItr(int index) {
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
    final void checkForComodification( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  private static class Node<E> {
    E item;
    Node<E> next;
    Node<E> prev;
    Node(Node<E> prev,E element, Node<E> next) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public Iterator<E> descendingIterator( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private class DescendingIterator implements Iterator<E> {
    public boolean hasNext( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public E next( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
    public void remove( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
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
  public Spliterator<E> spliterator( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  static final class LLSpliterator<E> implements Spliterator<E> {
    static final int BATCH_UNIT;
    static final int MAX_BATCH;
    final LinkedList<E> list;
    Node<E> current;
    int est;
    int expectedModCount;
    int batch;
    LLSpliterator(LinkedList<E> list,int est, int expectedModCount) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    final int getEst( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public long estimateSize( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public Spliterator<E> trySplit( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public void forEachRemaining(Consumer<? super E> action) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
    public boolean tryAdvance(Consumer<? super E> action) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
    public int characteristics( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
}