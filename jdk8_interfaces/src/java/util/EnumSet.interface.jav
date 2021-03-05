package java.util;


public abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E> implements Cloneable, java. io. Serializable {
  final Class<E> elementType;
  final Enum<?> [] universe;
  EnumSet(Class<E> elementType, Enum<?> [] universe) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public static <E extends Enum<E>> EnumSet<E> allOf(Class<E> elementType) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  abstract void addAll( ) ;
  public static <E extends Enum<E>> EnumSet<E> copyOf(EnumSet<E> s) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  public static <E extends Enum<E>> EnumSet<E> copyOf(Collection<E> c) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public static <E extends Enum<E>> EnumSet<E> complementOf(EnumSet<E> s) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public static <E extends Enum<E>> EnumSet<E> of(E e) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public static <E extends Enum<E>> EnumSet<E> of(E e1,E e2, E e3) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public static <E extends Enum<E>> EnumSet<E> of(E e1,E e2,E e3, E e4) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public static <E extends Enum<E>> EnumSet<E> of(E e1,E e2,E e3,E e4, E e5) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  public static <E extends Enum<E>> EnumSet<E> of(E first, E ... rest) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public static <E extends Enum<E>> EnumSet<E> range(E from, E to) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  abstract void addRange(E from, E to) ;
  public EnumSet<E> clone( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  abstract void complement( ) ;
  final void typeCheck(E e) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private static class SerializationProxy<E extends Enum<E>> implements java. io. Serializable {
    SerializationProxy(EnumSet<E> set) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  Object writeReplace( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
}