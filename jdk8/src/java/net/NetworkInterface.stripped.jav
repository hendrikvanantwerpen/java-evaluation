package java.net;

import java.util.Enumeration;
import sun.security.action.*;

public final class NetworkInterface {
  NetworkInterface( ) {
  }
  NetworkInterface(String name,int index, InetAddress [] addrs) {
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Enumeration<InetAddress> getInetAddresses( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public java. util. List<InterfaceAddress> getInterfaceAddresses( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Enumeration<NetworkInterface> getSubInterfaces( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NetworkInterface getParent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getDisplayName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static NetworkInterface getByName(String name) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static NetworkInterface getByIndex(int index) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static NetworkInterface getByInetAddress(InetAddress addr) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Enumeration<NetworkInterface> getNetworkInterfaces( ) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isUp( ) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLoopback( ) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isPointToPoint( ) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean supportsMulticast( ) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getHardwareAddress( ) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMTU( ) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isVirtual( ) {
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