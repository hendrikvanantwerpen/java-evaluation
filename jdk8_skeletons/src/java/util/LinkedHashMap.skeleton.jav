package java.util;


public class LinkedHashMap<K,V> extends HashMap<K, V> implements Map<K, V> {
  static class Entry<K,V> extends HashMap. Node<K, V> {
  }
  final class LinkedKeySet extends AbstractSet<K> {
  }
  final class LinkedValues extends AbstractCollection<V> {
  }
  final class LinkedEntrySet extends AbstractSet<Map. Entry<K, V>> {
  }
  abstract class LinkedHashIterator {
  }
  final class LinkedKeyIterator extends LinkedHashIterator implements Iterator<K> {
  }
  final class LinkedValueIterator extends LinkedHashIterator implements Iterator<V> {
  }
  final class LinkedEntryIterator extends LinkedHashIterator implements Iterator<Map. Entry<K, V>> {
  }
}