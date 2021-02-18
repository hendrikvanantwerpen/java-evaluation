package java.util;

import java.lang.ref.WeakReference;

public class WeakHashMap<K,V> extends AbstractMap<K, V> implements Map<K, V> {
  private static class Entry<K,V> extends WeakReference<Object> implements Map. Entry<K, V> {
  }
  private abstract class HashIterator<T> implements Iterator<T> {
  }
  private class ValueIterator extends HashIterator<V> {
  }
  private class KeyIterator extends HashIterator<K> {
  }
  private class EntryIterator extends HashIterator<Map. Entry<K, V>> {
  }
  private class KeySet extends AbstractSet<K> {
  }
  private class Values extends AbstractCollection<V> {
  }
  private class EntrySet extends AbstractSet<Map. Entry<K, V>> {
  }
  static class WeakHashMapSpliterator<K,V> {
  }
  static final class KeySpliterator<K,V> extends WeakHashMapSpliterator<K, V> implements Spliterator<K> {
  }
  static final class ValueSpliterator<K,V> extends WeakHashMapSpliterator<K, V> implements Spliterator<V> {
  }
  static final class EntrySpliterator<K,V> extends WeakHashMapSpliterator<K, V> implements Spliterator<Map. Entry<K, V>> {
  }
}