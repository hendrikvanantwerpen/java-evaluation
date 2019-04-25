package java.util;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class LinkedHashMap<K,V> extends HashMap<K, V> implements Map<K, V> {
  public LinkedHashMap(int initialCapacity, float loadFactor) {
    super(initialCapacity, loadFactor);
  }
  public LinkedHashMap(int initialCapacity) {
    super(initialCapacity);
  }
  public LinkedHashMap( ) {
    super( );
  }
  public LinkedHashMap(Map<? extends K, ? extends V> m) {
    super( );
  }
  public LinkedHashMap(int initialCapacity,float loadFactor, boolean accessOrder) {
    super(initialCapacity, loadFactor);
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