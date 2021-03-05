package java.time.format;

import java.time.ZoneId;
import java.time.chrono.Chronology;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.util.Locale;
import java.util.Set;
import java.util.function.Consumer;

final class DateTimeParseContext {
  DateTimeParseContext(DateTimeFormatter formatter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  DateTimeParseContext copy( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  Locale getLocale( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  DecimalStyle getDecimalStyle( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  Chronology getEffectiveChronology( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  boolean isCaseSensitive( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  void setCaseSensitive(boolean caseSensitive) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  boolean subSequenceEquals(CharSequence cs1,int offset1,CharSequence cs2,int offset2, int length) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
  boolean charEquals(char ch1, char ch2) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  static boolean charEqualsIgnoreCase(char c1, char c2) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  boolean isStrict( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  void setStrict(boolean strict) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  void startOptional( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  void endOptional(boolean successful) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  Parsed toUnresolved( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  TemporalAccessor toResolved(ResolverStyle resolverStyle, Set<TemporalField> resolverFields) {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
  Long getParsed(TemporalField field) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  int setParsedField(TemporalField field,long value,int errorPos, int successPos) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  void setParsed(Chronology chrono) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  void addChronoChangedListener(Consumer<Chronology> listener) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  void setParsed(ZoneId zone) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  void setParsedLeapSecond( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}