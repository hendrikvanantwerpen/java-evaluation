package java.util;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class TreeMap<K,V> extends AbstractMap<K, V> implements NavigableMap<K, V>, Cloneable, java. io. Serializable {
  private final Comparator<? super K> comparator;
  private transient Entry<K, V> root;
  private transient int size;
  private transient int modCount;
  public TreeMap( ) {
  }
  public TreeMap(Comparator<? super K> comparator) {
  }
  public TreeMap(Map<? extends K, ? extends V> m) {
  }
  public TreeMap(SortedMap<K, ? extends V> m) {
  }
  public int size( ) {
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
  public Comparator<? super K> comparator( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public K firstKey( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public K lastKey( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  public void putAll(Map<? extends K, ? extends V> map) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  final Entry<K, V> getEntry(Object key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  final Entry<K, V> getEntryUsingComparator(Object key) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  final Entry<K, V> getCeilingEntry(K key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  final Entry<K, V> getFloorEntry(K key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  final Entry<K, V> getHigherEntry(K key) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  final Entry<K, V> getLowerEntry(K key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public V put(K key, V value) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public V remove(Object key) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public Object clone( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public Map. Entry<K, V> firstEntry( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public Map. Entry<K, V> lastEntry( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public Map. Entry<K, V> pollFirstEntry( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public Map. Entry<K, V> pollLastEntry( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public Map. Entry<K, V> lowerEntry(K key) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public K lowerKey(K key) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public Map. Entry<K, V> floorEntry(K key) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public K floorKey(K key) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public Map. Entry<K, V> ceilingEntry(K key) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public K ceilingKey(K key) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public Map. Entry<K, V> higherEntry(K key) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public K higherKey(K key) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private transient EntrySet entrySet;
  private transient KeySet<K> navigableKeySet;
  private transient NavigableMap<K, V> descendingMap;
  public Set<K> keySet( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public NavigableSet<K> navigableKeySet( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public NavigableSet<K> descendingKeySet( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public Collection<V> values( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public Set<Map. Entry<K, V>> entrySet( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public NavigableMap<K, V> descendingMap( ) {
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
  public SortedMap<K, V> subMap(K fromKey, K toKey) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public SortedMap<K, V> headMap(K toKey) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public SortedMap<K, V> tailMap(K fromKey) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public boolean replace(K key,V oldValue, V newValue) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public V replace(K key, V value) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public void forEach(BiConsumer<? super K, ? super V> action) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  class Values extends AbstractCollection<V> {
    public Iterator<V> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean contains(Object o) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public boolean remove(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public void clear( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public Spliterator<V> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  class EntrySet extends AbstractSet<Map. Entry<K, V>> {
    public Iterator<Map. Entry<K, V>> iterator( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    public boolean contains(Object o) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public boolean remove(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public void clear( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public Spliterator<Map. Entry<K, V>> spliterator( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  }
  Iterator<K> keyIterator( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  Iterator<K> descendingKeyIterator( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  static final class KeySet<E> extends AbstractSet<E> implements NavigableSet<E> {
    private final NavigableMap<E, ?> m;
    KeySet(NavigableMap<E, ?> map) {
    }
    public Iterator<E> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public Iterator<E> descendingIterator( ) {
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
    public void clear( ) {
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
    public E first( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
    public E last( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
    public Comparator<? super E> comparator( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public E pollFirst( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public E pollLast( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public boolean remove(Object o) {
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
    public SortedSet<E> subSet(E fromElement, E toElement) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    public SortedSet<E> headSet(E toElement) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public SortedSet<E> tailSet(E fromElement) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public NavigableSet<E> descendingSet( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public Spliterator<E> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  abstract class PrivateEntryIterator<T> implements Iterator<T> {
    Entry<K, V> next;
    Entry<K, V> lastReturned;
    int expectedModCount;
    PrivateEntryIterator(Entry<K, V> first) {
    }
    public final boolean hasNext( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    final Entry<K, V> nextEntry( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    final Entry<K, V> prevEntry( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public void remove( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  }
  final class EntryIterator extends PrivateEntryIterator<Map. Entry<K, V>> {
    EntryIterator(Entry<K, V> first) {
      super(first);
    }
    public Map. Entry<K, V> next( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  }
  final class ValueIterator extends PrivateEntryIterator<V> {
    ValueIterator(Entry<K, V> first) {
      super(first);
    }
    public V next( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  }
  final class KeyIterator extends PrivateEntryIterator<K> {
    KeyIterator(Entry<K, V> first) {
      super(first);
    }
    public K next( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  }
  final class DescendingKeyIterator extends PrivateEntryIterator<K> {
    DescendingKeyIterator(Entry<K, V> first) {
      super(first);
    }
    public K next( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
    public void remove( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  }
  final int compare(Object k1, Object k2) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  static final boolean valEquals(Object o1, Object o2) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  static <K,V> Map. Entry<K, V> exportEntry(TreeMap. Entry<K, V> e) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  static <K,V> K keyOrNull(TreeMap. Entry<K, V> e) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  static <K> K key(Entry<K, ?> e) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private static final Object UNBOUNDED;
  abstract static class NavigableSubMap<K,V> extends AbstractMap<K, V> implements NavigableMap<K, V>, java. io. Serializable {
    private static final long serialVersionUID;
    final TreeMap<K, V> m;
    final K lo, hi;
    final boolean fromStart, toEnd;
    final boolean loInclusive, hiInclusive;
    NavigableSubMap(TreeMap<K, V> m,boolean fromStart,K lo,boolean loInclusive,boolean toEnd,K hi, boolean hiInclusive) {
    }
    final boolean tooLow(Object key) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    final boolean tooHigh(Object key) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    final boolean inRange(Object key) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    final boolean inClosedRange(Object key) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    final boolean inRange(Object key, boolean inclusive) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    final TreeMap. Entry<K, V> absLowest( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    final TreeMap. Entry<K, V> absHighest( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    final TreeMap. Entry<K, V> absCeiling(K key) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    final TreeMap. Entry<K, V> absHigher(K key) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    final TreeMap. Entry<K, V> absFloor(K key) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    final TreeMap. Entry<K, V> absLower(K key) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    final TreeMap. Entry<K, V> absHighFence( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    final TreeMap. Entry<K, V> absLowFence( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    abstract TreeMap. Entry<K, V> subLowest( ) ;
    abstract TreeMap. Entry<K, V> subHighest( ) ;
    abstract TreeMap. Entry<K, V> subCeiling(K key) ;
    abstract TreeMap. Entry<K, V> subHigher(K key) ;
    abstract TreeMap. Entry<K, V> subFloor(K key) ;
    abstract TreeMap. Entry<K, V> subLower(K key) ;
    abstract Iterator<K> keyIterator( ) ;
    abstract Spliterator<K> keySpliterator( ) ;
    abstract Iterator<K> descendingKeyIterator( ) ;
    public boolean isEmpty( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public final boolean containsKey(Object key) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    public final V put(K key, V value) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    public final V get(Object key) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final V remove(Object key) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public final Map. Entry<K, V> ceilingEntry(K key) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public final K ceilingKey(K key) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public final Map. Entry<K, V> higherEntry(K key) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    public final K higherKey(K key) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public final Map. Entry<K, V> floorEntry(K key) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public final K floorKey(K key) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final Map. Entry<K, V> lowerEntry(K key) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public final K lowerKey(K key) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final K firstKey( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public final K lastKey( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public final Map. Entry<K, V> firstEntry( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    public final Map. Entry<K, V> lastEntry( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public final Map. Entry<K, V> pollFirstEntry( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public final Map. Entry<K, V> pollLastEntry( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    transient NavigableMap<K, V> descendingMapView;
    transient EntrySetView entrySetView;
    transient KeySet<K> navigableKeySetView;
    public final NavigableSet<K> navigableKeySet( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public final Set<K> keySet( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    public NavigableSet<K> descendingKeySet( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public final SortedMap<K, V> subMap(K fromKey, K toKey) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
    public final SortedMap<K, V> headMap(K toKey) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    public final SortedMap<K, V> tailMap(K fromKey) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    abstract class EntrySetView extends AbstractSet<Map. Entry<K, V>> {
      private transient int size, sizeModCount;
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
    }
    abstract class SubMapIterator<T> implements Iterator<T> {
      TreeMap. Entry<K, V> lastReturned;
      TreeMap. Entry<K, V> next;
      final Object fenceKey;
      int expectedModCount;
      SubMapIterator(TreeMap. Entry<K, V> first, TreeMap. Entry<K, V> fence) {
      }
      public final boolean hasNext( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
      final TreeMap. Entry<K, V> nextEntry( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
      final TreeMap. Entry<K, V> prevEntry( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
      final void removeAscending( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
      final void removeDescending( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    }
    final class SubMapEntryIterator extends SubMapIterator<Map. Entry<K, V>> {
      SubMapEntryIterator(TreeMap. Entry<K, V> first, TreeMap. Entry<K, V> fence) {
        super(first, fence);
      }
      public Map. Entry<K, V> next( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
      public void remove( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    }
    final class DescendingSubMapEntryIterator extends SubMapIterator<Map. Entry<K, V>> {
      DescendingSubMapEntryIterator(TreeMap. Entry<K, V> last, TreeMap. Entry<K, V> fence) {
        super(last, fence);
      }
      public Map. Entry<K, V> next( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
      public void remove( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    }
    final class SubMapKeyIterator extends SubMapIterator<K> implements Spliterator<K> {
      SubMapKeyIterator(TreeMap. Entry<K, V> first, TreeMap. Entry<K, V> fence) {
        super(first, fence);
      }
      public K next( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
      public void remove( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
      public Spliterator<K> trySplit( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
      public void forEachRemaining(Consumer<? super K> action) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
      public boolean tryAdvance(Consumer<? super K> action) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
      public long estimateSize( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
      public int characteristics( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
      public final Comparator<? super K> getComparator( ) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
    }
    final class DescendingSubMapKeyIterator extends SubMapIterator<K> implements Spliterator<K> {
      DescendingSubMapKeyIterator(TreeMap. Entry<K, V> last, TreeMap. Entry<K, V> fence) {
        super(last, fence);
      }
      public K next( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
      public void remove( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
      public Spliterator<K> trySplit( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
      public void forEachRemaining(Consumer<? super K> action) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
      public boolean tryAdvance(Consumer<? super K> action) {
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
  static final class AscendingSubMap<K,V> extends NavigableSubMap<K, V> {
    private static final long serialVersionUID;
    AscendingSubMap(TreeMap<K, V> m,boolean fromStart,K lo,boolean loInclusive,boolean toEnd,K hi, boolean hiInclusive) {
      super(m, fromStart, lo, loInclusive, toEnd, hi, hiInclusive);
    }
    public Comparator<? super K> comparator( ) {
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
    public NavigableMap<K, V> descendingMap( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    Iterator<K> keyIterator( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    Spliterator<K> keySpliterator( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    Iterator<K> descendingKeyIterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    final class AscendingEntrySetView extends EntrySetView {
      public Iterator<Map. Entry<K, V>> iterator( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    }
    public Set<Map. Entry<K, V>> entrySet( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    TreeMap. Entry<K, V> subLowest( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    TreeMap. Entry<K, V> subHighest( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    TreeMap. Entry<K, V> subCeiling(K key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    TreeMap. Entry<K, V> subHigher(K key) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    TreeMap. Entry<K, V> subFloor(K key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    TreeMap. Entry<K, V> subLower(K key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  static final class DescendingSubMap<K,V> extends NavigableSubMap<K, V> {
    private static final long serialVersionUID;
    DescendingSubMap(TreeMap<K, V> m,boolean fromStart,K lo,boolean loInclusive,boolean toEnd,K hi, boolean hiInclusive) {
      super(m, fromStart, lo, loInclusive, toEnd, hi, hiInclusive);
    }
    private final Comparator<? super K> reverseComparator;
    public Comparator<? super K> comparator( ) {
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
    public NavigableMap<K, V> descendingMap( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    Iterator<K> keyIterator( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    Spliterator<K> keySpliterator( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    Iterator<K> descendingKeyIterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    final class DescendingEntrySetView extends EntrySetView {
      public Iterator<Map. Entry<K, V>> iterator( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    }
    public Set<Map. Entry<K, V>> entrySet( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    TreeMap. Entry<K, V> subLowest( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    TreeMap. Entry<K, V> subHighest( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    TreeMap. Entry<K, V> subCeiling(K key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    TreeMap. Entry<K, V> subHigher(K key) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    TreeMap. Entry<K, V> subFloor(K key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    TreeMap. Entry<K, V> subLower(K key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  private class SubMap extends AbstractMap<K, V> implements SortedMap<K, V>, java. io. Serializable {
    private static final long serialVersionUID;
    private boolean fromStart, toEnd;
    private K fromKey, toKey;
    private Object readResolve( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    public Set<Map. Entry<K, V>> entrySet( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public K lastKey( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public K firstKey( ) {
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
    public Comparator<? super K> comparator( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  }
  private static final boolean RED;
  private static final boolean BLACK;
  static final class Entry<K,V> implements Map. Entry<K, V> {
    K key;
    V value;
    Entry<K, V> left;
    Entry<K, V> right;
    Entry<K, V> parent;
    boolean color;
    Entry(K key,V value, Entry<K, V> parent) {
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
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  final Entry<K, V> getFirstEntry( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  final Entry<K, V> getLastEntry( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  static <K,V> TreeMap. Entry<K, V> successor(Entry<K, V> t) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  static <K,V> Entry<K, V> predecessor(Entry<K, V> t) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private static <K,V> boolean colorOf(Entry<K, V> p) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private static <K,V> Entry<K, V> parentOf(Entry<K, V> p) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  private static <K,V> void setColor(Entry<K, V> p, boolean c) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  private static <K,V> Entry<K, V> leftOf(Entry<K, V> p) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  private static <K,V> Entry<K, V> rightOf(Entry<K, V> p) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  private void rotateLeft(Entry<K, V> p) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  private void rotateRight(Entry<K, V> p) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private void fixAfterInsertion(Entry<K, V> x) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  private void deleteEntry(Entry<K, V> p) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private void fixAfterDeletion(Entry<K, V> x) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private static final long serialVersionUID;
  private void writeObject(java. io. ObjectOutputStream s) throws java. io. IOException {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  private void readObject(final java. io. ObjectInputStream s) throws java. io. IOException, ClassNotFoundException {
                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                    }
  void readTreeSet(int size,java. io. ObjectInputStream s, V defaultVal) throws java. io. IOException, ClassNotFoundException {
                                                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                              }
  void addAllForTreeSet(SortedSet<? extends K> set, V defaultVal) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  private void buildFromSorted(int size,Iterator<?> it,java. io. ObjectInputStream str, V defaultVal) throws java. io. IOException, ClassNotFoundException {
                                                                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                           }
  private final Entry<K, V> buildFromSorted(int level,int lo,int hi,int redLevel,Iterator<?> it,java. io. ObjectInputStream str, V defaultVal) throws java. io. IOException, ClassNotFoundException {
                                                                                                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                                                    }
  private static int computeRedLevel(int sz) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  static <K> Spliterator<K> keySpliteratorFor(NavigableMap<K, ?> m) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  final Spliterator<K> keySpliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  final Spliterator<K> descendingKeySpliterator( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  static class TreeMapSpliterator<K,V> {
    final TreeMap<K, V> tree;
    TreeMap. Entry<K, V> current;
    TreeMap. Entry<K, V> fence;
    int side;
    int est;
    int expectedModCount;
    TreeMapSpliterator(TreeMap<K, V> tree,TreeMap. Entry<K, V> origin,TreeMap. Entry<K, V> fence,int side,int est, int expectedModCount) {
    }
    final int getEstimate( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public final long estimateSize( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  static final class KeySpliterator<K,V> extends TreeMapSpliterator<K, V> implements Spliterator<K> {
    KeySpliterator(TreeMap<K, V> tree,TreeMap. Entry<K, V> origin,TreeMap. Entry<K, V> fence,int side,int est, int expectedModCount) {
      super(tree, origin, fence, side, est, expectedModCount);
    }
    public KeySpliterator<K, V> trySplit( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public void forEachRemaining(Consumer<? super K> action) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
    public boolean tryAdvance(Consumer<? super K> action) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
    public int characteristics( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    public final Comparator<? super K> getComparator( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  }
  static final class DescendingKeySpliterator<K,V> extends TreeMapSpliterator<K, V> implements Spliterator<K> {
    DescendingKeySpliterator(TreeMap<K, V> tree,TreeMap. Entry<K, V> origin,TreeMap. Entry<K, V> fence,int side,int est, int expectedModCount) {
      super(tree, origin, fence, side, est, expectedModCount);
    }
    public DescendingKeySpliterator<K, V> trySplit( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public void forEachRemaining(Consumer<? super K> action) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
    public boolean tryAdvance(Consumer<? super K> action) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
    public int characteristics( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class ValueSpliterator<K,V> extends TreeMapSpliterator<K, V> implements Spliterator<V> {
    ValueSpliterator(TreeMap<K, V> tree,TreeMap. Entry<K, V> origin,TreeMap. Entry<K, V> fence,int side,int est, int expectedModCount) {
      super(tree, origin, fence, side, est, expectedModCount);
    }
    public ValueSpliterator<K, V> trySplit( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public void forEachRemaining(Consumer<? super V> action) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
    public boolean tryAdvance(Consumer<? super V> action) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
    public int characteristics( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class EntrySpliterator<K,V> extends TreeMapSpliterator<K, V> implements Spliterator<Map. Entry<K, V>> {
    EntrySpliterator(TreeMap<K, V> tree,TreeMap. Entry<K, V> origin,TreeMap. Entry<K, V> fence,int side,int est, int expectedModCount) {
      super(tree, origin, fence, side, est, expectedModCount);
    }
    public EntrySpliterator<K, V> trySplit( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    public void forEachRemaining(Consumer<? super Map. Entry<K, V>> action) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
    public boolean tryAdvance(Consumer<? super Map. Entry<K, V>> action) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
    public int characteristics( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    public Comparator<Map. Entry<K, V>> getComparator( ) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  }
}