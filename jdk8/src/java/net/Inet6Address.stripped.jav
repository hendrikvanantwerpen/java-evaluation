package java.net;


public final class Inet6Address extends InetAddress {
  Inet6Address( ) {
    super( );
  }
  Inet6Address(String hostName,byte addr[], int scope_id) {
  }
  Inet6Address(String hostName, byte addr[]) {
  }
  Inet6Address(String hostName,byte addr[], NetworkInterface nif) throws UnknownHostException{
  }
  Inet6Address(String hostName,byte addr[], String ifname) throws UnknownHostException{
  }
  public static Inet6Address getByAddress(String host,byte [] addr, NetworkInterface nif) throws UnknownHostException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Inet6Address getByAddress(String host,byte [] addr, int scope_id) throws UnknownHostException {
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
  public byte [] getAddress( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getScopeId( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NetworkInterface getScopedInterface( ) {
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
  public boolean isIPv4CompatibleAddress( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}