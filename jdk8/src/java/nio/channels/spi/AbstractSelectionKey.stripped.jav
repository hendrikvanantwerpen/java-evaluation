package java.nio.channels.spi;

import java.nio.channels.*;

public abstract class AbstractSelectionKey extends SelectionKey {
  protected AbstractSelectionKey( ) {
  }
  public final boolean isValid( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void cancel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}