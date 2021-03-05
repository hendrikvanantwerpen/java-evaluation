package java.time;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
  public static final Instant EPOCH;
  public static final Instant MIN;
  public static final Instant MAX;
  public static Instant now( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public static Instant now(Clock clock) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public static Instant ofEpochSecond(long epochSecond) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public static Instant ofEpochSecond(long epochSecond, long nanoAdjustment) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  public static Instant ofEpochMilli(long epochMilli) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public static Instant from(TemporalAccessor temporal) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public static Instant parse(final CharSequence text) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public boolean isSupported(TemporalField field) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public boolean isSupported(TemporalUnit unit) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public ValueRange range(TemporalField field) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public int get(TemporalField field) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public long getLong(TemporalField field) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public long getEpochSecond( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public int getNano( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public Instant with(TemporalAdjuster adjuster) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public Instant with(TemporalField field, long newValue) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public Instant truncatedTo(TemporalUnit unit) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public Instant plus(TemporalAmount amountToAdd) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public Instant plus(long amountToAdd, TemporalUnit unit) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public Instant plusSeconds(long secondsToAdd) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public Instant plusMillis(long millisToAdd) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public Instant plusNanos(long nanosToAdd) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public Instant minus(TemporalAmount amountToSubtract) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public Instant minus(long amountToSubtract, TemporalUnit unit) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public Instant minusSeconds(long secondsToSubtract) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public Instant minusMillis(long millisToSubtract) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public Instant minusNanos(long nanosToSubtract) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public <R> R query(TemporalQuery<R> query) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public Temporal adjustInto(Temporal temporal) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public long until(Temporal endExclusive, TemporalUnit unit) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public OffsetDateTime atOffset(ZoneOffset offset) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public ZonedDateTime atZone(ZoneId zone) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public long toEpochMilli( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public int compareTo(Instant otherInstant) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public boolean isAfter(Instant otherInstant) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public boolean isBefore(Instant otherInstant) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public boolean equals(Object otherInstant) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  void writeExternal(DataOutput out) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  static Instant readExternal(DataInput in) throws IOException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
}