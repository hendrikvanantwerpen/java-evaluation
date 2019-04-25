package java.util.jar;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import java.util.zip.*;

public class JarFile extends ZipFile {
  public static final String MANIFEST_NAME;
  public JarFile(String name) throws IOException{
    this(new File (name), true, ZipFile.OPEN_READ);
  }
  public JarFile(String name, boolean verify) throws IOException{
    this(new File (name), verify, ZipFile.OPEN_READ);
  }
  public JarFile(File file) throws IOException{
    this(file, true, ZipFile.OPEN_READ);
  }
  public JarFile(File file, boolean verify) throws IOException{
    this(file, verify, ZipFile.OPEN_READ);
  }
  public JarFile(File file,boolean verify, int mode) throws IOException{
    super(file, mode);
  }
  public Manifest getManifest( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public JarEntry getJarEntry(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZipEntry getEntry(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Enumeration<JarEntry> entries( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Stream<JarEntry> stream( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized InputStream getInputStream(ZipEntry ze) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}