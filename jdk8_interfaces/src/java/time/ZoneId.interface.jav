package java.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAccessor;
import java.time.zone.ZoneRules;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public abstract class ZoneId implements Serializable {
  public static final Map<String, String> SHORT_IDS;
  public static ZoneId systemDefault( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public static Set<String> getAvailableZoneIds( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public static ZoneId of(String zoneId, Map<String, String> aliasMap) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public static ZoneId of(String zoneId) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public static ZoneId ofOffset(String prefix, ZoneOffset offset) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  static ZoneId of(String zoneId, boolean checkAvailable) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public static ZoneId from(TemporalAccessor temporal) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  ZoneId( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract String getId( ) ;
  public String getDisplayName(TextStyle style, Locale locale) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public abstract ZoneRules getRules( ) ;
  public ZoneId normalized( ) {
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
  abstract void write(DataOutput out) throws IOException ;
}