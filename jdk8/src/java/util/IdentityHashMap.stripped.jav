package java.util;

import java.io.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class IdentityHashMap<K,V> extends AbstractMap<K, V> implements Map<K, V>, java. io. Serializable, Cloneable {
  public IdentityHashMap( ) {
  }
  public IdentityHashMap(int expectedMaxSize) {
  }
  public IdentityHashMap(Map<? extends K, ? extends V> m) {
    this((int) ((1 + m. size( )) * 1.1));
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
  public void putAll(Map<? extends K, ? extends V> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public V remove(Object key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
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
  public void forEach(BiConsumer<? super K, ? super V> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}