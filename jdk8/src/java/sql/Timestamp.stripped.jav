package java.sql;

import java.time.Instant;
import java.time.LocalDateTime;

public class Timestamp extends java. util. Date {
  @Deprecated public Timestamp(int year,int month,int date,int hour,int minute,int second, int nano) {
    super(year, month, date, hour, minute, second);
  }
  public Timestamp(long time) {
    super(time / 1000 * 1000);
  }
  public void setTime(long time) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Timestamp valueOf(String s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNanos( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setNanos(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Timestamp ts) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(java. lang. Object ts) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean before(Timestamp ts) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean after(Timestamp ts) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(Timestamp ts) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(java. util. Date o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Timestamp valueOf(LocalDateTime dateTime) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime toLocalDateTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Timestamp from(Instant instant) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Instant toInstant( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}