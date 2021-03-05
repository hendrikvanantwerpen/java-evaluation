package java.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.regex.Matcher;

public final class Formatter implements Closeable, Flushable {
  public Formatter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(Appendable a) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(Locale l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(Appendable a, Locale l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(String fileName) throws FileNotFoundException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(String fileName,String csn, Locale l) throws FileNotFoundException, UnsupportedEncodingException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(File file) throws FileNotFoundException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(File file,String csn, Locale l) throws FileNotFoundException, UnsupportedEncodingException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(PrintStream ps) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(OutputStream os) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(OutputStream os, String csn) throws UnsupportedEncodingException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter(OutputStream os,String csn, Locale l) throws UnsupportedEncodingException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Locale locale( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public Appendable out( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void flush( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public void close( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public IOException ioException( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public Formatter format(String format, Object ... args) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public Formatter format(Locale l,String format, Object ... args) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  private interface FormatString {
    int index( ) ;
    void print(Object arg, Locale l) throws IOException ;
    String toString( ) ;
  }
  private class FixedString implements FormatString {
    FixedString(String s) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int index( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public void print(Object arg, Locale l) throws IOException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  public enum BigDecimalLayoutForm {
  }
  private class FormatSpecifier implements FormatString {
    public int index( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    Flags flags( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
    int width( ) {
                   throw new java . lang . RuntimeException ("Implementation stripped");
                 }
    int precision( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
    FormatSpecifier(Matcher m) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void print(Object arg, Locale l) throws IOException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    private class BigDecimalLayout {
      public BigDecimalLayout(BigInteger intVal,int scale, BigDecimalLayoutForm form) {
        throw new java . lang . RuntimeException ("Implementation stripped");
      }
      public boolean hasDot( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
      public int scale( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
      public char [] layoutChars( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
      public char [] mantissa( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
      public char [] exponent( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    }
  }
  private static class Flags {
    static final Flags NONE;
    static final Flags LEFT_JUSTIFY;
    static final Flags UPPERCASE;
    static final Flags ALTERNATE;
    static final Flags PLUS;
    static final Flags LEADING_SPACE;
    static final Flags ZERO_PAD;
    static final Flags GROUP;
    static final Flags PARENTHESES;
    static final Flags PREVIOUS;
    public int valueOf( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public boolean contains(Flags f) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    public Flags dup( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    public Flags remove(Flags f) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public static Flags parse(String s) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public static String toString(Flags f) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  private static class Conversion {
    static final char DECIMAL_INTEGER;
    static final char OCTAL_INTEGER;
    static final char HEXADECIMAL_INTEGER;
    static final char HEXADECIMAL_INTEGER_UPPER;
    static final char SCIENTIFIC;
    static final char SCIENTIFIC_UPPER;
    static final char GENERAL;
    static final char GENERAL_UPPER;
    static final char DECIMAL_FLOAT;
    static final char HEXADECIMAL_FLOAT;
    static final char HEXADECIMAL_FLOAT_UPPER;
    static final char CHARACTER;
    static final char CHARACTER_UPPER;
    static final char DATE_TIME;
    static final char DATE_TIME_UPPER;
    static final char BOOLEAN;
    static final char BOOLEAN_UPPER;
    static final char STRING;
    static final char STRING_UPPER;
    static final char HASHCODE;
    static final char HASHCODE_UPPER;
    static final char LINE_SEPARATOR;
    static final char PERCENT_SIGN;
    static boolean isValid(char c) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    static boolean isGeneral(char c) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    static boolean isCharacter(char c) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    static boolean isInteger(char c) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    static boolean isFloat(char c) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    static boolean isText(char c) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  private static class DateTime {
    static final char HOUR_OF_DAY_0;
    static final char HOUR_0;
    static final char HOUR_OF_DAY;
    static final char HOUR;
    static final char MINUTE;
    static final char NANOSECOND;
    static final char MILLISECOND;
    static final char MILLISECOND_SINCE_EPOCH;
    static final char AM_PM;
    static final char SECONDS_SINCE_EPOCH;
    static final char SECOND;
    static final char TIME;
    static final char ZONE_NUMERIC;
    static final char ZONE;
    static final char NAME_OF_DAY_ABBREV;
    static final char NAME_OF_DAY;
    static final char NAME_OF_MONTH_ABBREV;
    static final char NAME_OF_MONTH;
    static final char CENTURY;
    static final char DAY_OF_MONTH_0;
    static final char DAY_OF_MONTH;
    static final char NAME_OF_MONTH_ABBREV_X;
    static final char DAY_OF_YEAR;
    static final char MONTH;
    static final char YEAR_2;
    static final char YEAR_4;
    static final char TIME_12_HOUR;
    static final char TIME_24_HOUR;
    static final char DATE_TIME;
    static final char DATE;
    static final char ISO_STANDARD_DATE;
    static boolean isValid(char c) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  }
}