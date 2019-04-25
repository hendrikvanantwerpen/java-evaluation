package java.util.concurrent;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class ConcurrentSkipListMap<K,V> extends AbstractMap<K, V> implements ConcurrentNavigableMap<K, V>, Cloneable, Serializable {
  public ConcurrentSkipListMap( ) {
  }
  public ConcurrentSkipListMap(Comparator<? super K> comparator) {
  }
  public ConcurrentSkipListMap(Map<? extends K, ? extends V> m) {
  }
  public ConcurrentSkipListMap(SortedMap<K, ? extends V> m) {
  }
  public ConcurrentSkipListMap<K, V> clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsKey(Object key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public V get(Object key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public V getOrDefault(Object key, V defaultValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public V put(K key, V value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public V remove(Object key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsValue(Object value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEmpty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
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
  public NavigableSet<K> keySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NavigableSet<K> navigableKeySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Collection<V> values( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<Map. Entry<K, V>> entrySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ConcurrentNavigableMap<K, V> descendingMap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NavigableSet<K> descendingKeySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object o) {
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
  public Comparator<? super K> comparator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public K firstKey( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public K lastKey( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ConcurrentNavigableMap<K, V> subMap(K fromKey,boolean fromInclusive,K toKey, boolean toInclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ConcurrentNavigableMap<K, V> headMap(K toKey, boolean inclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ConcurrentNavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ConcurrentNavigableMap<K, V> subMap(K fromKey, K toKey) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ConcurrentNavigableMap<K, V> headMap(K toKey) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ConcurrentNavigableMap<K, V> tailMap(K fromKey) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map. Entry<K, V> lowerEntry(K key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public K lowerKey(K key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map. Entry<K, V> floorEntry(K key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public K floorKey(K key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map. Entry<K, V> ceilingEntry(K key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public K ceilingKey(K key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map. Entry<K, V> higherEntry(K key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public K higherKey(K key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map. Entry<K, V> firstEntry( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map. Entry<K, V> lastEntry( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map. Entry<K, V> pollFirstEntry( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map. Entry<K, V> pollLastEntry( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void forEach(BiConsumer<? super K, ? super V> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}