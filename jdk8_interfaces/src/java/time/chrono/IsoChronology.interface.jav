package java.time.chrono;

import java.io.Serializable;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.ValueRange;
import java.util.List;
import java.util.Map;

public final class IsoChronology extends AbstractChronology implements Serializable {
  public static final IsoChronology INSTANCE;
  public String getId( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String getCalendarType( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public LocalDate date(Era era,int yearOfEra,int month, int dayOfMonth) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public LocalDate date(int prolepticYear,int month, int dayOfMonth) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  public LocalDate dateYearDay(Era era,int yearOfEra, int dayOfYear) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  public LocalDate dateYearDay(int prolepticYear, int dayOfYear) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public LocalDate dateEpochDay(long epochDay) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public LocalDate date(TemporalAccessor temporal) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public LocalDateTime localDateTime(TemporalAccessor temporal) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public ZonedDateTime zonedDateTime(TemporalAccessor temporal) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public ZonedDateTime zonedDateTime(Instant instant, ZoneId zone) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public LocalDate dateNow( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public LocalDate dateNow(ZoneId zone) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public LocalDate dateNow(Clock clock) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public boolean isLeapYear(long prolepticYear) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public int prolepticYear(Era era, int yearOfEra) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public IsoEra eraOf(int eraValue) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public List<Era> eras( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public LocalDate resolveDate(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                  }
  void resolveProlepticMonth(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  LocalDate resolveYearOfEra(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  LocalDate resolveYMD(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  public ValueRange range(ChronoField field) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public Period period(int years,int months, int days) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  Object writeReplace( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
}