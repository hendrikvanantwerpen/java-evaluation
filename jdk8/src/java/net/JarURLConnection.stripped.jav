package java.net;

import java.io.IOException;
import java.util.jar.JarFile;
import java.util.jar.JarEntry;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public abstract class JarURLConnection extends URLConnection {
  protected JarURLConnection(URL url) throws MalformedURLException{
    super(url);
  }
  public URL getJarFileURL( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getEntryName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract JarFile getJarFile( ) throws IOException ;
  public Manifest getManifest( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public JarEntry getJarEntry( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Attributes getAttributes( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Attributes getMainAttributes( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public java. security. cert. Certificate [] getCertificates( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}