package java.util.jar;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.security.CodeSigner;
import java.security.cert.Certificate;

public class JarEntry extends ZipEntry {
  public JarEntry(String name) {
    super(name);
  }
  public JarEntry(ZipEntry ze) {
    super(ze);
  }
  public JarEntry(JarEntry je) {
    this((ZipEntry ) je);
  }
  public Attributes getAttributes( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Certificate [] getCertificates( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CodeSigner [] getCodeSigners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}