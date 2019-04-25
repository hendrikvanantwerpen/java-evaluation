package java.net;


public class Proxy {
  public enum Type {
    DIRECT, HTTP, SOCKS
  }
  ;
  public final static Proxy NO_PROXY;
  private Proxy( ) {
  }
  public Proxy(Type type, SocketAddress sa) {
  }
  public Type type( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SocketAddress address( ) {
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