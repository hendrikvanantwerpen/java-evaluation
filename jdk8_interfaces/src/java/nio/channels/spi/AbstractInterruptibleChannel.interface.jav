package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.*;
import sun.nio.ch.Interruptible;

public abstract class AbstractInterruptibleChannel implements Channel, InterruptibleChannel {
  public final void close( ) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public final boolean isOpen( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  static void blockedOn(Interruptible intr) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
}