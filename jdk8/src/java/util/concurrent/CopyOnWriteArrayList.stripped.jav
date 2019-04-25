package java.util.concurrent;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CopyOnWriteArrayList<E> implements List<E>, RandomAccess, Cloneable, java. io. Serializable {
  public CopyOnWriteArrayList( ) {
  }
  public CopyOnWriteArrayList(Collection<? extends E> c) {
  }
  public CopyOnWriteArrayList(E [] toCopyIn) {
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
  public int indexOf(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int indexOf(E e, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lastIndexOf(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lastIndexOf(E e, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] toArray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> T [] toArray(T a[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E get(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E set(int index, E element) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean add(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(int index, E element) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E remove(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean remove(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean addIfAbsent(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsAll(Collection<?> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean removeAll(Collection<?> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean retainAll(Collection<?> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int addAllAbsent(Collection<? extends E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean addAll(Collection<? extends E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean addAll(int index, Collection<? extends E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void forEach(Consumer<? super E> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean removeIf(Predicate<? super E> filter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void replaceAll(UnaryOperator<E> operator) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void sort(Comparator<? super E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<E> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ListIterator<E> listIterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ListIterator<E> listIterator(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Spliterator<E> spliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<E> subList(int fromIndex, int toIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}