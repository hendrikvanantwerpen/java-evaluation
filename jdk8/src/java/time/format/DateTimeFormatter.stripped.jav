package java.time.format;

import java.text.Format;
import java.text.ParsePosition;
import java.time.Period;
import java.time.ZoneId;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder.CompositePrinterParser;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.util.Locale;
import java.util.Set;

public final class DateTimeFormatter {
  public static DateTimeFormatter ofPattern(String pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static DateTimeFormatter ofPattern(String pattern, Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static DateTimeFormatter ofLocalizedDate(FormatStyle dateStyle) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static DateTimeFormatter ofLocalizedTime(FormatStyle timeStyle) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static DateTimeFormatter ofLocalizedDateTime(FormatStyle dateTimeStyle) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static DateTimeFormatter ofLocalizedDateTime(FormatStyle dateStyle, FormatStyle timeStyle) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final DateTimeFormatter ISO_LOCAL_DATE;
  public static final DateTimeFormatter ISO_OFFSET_DATE;
  public static final DateTimeFormatter ISO_DATE;
  public static final DateTimeFormatter ISO_LOCAL_TIME;
  public static final DateTimeFormatter ISO_OFFSET_TIME;
  public static final DateTimeFormatter ISO_TIME;
  public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;
  public static final DateTimeFormatter ISO_OFFSET_DATE_TIME;
  public static final DateTimeFormatter ISO_ZONED_DATE_TIME;
  public static final DateTimeFormatter ISO_DATE_TIME;
  public static final DateTimeFormatter ISO_ORDINAL_DATE;
  public static final DateTimeFormatter ISO_WEEK_DATE;
  public static final DateTimeFormatter ISO_INSTANT;
  public static final DateTimeFormatter BASIC_ISO_DATE;
  public static final DateTimeFormatter RFC_1123_DATE_TIME;
  public static final TemporalQuery<Period> parsedExcessDays( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final TemporalQuery<Boolean> parsedLeapSecond( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  DateTimeFormatter(CompositePrinterParser printerParser,Locale locale,DecimalStyle decimalStyle,ResolverStyle resolverStyle,Set<TemporalField> resolverFields,Chronology chrono, ZoneId zone) {
  }
  public Locale getLocale( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DateTimeFormatter withLocale(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DecimalStyle getDecimalStyle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Chronology getChronology( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DateTimeFormatter withChronology(Chronology chrono) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZoneId getZone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DateTimeFormatter withZone(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ResolverStyle getResolverStyle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DateTimeFormatter withResolverStyle(ResolverStyle resolverStyle) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<TemporalField> getResolverFields( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DateTimeFormatter withResolverFields(TemporalField ... resolverFields) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DateTimeFormatter withResolverFields(Set<TemporalField> resolverFields) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String format(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void formatTo(TemporalAccessor temporal, Appendable appendable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TemporalAccessor parse(CharSequence text) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TemporalAccessor parse(CharSequence text, ParsePosition position) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> T parse(CharSequence text, TemporalQuery<T> query) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TemporalAccessor parseBest(CharSequence text, TemporalQuery<?> ... queries) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TemporalAccessor parseUnresolved(CharSequence text, ParsePosition position) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Format toFormat( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Format toFormat(TemporalQuery<?> parseQuery) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}