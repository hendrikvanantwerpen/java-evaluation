package java.util;

import java.io.Serializable;

public class HashMap<K,V> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, Serializable {
  static class Node<K,V> implements Map. Entry<K, V> {
  }
  final class KeySet extends AbstractSet<K> {
  }
  final class Values extends AbstractCollection<V> {
  }
  final class EntrySet extends AbstractSet<Map. Entry<K, V>> {
  }
  abstract class HashIterator {
  }
  final class KeyIterator extends HashIterator implements Iterator<K> {
  }
  final class ValueIterator extends HashIterator implements Iterator<V> {
  }
  final class EntryIterator extends HashIterator implements Iterator<Map. Entry<K, V>> {
  }
  static class HashMapSpliterator<K,V> {
  }
  static final class KeySpliterator<K,V> extends HashMapSpliterator<K, V> implements Spliterator<K> {
  }
  static final class ValueSpliterator<K,V> extends HashMapSpliterator<K, V> implements Spliterator<V> {
  }
  static final class EntrySpliterator<K,V> extends HashMapSpliterator<K, V> implements Spliterator<Map. Entry<K, V>> {
  }
  static final class TreeNode<K,V> extends LinkedHashMap. Entry<K, V> {
  }
}