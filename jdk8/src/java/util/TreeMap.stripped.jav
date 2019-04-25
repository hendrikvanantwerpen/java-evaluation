package java.util;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class TreeMap<K,V> extends AbstractMap<K, V> implements NavigableMap<K, V>, Cloneable, java. io. Serializable {
  public TreeMap( ) {
  }
  public TreeMap(Comparator<? super K> comparator) {
  }
  public TreeMap(Map<? extends K, ? extends V> m) {
  }
  public TreeMap(SortedMap<K, ? extends V> m) {
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsKey(Object key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsValue(Object value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public V get(Object key) {
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
  public void putAll(Map<? extends K, ? extends V> map) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public V put(K key, V value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public V remove(Object key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
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
  public Set<K> keySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NavigableSet<K> navigableKeySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NavigableSet<K> descendingKeySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Collection<V> values( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<Map. Entry<K, V>> entrySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NavigableMap<K, V> descendingMap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NavigableMap<K, V> subMap(K fromKey,boolean fromInclusive,K toKey, boolean toInclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SortedMap<K, V> subMap(K fromKey, K toKey) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SortedMap<K, V> headMap(K toKey) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SortedMap<K, V> tailMap(K fromKey) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean replace(K key,V oldValue, V newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public V replace(K key, V value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void forEach(BiConsumer<? super K, ? super V> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}