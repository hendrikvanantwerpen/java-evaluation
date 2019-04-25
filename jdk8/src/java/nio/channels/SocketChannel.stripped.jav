package java.nio.channels;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketOption;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;

public abstract class SocketChannel extends AbstractSelectableChannel implements ByteChannel, ScatteringByteChannel, GatheringByteChannel, NetworkChannel {
  protected SocketChannel(SelectorProvider provider) {
    super(provider);
  }
  public static SocketChannel open( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static SocketChannel open(SocketAddress remote) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int validOps( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract SocketChannel bind(SocketAddress local) throws IOException ;
  public abstract <T> SocketChannel setOption(SocketOption<T> name, T value) throws IOException ;
  public abstract SocketChannel shutdownInput( ) throws IOException ;
  public abstract SocketChannel shutdownOutput( ) throws IOException ;
  public abstract Socket socket( ) ;
  public abstract boolean isConnected( ) ;
  public abstract boolean isConnectionPending( ) ;
  public abstract boolean connect(SocketAddress remote) throws IOException ;
  public abstract boolean finishConnect( ) throws IOException ;
  public abstract SocketAddress getRemoteAddress( ) throws IOException ;
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