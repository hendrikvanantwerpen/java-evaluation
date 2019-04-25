package java.time.temporal;

import java.time.Duration;

public interface TemporalUnit {
  Duration getDuration( ) ;
  boolean isDurationEstimated( ) ;
  boolean isDateBased( ) ;
  boolean isTimeBased( ) ;
  default boolean isSupportedBy(Temporal temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  <R extends Temporal> R addTo(R temporal, long amount) ;
  long between(Temporal temporal1Inclusive, Temporal temporal2Exclusive) ;
  @Override String toString( ) ;
}