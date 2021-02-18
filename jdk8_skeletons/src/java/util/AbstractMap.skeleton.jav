package java.util;

import java.util.Map.Entry;

public abstract class AbstractMap<K,V> implements Map<K, V> {
  public static class SimpleEntry<K,V> implements Entry<K, V>, java. io. Serializable {
  }
  public static class SimpleImmutableEntry<K,V> implements Entry<K, V>, java. io. Serializable {
  }
}