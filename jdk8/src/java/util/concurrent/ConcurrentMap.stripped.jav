package java.util.concurrent;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface ConcurrentMap<K,V> extends Map<K, V> {
  @Override default V getOrDefault(Object key, V defaultValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default void forEach(BiConsumer<? super K, ? super V> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  V putIfAbsent(K key, V value) ;
  boolean remove(Object key, Object value) ;
  boolean replace(K key,V oldValue, V newValue) ;
  V replace(K key, V value) ;
  @Override default void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default V merge(K key,V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}