package java.time;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Era;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable {
  public static final LocalDate MIN;
  public static final LocalDate MAX;
  static final long DAYS_0000_TO_1970;
  public static LocalDate now( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public static LocalDate now(ZoneId zone) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public static LocalDate now(Clock clock) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public static LocalDate of(int year,Month month, int dayOfMonth) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public static LocalDate of(int year,int month, int dayOfMonth) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public static LocalDate ofYearDay(int year, int dayOfYear) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public static LocalDate ofEpochDay(long epochDay) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public static LocalDate from(TemporalAccessor temporal) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public static LocalDate parse(CharSequence text) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public static LocalDate parse(CharSequence text, DateTimeFormatter formatter) {
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
  public IsoChronology getChronology( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public Era getEra( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public int getYear( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public int getMonthValue( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public Month getMonth( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public int getDayOfMonth( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public int getDayOfYear( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public DayOfWeek getDayOfWeek( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public boolean isLeapYear( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public int lengthOfMonth( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public int lengthOfYear( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public LocalDate with(TemporalAdjuster adjuster) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public LocalDate with(TemporalField field, long newValue) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public LocalDate withYear(int year) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public LocalDate withMonth(int month) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public LocalDate withDayOfMonth(int dayOfMonth) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public LocalDate withDayOfYear(int dayOfYear) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public LocalDate plus(TemporalAmount amountToAdd) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public LocalDate plus(long amountToAdd, TemporalUnit unit) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public LocalDate plusYears(long yearsToAdd) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public LocalDate plusMonths(long monthsToAdd) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public LocalDate plusWeeks(long weeksToAdd) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public LocalDate plusDays(long daysToAdd) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public LocalDate minus(TemporalAmount amountToSubtract) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public LocalDate minus(long amountToSubtract, TemporalUnit unit) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public LocalDate minusYears(long yearsToSubtract) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public LocalDate minusMonths(long monthsToSubtract) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public LocalDate minusWeeks(long weeksToSubtract) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public LocalDate minusDays(long daysToSubtract) {
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
  long daysUntil(LocalDate end) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public Period until(ChronoLocalDate endDateExclusive) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public String format(DateTimeFormatter formatter) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public LocalDateTime atTime(LocalTime time) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public LocalDateTime atTime(int hour, int minute) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public LocalDateTime atTime(int hour,int minute, int second) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public LocalDateTime atTime(int hour,int minute,int second, int nanoOfSecond) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  public OffsetDateTime atTime(OffsetTime time) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public LocalDateTime atStartOfDay( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public ZonedDateTime atStartOfDay(ZoneId zone) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public long toEpochDay( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public int compareTo(ChronoLocalDate other) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  int compareTo0(LocalDate otherDate) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public boolean isAfter(ChronoLocalDate other) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public boolean isBefore(ChronoLocalDate other) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public boolean isEqual(ChronoLocalDate other) {
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
  void writeExternal(DataOutput out) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  static LocalDate readExternal(DataInput in) throws IOException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
}