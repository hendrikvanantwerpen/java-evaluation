package java.util;

import java.util.Map.Entry;

public abstract class AbstractMap<K,V> implements Map<K, V> {
  protected AbstractMap( ) {
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEmpty( ) {
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
  public Collection<V> values( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Set<Entry<K, V>> entrySet( ) ;
  public boolean equals(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static class SimpleEntry<K,V> implements Entry<K, V>, java. io. Serializable {
    public SimpleEntry(K key, V value) {
    }
    public SimpleEntry(Entry<? extends K, ? extends V> entry) {
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
  public static class SimpleImmutableEntry<K,V> implements Entry<K, V>, java. io. Serializable {
    public SimpleImmutableEntry(K key, V value) {
    }
    public SimpleImmutableEntry(Entry<? extends K, ? extends V> entry) {
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
}