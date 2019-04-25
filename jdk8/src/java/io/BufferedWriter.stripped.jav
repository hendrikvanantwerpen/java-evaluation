package java.io;


public class BufferedWriter extends Writer {
  public BufferedWriter(Writer out) {
    this(out, defaultCharBufferSize);
  }
  public BufferedWriter(Writer out, int sz) {
    super(out);
  }
  public void write(int c) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(char cbuf[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(String s,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void newLine( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void flush( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}