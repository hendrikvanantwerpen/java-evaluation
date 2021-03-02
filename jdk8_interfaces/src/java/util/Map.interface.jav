package java.util;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface Map<K,V> {
  int size( ) ;
  boolean isEmpty( ) ;
  boolean containsKey(Object key) ;
  boolean containsValue(Object value) ;
  V get(Object key) ;
  V put(K key, V value) ;
  V remove(Object key) ;
  void putAll(Map<? extends K, ? extends V> m) ;
  void clear( ) ;
  Set<K> keySet( ) ;
  Collection<V> values( ) ;
  Set<Map. Entry<K, V>> entrySet( ) ;
  interface Entry<K,V> {
    K getKey( ) ;
    V getValue( ) ;
    V setValue(V value) ;
    boolean equals(Object o) ;
    int hashCode( ) ;
    public static <K extends Comparable<? super K>,V> Comparator<Map. Entry<K, V>> comparingByKey( ) {
                                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                     }
    public static <K,V extends Comparable<? super V>> Comparator<Map. Entry<K, V>> comparingByValue( ) {
                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                       }
    public static <K,V> Comparator<Map. Entry<K, V>> comparingByKey(Comparator<? super K> cmp) {
                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                               }
    public static <K,V> Comparator<Map. Entry<K, V>> comparingByValue(Comparator<? super V> cmp) {
                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                 }
  }
  boolean equals(Object o) ;
  int hashCode( ) ;
  default V getOrDefault(Object key, V defaultValue) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  default void forEach(BiConsumer<? super K, ? super V> action) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  default void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  default V putIfAbsent(K key, V value) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  default boolean remove(Object key, Object value) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  default boolean replace(K key,V oldValue, V newValue) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  default V replace(K key, V value) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  default V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  default V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                     }
  default V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  default V merge(K key,V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                  }
}