package java.lang;

import java.io.Serializable;

public abstract class Enum<E extends Enum<E>> implements Comparable<E>, Serializable {
  public final String name( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int ordinal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  protected Enum(String name, int ordinal) {
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean equals(Object other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int compareTo(E o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Class<E> getDeclaringClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T extends Enum<T>> T valueOf(Class<T> enumType, String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}