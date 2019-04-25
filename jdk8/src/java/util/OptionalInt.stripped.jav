package java.util;

import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public final class OptionalInt {
  private OptionalInt( ) {
  }
  public static OptionalInt empty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private OptionalInt(int value) {
  }
  public static OptionalInt of(int value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getAsInt( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isPresent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void ifPresent(IntConsumer consumer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int orElse(int other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int orElseGet(IntSupplier other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <X extends Throwable> int orElseThrow(Supplier<X> exceptionSupplier) throws X {
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