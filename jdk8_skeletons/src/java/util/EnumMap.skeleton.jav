package java.util;


public class EnumMap<K extends Enum<K>,V> extends AbstractMap<K, V> implements java. io. Serializable, Cloneable {
  private class KeySet extends AbstractSet<K> {
  }
  private class Values extends AbstractCollection<V> {
  }
  private class EntrySet extends AbstractSet<Map. Entry<K, V>> {
  }
  private abstract class EnumMapIterator<T> implements Iterator<T> {
  }
  private class KeyIterator extends EnumMapIterator<K> {
  }
  private class ValueIterator extends EnumMapIterator<V> {
  }
  private class EntryIterator extends EnumMapIterator<Map. Entry<K, V>> {
    private class Entry implements Map. Entry<K, V> {
    }
  }
}