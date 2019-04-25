package java.util.concurrent;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public class ConcurrentHashMap<K,V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
  public ConcurrentHashMap( ) {
  }
  public ConcurrentHashMap(int initialCapacity) {
  }
  public ConcurrentHashMap(Map<? extends K, ? extends V> m) {
  }
  public ConcurrentHashMap(int initialCapacity, float loadFactor) {
    this(initialCapacity, loadFactor, 1);
  }
  public ConcurrentHashMap(int initialCapacity,float loadFactor, int concurrencyLevel) {
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
  public KeySetView<K, V> keySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Collection<V> values( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<Map. Entry<K, V>> entrySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
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
  public V getOrDefault(Object key, V defaultValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void forEach(BiConsumer<? super K, ? super V> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
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
  public boolean contains(Object value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Enumeration<K> keys( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Enumeration<V> elements( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long mappingCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <K> KeySetView<K, Boolean> newKeySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <K> KeySetView<K, Boolean> newKeySet(int initialCapacity) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public KeySetView<K, V> keySet(V mappedValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void forEach(long parallelismThreshold, BiConsumer<? super K, ? super V> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> void forEach(long parallelismThreshold,BiFunction<? super K, ? super V, ? extends U> transformer, Consumer<? super U> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> U search(long parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> searchFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> U reduce(long parallelismThreshold,BiFunction<? super K, ? super V, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double reduceToDouble(long parallelismThreshold,ToDoubleBiFunction<? super K, ? super V> transformer,double basis, DoubleBinaryOperator reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long reduceToLong(long parallelismThreshold,ToLongBiFunction<? super K, ? super V> transformer,long basis, LongBinaryOperator reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int reduceToInt(long parallelismThreshold,ToIntBiFunction<? super K, ? super V> transformer,int basis, IntBinaryOperator reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void forEachKey(long parallelismThreshold, Consumer<? super K> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> void forEachKey(long parallelismThreshold,Function<? super K, ? extends U> transformer, Consumer<? super U> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> U searchKeys(long parallelismThreshold, Function<? super K, ? extends U> searchFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public K reduceKeys(long parallelismThreshold, BiFunction<? super K, ? super K, ? extends K> reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> U reduceKeys(long parallelismThreshold,Function<? super K, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double reduceKeysToDouble(long parallelismThreshold,ToDoubleFunction<? super K> transformer,double basis, DoubleBinaryOperator reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long reduceKeysToLong(long parallelismThreshold,ToLongFunction<? super K> transformer,long basis, LongBinaryOperator reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int reduceKeysToInt(long parallelismThreshold,ToIntFunction<? super K> transformer,int basis, IntBinaryOperator reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void forEachValue(long parallelismThreshold, Consumer<? super V> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> void forEachValue(long parallelismThreshold,Function<? super V, ? extends U> transformer, Consumer<? super U> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> U searchValues(long parallelismThreshold, Function<? super V, ? extends U> searchFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public V reduceValues(long parallelismThreshold, BiFunction<? super V, ? super V, ? extends V> reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> U reduceValues(long parallelismThreshold,Function<? super V, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double reduceValuesToDouble(long parallelismThreshold,ToDoubleFunction<? super V> transformer,double basis, DoubleBinaryOperator reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long reduceValuesToLong(long parallelismThreshold,ToLongFunction<? super V> transformer,long basis, LongBinaryOperator reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int reduceValuesToInt(long parallelismThreshold,ToIntFunction<? super V> transformer,int basis, IntBinaryOperator reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void forEachEntry(long parallelismThreshold, Consumer<? super Map. Entry<K, V>> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> void forEachEntry(long parallelismThreshold,Function<Map. Entry<K, V>, ? extends U> transformer, Consumer<? super U> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> U searchEntries(long parallelismThreshold, Function<Map. Entry<K, V>, ? extends U> searchFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map. Entry<K, V> reduceEntries(long parallelismThreshold, BiFunction<Map. Entry<K, V>, Map. Entry<K, V>, ? extends Map. Entry<K, V>> reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> U reduceEntries(long parallelismThreshold,Function<Map. Entry<K, V>, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double reduceEntriesToDouble(long parallelismThreshold,ToDoubleFunction<Map. Entry<K, V>> transformer,double basis, DoubleBinaryOperator reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long reduceEntriesToLong(long parallelismThreshold,ToLongFunction<Map. Entry<K, V>> transformer,long basis, LongBinaryOperator reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int reduceEntriesToInt(long parallelismThreshold,ToIntFunction<Map. Entry<K, V>> transformer,int basis, IntBinaryOperator reducer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static class KeySetView<K,V> extends CollectionView<K, V, K> implements Set<K>, java. io. Serializable {
    KeySetView(ConcurrentHashMap<K, V> map, V value) {
      super(map);
    }
    public V getMappedValue( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean contains(Object o) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean remove(Object o) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Iterator<K> iterator( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean add(K e) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean addAll(Collection<? extends K> c) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int hashCode( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean equals(Object o) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Spliterator<K> spliterator( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void forEach(Consumer<? super K> action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
}