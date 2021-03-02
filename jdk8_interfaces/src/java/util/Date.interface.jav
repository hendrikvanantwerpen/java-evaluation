package java.util;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.time.Instant;
import sun.util.calendar.BaseCalendar;

public class Date implements java. io. Serializable, Cloneable, Comparable<Date> {
  private static final BaseCalendar gcal;
  private static BaseCalendar jcal;
  private transient long fastTime;
  private transient BaseCalendar. Date cdate;
  private static int defaultCenturyStart;
  private static final long serialVersionUID;
  public Date( ) {
    this(System. currentTimeMillis( ));
  }
  public Date(long date) {
  }
  @Deprecated public Date(int year,int month, int date) {
    this(year, month, date, 0, 0, 0);
  }
  @Deprecated public Date(int year,int month,int date,int hrs, int min) {
    this(year, month, date, hrs, min, 0);
  }
  @Deprecated public Date(int year,int month,int date,int hrs,int min, int sec) {
  }
  @Deprecated public Date(String s) {
    this(parse(s));
  }
  public Object clone( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public static long UTC(int year,int month,int date,int hrs,int min, int sec) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public static long parse(String s) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private final static String wtb[];
  private final static int ttb[];
  public int getYear( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public void setYear(int year) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public int getMonth( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public void setMonth(int month) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public int getDate( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public void setDate(int date) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public int getDay( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public int getHours( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public void setHours(int hours) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public int getMinutes( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public void setMinutes(int minutes) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public int getSeconds( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public void setSeconds(int seconds) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public long getTime( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  private final long getTimeImpl( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public void setTime(long time) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public boolean before(Date when) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public boolean after(Date when) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  static final long getMillisOf(Date date) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public int compareTo(Date anotherDate) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private static final StringBuilder convertToAbbr(StringBuilder sb, String name) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  public String toLocaleString( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public String toGMTString( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public int getTimezoneOffset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private final BaseCalendar. Date getCalendarDate( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private final BaseCalendar. Date normalize( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  private final BaseCalendar. Date normalize(BaseCalendar. Date date) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  private static final BaseCalendar getCalendarSystem(int year) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  private static final BaseCalendar getCalendarSystem(long utc) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  private static final BaseCalendar getCalendarSystem(BaseCalendar. Date cdate) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  synchronized private static final BaseCalendar getJulianCalendar( ) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  private void writeObject(ObjectOutputStream s) throws IOException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  public static Date from(Instant instant) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public Instant toInstant( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
}