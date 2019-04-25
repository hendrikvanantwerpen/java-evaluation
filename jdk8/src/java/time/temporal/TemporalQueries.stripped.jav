package java.time.temporal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;

public final class TemporalQueries {
  private TemporalQueries( ) {
  }
  public static TemporalQuery<ZoneId> zoneId( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static TemporalQuery<Chronology> chronology( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static TemporalQuery<TemporalUnit> precision( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static TemporalQuery<ZoneId> zone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static TemporalQuery<ZoneOffset> offset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static TemporalQuery<LocalDate> localDate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static TemporalQuery<LocalTime> localTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}