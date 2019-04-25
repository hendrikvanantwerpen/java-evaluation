package java.util.concurrent;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;

public class LinkedBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E>, java. io. Serializable {
  public LinkedBlockingQueue( ) {
    this(Integer.MAX_VALUE);
  }
  public LinkedBlockingQueue(int capacity) {
  }
  public LinkedBlockingQueue(Collection<? extends E> c) {
    this(Integer.MAX_VALUE);
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int remainingCapacity( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void put(E e) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offer(E e,long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offer(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E take( ) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E poll(long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E poll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E peek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean remove(Object o) {
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
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int drainTo(Collection<? super E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int drainTo(Collection<? super E> c, int maxElements) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<E> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Spliterator<E> spliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}