package java.util.jar;

import java.util.zip.*;
import java.io.*;

public class JarInputStream extends ZipInputStream {
  public JarInputStream(InputStream in) throws IOException{
    this(in, true);
  }
  public JarInputStream(InputStream in, boolean verify) throws IOException{
    super(in);
  }
  public Manifest getManifest( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZipEntry getNextEntry( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public JarEntry getNextJarEntry( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(byte [] b,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}