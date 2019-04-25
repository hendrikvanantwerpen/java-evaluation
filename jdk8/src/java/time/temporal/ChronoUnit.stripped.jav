package java.time.temporal;

import java.time.Duration;

public enum ChronoUnit implements TemporalUnit {
  NANOS (null), MICROS (null), MILLIS (null), SECONDS (null), MINUTES (null), HOURS (null), HALF_DAYS (null), DAYS (null), WEEKS (null), MONTHS (null), YEARS (null), DECADES (null), CENTURIES (null), MILLENNIA (null), ERAS (null), FOREVER (null)
  ;  private final String name;
     private final Duration duration;
     private ChronoUnit(String name, Duration estimatedDuration) {
  }
     public Duration getDuration( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public boolean isDurationEstimated( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public boolean isDateBased( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public boolean isTimeBased( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public boolean isSupportedBy(Temporal temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public <R extends Temporal> R addTo(R temporal, long amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public long between(Temporal temporal1Inclusive, Temporal temporal2Exclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}