package java.time;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public final class OffsetTime implements Temporal, TemporalAdjuster, Comparable<OffsetTime>, Serializable {
  public static final OffsetTime MIN;
  public static final OffsetTime MAX;
  public static OffsetTime now( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static OffsetTime now(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static OffsetTime now(Clock clock) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static OffsetTime of(LocalTime time, ZoneOffset offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static OffsetTime of(int hour,int minute,int second,int nanoOfSecond, ZoneOffset offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static OffsetTime ofInstant(Instant instant, ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static OffsetTime from(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static OffsetTime parse(CharSequence text) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static OffsetTime parse(CharSequence text, DateTimeFormatter formatter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private OffsetTime(LocalTime time, ZoneOffset offset) {
  }
  public boolean isSupported(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isSupported(TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ValueRange range(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int get(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getLong(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZoneOffset getOffset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime withOffsetSameLocal(ZoneOffset offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime withOffsetSameInstant(ZoneOffset offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime toLocalTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getHour( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMinute( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSecond( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNano( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime with(TemporalAdjuster adjuster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime with(TemporalField field, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime withHour(int hour) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime withMinute(int minute) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime withSecond(int second) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime withNano(int nanoOfSecond) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime truncatedTo(TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime plus(TemporalAmount amountToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime plus(long amountToAdd, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime plusHours(long hours) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime plusMinutes(long minutes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime plusSeconds(long seconds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime plusNanos(long nanos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime minus(TemporalAmount amountToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime minus(long amountToSubtract, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime minusHours(long hours) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime minusMinutes(long minutes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime minusSeconds(long seconds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime minusNanos(long nanos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <R> R query(TemporalQuery<R> query) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Temporal adjustInto(Temporal temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long until(Temporal endExclusive, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String format(DateTimeFormatter formatter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetDateTime atDate(LocalDate date) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(OffsetTime other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAfter(OffsetTime other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isBefore(OffsetTime other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEqual(OffsetTime other) {
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