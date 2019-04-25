package java.time;


public abstract class Clock {
  public static Clock systemUTC( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Clock systemDefaultZone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Clock system(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Clock tickSeconds(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Clock tickMinutes(ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Clock tick(Clock baseClock, Duration tickDuration) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Clock fixed(Instant fixedInstant, ZoneId zone) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Clock offset(Clock baseClock, Duration offsetDuration) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  protected Clock( ) {
  }
  public abstract ZoneId getZone( ) ;
  public abstract Clock withZone(ZoneId zone) ;
  public long millis( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Instant instant( ) ;
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}