package java.util;

import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.io.IOException;

public class LinkedHashMap<K,V> extends HashMap<K, V> implements Map<K, V> {
  static class Entry<K,V> extends HashMap. Node<K, V> {
    Entry<K, V> before, after;
    Entry(int hash,K key,V value, Node<K, V> next) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  transient LinkedHashMap. Entry<K, V> head;
  transient LinkedHashMap. Entry<K, V> tail;
  final boolean accessOrder;
  void reinitialize( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  Node<K, V> newNode(int hash,K key,V value, Node<K, V> e) {
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
  void afterNodeRemoval(Node<K, V> e) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  void afterNodeInsertion(boolean evict) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  void afterNodeAccess(Node<K, V> e) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  void internalWriteEntries(java. io. ObjectOutputStream s) throws IOException {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public LinkedHashMap(int initialCapacity, float loadFactor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LinkedHashMap(int initialCapacity) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LinkedHashMap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LinkedHashMap(Map<? extends K, ? extends V> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LinkedHashMap(int initialCapacity,float loadFactor, boolean accessOrder) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsValue(Object value) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public V get(Object key) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public V getOrDefault(Object key, V defaultValue) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public Set<K> keySet( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  final class LinkedKeySet extends AbstractSet<K> {
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
  final class LinkedValues extends AbstractCollection<V> {
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
  final class LinkedEntrySet extends AbstractSet<Map. Entry<K, V>> {
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
  public void forEach(BiConsumer<? super K, ? super V> action) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  abstract class LinkedHashIterator {
    LinkedHashMap. Entry<K, V> next;
    LinkedHashMap. Entry<K, V> current;
    int expectedModCount;
    LinkedHashIterator( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final boolean hasNext( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    final LinkedHashMap. Entry<K, V> nextNode( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    public final void remove( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  }
  final class LinkedKeyIterator extends LinkedHashIterator implements Iterator<K> {
    public final K next( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  }
  final class LinkedValueIterator extends LinkedHashIterator implements Iterator<V> {
    public final V next( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  }
  final class LinkedEntryIterator extends LinkedHashIterator implements Iterator<Map. Entry<K, V>> {
    public final Map. Entry<K, V> next( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  }
}