package java.io;


public abstract class Writer implements Appendable, Closeable, Flushable {
  public void write(int c) throws IOException {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public void write(char cbuf[]) throws IOException {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  abstract public void write(char cbuf[],int off, int len) throws IOException ;
  public void write(String str) throws IOException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public void write(String str,int off, int len) throws IOException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  public Writer append(CharSequence csq) throws IOException {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public Writer append(CharSequence csq,int start, int end) throws IOException {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public Writer append(char c) throws IOException {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  abstract public void flush( ) throws IOException ;
  abstract public void close( ) throws IOException ;
}