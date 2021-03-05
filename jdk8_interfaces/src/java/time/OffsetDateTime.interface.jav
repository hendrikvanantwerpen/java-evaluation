package java.time;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;
import java.util.Comparator;

public final class OffsetDateTime implements Temporal, TemporalAdjuster, Comparable<OffsetDateTime>, Serializable {
  public static final OffsetDateTime MIN;
  public static final OffsetDateTime MAX;
  public static Comparator<OffsetDateTime> timeLineOrder( ) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public static OffsetDateTime now( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public static OffsetDateTime now(ZoneId zone) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public static OffsetDateTime now(Clock clock) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public static OffsetDateTime of(LocalDate date,LocalTime time, ZoneOffset offset) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public static OffsetDateTime of(LocalDateTime dateTime, ZoneOffset offset) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  public static OffsetDateTime of(int year,int month,int dayOfMonth,int hour,int minute,int second,int nanoOfSecond, ZoneOffset offset) {
                                                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                        }
  public static OffsetDateTime ofInstant(Instant instant, ZoneId zone) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public static OffsetDateTime from(TemporalAccessor temporal) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public static OffsetDateTime parse(CharSequence text) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public static OffsetDateTime parse(CharSequence text, DateTimeFormatter formatter) {
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
  public ZoneOffset getOffset( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public OffsetDateTime withOffsetSameLocal(ZoneOffset offset) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public OffsetDateTime withOffsetSameInstant(ZoneOffset offset) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public LocalDateTime toLocalDateTime( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public LocalDate toLocalDate( ) {
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
  public LocalTime toLocalTime( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public int getHour( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public int getMinute( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public int getSecond( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public int getNano( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public OffsetDateTime with(TemporalAdjuster adjuster) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public OffsetDateTime with(TemporalField field, long newValue) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public OffsetDateTime withYear(int year) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public OffsetDateTime withMonth(int month) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public OffsetDateTime withDayOfMonth(int dayOfMonth) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public OffsetDateTime withDayOfYear(int dayOfYear) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public OffsetDateTime withHour(int hour) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public OffsetDateTime withMinute(int minute) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public OffsetDateTime withSecond(int second) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public OffsetDateTime withNano(int nanoOfSecond) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public OffsetDateTime truncatedTo(TemporalUnit unit) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public OffsetDateTime plus(TemporalAmount amountToAdd) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public OffsetDateTime plus(long amountToAdd, TemporalUnit unit) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public OffsetDateTime plusYears(long years) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public OffsetDateTime plusMonths(long months) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public OffsetDateTime plusWeeks(long weeks) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public OffsetDateTime plusDays(long days) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public OffsetDateTime plusHours(long hours) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public OffsetDateTime plusMinutes(long minutes) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public OffsetDateTime plusSeconds(long seconds) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public OffsetDateTime plusNanos(long nanos) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public OffsetDateTime minus(TemporalAmount amountToSubtract) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public OffsetDateTime minus(long amountToSubtract, TemporalUnit unit) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public OffsetDateTime minusYears(long years) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public OffsetDateTime minusMonths(long months) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public OffsetDateTime minusWeeks(long weeks) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public OffsetDateTime minusDays(long days) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public OffsetDateTime minusHours(long hours) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public OffsetDateTime minusMinutes(long minutes) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public OffsetDateTime minusSeconds(long seconds) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public OffsetDateTime minusNanos(long nanos) {
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
  public String format(DateTimeFormatter formatter) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public ZonedDateTime atZoneSameInstant(ZoneId zone) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public ZonedDateTime atZoneSimilarLocal(ZoneId zone) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public OffsetTime toOffsetTime( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public ZonedDateTime toZonedDateTime( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public Instant toInstant( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public long toEpochSecond( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public int compareTo(OffsetDateTime other) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public boolean isAfter(OffsetDateTime other) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public boolean isBefore(OffsetDateTime other) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public boolean isEqual(OffsetDateTime other) {
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
  void writeExternal(ObjectOutput out) throws IOException {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  static OffsetDateTime readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
}