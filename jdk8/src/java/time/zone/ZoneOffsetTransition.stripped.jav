package java.time.zone;

import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public final class ZoneOffsetTransition implements Comparable<ZoneOffsetTransition>, Serializable {
  public static ZoneOffsetTransition of(LocalDateTime transition,ZoneOffset offsetBefore, ZoneOffset offsetAfter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ZoneOffsetTransition(LocalDateTime transition,ZoneOffset offsetBefore, ZoneOffset offsetAfter) {
  }
  ZoneOffsetTransition(long epochSecond,ZoneOffset offsetBefore, ZoneOffset offsetAfter) {
  }
  public Instant getInstant( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long toEpochSecond( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime getDateTimeBefore( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime getDateTimeAfter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZoneOffset getOffsetBefore( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZoneOffset getOffsetAfter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration getDuration( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isGap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isOverlap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isValidOffset(ZoneOffset offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(ZoneOffsetTransition transition) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}