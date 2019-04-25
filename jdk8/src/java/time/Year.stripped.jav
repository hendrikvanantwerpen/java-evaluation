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

public final class Year implements Temporal, TemporalAdjuster, Comparable<Year>, Serializable {
  public static final int MIN_VALUE;
  public static final int MAX_VALUE;
  public static Year now( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Year now(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Year now(Clock clock) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Year of(int isoYear) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Year from(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Year parse(CharSequence text) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Year parse(CharSequence text, DateTimeFormatter formatter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isLeap(long year) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private Year(int year) {
  }
  public int getValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
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
  public boolean isLeap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isValidMonthDay(MonthDay monthDay) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int length( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Year with(TemporalAdjuster adjuster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Year with(TemporalField field, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Year plus(TemporalAmount amountToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Year plus(long amountToAdd, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Year plusYears(long yearsToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Year minus(TemporalAmount amountToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Year minus(long amountToSubtract, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Year minusYears(long yearsToSubtract) {
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
  public LocalDate atDay(int dayOfYear) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth atMonth(Month month) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth atMonth(int month) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDate atMonthDay(MonthDay monthDay) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(Year other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAfter(Year other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isBefore(Year other) {
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