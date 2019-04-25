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

public final class LocalTime implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable {
  public static final LocalTime MIN;
  public static final LocalTime MAX;
  public static final LocalTime MIDNIGHT;
  public static final LocalTime NOON;
  public static LocalTime now( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalTime now(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalTime now(Clock clock) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalTime of(int hour, int minute) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalTime of(int hour,int minute, int second) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalTime of(int hour,int minute,int second, int nanoOfSecond) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalTime ofSecondOfDay(long secondOfDay) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalTime ofNanoOfDay(long nanoOfDay) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalTime from(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalTime parse(CharSequence text) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalTime parse(CharSequence text, DateTimeFormatter formatter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private LocalTime(int hour,int minute,int second, int nanoOfSecond) {
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
  public LocalTime with(TemporalAdjuster adjuster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime with(TemporalField field, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime withHour(int hour) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime withMinute(int minute) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime withSecond(int second) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime withNano(int nanoOfSecond) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime truncatedTo(TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime plus(TemporalAmount amountToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime plus(long amountToAdd, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime plusHours(long hoursToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime plusMinutes(long minutesToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime plusSeconds(long secondstoAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime plusNanos(long nanosToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime minus(TemporalAmount amountToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime minus(long amountToSubtract, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime minusHours(long hoursToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime minusMinutes(long minutesToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime minusSeconds(long secondsToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime minusNanos(long nanosToSubtract) {
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
  public LocalDateTime atDate(LocalDate date) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetTime atOffset(ZoneOffset offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int toSecondOfDay( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long toNanoOfDay( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(LocalTime other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAfter(LocalTime other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isBefore(LocalTime other) {
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