package java.util.concurrent;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentHashMap<K,V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
  static class Node<K,V> implements Map. Entry<K, V> {
  }
  static class Segment<K,V> extends ReentrantLock implements Serializable {
  }
  static final class ForwardingNode<K,V> extends Node<K, V> {
  }
  static final class ReservationNode<K,V> extends Node<K, V> {
  }
  static final class CounterCell {
  }
  static final class TreeNode<K,V> extends Node<K, V> {
  }
  static final class TreeBin<K,V> extends Node<K, V> {
  }
  static final class TableStack<K,V> {
  }
  static class Traverser<K,V> {
  }
  static class BaseIterator<K,V> extends Traverser<K, V> {
  }
  static final class KeyIterator<K,V> extends BaseIterator<K, V> implements Iterator<K>, Enumeration<K> {
  }
  static final class ValueIterator<K,V> extends BaseIterator<K, V> implements Iterator<V>, Enumeration<V> {
  }
  static final class EntryIterator<K,V> extends BaseIterator<K, V> implements Iterator<Map. Entry<K, V>> {
  }
  static final class MapEntry<K,V> implements Map. Entry<K, V> {
  }
  static final class KeySpliterator<K,V> extends Traverser<K, V> implements Spliterator<K> {
  }
  static final class ValueSpliterator<K,V> extends Traverser<K, V> implements Spliterator<V> {
  }
  static final class EntrySpliterator<K,V> extends Traverser<K, V> implements Spliterator<Map. Entry<K, V>> {
  }
  abstract static class CollectionView<K,V,E> implements Collection<E>, java. io. Serializable {
  }
  public static class KeySetView<K,V> extends CollectionView<K, V, K> implements Set<K>, java. io. Serializable {
  }
  static final class ValuesView<K,V> extends CollectionView<K, V, V> implements Collection<V>, java. io. Serializable {
  }
  static final class EntrySetView<K,V> extends CollectionView<K, V, Map. Entry<K, V>> implements Set<Map. Entry<K, V>>, java. io. Serializable {
  }
  abstract static class BulkTask<K,V,R> extends CountedCompleter<R> {
  }
  static final class ForEachKeyTask<K,V> extends BulkTask<K, V, Void> {
  }
  static final class ForEachValueTask<K,V> extends BulkTask<K, V, Void> {
  }
  static final class ForEachEntryTask<K,V> extends BulkTask<K, V, Void> {
  }
  static final class ForEachMappingTask<K,V> extends BulkTask<K, V, Void> {
  }
  static final class ForEachTransformedKeyTask<K,V,U> extends BulkTask<K, V, Void> {
  }
  static final class ForEachTransformedValueTask<K,V,U> extends BulkTask<K, V, Void> {
  }
  static final class ForEachTransformedEntryTask<K,V,U> extends BulkTask<K, V, Void> {
  }
  static final class ForEachTransformedMappingTask<K,V,U> extends BulkTask<K, V, Void> {
  }
  static final class SearchKeysTask<K,V,U> extends BulkTask<K, V, U> {
  }
  static final class SearchValuesTask<K,V,U> extends BulkTask<K, V, U> {
  }
  static final class SearchEntriesTask<K,V,U> extends BulkTask<K, V, U> {
  }
  static final class SearchMappingsTask<K,V,U> extends BulkTask<K, V, U> {
  }
  static final class ReduceKeysTask<K,V> extends BulkTask<K, V, K> {
  }
  static final class ReduceValuesTask<K,V> extends BulkTask<K, V, V> {
  }
  static final class ReduceEntriesTask<K,V> extends BulkTask<K, V, Map. Entry<K, V>> {
  }
  static final class MapReduceKeysTask<K,V,U> extends BulkTask<K, V, U> {
  }
  static final class MapReduceValuesTask<K,V,U> extends BulkTask<K, V, U> {
  }
  static final class MapReduceEntriesTask<K,V,U> extends BulkTask<K, V, U> {
  }
  static final class MapReduceMappingsTask<K,V,U> extends BulkTask<K, V, U> {
  }
  static final class MapReduceKeysToDoubleTask<K,V> extends BulkTask<K, V, Double> {
  }
  static final class MapReduceValuesToDoubleTask<K,V> extends BulkTask<K, V, Double> {
  }
  static final class MapReduceEntriesToDoubleTask<K,V> extends BulkTask<K, V, Double> {
  }
  static final class MapReduceMappingsToDoubleTask<K,V> extends BulkTask<K, V, Double> {
  }
  static final class MapReduceKeysToLongTask<K,V> extends BulkTask<K, V, Long> {
  }
  static final class MapReduceValuesToLongTask<K,V> extends BulkTask<K, V, Long> {
  }
  static final class MapReduceEntriesToLongTask<K,V> extends BulkTask<K, V, Long> {
  }
  static final class MapReduceMappingsToLongTask<K,V> extends BulkTask<K, V, Long> {
  }
  static final class MapReduceKeysToIntTask<K,V> extends BulkTask<K, V, Integer> {
  }
  static final class MapReduceValuesToIntTask<K,V> extends BulkTask<K, V, Integer> {
  }
  static final class MapReduceEntriesToIntTask<K,V> extends BulkTask<K, V, Integer> {
  }
  static final class MapReduceMappingsToIntTask<K,V> extends BulkTask<K, V, Integer> {
  }
}