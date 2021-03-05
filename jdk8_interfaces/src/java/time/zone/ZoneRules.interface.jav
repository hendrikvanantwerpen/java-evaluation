package java.time.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

public final class ZoneRules implements Serializable {
  public static ZoneRules of(ZoneOffset baseStandardOffset,ZoneOffset baseWallOffset,List<ZoneOffsetTransition> standardOffsetTransitionList,List<ZoneOffsetTransition> transitionList, List<ZoneOffsetTransitionRule> lastRules) {
                                                                                                                                                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                                                                                  }
  public static ZoneRules of(ZoneOffset offset) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  ZoneRules(ZoneOffset baseStandardOffset,ZoneOffset baseWallOffset,List<ZoneOffsetTransition> standardOffsetTransitionList,List<ZoneOffsetTransition> transitionList, List<ZoneOffsetTransitionRule> lastRules) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  void writeExternal(DataOutput out) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  static ZoneRules readExternal(DataInput in) throws IOException, ClassNotFoundException {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
  public boolean isFixedOffset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public ZoneOffset getOffset(Instant instant) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public ZoneOffset getOffset(LocalDateTime localDateTime) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public List<ZoneOffset> getValidOffsets(LocalDateTime localDateTime) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public ZoneOffsetTransition getTransition(LocalDateTime localDateTime) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public ZoneOffset getStandardOffset(Instant instant) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public Duration getDaylightSavings(Instant instant) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public boolean isDaylightSavings(Instant instant) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public boolean isValidOffset(LocalDateTime localDateTime, ZoneOffset offset) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public ZoneOffsetTransition nextTransition(Instant instant) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public ZoneOffsetTransition previousTransition(Instant instant) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public List<ZoneOffsetTransition> getTransitions( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public List<ZoneOffsetTransitionRule> getTransitionRules( ) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public boolean equals(Object otherRules) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}