package java.lang;

import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import java.security.PrivilegedExceptionAction;
import java.util.Enumeration;
import java.util.Map;
import sun.misc.URLClassPath;

public abstract class ClassLoader {
  private static class ParallelLoaders {
    static boolean register(Class<? extends ClassLoader> c) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
    static boolean isRegistered(Class<? extends ClassLoader> c) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  }
  void addClass(Class<?> c) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public Class<?> loadClass(String name) throws ClassNotFoundException {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public URL getResource(String name) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public Enumeration<URL> getResources(String name) throws IOException {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public static URL getSystemResource(String name) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public static Enumeration<URL> getSystemResources(String name) throws IOException {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  static URLClassPath getBootstrapClassPath( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public InputStream getResourceAsStream(String name) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public static InputStream getSystemResourceAsStream(String name) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public final ClassLoader getParent( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public static ClassLoader getSystemClassLoader( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  boolean isAncestor(ClassLoader cl) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  static ClassLoader getClassLoader(Class<?> caller) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  static void checkClassLoaderPermission(ClassLoader cl, Class<?> caller) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  static class NativeLibrary {
    long handle;
    String name;
    boolean isBuiltin;
    boolean loaded;
    native void load(String name, boolean isBuiltin) ;
    native long find(String name) ;
    native void unload(String name, boolean isBuiltin) ;
    public NativeLibrary(Class<?> fromClass,String name, boolean isBuiltin) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    static Class<?> getFromClass( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  }
  static void loadLibrary(Class<?> fromClass,String name, boolean isAbsolute) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  static long findNative(ClassLoader loader, String name) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  final Object assertionLock;
  Map<String, Boolean> classAssertionStatus;
  public void setDefaultAssertionStatus(boolean enabled) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public void setPackageAssertionStatus(String packageName, boolean enabled) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  public void setClassAssertionStatus(String className, boolean enabled) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public void clearAssertionStatus( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  boolean desiredAssertionStatus(String className) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
}
class SystemClassLoaderAction implements PrivilegedExceptionAction<ClassLoader> {
  SystemClassLoaderAction(ClassLoader parent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ClassLoader run( ) throws Exception {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
}