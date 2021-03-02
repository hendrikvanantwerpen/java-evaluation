package java.util.concurrent;

import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public class ConcurrentHashMap<K,V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
  private static final long serialVersionUID;
  private static final int MAXIMUM_CAPACITY;
  private static final int DEFAULT_CAPACITY;
  static final int MAX_ARRAY_SIZE;
  private static final int DEFAULT_CONCURRENCY_LEVEL;
  private static final float LOAD_FACTOR;
  static final int TREEIFY_THRESHOLD;
  static final int UNTREEIFY_THRESHOLD;
  static final int MIN_TREEIFY_CAPACITY;
  private static final int MIN_TRANSFER_STRIDE;
  private static int RESIZE_STAMP_BITS;
  private static final int MAX_RESIZERS;
  private static final int RESIZE_STAMP_SHIFT;
  static final int MOVED;
  static final int TREEBIN;
  static final int RESERVED;
  static final int HASH_BITS;
  static final int NCPU;
  private static final ObjectStreamField [] serialPersistentFields;
  static class Node<K,V> implements Map. Entry<K, V> {
    final int hash;
    final K key;
    volatile V val;
    volatile Node<K, V> next;
    Node(int hash,K key,V val, Node<K, V> next) {
    }
    public final K getKey( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public final V getValue( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public final int hashCode( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public final String toString( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public final V setValue(V value) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public final boolean equals(Object o) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    Node<K, V> find(int h, Object k) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  }
  static final int spread(int h) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  private static final int tableSizeFor(int c) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static Class<?> comparableClassFor(Object x) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static int compareComparables(Class<?> kc,Object k, Object x) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  static final <K,V> Node<K, V> tabAt(Node<K, V> [] tab, int i) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  static final <K,V> boolean casTabAt(Node<K, V> [] tab,int i,Node<K, V> c, Node<K, V> v) {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  static final <K,V> void setTabAt(Node<K, V> [] tab,int i, Node<K, V> v) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  transient volatile Node<K, V> [] table;
  private transient volatile Node<K, V> [] nextTable;
  private transient volatile long baseCount;
  private transient volatile int sizeCtl;
  private transient volatile int transferIndex;
  private transient volatile int cellsBusy;
  private transient volatile CounterCell [] counterCells;
  private transient KeySetView<K, V> keySet;
  private transient ValuesView<K, V> values;
  private transient EntrySetView<K, V> entrySet;
  public ConcurrentHashMap( ) {
  }
  public ConcurrentHashMap(int initialCapacity) {
  }
  public ConcurrentHashMap(Map<? extends K, ? extends V> m) {
  }
  public ConcurrentHashMap(int initialCapacity, float loadFactor) {
    this(initialCapacity, loadFactor, 1);
  }
  public ConcurrentHashMap(int initialCapacity,float loadFactor, int concurrencyLevel) {
  }
  public int size( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  public boolean isEmpty( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public V get(Object key) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public boolean containsKey(Object key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public boolean containsValue(Object value) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public V put(K key, V value) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  final V putVal(K key,V value, boolean onlyIfAbsent) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public void putAll(Map<? extends K, ? extends V> m) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public V remove(Object key) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  final V replaceNode(Object key,V value, Object cv) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public KeySetView<K, V> keySet( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public Collection<V> values( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public Set<Map. Entry<K, V>> entrySet( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean equals(Object o) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  static class Segment<K,V> extends ReentrantLock implements Serializable {
    private static final long serialVersionUID;
    final float loadFactor;
    Segment(float lf) {
    }
  }
  private void writeObject(java. io. ObjectOutputStream s) throws java. io. IOException {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  private void readObject(java. io. ObjectInputStream s) throws java. io. IOException, ClassNotFoundException {
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
  public V getOrDefault(Object key, V defaultValue) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public void forEach(BiConsumer<? super K, ? super V> action) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
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
  public boolean contains(Object value) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public Enumeration<K> keys( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public Enumeration<V> elements( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public long mappingCount( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public static <K> KeySetView<K, Boolean> newKeySet( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public static <K> KeySetView<K, Boolean> newKeySet(int initialCapacity) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public KeySetView<K, V> keySet(V mappedValue) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  static final class ForwardingNode<K,V> extends Node<K, V> {
    final Node<K, V> [] nextTable;
    ForwardingNode(Node<K, V> [] tab) {
      super(MOVED, null, null, null);
    }
    Node<K, V> find(int h, Object k) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  }
  static final class ReservationNode<K,V> extends Node<K, V> {
    ReservationNode( ) {
      super(RESERVED, null, null, null);
    }
    Node<K, V> find(int h, Object k) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  }
  static final int resizeStamp(int n) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  private final Node<K, V> [] initTable( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private final void addCount(long x, int check) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  final Node<K, V> [] helpTransfer(Node<K, V> [] tab, Node<K, V> f) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private final void tryPresize(int size) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private final void transfer(Node<K, V> [] tab, Node<K, V> [] nextTab) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  static final class CounterCell {
    volatile long value;
    CounterCell(long x) {
    }
  }
  final long sumCount( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  private final void fullAddCount(long x, boolean wasUncontended) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  private final void treeifyBin(Node<K, V> [] tab, int index) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  static <K,V> Node<K, V> untreeify(Node<K, V> b) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  static final class TreeNode<K,V> extends Node<K, V> {
    TreeNode<K, V> parent;
    TreeNode<K, V> left;
    TreeNode<K, V> right;
    TreeNode<K, V> prev;
    boolean red;
    TreeNode(int hash,K key,V val,Node<K, V> next, TreeNode<K, V> parent) {
      super(hash, key, val, next);
    }
    Node<K, V> find(int h, Object k) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    final TreeNode<K, V> findTreeNode(int h,Object k, Class<?> kc) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  }
  static final class TreeBin<K,V> extends Node<K, V> {
    TreeNode<K, V> root;
    volatile TreeNode<K, V> first;
    volatile Thread waiter;
    volatile int lockState;
    static final int WRITER;
    static final int WAITER;
    static final int READER;
    static int tieBreakOrder(Object a, Object b) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    TreeBin(TreeNode<K, V> b) {
      super(TREEBIN, null, null, null);
    }
    private final void lockRoot( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    private final void unlockRoot( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    private final void contendedLock( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    final Node<K, V> find(int h, Object k) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    final TreeNode<K, V> putTreeVal(int h,K k, V v) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    final boolean removeTreeNode(TreeNode<K, V> p) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    static <K,V> TreeNode<K, V> rotateLeft(TreeNode<K, V> root, TreeNode<K, V> p) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
    static <K,V> TreeNode<K, V> rotateRight(TreeNode<K, V> root, TreeNode<K, V> p) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    static <K,V> TreeNode<K, V> balanceInsertion(TreeNode<K, V> root, TreeNode<K, V> x) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
    static <K,V> TreeNode<K, V> balanceDeletion(TreeNode<K, V> root, TreeNode<K, V> x) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
    static <K,V> boolean checkInvariants(TreeNode<K, V> t) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    private static final sun. misc. Unsafe U;
    private static final long LOCKSTATE;
    static {
             throw new java . lang . RuntimeException ("Implementation stripped");
           }
  }
  static final class TableStack<K,V> {
    int length;
    int index;
    Node<K, V> [] tab;
    TableStack<K, V> next;
  }
  static class Traverser<K,V> {
    Node<K, V> [] tab;
    Node<K, V> next;
    TableStack<K, V> stack, spare;
    int index;
    int baseIndex;
    int baseLimit;
    final int baseSize;
    Traverser(Node<K, V> [] tab,int size,int index, int limit) {
    }
    final Node<K, V> advance( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    private void pushState(Node<K, V> [] t,int i, int n) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    private void recoverState(int n) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  }
  static class BaseIterator<K,V> extends Traverser<K, V> {
    final ConcurrentHashMap<K, V> map;
    Node<K, V> lastReturned;
    BaseIterator(Node<K, V> [] tab,int size,int index,int limit, ConcurrentHashMap<K, V> map) {
      super(tab, size, index, limit);
    }
    public final boolean hasNext( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public final boolean hasMoreElements( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public final void remove( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  }
  static final class KeyIterator<K,V> extends BaseIterator<K, V> implements Iterator<K>, Enumeration<K> {
    KeyIterator(Node<K, V> [] tab,int index,int size,int limit, ConcurrentHashMap<K, V> map) {
      super(tab, index, size, limit, map);
    }
    public final K next( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public final K nextElement( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class ValueIterator<K,V> extends BaseIterator<K, V> implements Iterator<V>, Enumeration<V> {
    ValueIterator(Node<K, V> [] tab,int index,int size,int limit, ConcurrentHashMap<K, V> map) {
      super(tab, index, size, limit, map);
    }
    public final V next( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public final V nextElement( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class EntryIterator<K,V> extends BaseIterator<K, V> implements Iterator<Map. Entry<K, V>> {
    EntryIterator(Node<K, V> [] tab,int index,int size,int limit, ConcurrentHashMap<K, V> map) {
      super(tab, index, size, limit, map);
    }
    public final Map. Entry<K, V> next( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  }
  static final class MapEntry<K,V> implements Map. Entry<K, V> {
    final K key;
    V val;
    final ConcurrentHashMap<K, V> map;
    MapEntry(K key,V val, ConcurrentHashMap<K, V> map) {
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
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public V setValue(V value) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  }
  static final class KeySpliterator<K,V> extends Traverser<K, V> implements Spliterator<K> {
    long est;
    KeySpliterator(Node<K, V> [] tab,int size,int index,int limit, long est) {
      super(tab, size, index, limit);
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
  static final class ValueSpliterator<K,V> extends Traverser<K, V> implements Spliterator<V> {
    long est;
    ValueSpliterator(Node<K, V> [] tab,int size,int index,int limit, long est) {
      super(tab, size, index, limit);
    }
    public Spliterator<V> trySplit( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public void forEachRemaining(Consumer<? super V> action) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
    public boolean tryAdvance(Consumer<? super V> action) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
    public long estimateSize( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public int characteristics( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class EntrySpliterator<K,V> extends Traverser<K, V> implements Spliterator<Map. Entry<K, V>> {
    final ConcurrentHashMap<K, V> map;
    long est;
    EntrySpliterator(Node<K, V> [] tab,int size,int index,int limit,long est, ConcurrentHashMap<K, V> map) {
      super(tab, size, index, limit);
    }
    public Spliterator<Map. Entry<K, V>> trySplit( ) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    public void forEachRemaining(Consumer<? super Map. Entry<K, V>> action) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
    public boolean tryAdvance(Consumer<? super Map. Entry<K, V>> action) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
    public long estimateSize( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public int characteristics( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  final int batchFor(long b) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public void forEach(long parallelismThreshold, BiConsumer<? super K, ? super V> action) {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  public <U> void forEach(long parallelismThreshold,BiFunction<? super K, ? super V, ? extends U> transformer, Consumer<? super U> action) {
                                                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                           }
  public <U> U search(long parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> searchFunction) {
                                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                               }
  public <U> U reduce(long parallelismThreshold,BiFunction<? super K, ? super V, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) {
                                                                                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                  }
  public double reduceToDouble(long parallelismThreshold,ToDoubleBiFunction<? super K, ? super V> transformer,double basis, DoubleBinaryOperator reducer) {
                                                                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                          }
  public long reduceToLong(long parallelismThreshold,ToLongBiFunction<? super K, ? super V> transformer,long basis, LongBinaryOperator reducer) {
                                                                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                }
  public int reduceToInt(long parallelismThreshold,ToIntBiFunction<? super K, ? super V> transformer,int basis, IntBinaryOperator reducer) {
                                                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                           }
  public void forEachKey(long parallelismThreshold, Consumer<? super K> action) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  public <U> void forEachKey(long parallelismThreshold,Function<? super K, ? extends U> transformer, Consumer<? super U> action) {
                                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                 }
  public <U> U searchKeys(long parallelismThreshold, Function<? super K, ? extends U> searchFunction) {
                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                      }
  public K reduceKeys(long parallelismThreshold, BiFunction<? super K, ? super K, ? extends K> reducer) {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
  public <U> U reduceKeys(long parallelismThreshold,Function<? super K, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) {
                                                                                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                         }
  public double reduceKeysToDouble(long parallelismThreshold,ToDoubleFunction<? super K> transformer,double basis, DoubleBinaryOperator reducer) {
                                                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                 }
  public long reduceKeysToLong(long parallelismThreshold,ToLongFunction<? super K> transformer,long basis, LongBinaryOperator reducer) {
                                                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                       }
  public int reduceKeysToInt(long parallelismThreshold,ToIntFunction<? super K> transformer,int basis, IntBinaryOperator reducer) {
                                                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                  }
  public void forEachValue(long parallelismThreshold, Consumer<? super V> action) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  public <U> void forEachValue(long parallelismThreshold,Function<? super V, ? extends U> transformer, Consumer<? super U> action) {
                                                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                   }
  public <U> U searchValues(long parallelismThreshold, Function<? super V, ? extends U> searchFunction) {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
  public V reduceValues(long parallelismThreshold, BiFunction<? super V, ? super V, ? extends V> reducer) {
                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                          }
  public <U> U reduceValues(long parallelismThreshold,Function<? super V, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) {
                                                                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                           }
  public double reduceValuesToDouble(long parallelismThreshold,ToDoubleFunction<? super V> transformer,double basis, DoubleBinaryOperator reducer) {
                                                                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                   }
  public long reduceValuesToLong(long parallelismThreshold,ToLongFunction<? super V> transformer,long basis, LongBinaryOperator reducer) {
                                                                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                         }
  public int reduceValuesToInt(long parallelismThreshold,ToIntFunction<? super V> transformer,int basis, IntBinaryOperator reducer) {
                                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                    }
  public void forEachEntry(long parallelismThreshold, Consumer<? super Map. Entry<K, V>> action) {
                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                 }
  public <U> void forEachEntry(long parallelismThreshold,Function<Map. Entry<K, V>, ? extends U> transformer, Consumer<? super U> action) {
                                                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                          }
  public <U> U searchEntries(long parallelismThreshold, Function<Map. Entry<K, V>, ? extends U> searchFunction) {
                                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                }
  public Map. Entry<K, V> reduceEntries(long parallelismThreshold, BiFunction<Map. Entry<K, V>, Map. Entry<K, V>, ? extends Map. Entry<K, V>> reducer) {
                                                                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                       }
  public <U> U reduceEntries(long parallelismThreshold,Function<Map. Entry<K, V>, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) {
                                                                                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                   }
  public double reduceEntriesToDouble(long parallelismThreshold,ToDoubleFunction<Map. Entry<K, V>> transformer,double basis, DoubleBinaryOperator reducer) {
                                                                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                           }
  public long reduceEntriesToLong(long parallelismThreshold,ToLongFunction<Map. Entry<K, V>> transformer,long basis, LongBinaryOperator reducer) {
                                                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                 }
  public int reduceEntriesToInt(long parallelismThreshold,ToIntFunction<Map. Entry<K, V>> transformer,int basis, IntBinaryOperator reducer) {
                                                                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                            }
  abstract static class CollectionView<K,V,E> implements Collection<E>, java. io. Serializable {
    private static final long serialVersionUID;
    final ConcurrentHashMap<K, V> map;
    CollectionView(ConcurrentHashMap<K, V> map) {
    }
    public ConcurrentHashMap<K, V> getMap( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
    public final void clear( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public final int size( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public final boolean isEmpty( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public abstract Iterator<E> iterator( ) ;
    public abstract boolean contains(Object o) ;
    public abstract boolean remove(Object o) ;
    private static final String oomeMsg;
    public final Object [] toArray( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public final <T> T [] toArray(T [] a) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public final String toString( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public final boolean containsAll(Collection<?> c) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    public final boolean removeAll(Collection<?> c) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    public final boolean retainAll(Collection<?> c) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  }
  public static class KeySetView<K,V> extends CollectionView<K, V, K> implements Set<K>, java. io. Serializable {
    private static final long serialVersionUID;
    private final V value;
    KeySetView(ConcurrentHashMap<K, V> map, V value) {
      super(map);
    }
    public V getMappedValue( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public boolean contains(Object o) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public boolean remove(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public Iterator<K> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public boolean add(K e) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public boolean addAll(Collection<? extends K> c) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public Spliterator<K> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public void forEach(Consumer<? super K> action) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  }
  static final class ValuesView<K,V> extends CollectionView<K, V, V> implements Collection<V>, java. io. Serializable {
    private static final long serialVersionUID;
    ValuesView(ConcurrentHashMap<K, V> map) {
      super(map);
    }
    public final boolean contains(Object o) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public final boolean remove(Object o) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public final Iterator<V> iterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public final boolean add(V e) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    public final boolean addAll(Collection<? extends V> c) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    public Spliterator<V> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public void forEach(Consumer<? super V> action) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  }
  static final class EntrySetView<K,V> extends CollectionView<K, V, Map. Entry<K, V>> implements Set<Map. Entry<K, V>>, java. io. Serializable {
    private static final long serialVersionUID;
    EntrySetView(ConcurrentHashMap<K, V> map) {
      super(map);
    }
    public boolean contains(Object o) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public boolean remove(Object o) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public Iterator<Map. Entry<K, V>> iterator( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    public boolean add(Entry<K, V> e) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public boolean addAll(Collection<? extends Entry<K, V>> c) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
    public final int hashCode( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public final boolean equals(Object o) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public Spliterator<Map. Entry<K, V>> spliterator( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
    public void forEach(Consumer<? super Map. Entry<K, V>> action) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  }
  abstract static class BulkTask<K,V,R> extends CountedCompleter<R> {
    Node<K, V> [] tab;
    Node<K, V> next;
    TableStack<K, V> stack, spare;
    int index;
    int baseIndex;
    int baseLimit;
    final int baseSize;
    int batch;
    BulkTask(BulkTask<K, V, ?> par,int b,int i,int f, Node<K, V> [] t) {
      super(par);
    }
    final Node<K, V> advance( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    private void pushState(Node<K, V> [] t,int i, int n) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    private void recoverState(int n) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  }
  static final class ForEachKeyTask<K,V> extends BulkTask<K, V, Void> {
    final Consumer<? super K> action;
    ForEachKeyTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t, Consumer<? super K> action) {
      super(p, b, i, f, t);
    }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class ForEachValueTask<K,V> extends BulkTask<K, V, Void> {
    final Consumer<? super V> action;
    ForEachValueTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t, Consumer<? super V> action) {
      super(p, b, i, f, t);
    }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class ForEachEntryTask<K,V> extends BulkTask<K, V, Void> {
    final Consumer<? super Entry<K, V>> action;
    ForEachEntryTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t, Consumer<? super Entry<K, V>> action) {
      super(p, b, i, f, t);
    }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class ForEachMappingTask<K,V> extends BulkTask<K, V, Void> {
    final BiConsumer<? super K, ? super V> action;
    ForEachMappingTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t, BiConsumer<? super K, ? super V> action) {
      super(p, b, i, f, t);
    }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class ForEachTransformedKeyTask<K,V,U> extends BulkTask<K, V, Void> {
    final Function<? super K, ? extends U> transformer;
    final Consumer<? super U> action;
    ForEachTransformedKeyTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,Function<? super K, ? extends U> transformer, Consumer<? super U> action) {
      super(p, b, i, f, t);
    }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class ForEachTransformedValueTask<K,V,U> extends BulkTask<K, V, Void> {
    final Function<? super V, ? extends U> transformer;
    final Consumer<? super U> action;
    ForEachTransformedValueTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,Function<? super V, ? extends U> transformer, Consumer<? super U> action) {
      super(p, b, i, f, t);
    }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class ForEachTransformedEntryTask<K,V,U> extends BulkTask<K, V, Void> {
    final Function<Map. Entry<K, V>, ? extends U> transformer;
    final Consumer<? super U> action;
    ForEachTransformedEntryTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,Function<Map. Entry<K, V>, ? extends U> transformer, Consumer<? super U> action) {
      super(p, b, i, f, t);
    }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class ForEachTransformedMappingTask<K,V,U> extends BulkTask<K, V, Void> {
    final BiFunction<? super K, ? super V, ? extends U> transformer;
    final Consumer<? super U> action;
    ForEachTransformedMappingTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,BiFunction<? super K, ? super V, ? extends U> transformer, Consumer<? super U> action) {
      super(p, b, i, f, t);
    }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class SearchKeysTask<K,V,U> extends BulkTask<K, V, U> {
    final Function<? super K, ? extends U> searchFunction;
    final AtomicReference<U> result;
    SearchKeysTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,Function<? super K, ? extends U> searchFunction, AtomicReference<U> result) {
      super(p, b, i, f, t);
    }
    public final U getRawResult( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class SearchValuesTask<K,V,U> extends BulkTask<K, V, U> {
    final Function<? super V, ? extends U> searchFunction;
    final AtomicReference<U> result;
    SearchValuesTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,Function<? super V, ? extends U> searchFunction, AtomicReference<U> result) {
      super(p, b, i, f, t);
    }
    public final U getRawResult( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class SearchEntriesTask<K,V,U> extends BulkTask<K, V, U> {
    final Function<Entry<K, V>, ? extends U> searchFunction;
    final AtomicReference<U> result;
    SearchEntriesTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,Function<Entry<K, V>, ? extends U> searchFunction, AtomicReference<U> result) {
      super(p, b, i, f, t);
    }
    public final U getRawResult( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class SearchMappingsTask<K,V,U> extends BulkTask<K, V, U> {
    final BiFunction<? super K, ? super V, ? extends U> searchFunction;
    final AtomicReference<U> result;
    SearchMappingsTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,BiFunction<? super K, ? super V, ? extends U> searchFunction, AtomicReference<U> result) {
      super(p, b, i, f, t);
    }
    public final U getRawResult( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class ReduceKeysTask<K,V> extends BulkTask<K, V, K> {
    final BiFunction<? super K, ? super K, ? extends K> reducer;
    K result;
    ReduceKeysTask<K, V> rights, nextRight;
    ReduceKeysTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,ReduceKeysTask<K, V> nextRight, BiFunction<? super K, ? super K, ? extends K> reducer) {
      super(p, b, i, f, t);
    }
    public final K getRawResult( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class ReduceValuesTask<K,V> extends BulkTask<K, V, V> {
    final BiFunction<? super V, ? super V, ? extends V> reducer;
    V result;
    ReduceValuesTask<K, V> rights, nextRight;
    ReduceValuesTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,ReduceValuesTask<K, V> nextRight, BiFunction<? super V, ? super V, ? extends V> reducer) {
      super(p, b, i, f, t);
    }
    public final V getRawResult( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class ReduceEntriesTask<K,V> extends BulkTask<K, V, Map. Entry<K, V>> {
    final BiFunction<Map. Entry<K, V>, Map. Entry<K, V>, ? extends Map. Entry<K, V>> reducer;
    Map. Entry<K, V> result;
    ReduceEntriesTask<K, V> rights, nextRight;
    ReduceEntriesTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,ReduceEntriesTask<K, V> nextRight, BiFunction<Entry<K, V>, Map. Entry<K, V>, ? extends Map. Entry<K, V>> reducer) {
      super(p, b, i, f, t);
    }
    public final Map. Entry<K, V> getRawResult( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceKeysTask<K,V,U> extends BulkTask<K, V, U> {
    final Function<? super K, ? extends U> transformer;
    final BiFunction<? super U, ? super U, ? extends U> reducer;
    U result;
    MapReduceKeysTask<K, V, U> rights, nextRight;
    MapReduceKeysTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceKeysTask<K, V, U> nextRight,Function<? super K, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) {
      super(p, b, i, f, t);
    }
    public final U getRawResult( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceValuesTask<K,V,U> extends BulkTask<K, V, U> {
    final Function<? super V, ? extends U> transformer;
    final BiFunction<? super U, ? super U, ? extends U> reducer;
    U result;
    MapReduceValuesTask<K, V, U> rights, nextRight;
    MapReduceValuesTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceValuesTask<K, V, U> nextRight,Function<? super V, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) {
      super(p, b, i, f, t);
    }
    public final U getRawResult( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceEntriesTask<K,V,U> extends BulkTask<K, V, U> {
    final Function<Map. Entry<K, V>, ? extends U> transformer;
    final BiFunction<? super U, ? super U, ? extends U> reducer;
    U result;
    MapReduceEntriesTask<K, V, U> rights, nextRight;
    MapReduceEntriesTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceEntriesTask<K, V, U> nextRight,Function<Map. Entry<K, V>, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) {
      super(p, b, i, f, t);
    }
    public final U getRawResult( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceMappingsTask<K,V,U> extends BulkTask<K, V, U> {
    final BiFunction<? super K, ? super V, ? extends U> transformer;
    final BiFunction<? super U, ? super U, ? extends U> reducer;
    U result;
    MapReduceMappingsTask<K, V, U> rights, nextRight;
    MapReduceMappingsTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceMappingsTask<K, V, U> nextRight,BiFunction<? super K, ? super V, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) {
      super(p, b, i, f, t);
    }
    public final U getRawResult( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceKeysToDoubleTask<K,V> extends BulkTask<K, V, Double> {
    final ToDoubleFunction<? super K> transformer;
    final DoubleBinaryOperator reducer;
    final double basis;
    double result;
    MapReduceKeysToDoubleTask<K, V> rights, nextRight;
    MapReduceKeysToDoubleTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceKeysToDoubleTask<K, V> nextRight,ToDoubleFunction<? super K> transformer,double basis, DoubleBinaryOperator reducer) {
      super(p, b, i, f, t);
    }
    public final Double getRawResult( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceValuesToDoubleTask<K,V> extends BulkTask<K, V, Double> {
    final ToDoubleFunction<? super V> transformer;
    final DoubleBinaryOperator reducer;
    final double basis;
    double result;
    MapReduceValuesToDoubleTask<K, V> rights, nextRight;
    MapReduceValuesToDoubleTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceValuesToDoubleTask<K, V> nextRight,ToDoubleFunction<? super V> transformer,double basis, DoubleBinaryOperator reducer) {
      super(p, b, i, f, t);
    }
    public final Double getRawResult( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceEntriesToDoubleTask<K,V> extends BulkTask<K, V, Double> {
    final ToDoubleFunction<Map. Entry<K, V>> transformer;
    final DoubleBinaryOperator reducer;
    final double basis;
    double result;
    MapReduceEntriesToDoubleTask<K, V> rights, nextRight;
    MapReduceEntriesToDoubleTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceEntriesToDoubleTask<K, V> nextRight,ToDoubleFunction<Map. Entry<K, V>> transformer,double basis, DoubleBinaryOperator reducer) {
      super(p, b, i, f, t);
    }
    public final Double getRawResult( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceMappingsToDoubleTask<K,V> extends BulkTask<K, V, Double> {
    final ToDoubleBiFunction<? super K, ? super V> transformer;
    final DoubleBinaryOperator reducer;
    final double basis;
    double result;
    MapReduceMappingsToDoubleTask<K, V> rights, nextRight;
    MapReduceMappingsToDoubleTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceMappingsToDoubleTask<K, V> nextRight,ToDoubleBiFunction<? super K, ? super V> transformer,double basis, DoubleBinaryOperator reducer) {
      super(p, b, i, f, t);
    }
    public final Double getRawResult( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceKeysToLongTask<K,V> extends BulkTask<K, V, Long> {
    final ToLongFunction<? super K> transformer;
    final LongBinaryOperator reducer;
    final long basis;
    long result;
    MapReduceKeysToLongTask<K, V> rights, nextRight;
    MapReduceKeysToLongTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceKeysToLongTask<K, V> nextRight,ToLongFunction<? super K> transformer,long basis, LongBinaryOperator reducer) {
      super(p, b, i, f, t);
    }
    public final Long getRawResult( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceValuesToLongTask<K,V> extends BulkTask<K, V, Long> {
    final ToLongFunction<? super V> transformer;
    final LongBinaryOperator reducer;
    final long basis;
    long result;
    MapReduceValuesToLongTask<K, V> rights, nextRight;
    MapReduceValuesToLongTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceValuesToLongTask<K, V> nextRight,ToLongFunction<? super V> transformer,long basis, LongBinaryOperator reducer) {
      super(p, b, i, f, t);
    }
    public final Long getRawResult( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceEntriesToLongTask<K,V> extends BulkTask<K, V, Long> {
    final ToLongFunction<Map. Entry<K, V>> transformer;
    final LongBinaryOperator reducer;
    final long basis;
    long result;
    MapReduceEntriesToLongTask<K, V> rights, nextRight;
    MapReduceEntriesToLongTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceEntriesToLongTask<K, V> nextRight,ToLongFunction<Map. Entry<K, V>> transformer,long basis, LongBinaryOperator reducer) {
      super(p, b, i, f, t);
    }
    public final Long getRawResult( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceMappingsToLongTask<K,V> extends BulkTask<K, V, Long> {
    final ToLongBiFunction<? super K, ? super V> transformer;
    final LongBinaryOperator reducer;
    final long basis;
    long result;
    MapReduceMappingsToLongTask<K, V> rights, nextRight;
    MapReduceMappingsToLongTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceMappingsToLongTask<K, V> nextRight,ToLongBiFunction<? super K, ? super V> transformer,long basis, LongBinaryOperator reducer) {
      super(p, b, i, f, t);
    }
    public final Long getRawResult( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceKeysToIntTask<K,V> extends BulkTask<K, V, Integer> {
    final ToIntFunction<? super K> transformer;
    final IntBinaryOperator reducer;
    final int basis;
    int result;
    MapReduceKeysToIntTask<K, V> rights, nextRight;
    MapReduceKeysToIntTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceKeysToIntTask<K, V> nextRight,ToIntFunction<? super K> transformer,int basis, IntBinaryOperator reducer) {
      super(p, b, i, f, t);
    }
    public final Integer getRawResult( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceValuesToIntTask<K,V> extends BulkTask<K, V, Integer> {
    final ToIntFunction<? super V> transformer;
    final IntBinaryOperator reducer;
    final int basis;
    int result;
    MapReduceValuesToIntTask<K, V> rights, nextRight;
    MapReduceValuesToIntTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceValuesToIntTask<K, V> nextRight,ToIntFunction<? super V> transformer,int basis, IntBinaryOperator reducer) {
      super(p, b, i, f, t);
    }
    public final Integer getRawResult( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceEntriesToIntTask<K,V> extends BulkTask<K, V, Integer> {
    final ToIntFunction<Map. Entry<K, V>> transformer;
    final IntBinaryOperator reducer;
    final int basis;
    int result;
    MapReduceEntriesToIntTask<K, V> rights, nextRight;
    MapReduceEntriesToIntTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceEntriesToIntTask<K, V> nextRight,ToIntFunction<Map. Entry<K, V>> transformer,int basis, IntBinaryOperator reducer) {
      super(p, b, i, f, t);
    }
    public final Integer getRawResult( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class MapReduceMappingsToIntTask<K,V> extends BulkTask<K, V, Integer> {
    final ToIntBiFunction<? super K, ? super V> transformer;
    final IntBinaryOperator reducer;
    final int basis;
    int result;
    MapReduceMappingsToIntTask<K, V> rights, nextRight;
    MapReduceMappingsToIntTask(BulkTask<K, V, ?> p,int b,int i,int f,Node<K, V> [] t,MapReduceMappingsToIntTask<K, V> nextRight,ToIntBiFunction<? super K, ? super V> transformer,int basis, IntBinaryOperator reducer) {
      super(p, b, i, f, t);
    }
    public final Integer getRawResult( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public final void compute( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  private static final sun. misc. Unsafe U;
  private static final long SIZECTL;
  private static final long TRANSFERINDEX;
  private static final long BASECOUNT;
  private static final long CELLSBUSY;
  private static final long CELLVALUE;
  private static final long ABASE;
  private static final int ASHIFT;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
}