package java.sql;

import java.time.Instant;
import java.time.LocalDate;

public class Date extends java. util. Date {
  @Deprecated public Date(int year,int month, int day) {
    super(year, month, day);
  }
  public Date(long date) {
    super(date);
  }
  public void setTime(long date) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Date valueOf(String s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getHours( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMinutes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSeconds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setHours(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMinutes(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSeconds(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Date valueOf(LocalDate date) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDate toLocalDate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Instant toInstant( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}