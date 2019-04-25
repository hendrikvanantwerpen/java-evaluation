package java.time;

import java.io.Serializable;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {
  public static final LocalDateTime MIN;
  public static final LocalDateTime MAX;
  public static LocalDateTime now( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime now(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime now(Clock clock) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime of(int year,Month month,int dayOfMonth,int hour, int minute) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime of(int year,Month month,int dayOfMonth,int hour,int minute, int second) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime of(int year,Month month,int dayOfMonth,int hour,int minute,int second, int nanoOfSecond) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime of(int year,int month,int dayOfMonth,int hour, int minute) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime of(int year,int month,int dayOfMonth,int hour,int minute, int second) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime of(int year,int month,int dayOfMonth,int hour,int minute,int second, int nanoOfSecond) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime of(LocalDate date, LocalTime time) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime ofInstant(Instant instant, ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime ofEpochSecond(long epochSecond,int nanoOfSecond, ZoneOffset offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime from(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime parse(CharSequence text) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private LocalDateTime(LocalDate date, LocalTime time) {
  }
  public boolean isSupported(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isSupported(TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ValueRange range(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int get(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getLong(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDate toLocalDate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMonthValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Month getMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDayOfMonth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDayOfYear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DayOfWeek getDayOfWeek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalTime toLocalTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getHour( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMinute( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSecond( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNano( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime with(TemporalAdjuster adjuster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime with(TemporalField field, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime withYear(int year) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime withMonth(int month) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime withDayOfMonth(int dayOfMonth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime withDayOfYear(int dayOfYear) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime withHour(int hour) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime withMinute(int minute) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime withSecond(int second) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime withNano(int nanoOfSecond) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime truncatedTo(TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime plus(TemporalAmount amountToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime plus(long amountToAdd, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime plusYears(long years) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime plusMonths(long months) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime plusWeeks(long weeks) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime plusDays(long days) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime plusHours(long hours) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime plusMinutes(long minutes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime plusSeconds(long seconds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime plusNanos(long nanos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime minus(TemporalAmount amountToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime minus(long amountToSubtract, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime minusYears(long years) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime minusMonths(long months) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime minusWeeks(long weeks) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime minusDays(long days) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime minusHours(long hours) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime minusMinutes(long minutes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime minusSeconds(long seconds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LocalDateTime minusNanos(long nanos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <R> R query(TemporalQuery<R> query) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Temporal adjustInto(Temporal temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long until(Temporal endExclusive, TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String format(DateTimeFormatter formatter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OffsetDateTime atOffset(ZoneOffset offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZonedDateTime atZone(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(ChronoLocalDateTime<?> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAfter(ChronoLocalDateTime<?> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isBefore(ChronoLocalDateTime<?> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEqual(ChronoLocalDateTime<?> other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}