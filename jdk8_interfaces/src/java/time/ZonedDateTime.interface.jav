package java.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.Serializable;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
  public static ZonedDateTime now( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public static ZonedDateTime now(ZoneId zone) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public static ZonedDateTime now(Clock clock) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public static ZonedDateTime of(LocalDate date,LocalTime time, ZoneId zone) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zone) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  public static ZonedDateTime of(int year,int month,int dayOfMonth,int hour,int minute,int second,int nanoOfSecond, ZoneId zone) {
                                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                 }
  public static ZonedDateTime ofLocal(LocalDateTime localDateTime,ZoneId zone, ZoneOffset preferredOffset) {
                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                           }
  public static ZonedDateTime ofInstant(Instant instant, ZoneId zone) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public static ZonedDateTime ofInstant(LocalDateTime localDateTime,ZoneOffset offset, ZoneId zone) {
                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                    }
  public static ZonedDateTime ofStrict(LocalDateTime localDateTime,ZoneOffset offset, ZoneId zone) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
  public static ZonedDateTime from(TemporalAccessor temporal) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public static ZonedDateTime parse(CharSequence text) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public static ZonedDateTime parse(CharSequence text, DateTimeFormatter formatter) {
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
  public ZonedDateTime withEarlierOffsetAtOverlap( ) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public ZonedDateTime withLaterOffsetAtOverlap( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public ZoneId getZone( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public ZonedDateTime withZoneSameLocal(ZoneId zone) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public ZonedDateTime withZoneSameInstant(ZoneId zone) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public ZonedDateTime withFixedOffsetZone( ) {
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
  public ZonedDateTime with(TemporalAdjuster adjuster) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public ZonedDateTime with(TemporalField field, long newValue) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public ZonedDateTime withYear(int year) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public ZonedDateTime withMonth(int month) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public ZonedDateTime withDayOfMonth(int dayOfMonth) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public ZonedDateTime withDayOfYear(int dayOfYear) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public ZonedDateTime withHour(int hour) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public ZonedDateTime withMinute(int minute) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public ZonedDateTime withSecond(int second) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public ZonedDateTime withNano(int nanoOfSecond) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public ZonedDateTime truncatedTo(TemporalUnit unit) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public ZonedDateTime plus(TemporalAmount amountToAdd) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public ZonedDateTime plus(long amountToAdd, TemporalUnit unit) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public ZonedDateTime plusYears(long years) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public ZonedDateTime plusMonths(long months) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public ZonedDateTime plusWeeks(long weeks) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public ZonedDateTime plusDays(long days) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public ZonedDateTime plusHours(long hours) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public ZonedDateTime plusMinutes(long minutes) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public ZonedDateTime plusSeconds(long seconds) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public ZonedDateTime plusNanos(long nanos) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public ZonedDateTime minus(TemporalAmount amountToSubtract) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public ZonedDateTime minus(long amountToSubtract, TemporalUnit unit) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public ZonedDateTime minusYears(long years) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public ZonedDateTime minusMonths(long months) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public ZonedDateTime minusWeeks(long weeks) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public ZonedDateTime minusDays(long days) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public ZonedDateTime minusHours(long hours) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public ZonedDateTime minusMinutes(long minutes) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public ZonedDateTime minusSeconds(long seconds) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public ZonedDateTime minusNanos(long nanos) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public <R> R query(TemporalQuery<R> query) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public long until(Temporal endExclusive, TemporalUnit unit) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public String format(DateTimeFormatter formatter) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public OffsetDateTime toOffsetDateTime( ) {
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
  static ZonedDateTime readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                               }
}