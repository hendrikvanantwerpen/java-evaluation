package java.lang;

import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;

public abstract class Enum<E extends Enum<E>> implements Comparable<E>, Serializable {
  private final String name;
  public final String name( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  private final int ordinal;
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
  protected final Object clone( ) throws CloneNotSupportedException {
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
  protected final void finalize( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  private void readObjectNoData( ) throws ObjectStreamException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
}