package java.time.chrono;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.util.Comparator;

public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
  static Comparator<ChronoLocalDateTime<?>> timeLineOrder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static ChronoLocalDateTime<?> from(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default Chronology getChronology( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  D toLocalDate( ) ;
  LocalTime toLocalTime( ) ;
  @Override boolean isSupported(TemporalField field) ;
  @Override default boolean isSupported(TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default ChronoLocalDateTime<D> with(TemporalAdjuster adjuster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override ChronoLocalDateTime<D> with(TemporalField field, long newValue) ;
  @Override default ChronoLocalDateTime<D> plus(TemporalAmount amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override ChronoLocalDateTime<D> plus(long amountToAdd, TemporalUnit unit) ;
  @Override default ChronoLocalDateTime<D> minus(TemporalAmount amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default ChronoLocalDateTime<D> minus(long amountToSubtract, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @SuppressWarnings("unchecked") @Override default <R> R query(TemporalQuery<R> query) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default Temporal adjustInto(Temporal temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default String format(DateTimeFormatter formatter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ChronoZonedDateTime<D> atZone(ZoneId zone) ;
  default Instant toInstant(ZoneOffset offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default long toEpochSecond(ZoneOffset offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default int compareTo(ChronoLocalDateTime<?> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default boolean isAfter(ChronoLocalDateTime<?> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default boolean isBefore(ChronoLocalDateTime<?> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default boolean isEqual(ChronoLocalDateTime<?> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override boolean equals(Object obj) ;
  @Override int hashCode( ) ;
  @Override String toString( ) ;
}