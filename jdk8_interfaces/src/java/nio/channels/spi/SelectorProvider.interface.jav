package java.nio.channels.spi;

import java.io.IOException;
import java.net.ProtocolFamily;
import java.nio.channels.*;

public abstract class SelectorProvider {
  public static SelectorProvider provider( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public abstract DatagramChannel openDatagramChannel( ) throws IOException ;
  public abstract DatagramChannel openDatagramChannel(ProtocolFamily family) throws IOException ;
  public abstract Pipe openPipe( ) throws IOException ;
  public abstract AbstractSelector openSelector( ) throws IOException ;
  public abstract ServerSocketChannel openServerSocketChannel( ) throws IOException ;
  public abstract SocketChannel openSocketChannel( ) throws IOException ;
  public Channel inheritedChannel( ) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
}