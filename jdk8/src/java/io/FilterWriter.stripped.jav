package java.io;


public abstract class FilterWriter extends Writer {
  protected FilterWriter(Writer out) {
    super(out);
  }
  public void write(int c) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(char cbuf[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(String str,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void flush( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}