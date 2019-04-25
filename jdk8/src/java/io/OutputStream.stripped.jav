package java.io;


public abstract class OutputStream implements Closeable, Flushable {
  public abstract void write(int b) throws IOException ;
  public void write(byte b[]) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(byte b[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void flush( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}