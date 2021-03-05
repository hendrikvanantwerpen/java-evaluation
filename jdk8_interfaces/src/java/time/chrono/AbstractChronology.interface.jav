package java.time.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public abstract class AbstractChronology implements Chronology {
  static final Comparator<ChronoLocalDate> DATE_ORDER;
  static final Comparator<ChronoLocalDateTime<? extends ChronoLocalDate>> DATE_TIME_ORDER;
  static final Comparator<ChronoZonedDateTime<?>> INSTANT_ORDER;
  static Chronology registerChrono(Chronology chrono) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  static Chronology registerChrono(Chronology chrono, String id) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  static Chronology ofLocale(Locale locale) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  static Chronology of(String id) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  static Set<Chronology> getAvailableChronologies( ) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public ChronoLocalDate resolveDate(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
  void resolveProlepticMonth(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  ChronoLocalDate resolveYearOfEra(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                      }
  ChronoLocalDate resolveYMD(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  ChronoLocalDate resolveYD(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                               }
  ChronoLocalDate resolveYMAA(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                 }
  ChronoLocalDate resolveYMAD(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                 }
  ChronoLocalDate resolveYAA(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  ChronoLocalDate resolveYAD(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  ChronoLocalDate resolveAligned(ChronoLocalDate base,long months,long weeks, long dow) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  void addFieldValue(Map<TemporalField, Long> fieldValues,ChronoField field, long value) {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
  public int compareTo(Chronology other) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  Object writeReplace( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  void writeExternal(DataOutput out) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  static Chronology readExternal(DataInput in) throws IOException {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
}