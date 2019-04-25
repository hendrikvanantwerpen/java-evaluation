package java.io;


public class LineNumberReader extends BufferedReader {
  public LineNumberReader(Reader in) {
    super(in);
  }
  public LineNumberReader(Reader in, int sz) {
    super(in, sz);
  }
  public void setLineNumber(int lineNumber) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getLineNumber( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(char cbuf[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String readLine( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long skip(long n) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mark(int readAheadLimit) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}