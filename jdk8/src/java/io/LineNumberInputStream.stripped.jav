package java.io;


public class LineNumberInputStream extends FilterInputStream {
  public LineNumberInputStream(InputStream in) {
    super(in);
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(byte b[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long skip(long n) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLineNumber(int lineNumber) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getLineNumber( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int available( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mark(int readlimit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}