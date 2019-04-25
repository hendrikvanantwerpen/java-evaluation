package java.time.format;

import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.temporal.TemporalField;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class DateTimeFormatterBuilder {
  public static String getLocalizedDateTimePattern(FormatStyle dateStyle,FormatStyle timeStyle,Chronology chrono, Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DateTimeFormatterBuilder( ) {
    super( );
  }
  private DateTimeFormatterBuilder(DateTimeFormatterBuilder parent, boolean optional) {
    super( );
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
}