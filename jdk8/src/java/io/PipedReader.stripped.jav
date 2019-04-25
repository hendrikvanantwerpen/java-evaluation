package java.io;


public class PipedReader extends Reader {
  public PipedReader(PipedWriter src) throws IOException{
    this(src, DEFAULT_PIPE_SIZE);
  }
  public PipedReader(PipedWriter src, int pipeSize) throws IOException{
  }
  public PipedReader( ) {
  }
  public PipedReader(int pipeSize) {
  }
  public void connect(PipedWriter src) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int read(char cbuf[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean ready( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}