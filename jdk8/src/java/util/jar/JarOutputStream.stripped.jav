package java.util.jar;

import java.util.zip.*;
import java.io.*;

public class JarOutputStream extends ZipOutputStream {
  public JarOutputStream(OutputStream out, Manifest man) throws IOException{
    super(out);
  }
  public JarOutputStream(OutputStream out) throws IOException{
    super(out);
  }
  public void putNextEntry(ZipEntry ze) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}