package java.util;

import java.io.Serializable;
import java.time.ZoneId;

abstract public class TimeZone implements Serializable, Cloneable {
  public TimeZone( ) {
  }
  public static final int SHORT;
  public static final int LONG;
  private static final int ONE_MINUTE;
  private static final int ONE_HOUR;
  private static final int ONE_DAY;
  static final long serialVersionUID;
  public abstract int getOffset(int era,int year,int month,int day,int dayOfWeek, int milliseconds) ;
  public int getOffset(long date) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  int getOffsets(long date, int [] offsets) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  abstract public void setRawOffset(int offsetMillis) ;
  public abstract int getRawOffset( ) ;
  public String getID( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public void setID(String ID) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public final String getDisplayName( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public final String getDisplayName(Locale locale) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public final String getDisplayName(boolean daylight, int style) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public String getDisplayName(boolean daylight,int style, Locale locale) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  private static String [] getDisplayNames(String id, Locale locale) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  public int getDSTSavings( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public abstract boolean useDaylightTime( ) ;
  public boolean observesDaylightTime( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  abstract public boolean inDaylightTime(Date date) ;
  public static synchronized TimeZone getTimeZone(String ID) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public static TimeZone getTimeZone(ZoneId zoneId) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public ZoneId toZoneId( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private static TimeZone getTimeZone(String ID, boolean fallback) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public static synchronized String [] getAvailableIDs(int rawOffset) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public static synchronized String [] getAvailableIDs( ) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  private static native String getSystemTimeZoneID(String javaHome) ;
  private static native String getSystemGMTOffsetID( ) ;
  public static TimeZone getDefault( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  static TimeZone getDefaultRef( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  private static synchronized TimeZone setDefaultZone( ) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public static void setDefault(TimeZone zone) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public boolean hasSameRules(TimeZone other) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public Object clone( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  static final TimeZone NO_TIMEZONE;
  private String ID;
  private static volatile TimeZone defaultTimeZone;
  static final String GMT_ID;
  private static final int GMT_ID_LENGTH;
  private static volatile TimeZone mainAppContextDefault;
  private static final TimeZone parseCustomTimeZone(String id) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
}