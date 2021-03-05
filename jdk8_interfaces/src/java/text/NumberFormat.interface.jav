package java.text;

import java.math.RoundingMode;
import java.util.Currency;
import java.util.Locale;

public abstract class NumberFormat extends Format {
  public static final int INTEGER_FIELD;
  public static final int FRACTION_FIELD;
  public StringBuffer format(Object number,StringBuffer toAppendTo, FieldPosition pos) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
  public final Object parseObject(String source, ParsePosition pos) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  public final String format(double number) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  String fastFormat(double number) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public final String format(long number) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public abstract StringBuffer format(double number,StringBuffer toAppendTo, FieldPosition pos) ;
  public abstract StringBuffer format(long number,StringBuffer toAppendTo, FieldPosition pos) ;
  public abstract Number parse(String source, ParsePosition parsePosition) ;
  public Number parse(String source) throws ParseException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public boolean isParseIntegerOnly( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public void setParseIntegerOnly(boolean value) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public final static NumberFormat getInstance( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public static NumberFormat getInstance(Locale inLocale) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public final static NumberFormat getNumberInstance( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public static NumberFormat getNumberInstance(Locale inLocale) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public final static NumberFormat getIntegerInstance( ) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public static NumberFormat getIntegerInstance(Locale inLocale) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public final static NumberFormat getCurrencyInstance( ) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public static NumberFormat getCurrencyInstance(Locale inLocale) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public final static NumberFormat getPercentInstance( ) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public static NumberFormat getPercentInstance(Locale inLocale) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  final static NumberFormat getScientificInstance( ) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  static NumberFormat getScientificInstance(Locale inLocale) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public static Locale [] getAvailableLocales( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public Object clone( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public boolean isGroupingUsed( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public void setGroupingUsed(boolean newValue) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public int getMaximumIntegerDigits( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public void setMaximumIntegerDigits(int newValue) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public int getMinimumIntegerDigits( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public void setMinimumIntegerDigits(int newValue) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public int getMaximumFractionDigits( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public void setMaximumFractionDigits(int newValue) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public int getMinimumFractionDigits( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public void setMinimumFractionDigits(int newValue) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public Currency getCurrency( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public void setCurrency(Currency currency) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public RoundingMode getRoundingMode( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public void setRoundingMode(RoundingMode roundingMode) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  static final int currentSerialVersion;
  static final long serialVersionUID;
  public static class Field extends Format. Field {
    public static final Field INTEGER;
    public static final Field FRACTION;
    public static final Field EXPONENT;
    public static final Field DECIMAL_SEPARATOR;
    public static final Field SIGN;
    public static final Field GROUPING_SEPARATOR;
    public static final Field EXPONENT_SYMBOL;
    public static final Field PERCENT;
    public static final Field PERMILLE;
    public static final Field CURRENCY;
    public static final Field EXPONENT_SIGN;
  }
}