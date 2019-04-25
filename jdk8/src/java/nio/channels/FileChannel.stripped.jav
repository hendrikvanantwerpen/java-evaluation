package java.nio.channels;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.spi.*;
import java.util.Set;

public abstract class FileChannel extends AbstractInterruptibleChannel implements SeekableByteChannel, GatheringByteChannel, ScatteringByteChannel {
  protected FileChannel( ) {
  }
  public static FileChannel open(Path path,Set<? extends OpenOption> options, FileAttribute<?> ... attrs) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static FileChannel open(Path path, OpenOption ... options) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int read(ByteBuffer dst) throws IOException ;
  public abstract long read(ByteBuffer [] dsts,int offset, int length) throws IOException ;
  public final long read(ByteBuffer [] dsts) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int write(ByteBuffer src) throws IOException ;
  public abstract long write(ByteBuffer [] srcs,int offset, int length) throws IOException ;
  public final long write(ByteBuffer [] srcs) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract long position( ) throws IOException ;
  public abstract FileChannel position(long newPosition) throws IOException ;
  public abstract long size( ) throws IOException ;
  public abstract FileChannel truncate(long size) throws IOException ;
  public abstract void force(boolean metaData) throws IOException ;
  public abstract long transferTo(long position,long count, WritableByteChannel target) throws IOException ;
  public abstract long transferFrom(ReadableByteChannel src,long position, long count) throws IOException ;
  public abstract int read(ByteBuffer dst, long position) throws IOException ;
  public abstract int write(ByteBuffer src, long position) throws IOException ;
  public static class MapMode {
    public static final MapMode READ_ONLY;
    public static final MapMode READ_WRITE;
    public static final MapMode PRIVATE;
    private MapMode(String name) {
    }
    public String toString( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public abstract MappedByteBuffer map(MapMode mode,long position, long size) throws IOException ;
  public abstract FileLock lock(long position,long size, boolean shared) throws IOException ;
  public final FileLock lock( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract FileLock tryLock(long position,long size, boolean shared) throws IOException ;
  public final FileLock tryLock( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}