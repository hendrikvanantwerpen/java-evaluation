package java.io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class BufferedInputStream extends FilterInputStream {
  private static int DEFAULT_BUFFER_SIZE;
  private static int MAX_BUFFER_SIZE;
  protected volatile byte buf[];
  private static final AtomicReferenceFieldUpdater<BufferedInputStream, byte []> bufUpdater;
  protected int count;
  protected int pos;
  protected int markpos;
  protected int marklimit;
  private InputStream getInIfOpen( ) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private byte [] getBufIfOpen( ) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public BufferedInputStream(InputStream in) {
    this(in, DEFAULT_BUFFER_SIZE);
  }
  public BufferedInputStream(InputStream in, int size) {
    super(in);
  }
  private void fill( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public synchronized int read( ) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  private int read1(byte [] b,int off, int len) throws IOException {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public synchronized int read(byte b[],int off, int len) throws IOException {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  public synchronized long skip(long n) throws IOException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public synchronized int available( ) throws IOException {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public synchronized void mark(int readlimit) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public synchronized void reset( ) throws IOException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public boolean markSupported( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public void close( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
}