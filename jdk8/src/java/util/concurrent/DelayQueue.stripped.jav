package java.util.concurrent;

import java.util.*;

public class DelayQueue<E extends Delayed> extends AbstractQueue<E> implements BlockingQueue<E> {
  public DelayQueue( ) {
  }
  public DelayQueue(Collection<? extends E> c) {
  }
  public boolean add(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offer(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void put(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offer(E e,long timeout, TimeUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E poll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E take( ) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E poll(long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E peek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int drainTo(Collection<? super E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int drainTo(Collection<? super E> c, int maxElements) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int remainingCapacity( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] toArray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> T [] toArray(T [] a) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean remove(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<E> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}