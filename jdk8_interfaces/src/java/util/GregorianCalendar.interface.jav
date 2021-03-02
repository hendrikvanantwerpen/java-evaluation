package java.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.ZonedDateTime;
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.Era;
import sun.util.calendar.Gregorian;
import sun.util.calendar.JulianCalendar;

public class GregorianCalendar extends Calendar {
  public static final int BC;
  static final int BCE;
  public static final int AD;
  static final int CE;
  private static final int EPOCH_OFFSET;
  private static final int EPOCH_YEAR;
  static final int MONTH_LENGTH[];
  static final int LEAP_MONTH_LENGTH[];
  private static final int ONE_SECOND;
  private static final int ONE_MINUTE;
  private static final int ONE_HOUR;
  private static final long ONE_DAY;
  private static final long ONE_WEEK;
  static final int MIN_VALUES[];
  static final int LEAST_MAX_VALUES[];
  static final int MAX_VALUES[];
  static final long serialVersionUID;
  private static final Gregorian gcal;
  private static JulianCalendar jcal;
  private static Era [] jeras;
  static final long DEFAULT_GREGORIAN_CUTOVER;
  private long gregorianCutover;
  private transient long gregorianCutoverDate;
  private transient int gregorianCutoverYear;
  private transient int gregorianCutoverYearJulian;
  private transient BaseCalendar. Date gdate;
  private transient BaseCalendar. Date cdate;
  private transient BaseCalendar calsys;
  private transient int [] zoneOffsets;
  private transient int [] originalFields;
  public GregorianCalendar( ) {
    this(TimeZone. getDefaultRef( ), Locale. getDefault(Locale.Category.FORMAT));
  }
  public GregorianCalendar(TimeZone zone) {
    this(zone, Locale. getDefault(Locale.Category.FORMAT));
  }
  public GregorianCalendar(Locale aLocale) {
    this(TimeZone. getDefaultRef( ), aLocale);
  }
  public GregorianCalendar(TimeZone zone, Locale aLocale) {
    super(zone, aLocale);
  }
  public GregorianCalendar(int year,int month, int dayOfMonth) {
    this(year, month, dayOfMonth, 0, 0, 0, 0);
  }
  public GregorianCalendar(int year,int month,int dayOfMonth,int hourOfDay, int minute) {
    this(year, month, dayOfMonth, hourOfDay, minute, 0, 0);
  }
  public GregorianCalendar(int year,int month,int dayOfMonth,int hourOfDay,int minute, int second) {
    this(year, month, dayOfMonth, hourOfDay, minute, second, 0);
  }
  GregorianCalendar(int year,int month,int dayOfMonth,int hourOfDay,int minute,int second, int millis) {
    super( );
  }
  GregorianCalendar(TimeZone zone,Locale locale, boolean flag) {
    super(zone, locale);
  }
  public void setGregorianChange(Date date) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  private void setGregorianChange(long cutoverTime) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public final Date getGregorianChange( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public boolean isLeapYear(int year) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public String getCalendarType( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public void add(int field, int amount) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public void roll(int field, boolean up) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public void roll(int field, int amount) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public int getMinimum(int field) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public int getMaximum(int field) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public int getGreatestMinimum(int field) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public int getLeastMaximum(int field) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public int getActualMinimum(int field) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public int getActualMaximum(int field) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  private long getYearOffsetInMillis( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public Object clone( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public TimeZone getTimeZone( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public void setTimeZone(TimeZone zone) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public final boolean isWeekDateSupported( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public int getWeekYear( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void setWeekDate(int weekYear,int weekOfYear, int dayOfWeek) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public int getWeeksInWeekYear( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  transient private long cachedFixedDate;
  protected void computeFields( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private int computeFields(int fieldMask, int tzMask) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private int getWeekNumber(long fixedDay1, long fixedDate) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  protected void computeTime( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  private long getFixedDate(BaseCalendar cal,int year, int fieldMask) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  private GregorianCalendar getNormalizedCalendar( ) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  private static synchronized BaseCalendar getJulianCalendarSystem( ) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  private BaseCalendar getCutoverCalendarSystem( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  private boolean isCutoverYear(int normalizedYear) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  private long getFixedDateJan1(BaseCalendar. Date date, long fixedDate) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  private long getFixedDateMonth1(BaseCalendar. Date date, long fixedDate) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  private BaseCalendar. Date getCalendarDate(long fd) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private BaseCalendar. Date getGregorianCutoverDate( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private BaseCalendar. Date getLastJulianDate( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  private int monthLength(int month, int year) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private int monthLength(int month) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private int actualMonthLength( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  private int yearLength(int year) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  private int yearLength( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private void pinDayOfMonth( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  private long getCurrentFixedDate( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  private static int getRolledValue(int value,int amount,int min, int max) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  private int internalGetEra( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                               }
  public ZonedDateTime toZonedDateTime( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public static GregorianCalendar from(ZonedDateTime zdt) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
}