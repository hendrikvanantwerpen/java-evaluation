package java.util;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public final class Optional<T> {
  private Optional( ) {
  }
  public static <T> Optional<T> empty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private Optional(T value) {
  }
  public static <T> Optional<T> of(T value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Optional<T> ofNullable(T value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T get( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isPresent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void ifPresent(Consumer<? super T> consumer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Optional<T> filter(Predicate<? super T> predicate) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> Optional<U> map(Function<? super T, ? extends U> mapper) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> Optional<U> flatMap(Function<? super T, Optional<U>> mapper) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T orElse(T other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T orElseGet(Supplier<? extends T> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}