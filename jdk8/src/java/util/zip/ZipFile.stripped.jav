package java.util.zip;

import java.io.Closeable;
import java.io.InputStream;
import java.io.IOException;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.stream.Stream;

public class ZipFile implements ZipConstants, Closeable {
  public static final int OPEN_READ;
  public static final int OPEN_DELETE;
  public ZipFile(String name) throws IOException{
    this(new File (name), OPEN_READ);
  }
  public ZipFile(File file, int mode) throws IOException{
    this(file, mode, StandardCharsets.UTF_8);
  }
  public ZipFile(File file) throws ZipException, IOException{
    this(file, OPEN_READ);
  }
  public ZipFile(File file,int mode, Charset charset) throws IOException{
  }
  public ZipFile(String name, Charset charset) throws IOException{
    this(new File (name), OPEN_READ, charset);
  }
  public ZipFile(File file, Charset charset) throws IOException{
    this(file, OPEN_READ, charset);
  }
  public String getComment( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZipEntry getEntry(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public InputStream getInputStream(ZipEntry entry) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Enumeration<? extends ZipEntry> entries( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Stream<? extends ZipEntry> stream( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}