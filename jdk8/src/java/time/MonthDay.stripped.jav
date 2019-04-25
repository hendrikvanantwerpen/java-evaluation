package java.time;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.ValueRange;

public final class MonthDay implements TemporalAccessor, TemporalAdjuster, Comparable<MonthDay>, Serializable {
  public static MonthDay now( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MonthDay now(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MonthDay now(Clock clock) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MonthDay of(Month month, int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MonthDay of(int month, int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MonthDay from(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MonthDay parse(CharSequence text) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MonthDay parse(CharSequence text, DateTimeFormatter formatter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private MonthDay(int month, int dayOfMonth) {
  }
  public boolean isSupported(TemporalField field) {
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
  public int getMonthValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Month getMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDayOfMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isValidYear(int year) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MonthDay withMonth(int month) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MonthDay with(Month month) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MonthDay withDayOfMonth(int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <R> R query(TemporalQuery<R> query) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Temporal adjustInto(Temporal temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String format(DateTimeFormatter formatter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDate atYear(int year) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(MonthDay other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAfter(MonthDay other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isBefore(MonthDay other) {
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