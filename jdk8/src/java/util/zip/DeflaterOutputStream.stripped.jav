package java.util.zip;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class DeflaterOutputStream extends FilterOutputStream {
  public DeflaterOutputStream(OutputStream out,Deflater def,int size, boolean syncFlush) {
    super(out);
  }
  public DeflaterOutputStream(OutputStream out,Deflater def, int size) {
    this(out, def, size, false);
  }
  public DeflaterOutputStream(OutputStream out,Deflater def, boolean syncFlush) {
    this(out, def, 512, syncFlush);
  }
  public DeflaterOutputStream(OutputStream out, Deflater def) {
    this(out, def, 512, false);
  }
  public DeflaterOutputStream(OutputStream out, boolean syncFlush) {
    this(out, new Deflater ( ), 512, syncFlush);
  }
  public DeflaterOutputStream(OutputStream out) {
    this(out, false);
  }
  public void write(int b) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(byte [] b,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void finish( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void flush( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}