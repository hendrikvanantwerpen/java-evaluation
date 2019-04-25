package java.time.chrono;

import java.io.Serializable;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.ValueRange;
import java.util.List;
import java.util.Map;

public final class ThaiBuddhistChronology extends AbstractChronology implements Serializable {
  public static final ThaiBuddhistChronology INSTANCE;
  private ThaiBuddhistChronology( ) {
  }
  public String getId( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getCalendarType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThaiBuddhistDate date(Era era,int yearOfEra,int month, int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThaiBuddhistDate date(int prolepticYear,int month, int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThaiBuddhistDate dateYearDay(Era era,int yearOfEra, int dayOfYear) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThaiBuddhistDate dateYearDay(int prolepticYear, int dayOfYear) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThaiBuddhistDate dateEpochDay(long epochDay) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThaiBuddhistDate dateNow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThaiBuddhistDate dateNow(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThaiBuddhistDate dateNow(Clock clock) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThaiBuddhistDate date(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ChronoLocalDateTime<ThaiBuddhistDate> localDateTime(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ChronoZonedDateTime<ThaiBuddhistDate> zonedDateTime(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ChronoZonedDateTime<ThaiBuddhistDate> zonedDateTime(Instant instant, ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLeapYear(long prolepticYear) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int prolepticYear(Era era, int yearOfEra) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThaiBuddhistEra eraOf(int eraValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<Era> eras( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ValueRange range(ChronoField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThaiBuddhistDate resolveDate(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}