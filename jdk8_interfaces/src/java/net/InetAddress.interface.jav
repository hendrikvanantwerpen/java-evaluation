package java.net;

import java.io.IOException;
import sun.security.action.*;
import sun.net.spi.nameservice.*;

public class InetAddress implements java. io. Serializable {
  static final int IPv4;
  static final int IPv6;
  static transient boolean preferIPv6Address;
  static class InetAddressHolder {
    String originalHostName;
    InetAddressHolder( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    InetAddressHolder(String hostName,int address, int family) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    void init(String hostName, int family) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    String hostName;
    String getHostName( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    String getOriginalHostName( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    int address;
    int getAddress( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
    int family;
    int getFamily( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  }
  final transient InetAddressHolder holder;
  InetAddressHolder holder( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  InetAddress( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMulticastAddress( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public boolean isAnyLocalAddress( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public boolean isLoopbackAddress( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public boolean isLinkLocalAddress( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public boolean isSiteLocalAddress( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public boolean isMCGlobal( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public boolean isMCNodeLocal( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean isMCLinkLocal( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean isMCSiteLocal( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean isMCOrgLocal( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public boolean isReachable(int timeout) throws IOException {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public boolean isReachable(NetworkInterface netif,int ttl, int timeout) throws IOException {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
  public String getHostName( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  String getHostName(boolean check) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public String getCanonicalHostName( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public byte [] getAddress( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public String getHostAddress( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  static InetAddress [] unknown_array;
  static InetAddressImpl impl;
  static final class CacheEntry {
    CacheEntry(InetAddress [] addresses, long expiration) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    InetAddress [] addresses;
    long expiration;
  }
  static final class Cache {
    enum Type {
    }
    public Cache(Type type) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Cache put(String host, InetAddress [] addresses) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
    public CacheEntry get(String host) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  }
  public static InetAddress getByAddress(String host, byte [] addr) throws UnknownHostException {
                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                }
  public static InetAddress getByName(String host) throws UnknownHostException {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public static InetAddress [] getAllByName(String host) throws UnknownHostException {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  public static InetAddress getLoopbackAddress( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  static InetAddress [] getAllByName0(String host, boolean check) throws UnknownHostException {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
  public static InetAddress getByAddress(byte [] addr) throws UnknownHostException {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  public static InetAddress getLocalHost( ) throws UnknownHostException {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  static InetAddress anyLocalAddress( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  static InetAddressImpl loadImpl(String implName) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
}
class InetAddressImplFactory {
  static InetAddressImpl create( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  static native boolean isIPv6Supported( ) ;
}