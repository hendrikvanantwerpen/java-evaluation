package java.io;


public class BufferedOutputStream extends FilterOutputStream {
  public BufferedOutputStream(OutputStream out) {
    this(out, 8192);
  }
  public BufferedOutputStream(OutputStream out, int size) {
    super(out);
  }
  public synchronized void write(int b) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void write(byte b[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void flush( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}