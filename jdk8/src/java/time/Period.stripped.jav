package java.time;

import java.io.Serializable;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.IsoChronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

public final class Period implements ChronoPeriod, Serializable {
  public static final Period ZERO;
  public static Period ofYears(int years) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Period ofMonths(int months) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Period ofWeeks(int weeks) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Period ofDays(int days) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Period of(int years,int months, int days) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Period from(TemporalAmount amount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Period parse(CharSequence text) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Period between(LocalDate startDateInclusive, LocalDate endDateExclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private Period(int years,int months, int days) {
  }
  public long get(TemporalUnit unit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<TemporalUnit> getUnits( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public IsoChronology getChronology( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isZero( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isNegative( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getYears( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMonths( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDays( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period withYears(int years) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period withMonths(int months) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period withDays(int days) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period plus(TemporalAmount amountToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period plusYears(long yearsToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period plusMonths(long monthsToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period plusDays(long daysToAdd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period minus(TemporalAmount amountToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period minusYears(long yearsToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period minusMonths(long monthsToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period minusDays(long daysToSubtract) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period multipliedBy(int scalar) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period negated( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Period normalized( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long toTotalMonths( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Temporal addTo(Temporal temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Temporal subtractFrom(Temporal temporal) {
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