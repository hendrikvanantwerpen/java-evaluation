package java.nio.channels;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketOption;
import java.net.SocketAddress;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;

public abstract class ServerSocketChannel extends AbstractSelectableChannel implements NetworkChannel {
  protected ServerSocketChannel(SelectorProvider provider) {
    super(provider);
  }
  public static ServerSocketChannel open( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int validOps( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final ServerSocketChannel bind(SocketAddress local) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract ServerSocketChannel bind(SocketAddress local, int backlog) throws IOException ;
  public abstract <T> ServerSocketChannel setOption(SocketOption<T> name, T value) throws IOException ;
  public abstract ServerSocket socket( ) ;
  public abstract SocketChannel accept( ) throws IOException ;
  public abstract SocketAddress getLocalAddress( ) throws IOException ;
}