package java.nio.channels;

import java.nio.channels.spi.AsynchronousChannelProvider;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public abstract class AsynchronousChannelGroup {
  protected AsynchronousChannelGroup(AsynchronousChannelProvider provider) {
  }
  public final AsynchronousChannelProvider provider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AsynchronousChannelGroup withFixedThreadPool(int nThreads, ThreadFactory threadFactory) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AsynchronousChannelGroup withCachedThreadPool(ExecutorService executor, int initialSize) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AsynchronousChannelGroup withThreadPool(ExecutorService executor) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract boolean isShutdown( ) ;
  public abstract boolean isTerminated( ) ;
  public abstract void shutdown( ) ;
  public abstract void shutdownNow( ) throws IOException ;
  public abstract boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException ;
}