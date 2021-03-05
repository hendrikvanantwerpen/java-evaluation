package java.nio;

import java.io.FileDescriptor;

public abstract class MappedByteBuffer extends ByteBuffer {
  MappedByteBuffer(int mark,int pos,int lim,int cap, FileDescriptor fd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  MappedByteBuffer(int mark,int pos,int lim, int cap) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isLoaded( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public final MappedByteBuffer load( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public final MappedByteBuffer force( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
}