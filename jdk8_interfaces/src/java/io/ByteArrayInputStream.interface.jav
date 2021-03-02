package java.io;


public class ByteArrayInputStream extends InputStream {
  protected byte buf[];
  protected int pos;
  protected int mark;
  protected int count;
  public ByteArrayInputStream(byte buf[]) {
  }
  public ByteArrayInputStream(byte buf[],int offset, int length) {
  }
  public synchronized int read( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public synchronized int read(byte b[],int off, int len) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public synchronized long skip(long n) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public synchronized int available( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public boolean markSupported( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public void mark(int readAheadLimit) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public synchronized void reset( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public void close( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
}