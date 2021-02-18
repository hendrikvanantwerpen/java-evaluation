package java.util;

import java.io.Serializable;

public class Collections {
  static class UnmodifiableCollection<E> implements Collection<E>, Serializable {
  }
  static class UnmodifiableSet<E> extends UnmodifiableCollection<E> implements Set<E>, Serializable {
  }
  static class UnmodifiableSortedSet<E> extends UnmodifiableSet<E> implements SortedSet<E>, Serializable {
  }
  static class UnmodifiableNavigableSet<E> extends UnmodifiableSortedSet<E> implements NavigableSet<E>, Serializable {
    private static class EmptyNavigableSet<E> extends UnmodifiableNavigableSet<E> implements Serializable {
    }
  }
  static class UnmodifiableList<E> extends UnmodifiableCollection<E> implements List<E> {
  }
  static class UnmodifiableRandomAccessList<E> extends UnmodifiableList<E> implements RandomAccess {
  }
  private static class UnmodifiableMap<K,V> implements Map<K, V>, Serializable {
    static class UnmodifiableEntrySet<K,V> extends UnmodifiableSet<Map. Entry<K, V>> {
      static final class UnmodifiableEntrySetSpliterator<K,V> implements Spliterator<Entry<K, V>> {
      }
      private static class UnmodifiableEntry<K,V> implements Map. Entry<K, V> {
      }
    }
  }
  static class UnmodifiableSortedMap<K,V> extends UnmodifiableMap<K, V> implements SortedMap<K, V>, Serializable {
  }
  static class UnmodifiableNavigableMap<K,V> extends UnmodifiableSortedMap<K, V> implements NavigableMap<K, V>, Serializable {
    private static class EmptyNavigableMap<K,V> extends UnmodifiableNavigableMap<K, V> implements Serializable {
    }
  }
  static class SynchronizedCollection<E> implements Collection<E>, Serializable {
  }
  static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
  }
  static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
  }
  static class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {
  }
  static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
  }
  static class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
  }
  private static class SynchronizedMap<K,V> implements Map<K, V>, Serializable {
  }
  static class SynchronizedSortedMap<K,V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
  }
  static class SynchronizedNavigableMap<K,V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
  }
  static class CheckedCollection<E> implements Collection<E>, Serializable {
  }
  static class CheckedQueue<E> extends CheckedCollection<E> implements Queue<E>, Serializable {
  }
  static class CheckedSet<E> extends CheckedCollection<E> implements Set<E>, Serializable {
  }
  static class CheckedSortedSet<E> extends CheckedSet<E> implements SortedSet<E>, Serializable {
  }
  static class CheckedNavigableSet<E> extends CheckedSortedSet<E> implements NavigableSet<E>, Serializable {
  }
  static class CheckedList<E> extends CheckedCollection<E> implements List<E> {
  }
  static class CheckedRandomAccessList<E> extends CheckedList<E> implements RandomAccess {
  }
  private static class CheckedMap<K,V> implements Map<K, V>, Serializable {
    static class CheckedEntrySet<K,V> implements Set<Map. Entry<K, V>> {
      private static class CheckedEntry<K,V,T> implements Map. Entry<K, V> {
      }
    }
  }
  static class CheckedSortedMap<K,V> extends CheckedMap<K, V> implements SortedMap<K, V>, Serializable {
  }
  static class CheckedNavigableMap<K,V> extends CheckedSortedMap<K, V> implements NavigableMap<K, V>, Serializable {
  }
  private static class EmptyIterator<E> implements Iterator<E> {
  }
  private static class EmptyListIterator<E> extends EmptyIterator<E> implements ListIterator<E> {
  }
  private static class EmptyEnumeration<E> implements Enumeration<E> {
  }
  private static class EmptySet<E> extends AbstractSet<E> implements Serializable {
  }
  private static class EmptyList<E> extends AbstractList<E> implements RandomAccess, Serializable {
  }
  private static class EmptyMap<K,V> extends AbstractMap<K, V> implements Serializable {
  }
  private static class SingletonSet<E> extends AbstractSet<E> implements Serializable {
  }
  private static class SingletonList<E> extends AbstractList<E> implements RandomAccess, Serializable {
  }
  private static class SingletonMap<K,V> extends AbstractMap<K, V> implements Serializable {
  }
  private static class CopiesList<E> extends AbstractList<E> implements RandomAccess, Serializable {
  }
  private static class ReverseComparator implements Comparator<Comparable<Object>>, Serializable {
  }
  private static class ReverseComparator2<T> implements Comparator<T>, Serializable {
  }
  private static class SetFromMap<E> extends AbstractSet<E> implements Set<E>, Serializable {
  }
  static class AsLIFOQueue<E> extends AbstractQueue<E> implements Queue<E>, Serializable {
  }
}