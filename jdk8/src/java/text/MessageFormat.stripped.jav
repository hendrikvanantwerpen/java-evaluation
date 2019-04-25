package java.text;

import java.util.Locale;

public class MessageFormat extends Format {
  public MessageFormat(String pattern) {
  }
  public MessageFormat(String pattern, Locale locale) {
  }
  public void setLocale(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Locale getLocale( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void applyPattern(String pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toPattern( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFormatsByArgumentIndex(Format [] newFormats) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFormats(Format [] newFormats) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFormatByArgumentIndex(int argumentIndex, Format newFormat) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFormat(int formatElementIndex, Format newFormat) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Format [] getFormatsByArgumentIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Format [] getFormats( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final StringBuffer format(Object [] arguments,StringBuffer result, FieldPosition pos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String format(String pattern, Object ... arguments) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final StringBuffer format(Object arguments,StringBuffer result, FieldPosition pos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AttributedCharacterIterator formatToCharacterIterator(Object arguments) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] parse(String source, ParsePosition pos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] parse(String source) throws ParseException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object parseObject(String source, ParsePosition pos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static class Field extends Format. Field {
    protected Field(String name) {
      super(name);
    }
    public final static Field ARGUMENT;
  }
}