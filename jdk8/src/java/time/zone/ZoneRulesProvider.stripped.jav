package java.time.zone;

import java.util.NavigableMap;
import java.util.Set;

public abstract class ZoneRulesProvider {
  public static Set<String> getAvailableZoneIds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ZoneRules getRules(String zoneId, boolean forCaching) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static NavigableMap<String, ZoneRules> getVersions(String zoneId) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void registerProvider(ZoneRulesProvider provider) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean refresh( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  protected ZoneRulesProvider( ) {
  }
}