package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.Selector;

public abstract class AbstractSelector extends Selector {
  protected AbstractSelector(SelectorProvider provider) {
  }
  public final void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isOpen( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final SelectorProvider provider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}