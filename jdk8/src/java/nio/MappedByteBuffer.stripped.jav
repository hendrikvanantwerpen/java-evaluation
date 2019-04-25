package java.nio;

import java.io.FileDescriptor;

public abstract class MappedByteBuffer extends ByteBuffer {
  MappedByteBuffer(int mark,int pos,int lim,int cap, FileDescriptor fd) {
    super(mark, pos, lim, cap);
  }
  MappedByteBuffer(int mark,int pos,int lim, int cap) {
    super(mark, pos, lim, cap);
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