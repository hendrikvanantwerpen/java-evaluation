package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

public abstract class AbstractSelectableChannel extends SelectableChannel {
  public final SelectorProvider provider( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  void removeKey(SelectionKey k) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public final boolean isRegistered( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public final SelectionKey keyFor(Selector sel) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public final SelectionKey register(Selector sel,int ops, Object att) throws ClosedChannelException {
                                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                     }
  public final boolean isBlocking( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public final Object blockingLock( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public final SelectableChannel configureBlocking(boolean block) throws IOException {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
}