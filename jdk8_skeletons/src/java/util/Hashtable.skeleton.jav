package java.util;

import java.io.*;

public class Hashtable<K,V> extends Dictionary<K, V> implements Map<K, V>, Cloneable, java. io. Serializable {
  private class KeySet extends AbstractSet<K> {
  }
  private class EntrySet extends AbstractSet<Map. Entry<K, V>> {
  }
  private class ValueCollection extends AbstractCollection<V> {
  }
  private static class Entry<K,V> implements Map. Entry<K, V> {
  }
  private class Enumerator<T> implements Enumeration<T>, Iterator<T> {
  }
}