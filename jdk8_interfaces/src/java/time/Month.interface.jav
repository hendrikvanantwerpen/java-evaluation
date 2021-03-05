package java.time;

import java.time.format.TextStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.ValueRange;
import java.util.Locale;

public enum Month implements TemporalAccessor, TemporalAdjuster {
  ;  public static Month of(int month) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
     public static Month from(TemporalAccessor temporal) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
     public int getValue( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
     public String getDisplayName(TextStyle style, Locale locale) {
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
     public Month plus(long months) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
     public Month minus(long months) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
     public int length(boolean leapYear) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
     public int minLength( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
     public int maxLength( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
     public int firstDayOfYear(boolean leapYear) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
     public Month firstMonthOfQuarter( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
     public <R> R query(TemporalQuery<R> query) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
     public Temporal adjustInto(Temporal temporal) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
}