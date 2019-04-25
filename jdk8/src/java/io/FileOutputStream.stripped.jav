package java.io;

import java.nio.channels.FileChannel;

public class FileOutputStream extends OutputStream {
  public FileOutputStream(String name) throws FileNotFoundException{
    this(name != null ? new File (name) : null, false);
  }
  public FileOutputStream(String name, boolean append) throws FileNotFoundException{
    this(name != null ? new File (name) : null, append);
  }
  public FileOutputStream(File file) throws FileNotFoundException{
    this(file, false);
  }
  public FileOutputStream(File file, boolean append) throws FileNotFoundException{
  }
  public FileOutputStream(FileDescriptor fdObj) {
  }
  public void write(int b) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(byte b[]) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(byte b[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
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