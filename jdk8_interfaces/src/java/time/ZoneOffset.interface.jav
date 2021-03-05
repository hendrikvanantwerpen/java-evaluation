package java.time;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.ValueRange;
import java.time.zone.ZoneRules;

public final class ZoneOffset extends ZoneId implements TemporalAccessor, TemporalAdjuster, Comparable<ZoneOffset>, Serializable {
  public static final ZoneOffset UTC;
  public static final ZoneOffset MIN;
  public static final ZoneOffset MAX;
  public static ZoneOffset of(String offsetId) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public static ZoneOffset ofHours(int hours) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public static ZoneOffset ofHoursMinutes(int hours, int minutes) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public static ZoneOffset ofHoursMinutesSeconds(int hours,int minutes, int seconds) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  public static ZoneOffset from(TemporalAccessor temporal) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public static ZoneOffset ofTotalSeconds(int totalSeconds) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public int getTotalSeconds( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public String getId( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public ZoneRules getRules( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public boolean isSupported(TemporalField field) {
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
  public <R> R query(TemporalQuery<R> query) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public Temporal adjustInto(Temporal temporal) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public int compareTo(ZoneOffset other) {
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
  void write(DataOutput out) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  void writeExternal(DataOutput out) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  static ZoneOffset readExternal(DataInput in) throws IOException {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
}