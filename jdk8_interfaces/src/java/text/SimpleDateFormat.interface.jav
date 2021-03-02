package java.text;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class SimpleDateFormat extends DateFormat {
  static final long serialVersionUID;
  static final int currentSerialVersion;
  private int serialVersionOnStream;
  private String pattern;
  transient private NumberFormat originalNumberFormat;
  transient private String originalNumberPattern;
  transient private char minusSign;
  transient private boolean hasFollowingMinusSign;
  transient private boolean forceStandaloneForm;
  transient private char [] compiledPattern;
  private final static int TAG_QUOTE_ASCII_CHAR;
  private final static int TAG_QUOTE_CHARS;
  transient private char zeroDigit;
  private DateFormatSymbols formatData;
  private Date defaultCenturyStart;
  transient private int defaultCenturyStartYear;
  private static final int MILLIS_PER_MINUTE;
  private static final String GMT;
  private static final ConcurrentMap<Locale, NumberFormat> cachedNumberFormatData;
  private Locale locale;
  transient boolean useDateFormatSymbols;
  public SimpleDateFormat( ) {
    this("", Locale. getDefault(Locale.Category.FORMAT));
  }
  public SimpleDateFormat(String pattern) {
    this(pattern, Locale. getDefault(Locale.Category.FORMAT));
  }
  public SimpleDateFormat(String pattern, Locale locale) {
  }
  public SimpleDateFormat(String pattern, DateFormatSymbols formatSymbols) {
  }
  private void initialize(Locale loc) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  private void initializeCalendar(Locale loc) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private char [] compile(String pattern) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private static void encode(int tag,int length, StringBuilder buffer) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  private void initializeDefaultCentury( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private void parseAmbiguousDatesAsAfter(Date startDate) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public void set2DigitYearStart(Date startDate) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public Date get2DigitYearStart( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public StringBuffer format(Date date,StringBuffer toAppendTo, FieldPosition pos) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  private StringBuffer format(Date date,StringBuffer toAppendTo, FieldDelegate delegate) {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
  public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  private static final int [] PATTERN_INDEX_TO_CALENDAR_FIELD;
  private static final int [] PATTERN_INDEX_TO_DATE_FORMAT_FIELD;
  private static final Field [] PATTERN_INDEX_TO_DATE_FORMAT_FIELD_ID;
  private void subFormat(int patternCharIndex,int count,FieldDelegate delegate,StringBuffer buffer, boolean useDateFormatSymbols) {
                                                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                  }
  private void zeroPaddingNumber(int value,int minDigits,int maxDigits, StringBuffer buffer) {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
  public Date parse(String text, ParsePosition pos) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  private int matchString(String text,int start,int field,String [] data, CalendarBuilder calb) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  private int matchString(String text,int start,int field,Map<String, Integer> data, CalendarBuilder calb) {
                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                           }
  private int matchZoneString(String text,int start, String [] zoneNames) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  private boolean matchDSTString(String text,int start,int zoneIndex,int standardIndex, String [] [] zoneStrings) {
                                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                  }
  private int subParseZoneString(String text,int start, CalendarBuilder calb) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  private int subParseNumericZone(String text,int start,int sign,int count,boolean colon, CalendarBuilder calb) {
                                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                }
  private boolean isDigit(char c) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private int subParse(String text,int start,int patternCharIndex,int count,boolean obeyCount,boolean [] ambiguousYear,ParsePosition origPos,boolean useFollowingMinusSignAsDelimiter, CalendarBuilder calb) {
                                                                                                                                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                                                             }
  private boolean useDateFormatSymbols( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private String translatePattern(String pattern,String from, String to) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public String toPattern( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public String toLocalizedPattern( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public void applyPattern(String pattern) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private void applyPatternImpl(String pattern) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public void applyLocalizedPattern(String pattern) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public DateFormatSymbols getDateFormatSymbols( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public void setDateFormatSymbols(DateFormatSymbols newFormatSymbols) {
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
  private static final int [] REST_OF_STYLES;
  private Map<String, Integer> getDisplayNamesMap(int field, Locale locale) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                               }
  private void checkNegativeNumberExpression( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
}