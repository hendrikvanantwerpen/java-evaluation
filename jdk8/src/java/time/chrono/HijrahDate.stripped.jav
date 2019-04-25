package java.time.chrono;

import java.io.Serializable;
import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public final class HijrahDate extends ChronoLocalDateImpl<HijrahDate> implements ChronoLocalDate, Serializable {
  public static HijrahDate now( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static HijrahDate now(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static HijrahDate now(Clock clock) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static HijrahDate of(int prolepticYear,int month, int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static HijrahDate from(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private HijrahDate(HijrahChronology chrono,int prolepticYear,int monthOfYear, int dayOfMonth) {
  }
  private HijrahDate(HijrahChronology chrono, long epochDay) {
  }
  public HijrahChronology getChronology( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public HijrahEra getEra( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lengthOfMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lengthOfYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ValueRange range(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getLong(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public HijrahDate with(TemporalField field, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public HijrahDate with(TemporalAdjuster adjuster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public HijrahDate withVariant(HijrahChronology chronology) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public HijrahDate plus(TemporalAmount amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public HijrahDate minus(TemporalAmount amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long toEpochDay( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLeapYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public HijrahDate plus(long amountToAdd, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public HijrahDate minus(long amountToSubtract, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final ChronoLocalDateTime<HijrahDate> atTime(LocalTime localTime) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ChronoPeriod until(ChronoLocalDate endDate) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}