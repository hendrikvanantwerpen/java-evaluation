package java.util;


public class SimpleTimeZone extends TimeZone {
  public SimpleTimeZone(int rawOffset, String ID) {
  }
  public SimpleTimeZone(int rawOffset,String ID,int startMonth,int startDay,int startDayOfWeek,int startTime,int endMonth,int endDay,int endDayOfWeek, int endTime) {
    this(rawOffset, ID, startMonth, startDay, startDayOfWeek, startTime, WALL_TIME, endMonth, endDay, endDayOfWeek, endTime, WALL_TIME, millisPerHour);
  }
  public SimpleTimeZone(int rawOffset,String ID,int startMonth,int startDay,int startDayOfWeek,int startTime,int endMonth,int endDay,int endDayOfWeek,int endTime, int dstSavings) {
    this(rawOffset, ID, startMonth, startDay, startDayOfWeek, startTime, WALL_TIME, endMonth, endDay, endDayOfWeek, endTime, WALL_TIME, dstSavings);
  }
  public SimpleTimeZone(int rawOffset,String ID,int startMonth,int startDay,int startDayOfWeek,int startTime,int startTimeMode,int endMonth,int endDay,int endDayOfWeek,int endTime,int endTimeMode, int dstSavings) {
  }
  public void setStartYear(int year) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setStartRule(int startMonth,int startDay,int startDayOfWeek, int startTime) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setStartRule(int startMonth,int startDay, int startTime) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setStartRule(int startMonth,int startDay,int startDayOfWeek,int startTime, boolean after) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setEndRule(int endMonth,int endDay,int endDayOfWeek, int endTime) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setEndRule(int endMonth,int endDay, int endTime) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setEndRule(int endMonth,int endDay,int endDayOfWeek,int endTime, boolean after) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getOffset(long date) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getOffset(int era,int year,int month,int day,int dayOfWeek, int millis) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRawOffset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setRawOffset(int offsetMillis) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDSTSavings(int millisSavedDuringDST) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDSTSavings( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean useDaylightTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean observesDaylightTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean inDaylightTime(Date date) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasSameRules(TimeZone other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final int WALL_TIME;
  public static final int STANDARD_TIME;
  public static final int UTC_TIME;
}