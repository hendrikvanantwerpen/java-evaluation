package java.time;

import java.io.Serializable;

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
  static final class SystemClock extends Clock implements Serializable {
    SystemClock(ZoneId zone) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public ZoneId getZone( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public Clock withZone(ZoneId zone) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    public long millis( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public Instant instant( ) {
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
  }
  static final class FixedClock extends Clock implements Serializable {
    FixedClock(Instant fixedInstant, ZoneId zone) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public ZoneId getZone( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public Clock withZone(ZoneId zone) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    public long millis( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public Instant instant( ) {
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
  }
  static final class OffsetClock extends Clock implements Serializable {
    OffsetClock(Clock baseClock, Duration offset) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public ZoneId getZone( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public Clock withZone(ZoneId zone) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    public long millis( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public Instant instant( ) {
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
  }
  static final class TickClock extends Clock implements Serializable {
    TickClock(Clock baseClock, long tickNanos) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public ZoneId getZone( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public Clock withZone(ZoneId zone) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
    public long millis( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    public Instant instant( ) {
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
  }
}