package java.time;

import java.io.Serializable;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
  public static final Duration ZERO;
  public static Duration ofDays(long days) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Duration ofHours(long hours) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Duration ofMinutes(long minutes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Duration ofSeconds(long seconds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Duration ofSeconds(long seconds, long nanoAdjustment) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Duration ofMillis(long millis) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Duration ofNanos(long nanos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Duration of(long amount, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Duration from(TemporalAmount amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Duration parse(CharSequence text) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Duration between(Temporal startInclusive, Temporal endExclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private Duration(long seconds, int nanos) {
    super( );
  }
  public long get(TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<TemporalUnit> getUnits( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isZero( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isNegative( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getSeconds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNano( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration withSeconds(long seconds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration withNanos(int nanoOfSecond) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration plus(Duration duration) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration plus(long amountToAdd, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration plusDays(long daysToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration plusHours(long hoursToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration plusMinutes(long minutesToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration plusSeconds(long secondsToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration plusMillis(long millisToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration plusNanos(long nanosToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration minus(Duration duration) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration minus(long amountToSubtract, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration minusDays(long daysToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration minusHours(long hoursToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration minusMinutes(long minutesToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration minusSeconds(long secondsToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration minusMillis(long millisToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration minusNanos(long nanosToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration multipliedBy(long multiplicand) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration dividedBy(long divisor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration negated( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Duration abs( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Temporal addTo(Temporal temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Temporal subtractFrom(Temporal temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long toDays( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long toHours( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long toMinutes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long toMillis( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long toNanos( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(Duration otherDuration) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object otherDuration) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}