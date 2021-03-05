package java.time.format;

import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class DateTimeFormatterBuilder {
  public static String getLocalizedDateTimePattern(FormatStyle dateStyle,FormatStyle timeStyle,Chronology chrono, Locale locale) {
                                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                 }
  public DateTimeFormatterBuilder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DateTimeFormatterBuilder parseCaseSensitive( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public DateTimeFormatterBuilder parseCaseInsensitive( ) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public DateTimeFormatterBuilder parseStrict( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public DateTimeFormatterBuilder parseLenient( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public DateTimeFormatterBuilder parseDefaulting(TemporalField field, long value) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  public DateTimeFormatterBuilder appendValue(TemporalField field) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public DateTimeFormatterBuilder appendValue(TemporalField field, int width) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public DateTimeFormatterBuilder appendValue(TemporalField field,int minWidth,int maxWidth, SignStyle signStyle) {
                                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                  }
  public DateTimeFormatterBuilder appendValueReduced(TemporalField field,int width,int maxWidth, int baseValue) {
                                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                }
  public DateTimeFormatterBuilder appendValueReduced(TemporalField field,int width,int maxWidth, ChronoLocalDate baseDate) {
                                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                           }
  public DateTimeFormatterBuilder appendFraction(TemporalField field,int minWidth,int maxWidth, boolean decimalPoint) {
                                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                      }
  public DateTimeFormatterBuilder appendText(TemporalField field) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public DateTimeFormatterBuilder appendText(TemporalField field, TextStyle textStyle) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
  public DateTimeFormatterBuilder appendText(TemporalField field, Map<Long, String> textLookup) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  public DateTimeFormatterBuilder appendInstant( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public DateTimeFormatterBuilder appendInstant(int fractionalDigits) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public DateTimeFormatterBuilder appendOffsetId( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public DateTimeFormatterBuilder appendOffset(String pattern, String noOffsetText) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public DateTimeFormatterBuilder appendLocalizedOffset(TextStyle style) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public DateTimeFormatterBuilder appendZoneId( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public DateTimeFormatterBuilder appendZoneRegionId( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public DateTimeFormatterBuilder appendZoneOrOffsetId( ) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle, Set<ZoneId> preferredZones) {
                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                  }
  public DateTimeFormatterBuilder appendChronologyId( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public DateTimeFormatterBuilder appendChronologyText(TextStyle textStyle) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public DateTimeFormatterBuilder appendLocalized(FormatStyle dateStyle, FormatStyle timeStyle) {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  public DateTimeFormatterBuilder appendLiteral(char literal) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public DateTimeFormatterBuilder appendLiteral(String literal) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public DateTimeFormatterBuilder append(DateTimeFormatter formatter) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public DateTimeFormatterBuilder appendOptional(DateTimeFormatter formatter) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public DateTimeFormatterBuilder appendPattern(String pattern) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public DateTimeFormatterBuilder padNext(int padWidth) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public DateTimeFormatterBuilder padNext(int padWidth, char padChar) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public DateTimeFormatterBuilder optionalStart( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public DateTimeFormatterBuilder optionalEnd( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public DateTimeFormatter toFormatter( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public DateTimeFormatter toFormatter(Locale locale) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  DateTimeFormatter toFormatter(ResolverStyle resolverStyle, Chronology chrono) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  interface DateTimePrinterParser {
    boolean format(DateTimePrintContext context, StringBuilder buf) ;
    int parse(DateTimeParseContext context,CharSequence text, int position) ;
  }
  static final class CompositePrinterParser implements DateTimePrinterParser {
    CompositePrinterParser(List<DateTimePrinterParser> printerParsers, boolean optional) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    CompositePrinterParser(DateTimePrinterParser [] printerParsers, boolean optional) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public CompositePrinterParser withOptional(boolean optional) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static final class PadPrinterParserDecorator implements DateTimePrinterParser {
    PadPrinterParserDecorator(DateTimePrinterParser printerParser,int padWidth, char padChar) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static enum SettingsParser implements DateTimePrinterParser {
    ;  public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
       public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
       public String toString( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static class DefaultValueParser implements DateTimePrinterParser {
    DefaultValueParser(TemporalField field, long value) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  }
  static final class CharLiteralPrinterParser implements DateTimePrinterParser {
    CharLiteralPrinterParser(char literal) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static final class StringLiteralPrinterParser implements DateTimePrinterParser {
    StringLiteralPrinterParser(String literal) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static class NumberPrinterParser implements DateTimePrinterParser {
    static final long [] EXCEED_POINTS;
    final TemporalField field;
    final int minWidth;
    final int maxWidth;
    final int subsequentWidth;
    NumberPrinterParser(TemporalField field,int minWidth,int maxWidth, SignStyle signStyle) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    NumberPrinterParser withFixedWidth( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    NumberPrinterParser withSubsequentWidth(int subsequentWidth) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    long getValue(DateTimePrintContext context, long value) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
    boolean isFixedWidth(DateTimeParseContext context) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    int setValue(DateTimeParseContext context,long value,int errorPos, int successPos) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static final class ReducedPrinterParser extends NumberPrinterParser {
    static final LocalDate BASE_DATE;
    ReducedPrinterParser(TemporalField field,int minWidth,int maxWidth,int baseValue, ChronoLocalDate baseDate) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    long getValue(DateTimePrintContext context, long value) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
    int setValue(DateTimeParseContext context,long value,int errorPos, int successPos) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
    ReducedPrinterParser withFixedWidth( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    ReducedPrinterParser withSubsequentWidth(int subsequentWidth) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    boolean isFixedWidth(DateTimeParseContext context) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static final class FractionPrinterParser implements DateTimePrinterParser {
    FractionPrinterParser(TemporalField field,int minWidth,int maxWidth, boolean decimalPoint) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static final class TextPrinterParser implements DateTimePrinterParser {
    TextPrinterParser(TemporalField field,TextStyle textStyle, DateTimeTextProvider provider) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence parseText, int position) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static final class InstantPrinterParser implements DateTimePrinterParser {
    InstantPrinterParser(int fractionalDigits) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static final class OffsetIdPrinterParser implements DateTimePrinterParser {
    static final String [] PATTERNS;
    static final OffsetIdPrinterParser INSTANCE_ID_Z;
    static final OffsetIdPrinterParser INSTANCE_ID_ZERO;
    OffsetIdPrinterParser(String pattern, String noOffsetText) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static final class LocalizedOffsetIdPrinterParser implements DateTimePrinterParser {
    LocalizedOffsetIdPrinterParser(TextStyle style) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    int getDigit(CharSequence text, int position) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static final class ZoneTextPrinterParser extends ZoneIdPrinterParser {
    ZoneTextPrinterParser(TextStyle textStyle, Set<ZoneId> preferredZones) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  }
  static class ZoneIdPrinterParser implements DateTimePrinterParser {
    ZoneIdPrinterParser(TemporalQuery<ZoneId> query, String description) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static class PrefixTree {
    public static PrefixTree newTree(DateTimeParseContext context) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
    public static PrefixTree newTree(Set<String> keys, DateTimeParseContext context) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
    public PrefixTree copyTree( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    public boolean add(String k, String v) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public String match(CharSequence text,int off, int end) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
    public String match(CharSequence text, ParsePosition pos) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
    private static class CI extends PrefixTree {
    }
    private static class LENIENT extends CI {
      public String match(CharSequence text, ParsePosition pos) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
    }
  }
  static final class ChronoPrinterParser implements DateTimePrinterParser {
    ChronoPrinterParser(TextStyle textStyle) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  }
  static final class LocalizedPrinterParser implements DateTimePrinterParser {
    LocalizedPrinterParser(FormatStyle dateStyle, FormatStyle timeStyle) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static final class WeekBasedFieldPrinterParser implements DateTimePrinterParser {
    WeekBasedFieldPrinterParser(char chr, int count) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean format(DateTimePrintContext context, StringBuilder buf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    public int parse(DateTimeParseContext context,CharSequence text, int position) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  static final Comparator<String> LENGTH_SORT;
}