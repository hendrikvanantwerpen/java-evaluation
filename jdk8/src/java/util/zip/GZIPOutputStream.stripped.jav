package java.util.zip;

import java.io.OutputStream;
import java.io.IOException;

public class GZIPOutputStream extends DeflaterOutputStream {
  public GZIPOutputStream(OutputStream out, int size) throws IOException{
    this(out, size, false);
  }
  public GZIPOutputStream(OutputStream out,int size, boolean syncFlush) throws IOException{
    super(out, new Deflater (Deflater.DEFAULT_COMPRESSION,true), size, syncFlush);
  }
  public GZIPOutputStream(OutputStream out) throws IOException{
    this(out, 512, false);
  }
  public GZIPOutputStream(OutputStream out, boolean syncFlush) throws IOException{
    this(out, 512, syncFlush);
  }
  public synchronized void write(byte [] buf,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void finish( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}