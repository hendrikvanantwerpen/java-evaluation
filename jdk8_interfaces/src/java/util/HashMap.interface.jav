package java.util;

import java.io.IOException;
import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class HashMap<K,V> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, Serializable {
  static final int DEFAULT_INITIAL_CAPACITY;
  static final int MAXIMUM_CAPACITY;
  static final float DEFAULT_LOAD_FACTOR;
  static final int TREEIFY_THRESHOLD;
  static final int UNTREEIFY_THRESHOLD;
  static final int MIN_TREEIFY_CAPACITY;
  static class Node<K,V> implements Map. Entry<K, V> {
    final int hash;
    final K key;
    V value;
    Node<K, V> next;
    Node(int hash,K key,V value, Node<K, V> next) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final K getKey( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public final V getValue( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public final String toString( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public final int hashCode( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public final V setValue(V newValue) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public final boolean equals(Object o) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  }
  static final int hash(Object key) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  static Class<?> comparableClassFor(Object x) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static int compareComparables(Class<?> kc,Object k, Object x) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  static final int tableSizeFor(int cap) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  transient Node<K, V> [] table;
  transient Set<Map. Entry<K, V>> entrySet;
  transient int size;
  transient int modCount;
  int threshold;
  final float loadFactor;
  public HashMap(int initialCapacity, float loadFactor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public HashMap(int initialCapacity) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public HashMap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public HashMap(Map<? extends K, ? extends V> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final void putMapEntries(Map<? extends K, ? extends V> m, boolean evict) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
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
  final Node<K, V> getNode(int hash, Object key) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public boolean containsKey(Object key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public V put(K key, V value) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  final V putVal(int hash,K key,V value,boolean onlyIfAbsent, boolean evict) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  final Node<K, V> [] resize( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  final void treeifyBin(Node<K, V> [] tab, int hash) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public void putAll(Map<? extends K, ? extends V> m) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public V remove(Object key) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  final Node<K, V> removeNode(int hash,Object key,Object value,boolean matchValue, boolean movable) {
                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                    }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public boolean containsValue(Object value) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public Set<K> keySet( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  final class KeySet extends AbstractSet<K> {
    public final int size( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public final void clear( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public final Iterator<K> iterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public final boolean contains(Object o) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public final boolean remove(Object key) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public final Spliterator<K> spliterator( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public final void forEach(Consumer<? super K> action) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  }
  public Collection<V> values( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  final class Values extends AbstractCollection<V> {
    public final int size( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public final void clear( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public final Iterator<V> iterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public final boolean contains(Object o) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public final Spliterator<V> spliterator( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public final void forEach(Consumer<? super V> action) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  }
  public Set<Map. Entry<K, V>> entrySet( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  final class EntrySet extends AbstractSet<Map. Entry<K, V>> {
    public final int size( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public final void clear( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    public final Iterator<Map. Entry<K, V>> iterator( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
    public final boolean contains(Object o) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public final boolean remove(Object o) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public final Spliterator<Map. Entry<K, V>> spliterator( ) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
    public final void forEach(Consumer<? super Map. Entry<K, V>> action) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  }
  public V getOrDefault(Object key, V defaultValue) {
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
  public void forEach(BiConsumer<? super K, ? super V> action) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public Object clone( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  final float loadFactor( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  final int capacity( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  abstract class HashIterator {
    Node<K, V> next;
    Node<K, V> current;
    int expectedModCount;
    int index;
    HashIterator( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final boolean hasNext( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    final Node<K, V> nextNode( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public final void remove( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  }
  final class KeyIterator extends HashIterator implements Iterator<K> {
    public final K next( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  }
  final class ValueIterator extends HashIterator implements Iterator<V> {
    public final V next( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  }
  final class EntryIterator extends HashIterator implements Iterator<Map. Entry<K, V>> {
    public final Map. Entry<K, V> next( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  }
  static class HashMapSpliterator<K,V> {
    final HashMap<K, V> map;
    Node<K, V> current;
    int index;
    int fence;
    int est;
    int expectedModCount;
    HashMapSpliterator(HashMap<K, V> m,int origin,int fence,int est, int expectedModCount) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    final int getFence( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public final long estimateSize( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  static final class KeySpliterator<K,V> extends HashMapSpliterator<K, V> implements Spliterator<K> {
    KeySpliterator(HashMap<K, V> m,int origin,int fence,int est, int expectedModCount) {
      throw new java . lang . RuntimeException ("Implementation stripped");
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
  }
  static final class ValueSpliterator<K,V> extends HashMapSpliterator<K, V> implements Spliterator<V> {
    ValueSpliterator(HashMap<K, V> m,int origin,int fence,int est, int expectedModCount) {
      throw new java . lang . RuntimeException ("Implementation stripped");
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
  static final class EntrySpliterator<K,V> extends HashMapSpliterator<K, V> implements Spliterator<Map. Entry<K, V>> {
    EntrySpliterator(HashMap<K, V> m,int origin,int fence,int est, int expectedModCount) {
      throw new java . lang . RuntimeException ("Implementation stripped");
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
  }
  Node<K, V> newNode(int hash,K key,V value, Node<K, V> next) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  Node<K, V> replacementNode(Node<K, V> p, Node<K, V> next) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  TreeNode<K, V> newTreeNode(int hash,K key,V value, Node<K, V> next) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  TreeNode<K, V> replacementTreeNode(Node<K, V> p, Node<K, V> next) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  void reinitialize( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  void afterNodeAccess(Node<K, V> p) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  void afterNodeInsertion(boolean evict) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  void afterNodeRemoval(Node<K, V> p) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  void internalWriteEntries(java. io. ObjectOutputStream s) throws IOException {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  static final class TreeNode<K,V> extends LinkedHashMap. Entry<K, V> {
    TreeNode<K, V> parent;
    TreeNode<K, V> left;
    TreeNode<K, V> right;
    TreeNode<K, V> prev;
    boolean red;
    TreeNode(int hash,K key,V val, Node<K, V> next) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    final TreeNode<K, V> root( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    static <K,V> void moveRootToFront(Node<K, V> [] tab, TreeNode<K, V> root) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
    final TreeNode<K, V> find(int h,Object k, Class<?> kc) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    final TreeNode<K, V> getTreeNode(int h, Object k) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    static int tieBreakOrder(Object a, Object b) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    final void treeify(Node<K, V> [] tab) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    final Node<K, V> untreeify(HashMap<K, V> map) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    final TreeNode<K, V> putTreeVal(HashMap<K, V> map,Node<K, V> [] tab,int h,K k, V v) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
    final void removeTreeNode(HashMap<K, V> map,Node<K, V> [] tab, boolean movable) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
    final void split(HashMap<K, V> map,Node<K, V> [] tab,int index, int bit) {
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
  }
}