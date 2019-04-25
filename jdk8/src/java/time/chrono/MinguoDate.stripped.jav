package java.time.chrono;

import java.io.Serializable;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public final class MinguoDate extends ChronoLocalDateImpl<MinguoDate> implements ChronoLocalDate, Serializable {
  public static MinguoDate now( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MinguoDate now(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MinguoDate now(Clock clock) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MinguoDate of(int prolepticYear,int month, int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MinguoDate from(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  MinguoDate(LocalDate isoDate) {
  }
  public MinguoChronology getChronology( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoEra getEra( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lengthOfMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ValueRange range(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getLong(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate with(TemporalField field, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate with(TemporalAdjuster adjuster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate plus(TemporalAmount amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate minus(TemporalAmount amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate plus(long amountToAdd, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate minus(long amountToAdd, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final ChronoLocalDateTime<MinguoDate> atTime(LocalTime localTime) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ChronoPeriod until(ChronoLocalDate endDate) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long toEpochDay( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}