package java.io;

import java.nio.channels.FileChannel;

public class FileOutputStream extends OutputStream {
  private final FileDescriptor fd;
  private final boolean append;
  private FileChannel channel;
  private final String path;
  private final Object closeLock;
  private volatile boolean closed;
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
  private native void open0(String name, boolean append) throws FileNotFoundException ;
  private void open(String name, boolean append) throws FileNotFoundException {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  private native void write(int b, boolean append) throws IOException ;
  public void write(int b) throws IOException {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private native void writeBytes(byte b[],int off,int len, boolean append) throws IOException ;
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
  protected void finalize( ) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  private native void close0( ) throws IOException ;
  private static native void initIDs( ) ;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
}