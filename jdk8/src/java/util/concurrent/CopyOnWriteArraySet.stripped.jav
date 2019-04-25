package java.util.concurrent;

import java.util.Collection;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class CopyOnWriteArraySet<E> extends AbstractSet<E> implements java. io. Serializable {
  public CopyOnWriteArraySet( ) {
  }
  public CopyOnWriteArraySet(Collection<? extends E> c) {
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEmpty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] toArray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> T [] toArray(T [] a) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean remove(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean add(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsAll(Collection<?> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean addAll(Collection<? extends E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean removeAll(Collection<?> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean retainAll(Collection<?> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<E> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean removeIf(Predicate<? super E> filter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void forEach(Consumer<? super E> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Spliterator<E> spliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}