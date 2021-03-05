package java.time.chrono;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

public interface ChronoPeriod extends TemporalAmount {
  public static ChronoPeriod between(ChronoLocalDate startDateInclusive, ChronoLocalDate endDateExclusive) {
                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                           }
  long get(TemporalUnit unit) ;
  List<TemporalUnit> getUnits( ) ;
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
  Temporal addTo(Temporal temporal) ;
  Temporal subtractFrom(Temporal temporal) ;
  boolean equals(Object obj) ;
  int hashCode( ) ;
  String toString( ) ;
}