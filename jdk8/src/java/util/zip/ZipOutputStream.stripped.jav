package java.util.zip;

import java.io.OutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class ZipOutputStream extends DeflaterOutputStream implements ZipConstants {
  public static final int STORED;
  public static final int DEFLATED;
  public ZipOutputStream(OutputStream out) {
    this(out, StandardCharsets.UTF_8);
  }
  public ZipOutputStream(OutputStream out, Charset charset) {
    super(out, new Deflater (Deflater.DEFAULT_COMPRESSION,true));
  }
  public void setComment(String comment) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMethod(int method) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLevel(int level) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void putNextEntry(ZipEntry e) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void closeEntry( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void write(byte [] b,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void finish( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}