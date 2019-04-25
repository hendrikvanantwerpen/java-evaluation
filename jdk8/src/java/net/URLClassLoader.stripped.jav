package java.net;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlContext;
import java.security.SecureClassLoader;
import java.util.Enumeration;

public class URLClassLoader extends SecureClassLoader implements Closeable {
  public URLClassLoader(URL [] urls, ClassLoader parent) {
    super(parent);
  }
  URLClassLoader(URL [] urls,ClassLoader parent, AccessControlContext acc) {
    super(parent);
  }
  public URLClassLoader(URL [] urls) {
    super( );
  }
  URLClassLoader(URL [] urls, AccessControlContext acc) {
    super( );
  }
  public URLClassLoader(URL [] urls,ClassLoader parent, URLStreamHandlerFactory factory) {
    super(parent);
  }
  public InputStream getResourceAsStream(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URL [] getURLs( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URL findResource(final String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Enumeration<URL> findResources(final String name) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static URLClassLoader newInstance(final URL [] urls, final ClassLoader parent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static URLClassLoader newInstance(final URL [] urls) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}