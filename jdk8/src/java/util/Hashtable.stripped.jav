package java.util;

import java.io.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.BiFunction;

public class Hashtable<K,V> extends Dictionary<K, V> implements Map<K, V>, Cloneable, java. io. Serializable {
  public Hashtable(int initialCapacity, float loadFactor) {
  }
  public Hashtable(int initialCapacity) {
    this(initialCapacity, 0.75f);
  }
  public Hashtable( ) {
    this(11, 0.75f);
  }
  public Hashtable(Map<? extends K, ? extends V> t) {
    this(Math. max(2 * t. size( ), 11), 0.75f);
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
  public Set<Map. Entry<K, V>> entrySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Collection<V> values( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
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
}