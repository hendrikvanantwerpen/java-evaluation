package java.io;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class InputStreamReader extends Reader {
  public InputStreamReader(InputStream in) {
    super(in);
  }
  public InputStreamReader(InputStream in, String charsetName) throws UnsupportedEncodingException{
    super(in);
  }
  public InputStreamReader(InputStream in, Charset cs) {
    super(in);
  }
  public InputStreamReader(InputStream in, CharsetDecoder dec) {
    super(in);
  }
  public String getEncoding( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(char cbuf[],int offset, int length) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean ready( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}