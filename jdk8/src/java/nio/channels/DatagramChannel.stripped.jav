package java.nio.channels;

import java.io.IOException;
import java.net.ProtocolFamily;
import java.net.DatagramSocket;
import java.net.SocketOption;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;

public abstract class DatagramChannel extends AbstractSelectableChannel implements ByteChannel, ScatteringByteChannel, GatheringByteChannel, MulticastChannel {
  protected DatagramChannel(SelectorProvider provider) {
    super(provider);
  }
  public static DatagramChannel open( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static DatagramChannel open(ProtocolFamily family) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int validOps( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract DatagramChannel bind(SocketAddress local) throws IOException ;
  public abstract <T> DatagramChannel setOption(SocketOption<T> name, T value) throws IOException ;
  public abstract DatagramSocket socket( ) ;
  public abstract boolean isConnected( ) ;
  public abstract DatagramChannel connect(SocketAddress remote) throws IOException ;
  public abstract DatagramChannel disconnect( ) throws IOException ;
  public abstract SocketAddress getRemoteAddress( ) throws IOException ;
  public abstract SocketAddress receive(ByteBuffer dst) throws IOException ;
  public abstract int send(ByteBuffer src, SocketAddress target) throws IOException ;
  public abstract int read(ByteBuffer dst) throws IOException ;
  public abstract long read(ByteBuffer [] dsts,int offset, int length) throws IOException ;
  public final long read(ByteBuffer [] dsts) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int write(ByteBuffer src) throws IOException ;
  public abstract long write(ByteBuffer [] srcs,int offset, int length) throws IOException ;
  public final long write(ByteBuffer [] srcs) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract SocketAddress getLocalAddress( ) throws IOException ;
}