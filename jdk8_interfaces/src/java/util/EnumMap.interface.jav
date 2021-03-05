package java.util;


public class EnumMap<K extends Enum<K>,V> extends AbstractMap<K, V> implements java. io. Serializable, Cloneable {
  public EnumMap(Class<K> keyType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public EnumMap(EnumMap<K, ? extends V> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public EnumMap(Map<K, ? extends V> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int size( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  public boolean containsValue(Object value) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public boolean containsKey(Object key) {
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
  }
  private abstract class EnumMapIterator<T> implements Iterator<T> {
    int index;
    int lastReturnedIndex;
    public boolean hasNext( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public void remove( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  }
  private class KeyIterator extends EnumMapIterator<K> {
    public K next( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  }
  private class ValueIterator extends EnumMapIterator<V> {
    public V next( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  }
  private class EntryIterator extends EnumMapIterator<Map. Entry<K, V>> {
    public Map. Entry<K, V> next( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    public void remove( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    private class Entry implements Map. Entry<K, V> {
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
  }
  public boolean equals(Object o) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public EnumMap<K, V> clone( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
}