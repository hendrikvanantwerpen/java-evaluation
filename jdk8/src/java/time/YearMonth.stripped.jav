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

public final class YearMonth implements Temporal, TemporalAdjuster, Comparable<YearMonth>, Serializable {
  public static YearMonth now( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static YearMonth now(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static YearMonth now(Clock clock) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static YearMonth of(int year, Month month) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static YearMonth of(int year, int month) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static YearMonth from(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static YearMonth parse(CharSequence text) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static YearMonth parse(CharSequence text, DateTimeFormatter formatter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private YearMonth(int year, int month) {
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
  public int getYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMonthValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Month getMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLeapYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isValidDay(int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lengthOfMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lengthOfYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth with(TemporalAdjuster adjuster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth with(TemporalField field, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth withYear(int year) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth withMonth(int month) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth plus(TemporalAmount amountToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth plus(long amountToAdd, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth plusYears(long yearsToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth plusMonths(long monthsToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth minus(TemporalAmount amountToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth minus(long amountToSubtract, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth minusYears(long yearsToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public YearMonth minusMonths(long monthsToSubtract) {
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
  public LocalDate atDay(int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDate atEndOfMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(YearMonth other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAfter(YearMonth other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isBefore(YearMonth other) {
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