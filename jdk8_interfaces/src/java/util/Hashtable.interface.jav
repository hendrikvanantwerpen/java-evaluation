package java.util;

import java.io.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.BiFunction;

public class Hashtable<K,V> extends Dictionary<K, V> implements Map<K, V>, Cloneable, java. io. Serializable {
  public Hashtable(int initialCapacity, float loadFactor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Hashtable(int initialCapacity) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Hashtable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Hashtable(Map<? extends K, ? extends V> t) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int size( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public synchronized boolean isEmpty( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public synchronized Enumeration<K> keys( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public synchronized Enumeration<V> elements( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public synchronized boolean contains(Object value) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public boolean containsValue(Object value) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public synchronized boolean containsKey(Object key) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public synchronized V get(Object key) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public synchronized V put(K key, V value) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public synchronized V remove(Object key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public synchronized void putAll(Map<? extends K, ? extends V> t) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public synchronized void clear( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public synchronized Object clone( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public synchronized String toString( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
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
  }
  public Set<Map. Entry<K, V>> entrySet( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private class EntrySet extends AbstractSet<Map. Entry<K, V>> {
    public Iterator<Map. Entry<K, V>> iterator( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    public boolean add(Map. Entry<K, V> o) {
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
  }
  public Collection<V> values( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  private class ValueCollection extends AbstractCollection<V> {
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
  }
  public synchronized boolean equals(Object o) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public synchronized int hashCode( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public synchronized V getOrDefault(Object key, V defaultValue) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public synchronized void forEach(BiConsumer<? super K, ? super V> action) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public synchronized void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
  public synchronized V putIfAbsent(K key, V value) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public synchronized boolean remove(Object key, Object value) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public synchronized boolean replace(K key,V oldValue, V newValue) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  public synchronized V replace(K key, V value) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public synchronized V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                 }
  public synchronized V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                 }
  public synchronized V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
  public synchronized V merge(K key,V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
                                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                              }
  private static class Entry<K,V> implements Map. Entry<K, V> {
    final int hash;
    final K key;
    V value;
    Entry<K, V> next;
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
  private class Enumerator<T> implements Enumeration<T>, Iterator<T> {
    Entry<?, ?> [] table;
    int index;
    Entry<?, ?> entry;
    Entry<?, ?> lastReturned;
    int type;
    boolean iterator;
    Enumerator(int type, boolean iterator) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean hasMoreElements( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public T nextElement( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    public boolean hasNext( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public T next( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
    public void remove( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  }
}