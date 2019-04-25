package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.*;

public abstract class AbstractSelectableChannel extends SelectableChannel {
  protected AbstractSelectableChannel(SelectorProvider provider) {
  }
  public final SelectorProvider provider( ) {
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