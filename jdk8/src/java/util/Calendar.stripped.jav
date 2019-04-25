package java.util;

import java.io.Serializable;
import java.time.Instant;

public abstract class Calendar implements Serializable, Cloneable, Comparable<Calendar> {
  public final static int ERA;
  public final static int YEAR;
  public final static int MONTH;
  public final static int WEEK_OF_YEAR;
  public final static int WEEK_OF_MONTH;
  public final static int DATE;
  public final static int DAY_OF_MONTH;
  public final static int DAY_OF_YEAR;
  public final static int DAY_OF_WEEK;
  public final static int DAY_OF_WEEK_IN_MONTH;
  public final static int AM_PM;
  public final static int HOUR;
  public final static int HOUR_OF_DAY;
  public final static int MINUTE;
  public final static int SECOND;
  public final static int MILLISECOND;
  public final static int ZONE_OFFSET;
  public final static int DST_OFFSET;
  public final static int FIELD_COUNT;
  public final static int SUNDAY;
  public final static int MONDAY;
  public final static int TUESDAY;
  public final static int WEDNESDAY;
  public final static int THURSDAY;
  public final static int FRIDAY;
  public final static int SATURDAY;
  public final static int JANUARY;
  public final static int FEBRUARY;
  public final static int MARCH;
  public final static int APRIL;
  public final static int MAY;
  public final static int JUNE;
  public final static int JULY;
  public final static int AUGUST;
  public final static int SEPTEMBER;
  public final static int OCTOBER;
  public final static int NOVEMBER;
  public final static int DECEMBER;
  public final static int UNDECIMBER;
  public final static int AM;
  public final static int PM;
  public static final int ALL_STYLES;
  public static final int SHORT;
  public static final int LONG;
  public static final int NARROW_FORMAT;
  public static final int NARROW_STANDALONE;
  public static final int SHORT_FORMAT;
  public static final int LONG_FORMAT;
  public static final int SHORT_STANDALONE;
  public static final int LONG_STANDALONE;
  public static class Builder {
    public Builder( ) {
    }
    public Builder setInstant(long instant) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setInstant(Date instant) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder set(int field, int value) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setFields(int ... fieldValuePairs) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setDate(int year,int month, int dayOfMonth) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setTimeOfDay(int hourOfDay,int minute, int second) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setTimeOfDay(int hourOfDay,int minute,int second, int millis) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setWeekDate(int weekYear,int weekOfYear, int dayOfWeek) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setTimeZone(TimeZone zone) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setLenient(boolean lenient) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setCalendarType(String type) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setLocale(Locale locale) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setWeekDefinition(int firstDayOfWeek, int minimalDaysInFirstWeek) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Calendar build( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  protected Calendar( ) {
    this(TimeZone. getDefaultRef( ), Locale. getDefault(Locale.Category.FORMAT));
  }
  protected Calendar(TimeZone zone, Locale aLocale) {
  }
  public static Calendar getInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Calendar getInstance(TimeZone zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Calendar getInstance(Locale aLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Calendar getInstance(TimeZone zone, Locale aLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized Locale [] getAvailableLocales( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Date getTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setTime(Date date) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getTimeInMillis( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTimeInMillis(long millis) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int get(int field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void set(int field, int value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void set(int year,int month, int date) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void set(int year,int month,int date,int hourOfDay, int minute) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void set(int year,int month,int date,int hourOfDay,int minute, int second) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void clear(int field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isSet(int field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getDisplayName(int field,int style, Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map<String, Integer> getDisplayNames(int field,int style, Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Set<String> getAvailableCalendarTypes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getCalendarType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean before(Object when) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean after(Object when) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(Calendar anotherCalendar) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  abstract public void add(int field, int amount) ;
  abstract public void roll(int field, boolean up) ;
  public void roll(int field, int amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTimeZone(TimeZone value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TimeZone getTimeZone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLenient(boolean lenient) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLenient( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFirstDayOfWeek(int value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getFirstDayOfWeek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMinimalDaysInFirstWeek(int value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMinimalDaysInFirstWeek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isWeekDateSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getWeekYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setWeekDate(int weekYear,int weekOfYear, int dayOfWeek) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getWeeksInWeekYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  abstract public int getMinimum(int field) ;
  abstract public int getMaximum(int field) ;
  abstract public int getGreatestMinimum(int field) ;
  abstract public int getLeastMaximum(int field) ;
  public int getActualMinimum(int field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getActualMaximum(int field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Instant toInstant( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}