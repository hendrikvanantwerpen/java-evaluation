package java.net;


public final class StandardSocketOptions {
  private StandardSocketOptions( ) {
  }
  public static final SocketOption<Boolean> SO_BROADCAST;
  public static final SocketOption<Boolean> SO_KEEPALIVE;
  public static final SocketOption<Integer> SO_SNDBUF;
  public static final SocketOption<Integer> SO_RCVBUF;
  public static final SocketOption<Boolean> SO_REUSEADDR;
  public static final SocketOption<Integer> SO_LINGER;
  public static final SocketOption<Integer> IP_TOS;
  public static final SocketOption<NetworkInterface> IP_MULTICAST_IF;
  public static final SocketOption<Integer> IP_MULTICAST_TTL;
  public static final SocketOption<Boolean> IP_MULTICAST_LOOP;
  public static final SocketOption<Boolean> TCP_NODELAY;
}