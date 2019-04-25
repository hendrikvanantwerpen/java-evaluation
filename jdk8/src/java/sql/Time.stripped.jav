package java.sql;

import java.time.Instant;
import java.time.LocalTime;

public class Time extends java. util. Date {
  @Deprecated public Time(int hour,int minute, int second) {
    super(70, 0, 1, hour, minute, second);
  }
  public Time(long time) {
    super(time);
  }
  public void setTime(long time) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Time valueOf(String s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDay( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setYear(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMonth(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDate(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Time valueOf(LocalTime time) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime toLocalTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Instant toInstant( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}