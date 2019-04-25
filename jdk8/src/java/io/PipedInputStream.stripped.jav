package java.io;


public class PipedInputStream extends InputStream {
  public PipedInputStream(PipedOutputStream src) throws IOException{
    this(src, DEFAULT_PIPE_SIZE);
  }
  public PipedInputStream(PipedOutputStream src, int pipeSize) throws IOException{
  }
  public PipedInputStream( ) {
  }
  public PipedInputStream(int pipeSize) {
  }
  public void connect(PipedOutputStream src) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int read(byte b[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int available( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}