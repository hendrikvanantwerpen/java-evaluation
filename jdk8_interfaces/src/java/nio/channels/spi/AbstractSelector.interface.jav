package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

public abstract class AbstractSelector extends Selector {
  void cancel(SelectionKey k) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
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