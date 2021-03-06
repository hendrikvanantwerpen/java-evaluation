package java.text;

import java.io.Serializable;
import java.util.Locale;

public class DateFormatSymbols implements Serializable, Cloneable {
  public DateFormatSymbols( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DateFormatSymbols(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  String eras[];
  String months[];
  String shortMonths[];
  String weekdays[];
  String shortWeekdays[];
  String ampms[];
  String zoneStrings[] [];
  transient boolean isZoneStringsSet;
  static final String patternChars;
  static final int PATTERN_ERA;
  static final int PATTERN_YEAR;
  static final int PATTERN_MONTH;
  static final int PATTERN_DAY_OF_MONTH;
  static final int PATTERN_HOUR_OF_DAY1;
  static final int PATTERN_HOUR_OF_DAY0;
  static final int PATTERN_MINUTE;
  static final int PATTERN_SECOND;
  static final int PATTERN_MILLISECOND;
  static final int PATTERN_DAY_OF_WEEK;
  static final int PATTERN_DAY_OF_YEAR;
  static final int PATTERN_DAY_OF_WEEK_IN_MONTH;
  static final int PATTERN_WEEK_OF_YEAR;
  static final int PATTERN_WEEK_OF_MONTH;
  static final int PATTERN_AM_PM;
  static final int PATTERN_HOUR1;
  static final int PATTERN_HOUR0;
  static final int PATTERN_ZONE_NAME;
  static final int PATTERN_ZONE_VALUE;
  static final int PATTERN_WEEK_YEAR;
  static final int PATTERN_ISO_DAY_OF_WEEK;
  static final int PATTERN_ISO_ZONE;
  static final int PATTERN_MONTH_STANDALONE;
  String localPatternChars;
  Locale locale;
  static final long serialVersionUID;
  public static Locale [] getAvailableLocales( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public static final DateFormatSymbols getInstance( ) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public static final DateFormatSymbols getInstance(Locale locale) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  static final DateFormatSymbols getInstanceRef(Locale locale) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public String [] getEras( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public void setEras(String [] newEras) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public String [] getMonths( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public void setMonths(String [] newMonths) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public String [] getShortMonths( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public void setShortMonths(String [] newShortMonths) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public String [] getWeekdays( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public void setWeekdays(String [] newWeekdays) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public String [] getShortWeekdays( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public void setShortWeekdays(String [] newShortWeekdays) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public String [] getAmPmStrings( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public void setAmPmStrings(String [] newAmpms) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public String [] [] getZoneStrings( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public void setZoneStrings(String [] [] newZoneStrings) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public String getLocalPatternChars( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public void setLocalPatternChars(String newLocalPatternChars) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public Object clone( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  static final int millisPerHour;
  transient volatile int cachedHashCode;
  final int getZoneIndex(String ID) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  final String [] [] getZoneStringsWrapper( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
}