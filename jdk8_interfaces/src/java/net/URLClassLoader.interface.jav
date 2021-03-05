package java.net;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlContext;
import java.security.SecureClassLoader;
import java.util.Enumeration;

public class URLClassLoader extends SecureClassLoader implements Closeable {
  public URLClassLoader(URL [] urls, ClassLoader parent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  URLClassLoader(URL [] urls,ClassLoader parent, AccessControlContext acc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URLClassLoader(URL [] urls) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  URLClassLoader(URL [] urls, AccessControlContext acc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URLClassLoader(URL [] urls,ClassLoader parent, URLStreamHandlerFactory factory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
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
final class FactoryURLClassLoader extends URLClassLoader {
  FactoryURLClassLoader(URL [] urls,ClassLoader parent, AccessControlContext acc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  FactoryURLClassLoader(URL [] urls, AccessControlContext acc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
}