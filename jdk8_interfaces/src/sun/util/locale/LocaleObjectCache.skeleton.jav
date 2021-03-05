package sun.util.locale;

import java.lang.ref.SoftReference;

public abstract class LocaleObjectCache<K,V> {
  private static class CacheEntry<K,V> extends SoftReference<V> {
  }
}