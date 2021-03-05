package java.nio.channels;

import java.io.IOException;
import java.nio.channels.spi.*;

public abstract class Pipe {
  public static abstract class SourceChannel extends AbstractSelectableChannel implements ReadableByteChannel, ScatteringByteChannel {
    public final int validOps( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  public static abstract class SinkChannel extends AbstractSelectableChannel implements WritableByteChannel, GatheringByteChannel {
    public final int validOps( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  public abstract SourceChannel source( ) ;
  public abstract SinkChannel sink( ) ;
  public static Pipe open( ) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
}