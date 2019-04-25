package java.nio.channels.spi;

import java.nio.channels.*;
import java.io.IOException;
import java.util.concurrent.*;

public abstract class AsynchronousChannelProvider {
  private AsynchronousChannelProvider(Void ignore) {
  }
  protected AsynchronousChannelProvider( ) {
    this(checkPermission( ));
  }
  public static AsynchronousChannelProvider provider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract AsynchronousChannelGroup openAsynchronousChannelGroup(int nThreads, ThreadFactory threadFactory) throws IOException ;
  public abstract AsynchronousChannelGroup openAsynchronousChannelGroup(ExecutorService executor, int initialSize) throws IOException ;
  public abstract AsynchronousServerSocketChannel openAsynchronousServerSocketChannel(AsynchronousChannelGroup group) throws IOException ;
  public abstract AsynchronousSocketChannel openAsynchronousSocketChannel(AsynchronousChannelGroup group) throws IOException ;
}