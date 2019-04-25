package java.util;

import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HashMap<K,V> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, Serializable {
  public HashMap(int initialCapacity, float loadFactor) {
  }
  public HashMap(int initialCapacity) {
    this(initialCapacity, DEFAULT_LOAD_FACTOR);
  }
  public HashMap( ) {
  }
  public HashMap(Map<? extends K, ? extends V> m) {
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
  public boolean containsValue(Object value) {
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
}