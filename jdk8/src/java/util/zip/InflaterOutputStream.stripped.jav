package java.util.zip;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class InflaterOutputStream extends FilterOutputStream {
  public InflaterOutputStream(OutputStream out) {
    this(out, new Inflater ( ));
  }
  public InflaterOutputStream(OutputStream out, Inflater infl) {
    this(out, infl, 512);
  }
  public InflaterOutputStream(OutputStream out,Inflater infl, int bufLen) {
    super(out);
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void flush( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void finish( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(int b) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(byte [] b,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}