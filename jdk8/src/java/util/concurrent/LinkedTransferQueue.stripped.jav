package java.util.concurrent;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.Spliterator;

public class LinkedTransferQueue<E> extends AbstractQueue<E> implements TransferQueue<E>, java. io. Serializable {
  public Spliterator<E> spliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LinkedTransferQueue( ) {
  }
  public LinkedTransferQueue(Collection<? extends E> c) {
    this( );
  }
  public void put(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offer(E e,long timeout, TimeUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offer(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean add(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean tryTransfer(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void transfer(E e) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean tryTransfer(E e,long timeout, TimeUnit unit) throws InterruptedException {
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
  public int drainTo(Collection<? super E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int drainTo(Collection<? super E> c, int maxElements) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<E> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E peek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEmpty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasWaitingConsumer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getWaitingConsumerCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean remove(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int remainingCapacity( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}