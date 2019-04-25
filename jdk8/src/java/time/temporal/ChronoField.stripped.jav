package java.time.temporal;

import java.util.Locale;

public enum ChronoField implements TemporalField {
  NANO_OF_SECOND (null), NANO_OF_DAY (null), MICRO_OF_SECOND (null), MICRO_OF_DAY (null), MILLI_OF_SECOND (null), MILLI_OF_DAY (null), SECOND_OF_MINUTE (null), SECOND_OF_DAY (null), MINUTE_OF_HOUR (null), MINUTE_OF_DAY (null), HOUR_OF_AMPM (null), CLOCK_HOUR_OF_AMPM (null), HOUR_OF_DAY (null), CLOCK_HOUR_OF_DAY (null), AMPM_OF_DAY (null), DAY_OF_WEEK (null), ALIGNED_DAY_OF_WEEK_IN_MONTH (null), ALIGNED_DAY_OF_WEEK_IN_YEAR (null), DAY_OF_MONTH (null), DAY_OF_YEAR (null), EPOCH_DAY (null), ALIGNED_WEEK_OF_MONTH (null), ALIGNED_WEEK_OF_YEAR (null), MONTH_OF_YEAR (null), PROLEPTIC_MONTH (null), YEAR_OF_ERA (null), YEAR (null), ERA (null), INSTANT_SECONDS (null), OFFSET_SECONDS (null)
  ;  private final String name;
     private final TemporalUnit baseUnit;
     private final TemporalUnit rangeUnit;
     private final ValueRange range;
     private final String displayNameKey;
     private ChronoField(String name,TemporalUnit baseUnit,TemporalUnit rangeUnit, ValueRange range) {
  }
     private ChronoField(String name,TemporalUnit baseUnit,TemporalUnit rangeUnit,ValueRange range, String displayNameKey) {
  }
     public String getDisplayName(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public TemporalUnit getBaseUnit( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public TemporalUnit getRangeUnit( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public ValueRange range( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public boolean isDateBased( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public boolean isTimeBased( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public long checkValidValue(long value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public int checkValidIntValue(long value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public boolean isSupportedBy(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public ValueRange rangeRefinedBy(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public long getFrom(TemporalAccessor temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public <R extends Temporal> R adjustInto(R temporal, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}