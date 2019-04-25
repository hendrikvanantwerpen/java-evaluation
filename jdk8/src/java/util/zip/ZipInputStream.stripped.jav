package java.util.zip;

import java.io.InputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class ZipInputStream extends InflaterInputStream implements ZipConstants {
  public ZipInputStream(InputStream in) {
    this(in, StandardCharsets.UTF_8);
  }
  public ZipInputStream(InputStream in, Charset charset) {
    super(new PushbackInputStream (in,512), new Inflater (true), 512);
  }
  public ZipEntry getNextEntry( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void closeEntry( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int available( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(byte [] b,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long skip(long n) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}