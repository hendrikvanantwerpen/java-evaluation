package java.io;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import sun.nio.cs.StreamEncoder;

public class OutputStreamWriter extends Writer {
  private final StreamEncoder se;
  public OutputStreamWriter(OutputStream out, String charsetName) throws UnsupportedEncodingException{
    super(out);
  }
  public OutputStreamWriter(OutputStream out) {
    super(out);
  }
  public OutputStreamWriter(OutputStream out, Charset cs) {
    super(out);
  }
  public OutputStreamWriter(OutputStream out, CharsetEncoder enc) {
    super(out);
  }
  public String getEncoding( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  void flushBuffer( ) throws IOException {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
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