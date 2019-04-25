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

public final class MinguoChronology extends AbstractChronology implements Serializable {
  public static final MinguoChronology INSTANCE;
  private MinguoChronology( ) {
  }
  public String getId( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getCalendarType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate date(Era era,int yearOfEra,int month, int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate date(int prolepticYear,int month, int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate dateYearDay(Era era,int yearOfEra, int dayOfYear) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate dateYearDay(int prolepticYear, int dayOfYear) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate dateEpochDay(long epochDay) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate dateNow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate dateNow(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate dateNow(Clock clock) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate date(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ChronoLocalDateTime<MinguoDate> localDateTime(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ChronoZonedDateTime<MinguoDate> zonedDateTime(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ChronoZonedDateTime<MinguoDate> zonedDateTime(Instant instant, ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLeapYear(long prolepticYear) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int prolepticYear(Era era, int yearOfEra) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoEra eraOf(int eraValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<Era> eras( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ValueRange range(ChronoField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MinguoDate resolveDate(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}