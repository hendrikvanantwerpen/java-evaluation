package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.*;
import sun.nio.ch.Interruptible;

public abstract class AbstractInterruptibleChannel implements Channel, InterruptibleChannel {
  private final Object closeLock;
  private volatile boolean open;
  protected AbstractInterruptibleChannel( ) {
  }
  public final void close( ) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  protected abstract void implCloseChannel( ) throws IOException ;
  public final boolean isOpen( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  private Interruptible interruptor;
  private volatile Thread interrupted;
  protected final void begin( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  protected final void end(boolean completed) throws AsynchronousCloseException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  static void blockedOn(Interruptible intr) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
}