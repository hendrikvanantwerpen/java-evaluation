package java.util;


public abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E> implements Cloneable, java. io. Serializable {
  private static class SerializationProxy<E extends Enum<E>> implements java. io. Serializable {
  }
}