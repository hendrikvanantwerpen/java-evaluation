package java.time.chrono;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

public interface ChronoPeriod extends TemporalAmount {
  public static ChronoPeriod between(ChronoLocalDate startDateInclusive, ChronoLocalDate endDateExclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override long get(TemporalUnit unit) ;
  @Override List<TemporalUnit> getUnits( ) ;
  Chronology getChronology( ) ;
  default boolean isZero( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default boolean isNegative( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ChronoPeriod plus(TemporalAmount amountToAdd) ;
  ChronoPeriod minus(TemporalAmount amountToSubtract) ;
  ChronoPeriod multipliedBy(int scalar) ;
  default ChronoPeriod negated( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ChronoPeriod normalized( ) ;
  @Override Temporal addTo(Temporal temporal) ;
  @Override Temporal subtractFrom(Temporal temporal) ;
  @Override boolean equals(Object obj) ;
  @Override int hashCode( ) ;
  @Override String toString( ) ;
}