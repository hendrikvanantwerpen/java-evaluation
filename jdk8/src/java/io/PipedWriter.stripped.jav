package java.io;


public class PipedWriter extends Writer {
  public PipedWriter(PipedReader snk) throws IOException{
  }
  public PipedWriter( ) {
  }
  public synchronized void connect(PipedReader snk) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(int c) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(char cbuf[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void flush( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}