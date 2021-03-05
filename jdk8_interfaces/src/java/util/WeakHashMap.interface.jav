package java.util;

import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class WeakHashMap<K,V> extends AbstractMap<K, V> implements Map<K, V> {
  Entry<K, V> [] table;
  int modCount;
  public WeakHashMap(int initialCapacity, float loadFactor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WeakHashMap(int initialCapacity) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WeakHashMap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WeakHashMap(Map<? extends K, ? extends V> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static Object unmaskNull(Object key) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  final int hash(Object k) {
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
  public boolean containsKey(Object key) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  Entry<K, V> getEntry(Object key) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public V put(K key, V value) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  void resize(int newCapacity) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public void putAll(Map<? extends K, ? extends V> m) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public V remove(Object key) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  boolean removeMapping(Object o) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public boolean containsValue(Object value) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private static class Entry<K,V> extends WeakReference<Object> implements Map. Entry<K, V> {
    V value;
    final int hash;
    Entry<K, V> next;
    Entry(Object key,V value,ReferenceQueue<Object> queue,int hash, Entry<K, V> next) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public K getKey( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public V getValue( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public V setValue(V newValue) {
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
  private abstract class HashIterator<T> implements Iterator<T> {
    HashIterator( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean hasNext( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public void remove( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  }
  private class ValueIterator extends HashIterator<V> {
    public V next( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  }
  private class KeyIterator extends HashIterator<K> {
    public K next( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  }
  private class EntryIterator extends HashIterator<Map. Entry<K, V>> {
    public Map. Entry<K, V> next( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  }
  public Set<K> keySet( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  private class KeySet extends AbstractSet<K> {
    public Iterator<K> iterator( ) {
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
    public Spliterator<K> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  public Collection<V> values( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  private class Values extends AbstractCollection<V> {
    public Iterator<V> iterator( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public int size( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    public boolean contains(Object o) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public void clear( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public Spliterator<V> spliterator( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  }
  public Set<Map. Entry<K, V>> entrySet( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private class EntrySet extends AbstractSet<Map. Entry<K, V>> {
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
    public Object [] toArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    public <T> T [] toArray(T [] a) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public Spliterator<Map. Entry<K, V>> spliterator( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  }
  public void forEach(BiConsumer<? super K, ? super V> action) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  static class WeakHashMapSpliterator<K,V> {
    final WeakHashMap<K, V> map;
    WeakHashMap. Entry<K, V> current;
    int index;
    int fence;
    int est;
    int expectedModCount;
    WeakHashMapSpliterator(WeakHashMap<K, V> m,int origin,int fence,int est, int expectedModCount) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    final int getFence( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public final long estimateSize( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  static final class KeySpliterator<K,V> extends WeakHashMapSpliterator<K, V> implements Spliterator<K> {
    KeySpliterator(WeakHashMap<K, V> m,int origin,int fence,int est, int expectedModCount) {
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
  static final class ValueSpliterator<K,V> extends WeakHashMapSpliterator<K, V> implements Spliterator<V> {
    ValueSpliterator(WeakHashMap<K, V> m,int origin,int fence,int est, int expectedModCount) {
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
  static final class EntrySpliterator<K,V> extends WeakHashMapSpliterator<K, V> implements Spliterator<Map. Entry<K, V>> {
    EntrySpliterator(WeakHashMap<K, V> m,int origin,int fence,int est, int expectedModCount) {
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
}