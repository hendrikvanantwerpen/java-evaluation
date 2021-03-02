package java.util;

import java.security.*;

public final class UUID implements java. io. Serializable, Comparable<UUID> {
  private static final long serialVersionUID;
  private final long mostSigBits;
  private final long leastSigBits;
  private static class Holder {
    static final SecureRandom numberGenerator;
  }
  private UUID(byte [] data) {
  }
  public UUID(long mostSigBits, long leastSigBits) {
  }
  public static UUID randomUUID( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public static UUID nameUUIDFromBytes(byte [] name) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public static UUID fromString(String name) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public long getLeastSignificantBits( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public long getMostSignificantBits( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public int version( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public int variant( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public long timestamp( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public int clockSequence( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public long node( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private static String digits(long val, int digits) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int compareTo(UUID val) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
}