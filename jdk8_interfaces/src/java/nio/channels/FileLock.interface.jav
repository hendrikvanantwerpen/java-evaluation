package java.nio.channels;

import java.io.IOException;

public abstract class FileLock implements AutoCloseable {
  public final FileChannel channel( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public Channel acquiredBy( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public final long position( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public final long size( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public final boolean isShared( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public final boolean overlaps(long position, long size) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public abstract boolean isValid( ) ;
  public abstract void release( ) throws IOException ;
  public final void close( ) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public final String toString( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
}