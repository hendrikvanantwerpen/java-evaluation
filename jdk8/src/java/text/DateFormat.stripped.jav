package java.text;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class DateFormat extends Format {
  public final static int ERA_FIELD;
  public final static int YEAR_FIELD;
  public final static int MONTH_FIELD;
  public final static int DATE_FIELD;
  public final static int HOUR_OF_DAY1_FIELD;
  public final static int HOUR_OF_DAY0_FIELD;
  public final static int MINUTE_FIELD;
  public final static int SECOND_FIELD;
  public final static int MILLISECOND_FIELD;
  public final static int DAY_OF_WEEK_FIELD;
  public final static int DAY_OF_YEAR_FIELD;
  public final static int DAY_OF_WEEK_IN_MONTH_FIELD;
  public final static int WEEK_OF_YEAR_FIELD;
  public final static int WEEK_OF_MONTH_FIELD;
  public final static int AM_PM_FIELD;
  public final static int HOUR1_FIELD;
  public final static int HOUR0_FIELD;
  public final static int TIMEZONE_FIELD;
  public final StringBuffer format(Object obj,StringBuffer toAppendTo, FieldPosition fieldPosition) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract StringBuffer format(Date date,StringBuffer toAppendTo, FieldPosition fieldPosition) ;
  public final String format(Date date) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Date parse(String source) throws ParseException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Date parse(String source, ParsePosition pos) ;
  public Object parseObject(String source, ParsePosition pos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final int FULL;
  public static final int LONG;
  public static final int MEDIUM;
  public static final int SHORT;
  public static final int DEFAULT;
  public final static DateFormat getTimeInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static DateFormat getTimeInstance(int style) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static DateFormat getTimeInstance(int style, Locale aLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static DateFormat getDateInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static DateFormat getDateInstance(int style) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static DateFormat getDateInstance(int style, Locale aLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static DateFormat getDateTimeInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static DateFormat getDateTimeInstance(int dateStyle, int timeStyle) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static DateFormat getDateTimeInstance(int dateStyle,int timeStyle, Locale aLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static DateFormat getInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Locale [] getAvailableLocales( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCalendar(Calendar newCalendar) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Calendar getCalendar( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setNumberFormat(NumberFormat newNumberFormat) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NumberFormat getNumberFormat( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTimeZone(TimeZone zone) {
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
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  protected DateFormat( ) {
  }
  public static class Field extends Format. Field {
    public static Field ofCalendarField(int calendarField) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    protected Field(String name, int calendarField) {
      super(name);
    }
    public int getCalendarField( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final static Field ERA;
    public final static Field YEAR;
    public final static Field MONTH;
    public final static Field DAY_OF_MONTH;
    public final static Field HOUR_OF_DAY1;
    public final static Field HOUR_OF_DAY0;
    public final static Field MINUTE;
    public final static Field SECOND;
    public final static Field MILLISECOND;
    public final static Field DAY_OF_WEEK;
    public final static Field DAY_OF_YEAR;
    public final static Field DAY_OF_WEEK_IN_MONTH;
    public final static Field WEEK_OF_YEAR;
    public final static Field WEEK_OF_MONTH;
    public final static Field AM_PM;
    public final static Field HOUR1;
    public final static Field HOUR0;
    public final static Field TIME_ZONE;
  }
}