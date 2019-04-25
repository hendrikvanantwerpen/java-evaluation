package java.time.zone;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;

public final class ZoneOffsetTransitionRule implements Serializable {
  public static ZoneOffsetTransitionRule of(Month month,int dayOfMonthIndicator,DayOfWeek dayOfWeek,LocalTime time,boolean timeEndOfDay,TimeDefinition timeDefnition,ZoneOffset standardOffset,ZoneOffset offsetBefore, ZoneOffset offsetAfter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ZoneOffsetTransitionRule(Month month,int dayOfMonthIndicator,DayOfWeek dayOfWeek,LocalTime time,boolean timeEndOfDay,TimeDefinition timeDefnition,ZoneOffset standardOffset,ZoneOffset offsetBefore, ZoneOffset offsetAfter) {
  }
  public Month getMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDayOfMonthIndicator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DayOfWeek getDayOfWeek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime getLocalTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMidnightEndOfDay( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TimeDefinition getTimeDefinition( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZoneOffset getStandardOffset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZoneOffset getOffsetBefore( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZoneOffset getOffsetAfter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZoneOffsetTransition createTransition(int year) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object otherRule) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static enum TimeDefinition {
    UTC, WALL, STANDARD
    ;  public LocalDateTime createDateTime(LocalDateTime dateTime,ZoneOffset standardOffset, ZoneOffset wallOffset) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
}