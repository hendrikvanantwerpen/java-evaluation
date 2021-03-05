package java.io;


public abstract class InputStream implements Closeable {
  public abstract int read( ) throws IOException ;
  public int read(byte b[]) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public int read(byte b[],int off, int len) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public long skip(long n) throws IOException {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public int available( ) throws IOException {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public void close( ) throws IOException {
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
}