package java.net;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlContext;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.SecureClassLoader;
import java.util.Enumeration;
import java.util.WeakHashMap;
import java.util.jar.Manifest;
import sun.misc.Resource;
import sun.misc.URLClassPath;

public class URLClassLoader extends SecureClassLoader implements Closeable {
  private final URLClassPath ucp;
  private final AccessControlContext acc;
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
  private WeakHashMap<Closeable, Void> closeables;
  public InputStream getResourceAsStream(String name) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public void close( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  protected void addURL(URL url) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public URL [] getURLs( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  protected Class<?> findClass(final String name) throws ClassNotFoundException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  private Package getAndVerifyPackage(String pkgname,Manifest man, URL url) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  private void definePackageInternal(String pkgname,Manifest man, URL url) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  private Class<?> defineClass(String name, Resource res) throws IOException {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  protected Package definePackage(String name,Manifest man, URL url) throws IllegalArgumentException {
                                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                     }
  private boolean isSealed(String name, Manifest man) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public URL findResource(final String name) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public Enumeration<URL> findResources(final String name) throws IOException {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  protected PermissionCollection getPermissions(CodeSource codesource) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public static URLClassLoader newInstance(final URL [] urls, final ClassLoader parent) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  public static URLClassLoader newInstance(final URL [] urls) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
}
final class FactoryURLClassLoader extends URLClassLoader {
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  FactoryURLClassLoader(URL [] urls,ClassLoader parent, AccessControlContext acc) {
    super(urls, parent, acc);
  }
  FactoryURLClassLoader(URL [] urls, AccessControlContext acc) {
    super(urls, acc);
  }
  public final Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
}