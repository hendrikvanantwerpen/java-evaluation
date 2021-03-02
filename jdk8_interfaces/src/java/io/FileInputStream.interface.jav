package java.io;

import java.nio.channels.FileChannel;

public class FileInputStream extends InputStream {
  private final FileDescriptor fd;
  private final String path;
  private FileChannel channel;
  private final Object closeLock;
  private volatile boolean closed;
  public FileInputStream(String name) throws FileNotFoundException{
    this(name != null ? new File (name) : null);
  }
  public FileInputStream(File file) throws FileNotFoundException{
  }
  public FileInputStream(FileDescriptor fdObj) {
  }
  private native void open0(String name) throws FileNotFoundException ;
  private void open(String name) throws FileNotFoundException {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public int read( ) throws IOException {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private native int read0( ) throws IOException ;
  private native int readBytes(byte b[],int off, int len) throws IOException ;
  public int read(byte b[]) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public int read(byte b[],int off, int len) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public long skip(long n) throws IOException {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private native long skip0(long n) throws IOException ;
  public int available( ) throws IOException {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private native int available0( ) throws IOException ;
  public void close( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public final FileDescriptor getFD( ) throws IOException {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public FileChannel getChannel( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  private static native void initIDs( ) ;
  private native void close0( ) throws IOException ;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  protected void finalize( ) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
}