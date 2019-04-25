package java.net;

import java.io.IOException;
import sun.security.action.*;
import sun.net.spi.nameservice.*;

public class InetAddress implements java. io. Serializable {
  InetAddress( ) {
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
  public static InetAddress getByAddress(byte [] addr) throws UnknownHostException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static InetAddress getLocalHost( ) throws UnknownHostException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}