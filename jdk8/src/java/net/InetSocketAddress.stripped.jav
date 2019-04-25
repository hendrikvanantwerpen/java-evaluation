package java.net;


public class InetSocketAddress extends SocketAddress {
  public InetSocketAddress(int port) {
    this(InetAddress. anyLocalAddress( ), port);
  }
  public InetSocketAddress(InetAddress addr, int port) {
  }
  public InetSocketAddress(String hostname, int port) {
  }
  private InetSocketAddress(int port, String hostname) {
  }
  public static InetSocketAddress createUnresolved(String host, int port) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getPort( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final InetAddress getAddress( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getHostName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getHostString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isUnresolved( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}