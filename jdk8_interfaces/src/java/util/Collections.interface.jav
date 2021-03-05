package java.util;

import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Collections {
  public static <T extends Comparable<? super T>> void sort(List<T> list) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public static <T> void sort(List<T> list, Comparator<? super T> c) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  public static <T> int binarySearch(List<? extends T> list,T key, Comparator<? super T> c) {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  public static void reverse(List<?> list) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public static void shuffle(List<?> list) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public static void shuffle(List<?> list, Random rnd) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public static void swap(List<?> list,int i, int j) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public static <T> void fill(List<? super T> list, T obj) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public static <T> void copy(List<? super T> dest, List<? extends T> src) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  public static <T extends Object& Comparable<? super T>> T min(Collection<? extends T> coll) {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
  public static <T> T min(Collection<? extends T> coll, Comparator<? super T> comp) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public static <T extends Object& Comparable<? super T>> T max(Collection<? extends T> coll) {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
  public static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public static void rotate(List<?> list, int distance) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public static <T> boolean replaceAll(List<T> list,T oldVal, T newVal) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public static int indexOfSubList(List<?> source, List<?> target) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public static int lastIndexOfSubList(List<?> source, List<?> target) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public static <T> Collection<T> unmodifiableCollection(Collection<? extends T> c) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  static class UnmodifiableCollection<E> implements Collection<E>, Serializable {
    final Collection<? extends E> c;
    UnmodifiableCollection(Collection<? extends E> c) {
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
    public Object [] toArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public <T> T [] toArray(T [] a) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public Iterator<E> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public boolean add(E e) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public boolean remove(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public boolean containsAll(Collection<?> coll) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    public boolean addAll(Collection<? extends E> coll) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
    public boolean removeAll(Collection<?> coll) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    public boolean retainAll(Collection<?> coll) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    public void clear( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public void forEach(Consumer<? super E> action) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public boolean removeIf(Predicate<? super E> filter) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public Stream<E> stream( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public Stream<E> parallelStream( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  }
  public static <T> Set<T> unmodifiableSet(Set<? extends T> s) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  static class UnmodifiableSet<E> extends UnmodifiableCollection<E> implements Set<E>, Serializable {
    UnmodifiableSet(Set<? extends E> s) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  }
  public static <T> SortedSet<T> unmodifiableSortedSet(SortedSet<T> s) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  static class UnmodifiableSortedSet<E> extends UnmodifiableSet<E> implements SortedSet<E>, Serializable {
    UnmodifiableSortedSet(SortedSet<E> s) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Comparator<? super E> comparator( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public SortedSet<E> subSet(E fromElement, E toElement) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    public SortedSet<E> headSet(E toElement) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public SortedSet<E> tailSet(E fromElement) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public E first( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
    public E last( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  }
  public static <T> NavigableSet<T> unmodifiableNavigableSet(NavigableSet<T> s) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  static class UnmodifiableNavigableSet<E> extends UnmodifiableSortedSet<E> implements NavigableSet<E>, Serializable {
    private static class EmptyNavigableSet<E> extends UnmodifiableNavigableSet<E> implements Serializable {
      public EmptyNavigableSet( ) {
        throw new java . lang . RuntimeException ("Implementation stripped");
      }
    }
    UnmodifiableNavigableSet(NavigableSet<E> s) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public E lower(E e) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public E floor(E e) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public E ceiling(E e) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public E higher(E e) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public E pollFirst( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public E pollLast( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public NavigableSet<E> descendingSet( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public Iterator<E> descendingIterator( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public NavigableSet<E> subSet(E fromElement,boolean fromInclusive,E toElement, boolean toInclusive) {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
    public NavigableSet<E> headSet(E toElement, boolean inclusive) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
    public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  }
  public static <T> List<T> unmodifiableList(List<? extends T> list) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  static class UnmodifiableList<E> extends UnmodifiableCollection<E> implements List<E> {
    final List<? extends E> list;
    UnmodifiableList(List<? extends E> list) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
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
    public int indexOf(Object o) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public int lastIndexOf(Object o) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public boolean addAll(int index, Collection<? extends E> c) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
    public void replaceAll(UnaryOperator<E> operator) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public void sort(Comparator<? super E> c) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public ListIterator<E> listIterator( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public ListIterator<E> listIterator(final int index) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public List<E> subList(int fromIndex, int toIndex) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  }
  static class UnmodifiableRandomAccessList<E> extends UnmodifiableList<E> implements RandomAccess {
    UnmodifiableRandomAccessList(List<? extends E> list) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public List<E> subList(int fromIndex, int toIndex) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  }
  public static <K,V> Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> m) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  private static class UnmodifiableMap<K,V> implements Map<K, V>, Serializable {
    UnmodifiableMap(Map<? extends K, ? extends V> m) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean isEmpty( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean containsKey(Object key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public boolean containsValue(Object val) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public V get(Object key) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public V put(K key, V value) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public V remove(Object key) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public void putAll(Map<? extends K, ? extends V> m) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
    public void clear( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public Set<K> keySet( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public Set<Map. Entry<K, V>> entrySet( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public Collection<V> values( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public V getOrDefault(Object k, V defaultValue) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public void forEach(BiConsumer<? super K, ? super V> action) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public V putIfAbsent(K key, V value) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public boolean remove(Object key, Object value) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public boolean replace(K key,V oldValue, V newValue) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public V replace(K key, V value) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                      }
    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
    public V merge(K key,V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
    static class UnmodifiableEntrySet<K,V> extends UnmodifiableSet<Map. Entry<K, V>> {
      UnmodifiableEntrySet(Set<? extends Map. Entry<? extends K, ? extends V>> s) {
        throw new java . lang . RuntimeException ("Implementation stripped");
      }
      static <K,V> Consumer<Map. Entry<K, V>> entryConsumer(Consumer<? super Entry<K, V>> action) {
                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                  }
      public void forEach(Consumer<? super Entry<K, V>> action) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
      static final class UnmodifiableEntrySetSpliterator<K,V> implements Spliterator<Entry<K, V>> {
        final Spliterator<Map. Entry<K, V>> s;
        UnmodifiableEntrySetSpliterator(Spliterator<Entry<K, V>> s) {
          throw new java . lang . RuntimeException ("Implementation stripped");
        }
        public boolean tryAdvance(Consumer<? super Entry<K, V>> action) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
        public void forEachRemaining(Consumer<? super Entry<K, V>> action) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
        public Spliterator<Entry<K, V>> trySplit( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
        public long estimateSize( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
        public long getExactSizeIfKnown( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
        public int characteristics( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
        public boolean hasCharacteristics(int characteristics) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
        public Comparator<? super Entry<K, V>> getComparator( ) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
      }
      public Spliterator<Entry<K, V>> spliterator( ) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
      public Stream<Entry<K, V>> stream( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
      public Stream<Entry<K, V>> parallelStream( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
      public Iterator<Map. Entry<K, V>> iterator( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
      public Object [] toArray( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
      public <T> T [] toArray(T [] a) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
      public boolean contains(Object o) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
      public boolean containsAll(Collection<?> coll) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
      public boolean equals(Object o) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
      private static class UnmodifiableEntry<K,V> implements Map. Entry<K, V> {
        UnmodifiableEntry(Map. Entry<? extends K, ? extends V> e) {
          throw new java . lang . RuntimeException ("Implementation stripped");
        }
        public K getKey( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
        public V getValue( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
        public V setValue(V value) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
        public int hashCode( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
        public boolean equals(Object o) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
        public String toString( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
      }
    }
  }
  public static <K,V> SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> m) {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
  static class UnmodifiableSortedMap<K,V> extends UnmodifiableMap<K, V> implements SortedMap<K, V>, Serializable {
    UnmodifiableSortedMap(SortedMap<K, ? extends V> m) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Comparator<? super K> comparator( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public SortedMap<K, V> subMap(K fromKey, K toKey) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public SortedMap<K, V> headMap(K toKey) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public SortedMap<K, V> tailMap(K fromKey) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public K firstKey( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public K lastKey( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  }
  public static <K,V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> m) {
                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                  }
  static class UnmodifiableNavigableMap<K,V> extends UnmodifiableSortedMap<K, V> implements NavigableMap<K, V>, Serializable {
    private static class EmptyNavigableMap<K,V> extends UnmodifiableNavigableMap<K, V> implements Serializable {
      EmptyNavigableMap( ) {
        throw new java . lang . RuntimeException ("Implementation stripped");
      }
      public NavigableSet<K> navigableKeySet( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    }
    UnmodifiableNavigableMap(NavigableMap<K, ? extends V> m) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public K lowerKey(K key) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public K floorKey(K key) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public K ceilingKey(K key) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public K higherKey(K key) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public Entry<K, V> lowerEntry(K key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public Entry<K, V> floorEntry(K key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public Entry<K, V> ceilingEntry(K key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public Entry<K, V> higherEntry(K key) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public Entry<K, V> firstEntry( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public Entry<K, V> lastEntry( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public Entry<K, V> pollFirstEntry( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public Entry<K, V> pollLastEntry( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public NavigableMap<K, V> descendingMap( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public NavigableSet<K> navigableKeySet( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public NavigableSet<K> descendingKeySet( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public NavigableMap<K, V> subMap(K fromKey,boolean fromInclusive,K toKey, boolean toInclusive) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
    public NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  }
  public static <T> Collection<T> synchronizedCollection(Collection<T> c) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  static <T> Collection<T> synchronizedCollection(Collection<T> c, Object mutex) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  static class SynchronizedCollection<E> implements Collection<E>, Serializable {
    final Collection<E> c;
    final Object mutex;
    SynchronizedCollection(Collection<E> c) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    SynchronizedCollection(Collection<E> c, Object mutex) {
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
    public Object [] toArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public <T> T [] toArray(T [] a) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public Iterator<E> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public boolean add(E e) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public boolean remove(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public boolean containsAll(Collection<?> coll) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    public boolean addAll(Collection<? extends E> coll) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
    public boolean removeAll(Collection<?> coll) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    public boolean retainAll(Collection<?> coll) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    public void clear( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public void forEach(Consumer<? super E> consumer) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public boolean removeIf(Predicate<? super E> filter) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public Stream<E> stream( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public Stream<E> parallelStream( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  }
  public static <T> Set<T> synchronizedSet(Set<T> s) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  static <T> Set<T> synchronizedSet(Set<T> s, Object mutex) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
    SynchronizedSet(Set<E> s) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    SynchronizedSet(Set<E> s, Object mutex) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  }
  public static <T> SortedSet<T> synchronizedSortedSet(SortedSet<T> s) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
    SynchronizedSortedSet(SortedSet<E> s) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    SynchronizedSortedSet(SortedSet<E> s, Object mutex) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Comparator<? super E> comparator( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public SortedSet<E> subSet(E fromElement, E toElement) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    public SortedSet<E> headSet(E toElement) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public SortedSet<E> tailSet(E fromElement) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public E first( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
    public E last( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  }
  public static <T> NavigableSet<T> synchronizedNavigableSet(NavigableSet<T> s) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  static class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {
    SynchronizedNavigableSet(NavigableSet<E> s) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    SynchronizedNavigableSet(NavigableSet<E> s, Object mutex) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public E lower(E e) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public E floor(E e) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public E ceiling(E e) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public E higher(E e) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public E pollFirst( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public E pollLast( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public NavigableSet<E> descendingSet( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public Iterator<E> descendingIterator( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public NavigableSet<E> subSet(E fromElement, E toElement) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
    public NavigableSet<E> headSet(E toElement) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    public NavigableSet<E> tailSet(E fromElement) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    public NavigableSet<E> subSet(E fromElement,boolean fromInclusive,E toElement, boolean toInclusive) {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
    public NavigableSet<E> headSet(E toElement, boolean inclusive) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
    public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  }
  public static <T> List<T> synchronizedList(List<T> list) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  static <T> List<T> synchronizedList(List<T> list, Object mutex) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
    final List<E> list;
    SynchronizedList(List<E> list) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    SynchronizedList(List<E> list, Object mutex) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
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
    public int indexOf(Object o) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public int lastIndexOf(Object o) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public boolean addAll(int index, Collection<? extends E> c) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
    public ListIterator<E> listIterator( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public ListIterator<E> listIterator(int index) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    public List<E> subList(int fromIndex, int toIndex) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    public void replaceAll(UnaryOperator<E> operator) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public void sort(Comparator<? super E> c) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  }
  static class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
    SynchronizedRandomAccessList(List<E> list) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    SynchronizedRandomAccessList(List<E> list, Object mutex) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public List<E> subList(int fromIndex, int toIndex) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  }
  public static <K,V> Map<K, V> synchronizedMap(Map<K, V> m) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private static class SynchronizedMap<K,V> implements Map<K, V>, Serializable {
    final Object mutex;
    SynchronizedMap(Map<K, V> m) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    SynchronizedMap(Map<K, V> m, Object mutex) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean isEmpty( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean containsKey(Object key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public boolean containsValue(Object value) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public V get(Object key) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public V put(K key, V value) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public V remove(Object key) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public void putAll(Map<? extends K, ? extends V> map) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
    public void clear( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public Set<K> keySet( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public Set<Map. Entry<K, V>> entrySet( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public Collection<V> values( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public V getOrDefault(Object k, V defaultValue) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public void forEach(BiConsumer<? super K, ? super V> action) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public V putIfAbsent(K key, V value) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public boolean remove(Object key, Object value) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public boolean replace(K key,V oldValue, V newValue) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public V replace(K key, V value) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                      }
    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
    public V merge(K key,V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
  }
  public static <K,V> SortedMap<K, V> synchronizedSortedMap(SortedMap<K, V> m) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  static class SynchronizedSortedMap<K,V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
    SynchronizedSortedMap(SortedMap<K, V> m) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    SynchronizedSortedMap(SortedMap<K, V> m, Object mutex) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Comparator<? super K> comparator( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public SortedMap<K, V> subMap(K fromKey, K toKey) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public SortedMap<K, V> headMap(K toKey) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public SortedMap<K, V> tailMap(K fromKey) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public K firstKey( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public K lastKey( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  }
  public static <K,V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> m) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  static class SynchronizedNavigableMap<K,V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
    SynchronizedNavigableMap(NavigableMap<K, V> m) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    SynchronizedNavigableMap(NavigableMap<K, V> m, Object mutex) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Entry<K, V> lowerEntry(K key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public K lowerKey(K key) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public Entry<K, V> floorEntry(K key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public K floorKey(K key) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public Entry<K, V> ceilingEntry(K key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public K ceilingKey(K key) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public Entry<K, V> higherEntry(K key) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public K higherKey(K key) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public Entry<K, V> firstEntry( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public Entry<K, V> lastEntry( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public Entry<K, V> pollFirstEntry( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public Entry<K, V> pollLastEntry( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public NavigableMap<K, V> descendingMap( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public NavigableSet<K> keySet( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public NavigableSet<K> navigableKeySet( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public NavigableSet<K> descendingKeySet( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public SortedMap<K, V> subMap(K fromKey, K toKey) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public SortedMap<K, V> headMap(K toKey) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public SortedMap<K, V> tailMap(K fromKey) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public NavigableMap<K, V> subMap(K fromKey,boolean fromInclusive,K toKey, boolean toInclusive) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
    public NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  }
  public static <E> Collection<E> checkedCollection(Collection<E> c, Class<E> type) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  static <T> T [] zeroLengthArray(Class<T> type) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  static class CheckedCollection<E> implements Collection<E>, Serializable {
    final Collection<E> c;
    final Class<E> type;
    E typeCheck(Object o) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    CheckedCollection(Collection<E> c, Class<E> type) {
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
    public Object [] toArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public <T> T [] toArray(T [] a) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean remove(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public void clear( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public boolean containsAll(Collection<?> coll) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    public boolean removeAll(Collection<?> coll) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    public boolean retainAll(Collection<?> coll) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    public Iterator<E> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public boolean add(E e) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    Collection<E> checkedCopyOf(Collection<? extends E> coll) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
    public boolean addAll(Collection<? extends E> coll) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
    public void forEach(Consumer<? super E> action) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public boolean removeIf(Predicate<? super E> filter) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public Stream<E> stream( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public Stream<E> parallelStream( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  }
  public static <E> Queue<E> checkedQueue(Queue<E> queue, Class<E> type) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  static class CheckedQueue<E> extends CheckedCollection<E> implements Queue<E>, Serializable {
    final Queue<E> queue;
    CheckedQueue(Queue<E> queue, Class<E> elementType) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public E element( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public E peek( ) {
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
  }
  public static <E> Set<E> checkedSet(Set<E> s, Class<E> type) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  static class CheckedSet<E> extends CheckedCollection<E> implements Set<E>, Serializable {
    CheckedSet(Set<E> s, Class<E> elementType) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  }
  public static <E> SortedSet<E> checkedSortedSet(SortedSet<E> s, Class<E> type) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  static class CheckedSortedSet<E> extends CheckedSet<E> implements SortedSet<E>, Serializable {
    CheckedSortedSet(SortedSet<E> s, Class<E> type) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Comparator<? super E> comparator( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public E first( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
    public E last( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
    public SortedSet<E> subSet(E fromElement, E toElement) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    public SortedSet<E> headSet(E toElement) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public SortedSet<E> tailSet(E fromElement) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  }
  public static <E> NavigableSet<E> checkedNavigableSet(NavigableSet<E> s, Class<E> type) {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  static class CheckedNavigableSet<E> extends CheckedSortedSet<E> implements NavigableSet<E>, Serializable {
    CheckedNavigableSet(NavigableSet<E> s, Class<E> type) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public E lower(E e) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public E floor(E e) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public E ceiling(E e) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public E higher(E e) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public E pollFirst( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public E pollLast( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public NavigableSet<E> descendingSet( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public Iterator<E> descendingIterator( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public NavigableSet<E> subSet(E fromElement, E toElement) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
    public NavigableSet<E> headSet(E toElement) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    public NavigableSet<E> tailSet(E fromElement) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    public NavigableSet<E> subSet(E fromElement,boolean fromInclusive,E toElement, boolean toInclusive) {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
    public NavigableSet<E> headSet(E toElement, boolean inclusive) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
    public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  }
  public static <E> List<E> checkedList(List<E> list, Class<E> type) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  static class CheckedList<E> extends CheckedCollection<E> implements List<E> {
    final List<E> list;
    CheckedList(List<E> list, Class<E> type) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public E get(int index) {
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
    public E set(int index, E element) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    public void add(int index, E element) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public boolean addAll(int index, Collection<? extends E> c) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
    public ListIterator<E> listIterator( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public ListIterator<E> listIterator(final int index) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public List<E> subList(int fromIndex, int toIndex) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    public void replaceAll(UnaryOperator<E> operator) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public void sort(Comparator<? super E> c) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  }
  static class CheckedRandomAccessList<E> extends CheckedList<E> implements RandomAccess {
    CheckedRandomAccessList(List<E> list, Class<E> type) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public List<E> subList(int fromIndex, int toIndex) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  }
  public static <K,V> Map<K, V> checkedMap(Map<K, V> m,Class<K> keyType, Class<V> valueType) {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
  private static class CheckedMap<K,V> implements Map<K, V>, Serializable {
    final Class<K> keyType;
    final Class<V> valueType;
    CheckedMap(Map<K, V> m,Class<K> keyType, Class<V> valueType) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean isEmpty( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean containsKey(Object key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public boolean containsValue(Object v) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public V get(Object key) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public V remove(Object key) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public void clear( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public Set<K> keySet( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public Collection<V> values( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public V put(K key, V value) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public void putAll(Map<? extends K, ? extends V> t) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
    public Set<Map. Entry<K, V>> entrySet( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public void forEach(BiConsumer<? super K, ? super V> action) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public V putIfAbsent(K key, V value) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public boolean remove(Object key, Object value) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public boolean replace(K key,V oldValue, V newValue) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public V replace(K key, V value) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                      }
    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
    public V merge(K key,V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
    static class CheckedEntrySet<K,V> implements Set<Map. Entry<K, V>> {
      CheckedEntrySet(Set<Map. Entry<K, V>> s, Class<V> valueType) {
        throw new java . lang . RuntimeException ("Implementation stripped");
      }
      public int size( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
      public boolean isEmpty( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
      public String toString( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
      public int hashCode( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
      public void clear( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
      public boolean add(Map. Entry<K, V> e) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
      public boolean addAll(Collection<? extends Map. Entry<K, V>> coll) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
      public Iterator<Map. Entry<K, V>> iterator( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
      public Object [] toArray( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
      public <T> T [] toArray(T [] a) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
      public boolean contains(Object o) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
      public boolean containsAll(Collection<?> c) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
      public boolean remove(Object o) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
      public boolean removeAll(Collection<?> c) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
      public boolean retainAll(Collection<?> c) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
      public boolean equals(Object o) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
      static <K,V,T> CheckedEntry<K, V, T> checkedEntry(Map. Entry<K, V> e, Class<T> valueType) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
      private static class CheckedEntry<K,V,T> implements Map. Entry<K, V> {
        CheckedEntry(Map. Entry<K, V> e, Class<T> valueType) {
          throw new java . lang . RuntimeException ("Implementation stripped");
        }
        public K getKey( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
        public V getValue( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
        public int hashCode( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
        public String toString( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
        public V setValue(V value) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
        public boolean equals(Object o) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
      }
    }
  }
  public static <K,V> SortedMap<K, V> checkedSortedMap(SortedMap<K, V> m,Class<K> keyType, Class<V> valueType) {
                                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                               }
  static class CheckedSortedMap<K,V> extends CheckedMap<K, V> implements SortedMap<K, V>, Serializable {
    CheckedSortedMap(SortedMap<K, V> m,Class<K> keyType, Class<V> valueType) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Comparator<? super K> comparator( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public K firstKey( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public K lastKey( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public SortedMap<K, V> subMap(K fromKey, K toKey) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public SortedMap<K, V> headMap(K toKey) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public SortedMap<K, V> tailMap(K fromKey) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  }
  public static <K,V> NavigableMap<K, V> checkedNavigableMap(NavigableMap<K, V> m,Class<K> keyType, Class<V> valueType) {
                                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                        }
  static class CheckedNavigableMap<K,V> extends CheckedSortedMap<K, V> implements NavigableMap<K, V>, Serializable {
    CheckedNavigableMap(NavigableMap<K, V> m,Class<K> keyType, Class<V> valueType) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Comparator<? super K> comparator( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public K firstKey( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public K lastKey( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public Entry<K, V> lowerEntry(K key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public K lowerKey(K key) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public Entry<K, V> floorEntry(K key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public K floorKey(K key) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public Entry<K, V> ceilingEntry(K key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public K ceilingKey(K key) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public Entry<K, V> higherEntry(K key) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public K higherKey(K key) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public Entry<K, V> firstEntry( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public Entry<K, V> lastEntry( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public Entry<K, V> pollFirstEntry( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public Entry<K, V> pollLastEntry( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public NavigableMap<K, V> descendingMap( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public NavigableSet<K> keySet( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public NavigableSet<K> navigableKeySet( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public NavigableSet<K> descendingKeySet( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public NavigableMap<K, V> subMap(K fromKey, K toKey) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public NavigableMap<K, V> headMap(K toKey) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public NavigableMap<K, V> tailMap(K fromKey) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    public NavigableMap<K, V> subMap(K fromKey,boolean fromInclusive,K toKey, boolean toInclusive) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
    public NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  }
  public static <T> Iterator<T> emptyIterator( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  private static class EmptyIterator<E> implements Iterator<E> {
    static final EmptyIterator<Object> EMPTY_ITERATOR;
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
  }
  public static <T> ListIterator<T> emptyListIterator( ) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  private static class EmptyListIterator<E> extends EmptyIterator<E> implements ListIterator<E> {
    static final EmptyListIterator<Object> EMPTY_ITERATOR;
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
  public static <T> Enumeration<T> emptyEnumeration( ) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private static class EmptyEnumeration<E> implements Enumeration<E> {
    static final EmptyEnumeration<Object> EMPTY_ENUMERATION;
    public boolean hasMoreElements( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public E nextElement( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  }
  public static final Set EMPTY_SET;
  public static final <T> Set<T> emptySet( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private static class EmptySet<E> extends AbstractSet<E> implements Serializable {
    public Iterator<E> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean isEmpty( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean contains(Object obj) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public boolean containsAll(Collection<?> c) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    public Object [] toArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public <T> T [] toArray(T [] a) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public void forEach(Consumer<? super E> action) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public boolean removeIf(Predicate<? super E> filter) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  public static <E> SortedSet<E> emptySortedSet( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public static <E> NavigableSet<E> emptyNavigableSet( ) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public static final List EMPTY_LIST;
  public static final <T> List<T> emptyList( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private static class EmptyList<E> extends AbstractList<E> implements RandomAccess, Serializable {
    public Iterator<E> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public ListIterator<E> listIterator( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean isEmpty( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean contains(Object obj) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public boolean containsAll(Collection<?> c) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    public Object [] toArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public <T> T [] toArray(T [] a) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public E get(int index) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
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
    public void forEach(Consumer<? super E> action) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  public static final Map EMPTY_MAP;
  public static final <K,V> Map<K, V> emptyMap( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public static final <K,V> SortedMap<K, V> emptySortedMap( ) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public static final <K,V> NavigableMap<K, V> emptyNavigableMap( ) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private static class EmptyMap<K,V> extends AbstractMap<K, V> implements Serializable {
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean isEmpty( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean containsKey(Object key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public boolean containsValue(Object value) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public V get(Object key) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public Set<K> keySet( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public Collection<V> values( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public Set<Map. Entry<K, V>> entrySet( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public V getOrDefault(Object k, V defaultValue) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public void forEach(BiConsumer<? super K, ? super V> action) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public V putIfAbsent(K key, V value) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public boolean remove(Object key, Object value) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public boolean replace(K key,V oldValue, V newValue) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public V replace(K key, V value) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                      }
    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
    public V merge(K key,V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
  }
  public static <T> Set<T> singleton(T o) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  static <E> Iterator<E> singletonIterator(final E e) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  static <T> Spliterator<T> singletonSpliterator(final T element) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  private static class SingletonSet<E> extends AbstractSet<E> implements Serializable {
    SingletonSet(E e) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Iterator<E> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean contains(Object o) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public void forEach(Consumer<? super E> action) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public boolean removeIf(Predicate<? super E> filter) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  }
  public static <T> List<T> singletonList(T o) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private static class SingletonList<E> extends AbstractList<E> implements RandomAccess, Serializable {
    SingletonList(E obj) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Iterator<E> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean contains(Object obj) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public E get(int index) {
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
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  public static <K,V> Map<K, V> singletonMap(K key, V value) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private static class SingletonMap<K,V> extends AbstractMap<K, V> implements Serializable {
    SingletonMap(K key, V value) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean isEmpty( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public boolean containsKey(Object key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public boolean containsValue(Object value) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public V get(Object key) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public Set<K> keySet( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public Set<Map. Entry<K, V>> entrySet( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public Collection<V> values( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public V getOrDefault(Object key, V defaultValue) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public void forEach(BiConsumer<? super K, ? super V> action) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public V putIfAbsent(K key, V value) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public boolean remove(Object key, Object value) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public boolean replace(K key,V oldValue, V newValue) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public V replace(K key, V value) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                      }
    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
    public V merge(K key,V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
  }
  public static <T> List<T> nCopies(int n, T o) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  private static class CopiesList<E> extends AbstractList<E> implements RandomAccess, Serializable {
    final int n;
    final E element;
    CopiesList(int n, E e) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean contains(Object obj) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public int indexOf(Object o) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public int lastIndexOf(Object o) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public E get(int index) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public Object [] toArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public <T> T [] toArray(T [] a) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public List<E> subList(int fromIndex, int toIndex) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public Stream<E> stream( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public Stream<E> parallelStream( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  public static <T> Comparator<T> reverseOrder( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  private static class ReverseComparator implements Comparator<Comparable<Object>>, Serializable {
    static final ReverseComparator REVERSE_ORDER;
    public int compare(Comparable<Object> c1, Comparable<Object> c2) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
    public Comparator<Comparable<Object>> reversed( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  }
  public static <T> Comparator<T> reverseOrder(Comparator<T> cmp) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  private static class ReverseComparator2<T> implements Comparator<T>, Serializable {
    final Comparator<T> cmp;
    ReverseComparator2(Comparator<T> cmp) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int compare(T t1, T t2) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public Comparator<T> reversed( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  }
  public static <T> Enumeration<T> enumeration(final Collection<T> c) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public static <T> ArrayList<T> list(Enumeration<T> e) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  static boolean eq(Object o1, Object o2) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public static int frequency(Collection<?> c, Object o) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public static boolean disjoint(Collection<?> c1, Collection<?> c2) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  public static <T> boolean addAll(Collection<? super T> c, T ... elements) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  private static class SetFromMap<E> extends AbstractSet<E> implements Set<E>, Serializable {
    SetFromMap(Map<E, Boolean> map) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void clear( ) {
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
    public boolean remove(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public boolean add(E e) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public Iterator<E> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public Object [] toArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public <T> T [] toArray(T [] a) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object o) {
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
    public void forEach(Consumer<? super E> action) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public boolean removeIf(Predicate<? super E> filter) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public Stream<E> stream( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public Stream<E> parallelStream( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  }
  public static <T> Queue<T> asLifoQueue(Deque<T> deque) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  static class AsLIFOQueue<E> extends AbstractQueue<E> implements Queue<E>, Serializable {
    AsLIFOQueue(Deque<E> q) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean add(E e) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public boolean offer(E e) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public E poll( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
    public E remove( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public E peek( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
    public E element( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public void clear( ) {
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
    public boolean remove(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public Iterator<E> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public Object [] toArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public <T> T [] toArray(T [] a) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public String toString( ) {
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
    public void forEach(Consumer<? super E> action) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public boolean removeIf(Predicate<? super E> filter) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public Stream<E> stream( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public Stream<E> parallelStream( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  }
}