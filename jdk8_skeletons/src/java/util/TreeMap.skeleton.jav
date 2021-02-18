package java.util;


public class TreeMap<K,V> extends AbstractMap<K, V> implements NavigableMap<K, V>, Cloneable, java. io. Serializable {
  class Values extends AbstractCollection<V> {
  }
  class EntrySet extends AbstractSet<Map. Entry<K, V>> {
  }
  static final class KeySet<E> extends AbstractSet<E> implements NavigableSet<E> {
  }
  abstract class PrivateEntryIterator<T> implements Iterator<T> {
  }
  final class EntryIterator extends PrivateEntryIterator<Map. Entry<K, V>> {
  }
  final class ValueIterator extends PrivateEntryIterator<V> {
  }
  final class KeyIterator extends PrivateEntryIterator<K> {
  }
  final class DescendingKeyIterator extends PrivateEntryIterator<K> {
  }
  abstract static class NavigableSubMap<K,V> extends AbstractMap<K, V> implements NavigableMap<K, V>, java. io. Serializable {
    abstract class EntrySetView extends AbstractSet<Map. Entry<K, V>> {
    }
    abstract class SubMapIterator<T> implements Iterator<T> {
    }
    final class SubMapEntryIterator extends SubMapIterator<Map. Entry<K, V>> {
    }
    final class DescendingSubMapEntryIterator extends SubMapIterator<Map. Entry<K, V>> {
    }
    final class SubMapKeyIterator extends SubMapIterator<K> implements Spliterator<K> {
    }
    final class DescendingSubMapKeyIterator extends SubMapIterator<K> implements Spliterator<K> {
    }
  }
  static final class AscendingSubMap<K,V> extends NavigableSubMap<K, V> {
    final class AscendingEntrySetView extends EntrySetView {
    }
  }
  static final class DescendingSubMap<K,V> extends NavigableSubMap<K, V> {
    final class DescendingEntrySetView extends EntrySetView {
    }
  }
  private class SubMap extends AbstractMap<K, V> implements SortedMap<K, V>, java. io. Serializable {
  }
  static final class Entry<K,V> implements Map. Entry<K, V> {
  }
  static class TreeMapSpliterator<K,V> {
  }
  static final class KeySpliterator<K,V> extends TreeMapSpliterator<K, V> implements Spliterator<K> {
  }
  static final class DescendingKeySpliterator<K,V> extends TreeMapSpliterator<K, V> implements Spliterator<K> {
  }
  static final class ValueSpliterator<K,V> extends TreeMapSpliterator<K, V> implements Spliterator<V> {
  }
  static final class EntrySpliterator<K,V> extends TreeMapSpliterator<K, V> implements Spliterator<Map. Entry<K, V>> {
  }
}