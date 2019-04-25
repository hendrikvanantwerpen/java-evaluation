package java.net;

import java.io.IOException;

public class MulticastSocket extends DatagramSocket {
  public MulticastSocket( ) throws IOException{
    this(new InetSocketAddress (0));
  }
  public MulticastSocket(int port) throws IOException{
    this(new InetSocketAddress (port));
  }
  public MulticastSocket(SocketAddress bindaddr) throws IOException{
    super((SocketAddress ) null);
  }
  public void setTTL(byte ttl) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTimeToLive(int ttl) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte getTTL( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTimeToLive( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void joinGroup(InetAddress mcastaddr) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void leaveGroup(InetAddress mcastaddr) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void joinGroup(SocketAddress mcastaddr, NetworkInterface netIf) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void leaveGroup(SocketAddress mcastaddr, NetworkInterface netIf) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setInterface(InetAddress inf) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public InetAddress getInterface( ) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setNetworkInterface(NetworkInterface netIf) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NetworkInterface getNetworkInterface( ) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLoopbackMode(boolean disable) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getLoopbackMode( ) throws SocketException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void send(DatagramPacket p, byte ttl) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}