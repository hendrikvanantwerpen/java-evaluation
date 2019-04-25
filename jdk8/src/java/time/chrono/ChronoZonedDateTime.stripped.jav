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
import java.time.temporal.ValueRange;
import java.util.Comparator;

public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
  static Comparator<ChronoZonedDateTime<?>> timeLineOrder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static ChronoZonedDateTime<?> from(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default ValueRange range(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default int get(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default long getLong(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default D toLocalDate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default LocalTime toLocalTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ChronoLocalDateTime<D> toLocalDateTime( ) ;
  default Chronology getChronology( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ZoneOffset getOffset( ) ;
  ZoneId getZone( ) ;
  ChronoZonedDateTime<D> withEarlierOffsetAtOverlap( ) ;
  ChronoZonedDateTime<D> withLaterOffsetAtOverlap( ) ;
  ChronoZonedDateTime<D> withZoneSameLocal(ZoneId zone) ;
  ChronoZonedDateTime<D> withZoneSameInstant(ZoneId zone) ;
  @Override boolean isSupported(TemporalField field) ;
  @Override default boolean isSupported(TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default ChronoZonedDateTime<D> with(TemporalAdjuster adjuster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override ChronoZonedDateTime<D> with(TemporalField field, long newValue) ;
  @Override default ChronoZonedDateTime<D> plus(TemporalAmount amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override ChronoZonedDateTime<D> plus(long amountToAdd, TemporalUnit unit) ;
  @Override default ChronoZonedDateTime<D> minus(TemporalAmount amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default ChronoZonedDateTime<D> minus(long amountToSubtract, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @SuppressWarnings("unchecked") @Override default <R> R query(TemporalQuery<R> query) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default String format(DateTimeFormatter formatter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default Instant toInstant( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default long toEpochSecond( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default int compareTo(ChronoZonedDateTime<?> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default boolean isBefore(ChronoZonedDateTime<?> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default boolean isAfter(ChronoZonedDateTime<?> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default boolean isEqual(ChronoZonedDateTime<?> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override boolean equals(Object obj) ;
  @Override int hashCode( ) ;
  @Override String toString( ) ;
}