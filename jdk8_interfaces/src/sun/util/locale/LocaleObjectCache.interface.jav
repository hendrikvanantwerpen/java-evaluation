package sun.util.locale;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentMap;

public abstract class LocaleObjectCache<K,V> {
  private ConcurrentMap<K, CacheEntry<K, V>> map;
  private ReferenceQueue<V> queue;
  public LocaleObjectCache( ) {
    this(16, 0.75f, 16);
  }
  public LocaleObjectCache(int initialCapacity,float loadFactor, int concurrencyLevel) {
  }
  public V get(K key) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  protected V put(K key, V value) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private void cleanStaleEntries( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  protected abstract V createObject(K key) ;
  protected K normalizeKey(K key) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private static class CacheEntry<K,V> extends SoftReference<V> {
    private K key;
    CacheEntry(K key,V value, ReferenceQueue<V> queue) {
      super(value, queue);
    }
    K getKey( ) {
                  throw new java . lang . RuntimeException ("Implementation stripped");
                }
  }
}