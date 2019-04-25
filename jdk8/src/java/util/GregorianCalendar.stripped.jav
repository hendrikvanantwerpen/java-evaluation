package java.util;

import java.time.ZonedDateTime;

public class GregorianCalendar extends Calendar {
  public static final int BC;
  public static final int AD;
  public GregorianCalendar( ) {
    this(TimeZone. getDefaultRef( ), Locale. getDefault(Locale.Category.FORMAT));
  }
  public GregorianCalendar(TimeZone zone) {
    this(zone, Locale. getDefault(Locale.Category.FORMAT));
  }
  public GregorianCalendar(Locale aLocale) {
    this(TimeZone. getDefaultRef( ), aLocale);
  }
  public GregorianCalendar(TimeZone zone, Locale aLocale) {
    super(zone, aLocale);
  }
  public GregorianCalendar(int year,int month, int dayOfMonth) {
    this(year, month, dayOfMonth, 0, 0, 0, 0);
  }
  public GregorianCalendar(int year,int month,int dayOfMonth,int hourOfDay, int minute) {
    this(year, month, dayOfMonth, hourOfDay, minute, 0, 0);
  }
  public GregorianCalendar(int year,int month,int dayOfMonth,int hourOfDay,int minute, int second) {
    this(year, month, dayOfMonth, hourOfDay, minute, second, 0);
  }
  GregorianCalendar(int year,int month,int dayOfMonth,int hourOfDay,int minute,int second, int millis) {
    super( );
  }
  GregorianCalendar(TimeZone zone,Locale locale, boolean flag) {
    super(zone, locale);
  }
  public void setGregorianChange(Date date) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Date getGregorianChange( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLeapYear(int year) {
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
  public void add(int field, int amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void roll(int field, boolean up) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void roll(int field, int amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMinimum(int field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMaximum(int field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getGreatestMinimum(int field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getLeastMaximum(int field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getActualMinimum(int field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getActualMaximum(int field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TimeZone getTimeZone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTimeZone(TimeZone zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isWeekDateSupported( ) {
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
  public ZonedDateTime toZonedDateTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static GregorianCalendar from(ZonedDateTime zdt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}