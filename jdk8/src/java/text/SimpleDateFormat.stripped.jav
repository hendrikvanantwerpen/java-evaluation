package java.text;

import java.util.Date;
import java.util.Locale;

public class SimpleDateFormat extends DateFormat {
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
  public void set2DigitYearStart(Date startDate) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Date get2DigitYearStart( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public StringBuffer format(Date date,StringBuffer toAppendTo, FieldPosition pos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Date parse(String text, ParsePosition pos) {
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
}