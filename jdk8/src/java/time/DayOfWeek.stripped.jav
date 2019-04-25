package java.time;

import java.time.format.TextStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.ValueRange;
import java.util.Locale;

public enum DayOfWeek implements TemporalAccessor, TemporalAdjuster {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
  ;  private static final DayOfWeek [] ENUMS;
     public static DayOfWeek of(int dayOfWeek) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public static DayOfWeek from(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public int getValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public String getDisplayName(TextStyle style, Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
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
     public DayOfWeek plus(long days) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public DayOfWeek minus(long days) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public <R> R query(TemporalQuery<R> query) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public Temporal adjustInto(Temporal temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}