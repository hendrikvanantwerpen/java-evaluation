package java.util.zip;

import java.io.InputStream;
import java.io.IOException;

public class GZIPInputStream extends InflaterInputStream {
  public GZIPInputStream(InputStream in, int size) throws IOException{
    super(in, new Inflater (true), size);
  }
  public GZIPInputStream(InputStream in) throws IOException{
    this(in, 512);
  }
  public int read(byte [] buf,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static int GZIP_MAGIC;
}