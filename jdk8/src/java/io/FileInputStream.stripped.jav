package java.io;

import java.nio.channels.FileChannel;

public class FileInputStream extends InputStream {
  public FileInputStream(String name) throws FileNotFoundException{
    this(name != null ? new File (name) : null);
  }
  public FileInputStream(File file) throws FileNotFoundException{
  }
  public FileInputStream(FileDescriptor fdObj) {
  }
  public native int read( ) throws IOException ;
  public int read(byte b[]) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(byte b[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public native long skip(long n) throws IOException ;
  public native int available( ) throws IOException ;
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final FileDescriptor getFD( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FileChannel getChannel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}