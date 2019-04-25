package java.time.temporal;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.Locale;

public final class WeekFields implements Serializable {
  public static final WeekFields ISO;
  public static final WeekFields SUNDAY_START;
  public static final TemporalUnit WEEK_BASED_YEARS;
  public static WeekFields of(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WeekFields of(DayOfWeek firstDayOfWeek, int minimalDaysInFirstWeek) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private WeekFields(DayOfWeek firstDayOfWeek, int minimalDaysInFirstWeek) {
  }
  public DayOfWeek getFirstDayOfWeek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMinimalDaysInFirstWeek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TemporalField dayOfWeek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TemporalField weekOfMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TemporalField weekOfYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TemporalField weekOfWeekBasedYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TemporalField weekBasedYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object object) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}