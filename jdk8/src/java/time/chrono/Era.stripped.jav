package java.time.chrono;

import java.time.format.TextStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.ValueRange;
import java.util.Locale;

public interface Era extends TemporalAccessor, TemporalAdjuster {
  int getValue( ) ;
  @Override default boolean isSupported(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default ValueRange range(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default int get(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default long getLong(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @SuppressWarnings("unchecked") @Override default <R> R query(TemporalQuery<R> query) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @Override default Temporal adjustInto(Temporal temporal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default String getDisplayName(TextStyle style, Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}