package java.util;


public abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E> implements Cloneable, java. io. Serializable {
  final Class<E> elementType;
  final Enum<?> [] universe;
  private static Enum<?> [] ZERO_LENGTH_ENUM_ARRAY;
  EnumSet(Class<E> elementType, Enum<?> [] universe) {
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
  private static <E extends Enum<E>> E [] getUniverse(Class<E> elementType) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  private static class SerializationProxy<E extends Enum<E>> implements java. io. Serializable {
    private final Class<E> elementType;
    private final Enum<?> [] elements;
    SerializationProxy(EnumSet<E> set) {
    }
    private Object readResolve( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    private static final long serialVersionUID;
  }
  Object writeReplace( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  private void readObject(java. io. ObjectInputStream stream) throws java. io. InvalidObjectException {
                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                      }
}