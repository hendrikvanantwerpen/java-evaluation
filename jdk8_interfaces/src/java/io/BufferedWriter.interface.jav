package java.io;


public class BufferedWriter extends Writer {
  private Writer out;
  private char cb[];
  private int nChars, nextChar;
  private static int defaultCharBufferSize;
  private String lineSeparator;
  public BufferedWriter(Writer out) {
    this(out, defaultCharBufferSize);
  }
  public BufferedWriter(Writer out, int sz) {
    super(out);
  }
  private void ensureOpen( ) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  void flushBuffer( ) throws IOException {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public void write(int c) throws IOException {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private int min(int a, int b) {
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