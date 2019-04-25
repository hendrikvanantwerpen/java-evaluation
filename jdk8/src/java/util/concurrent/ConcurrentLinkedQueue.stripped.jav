package java.util.concurrent;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;

public class ConcurrentLinkedQueue<E> extends AbstractQueue<E> implements Queue<E>, java. io. Serializable {
  public ConcurrentLinkedQueue( ) {
  }
  public ConcurrentLinkedQueue(Collection<? extends E> c) {
  }
  public boolean add(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offer(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E poll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E peek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEmpty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean remove(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean addAll(Collection<? extends E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] toArray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> T [] toArray(T [] a) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<E> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Spliterator<E> spliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}