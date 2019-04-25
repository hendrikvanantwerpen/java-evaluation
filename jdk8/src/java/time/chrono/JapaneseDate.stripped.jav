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

public final class JapaneseDate extends ChronoLocalDateImpl<JapaneseDate> implements ChronoLocalDate, Serializable {
  public static JapaneseDate now( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static JapaneseDate now(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static JapaneseDate now(Clock clock) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static JapaneseDate of(JapaneseEra era,int yearOfEra,int month, int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static JapaneseDate of(int prolepticYear,int month, int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static JapaneseDate from(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  JapaneseDate(LocalDate isoDate) {
  }
  JapaneseDate(JapaneseEra era,int year, LocalDate isoDate) {
  }
  public JapaneseChronology getChronology( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public JapaneseEra getEra( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lengthOfMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lengthOfYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isSupported(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ValueRange range(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getLong(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public JapaneseDate with(TemporalField field, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public JapaneseDate with(TemporalAdjuster adjuster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public JapaneseDate plus(TemporalAmount amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public JapaneseDate minus(TemporalAmount amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public JapaneseDate plus(long amountToAdd, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public JapaneseDate minus(long amountToAdd, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final ChronoLocalDateTime<JapaneseDate> atTime(LocalTime localTime) {
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