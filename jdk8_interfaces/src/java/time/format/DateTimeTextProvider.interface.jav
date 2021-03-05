package java.time.format;

import java.time.chrono.Chronology;
import java.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

class DateTimeTextProvider {
  DateTimeTextProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static DateTimeTextProvider getInstance( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public String getText(TemporalField field,long value,TextStyle style, Locale locale) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
  public String getText(Chronology chrono,TemporalField field,long value,TextStyle style, Locale locale) {
                                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                         }
  public Iterator<Entry<String, Long>> getTextIterator(TemporalField field,TextStyle style, Locale locale) {
                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                           }
  public Iterator<Entry<String, Long>> getTextIterator(Chronology chrono,TemporalField field,TextStyle style, Locale locale) {
                                                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                             }
  static <T> T getLocalizedResource(String key, Locale locale) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  static final class LocaleStore {
    LocaleStore(Map<TextStyle, Map<Long, String>> valueTextMap) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    String getText(long value, TextStyle style) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    Iterator<Entry<String, Long>> getTextIterator(TextStyle style) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  }
}