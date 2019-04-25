package java.util.concurrent;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;

public class LinkedBlockingDeque<E> extends AbstractQueue<E> implements BlockingDeque<E>, java. io. Serializable {
  public LinkedBlockingDeque( ) {
    this(Integer.MAX_VALUE);
  }
  public LinkedBlockingDeque(int capacity) {
  }
  public LinkedBlockingDeque(Collection<? extends E> c) {
    this(Integer.MAX_VALUE);
  }
  public void addFirst(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addLast(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offerFirst(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offerLast(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void putFirst(E e) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void putLast(E e) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offerFirst(E e,long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offerLast(E e,long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E removeFirst( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E removeLast( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E pollFirst( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E pollLast( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E takeFirst( ) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E takeLast( ) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E pollFirst(long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E pollLast(long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E getFirst( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E getLast( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E peekFirst( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E peekLast( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean removeFirstOccurrence(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean removeLastOccurrence(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean add(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offer(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void put(E e) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offer(E e,long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E remove( ) {
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
  public E element( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E peek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int remainingCapacity( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int drainTo(Collection<? super E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int drainTo(Collection<? super E> c, int maxElements) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void push(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E pop( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean remove(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int size( ) {
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
  public Iterator<E> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<E> descendingIterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Spliterator<E> spliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}