package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.*;

public abstract class AbstractInterruptibleChannel implements Channel, InterruptibleChannel {
  protected AbstractInterruptibleChannel( ) {
  }
  public final void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isOpen( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}