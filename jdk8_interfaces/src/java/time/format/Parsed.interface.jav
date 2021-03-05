package java.time.format;

import java.time.Period;
import java.time.ZoneId;
import java.time.chrono.Chronology;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.util.Map;
import java.util.Set;

final class Parsed implements TemporalAccessor {
  final Map<TemporalField, Long> fieldValues;
  ZoneId zone;
  Chronology chrono;
  boolean leapSecond;
  Period excessDays;
  Parsed( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  Parsed copy( ) {
                   throw new java . lang . RuntimeException ("Implementation stripped");
                 }
  public boolean isSupported(TemporalField field) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public long getLong(TemporalField field) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public <R> R query(TemporalQuery<R> query) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  TemporalAccessor resolve(ResolverStyle resolverStyle, Set<TemporalField> resolverFields) {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}