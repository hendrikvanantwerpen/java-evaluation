package java.util;


public abstract class AbstractQueue<E> extends AbstractCollection<E> implements Queue<E> {
  public boolean add(E e) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public E remove( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  public E element( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  public void clear( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public boolean addAll(Collection<? extends E> c) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
}