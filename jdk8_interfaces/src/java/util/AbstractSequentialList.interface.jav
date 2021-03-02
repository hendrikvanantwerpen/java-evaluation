package java.util;


public abstract class AbstractSequentialList<E> extends AbstractList<E> {
  protected AbstractSequentialList( ) {
  }
  public E get(int index) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public E set(int index, E element) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public void add(int index, E element) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public E remove(int index) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean addAll(int index, Collection<? extends E> c) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public Iterator<E> iterator( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public abstract ListIterator<E> listIterator(int index) ;
}