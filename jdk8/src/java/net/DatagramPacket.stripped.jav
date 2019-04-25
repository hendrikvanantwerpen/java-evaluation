package java.net;


public final class DatagramPacket {
  public DatagramPacket(byte buf[],int offset, int length) {
  }
  public DatagramPacket(byte buf[], int length) {
    this(buf, 0, length);
  }
  public DatagramPacket(byte buf[],int offset,int length,InetAddress address, int port) {
  }
  public DatagramPacket(byte buf[],int offset,int length, SocketAddress address) {
  }
  public DatagramPacket(byte buf[],int length,InetAddress address, int port) {
    this(buf, 0, length, address, port);
  }
  public DatagramPacket(byte buf[],int length, SocketAddress address) {
    this(buf, 0, length, address);
  }
  public synchronized InetAddress getAddress( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getPort( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized byte [] getData( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getOffset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getLength( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setData(byte [] buf,int offset, int length) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setAddress(InetAddress iaddr) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setPort(int iport) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setSocketAddress(SocketAddress address) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized SocketAddress getSocketAddress( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setData(byte [] buf) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setLength(int length) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}