package java.time.chrono;

import java.time.format.ResolverStyle;
import java.time.temporal.TemporalField;
import java.util.Map;

public abstract class AbstractChronology implements Chronology {
  protected AbstractChronology( ) {
  }
  public ChronoLocalDate resolveDate(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(Chronology other) {
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