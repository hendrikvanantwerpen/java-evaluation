package java.net;


public interface SocketOptions {
  public void setOption(int optID, Object value) throws SocketException ;
  public Object getOption(int optID) throws SocketException ;
  @Native public final static int TCP_NODELAY
  ;
  @Native public final static int SO_BINDADDR
  ;
  @Native public final static int SO_REUSEADDR
  ;
  @Native public final static int SO_BROADCAST
  ;
  @Native public final static int IP_MULTICAST_IF
  ;
  @Native public final static int IP_MULTICAST_IF2
  ;
  @Native public final static int IP_MULTICAST_LOOP
  ;
  @Native public final static int IP_TOS
  ;
  @Native public final static int SO_LINGER
  ;
  @Native public final static int SO_TIMEOUT
  ;
  @Native public final static int SO_SNDBUF
  ;
  @Native public final static int SO_RCVBUF
  ;
  @Native public final static int SO_KEEPALIVE
  ;
  @Native public final static int SO_OOBINLINE
  ;
}