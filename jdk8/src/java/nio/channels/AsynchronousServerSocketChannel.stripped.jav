package java.nio.channels;

import java.nio.channels.spi.*;
import java.net.SocketOption;
import java.net.SocketAddress;
import java.util.concurrent.Future;
import java.io.IOException;

public abstract class AsynchronousServerSocketChannel implements AsynchronousChannel, NetworkChannel {
  protected AsynchronousServerSocketChannel(AsynchronousChannelProvider provider) {
  }
  public final AsynchronousChannelProvider provider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AsynchronousServerSocketChannel open(AsynchronousChannelGroup group) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AsynchronousServerSocketChannel open( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final AsynchronousServerSocketChannel bind(SocketAddress local) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract AsynchronousServerSocketChannel bind(SocketAddress local, int backlog) throws IOException ;
  public abstract <T> AsynchronousServerSocketChannel setOption(SocketOption<T> name, T value) throws IOException ;
  public abstract <A> void accept(A attachment, CompletionHandler<AsynchronousSocketChannel, ? super A> handler) ;
  public abstract Future<AsynchronousSocketChannel> accept( ) ;
  public abstract SocketAddress getLocalAddress( ) throws IOException ;
}