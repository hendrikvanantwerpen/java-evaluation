package java.time.chrono;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.util.Comparator;

public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate> {
  static Comparator<ChronoLocalDate> timeLineOrder( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  static ChronoLocalDate from(TemporalAccessor temporal) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  Chronology getChronology( ) ;
  default Era getEra( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  default boolean isLeapYear( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  int lengthOfMonth( ) ;
  default int lengthOfYear( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  default boolean isSupported(TemporalField field) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  default boolean isSupported(TemporalUnit unit) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  default ChronoLocalDate with(TemporalAdjuster adjuster) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  default ChronoLocalDate with(TemporalField field, long newValue) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  default ChronoLocalDate plus(TemporalAmount amount) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  default ChronoLocalDate plus(long amountToAdd, TemporalUnit unit) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  default ChronoLocalDate minus(TemporalAmount amount) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  default ChronoLocalDate minus(long amountToSubtract, TemporalUnit unit) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  default <R> R query(TemporalQuery<R> query) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  default Temporal adjustInto(Temporal temporal) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  long until(Temporal endExclusive, TemporalUnit unit) ;
  ChronoPeriod until(ChronoLocalDate endDateExclusive) ;
  default String format(DateTimeFormatter formatter) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  default ChronoLocalDateTime<?> atTime(LocalTime localTime) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  default long toEpochDay( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  default int compareTo(ChronoLocalDate other) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  default boolean isAfter(ChronoLocalDate other) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  default boolean isBefore(ChronoLocalDate other) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  default boolean isEqual(ChronoLocalDate other) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  boolean equals(Object obj) ;
  int hashCode( ) ;
  String toString( ) ;
}