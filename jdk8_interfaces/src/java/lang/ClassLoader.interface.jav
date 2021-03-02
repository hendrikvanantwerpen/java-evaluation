package java.lang;

import java.io.InputStream;
import java.io.IOException;
import java.io.File;
import java.net.URL;
import java.security.CodeSource;
import java.security.PrivilegedExceptionAction;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.URLClassPath;

public abstract class ClassLoader {
  private static native void registerNatives( ) ;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  private final ClassLoader parent;
  private static class ParallelLoaders {
    private ParallelLoaders( ) {
    }
    private static final Set<Class<? extends ClassLoader>> loaderTypes;
    static {
             throw new java . lang . RuntimeException ("Implementation stripped");
           }
    static boolean register(Class<? extends ClassLoader> c) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
    static boolean isRegistered(Class<? extends ClassLoader> c) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  }
  private final ConcurrentHashMap<String, Object> parallelLockMap;
  private final Map<String, Certificate []> package2certs;
  private static final Certificate [] nocerts;
  private final Vector<Class<?>> classes;
  private final ProtectionDomain defaultDomain;
  void addClass(Class<?> c) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private final HashMap<String, Package> packages;
  private static Void checkCreateClassLoader( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  private ClassLoader(Void unused, ClassLoader parent) {
  }
  protected ClassLoader(ClassLoader parent) {
    this(checkCreateClassLoader( ), parent);
  }
  protected ClassLoader( ) {
    this(checkCreateClassLoader( ), getSystemClassLoader( ));
  }
  public Class<?> loadClass(String name) throws ClassNotFoundException {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  protected Object getClassLoadingLock(String className) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  private Class<?> loadClassInternal(String name) throws ClassNotFoundException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  private void checkPackageAccess(Class<?> cls, ProtectionDomain pd) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  protected Class<?> findClass(String name) throws ClassNotFoundException {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  protected final Class<?> defineClass(byte [] b,int off, int len) throws ClassFormatError {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  protected final Class<?> defineClass(String name,byte [] b,int off, int len) throws ClassFormatError {
                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                       }
  private ProtectionDomain preDefineClass(String name, ProtectionDomain pd) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  private String defineClassSourceLocation(ProtectionDomain pd) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  private void postDefineClass(Class<?> c, ProtectionDomain pd) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  protected final Class<?> defineClass(String name,byte [] b,int off,int len, ProtectionDomain protectionDomain) throws ClassFormatError {
                                                                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                         }
  protected final Class<?> defineClass(String name,java. nio. ByteBuffer b, ProtectionDomain protectionDomain) throws ClassFormatError {
                                                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                       }
  private native Class<?> defineClass0(String name,byte [] b,int off,int len, ProtectionDomain pd) ;
  private native Class<?> defineClass1(String name,byte [] b,int off,int len,ProtectionDomain pd, String source) ;
  private native Class<?> defineClass2(String name,java. nio. ByteBuffer b,int off,int len,ProtectionDomain pd, String source) ;
  private boolean checkName(String name) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  private void checkCerts(String name, CodeSource cs) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private boolean compareCerts(Certificate [] pcerts, Certificate [] certs) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  protected final void resolveClass(Class<?> c) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  private native void resolveClass0(Class<?> c) ;
  protected final Class<?> findSystemClass(String name) throws ClassNotFoundException {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  private Class<?> findBootstrapClassOrNull(String name) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  private native Class<?> findBootstrapClass(String name) ;
  protected final Class<?> findLoadedClass(String name) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private native final Class<?> findLoadedClass0(String name) ;
  protected final void setSigners(Class<?> c, Object [] signers) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public URL getResource(String name) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public Enumeration<URL> getResources(String name) throws IOException {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  protected URL findResource(String name) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  protected Enumeration<URL> findResources(String name) throws IOException {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  protected static boolean registerAsParallelCapable( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public static URL getSystemResource(String name) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public static Enumeration<URL> getSystemResources(String name) throws IOException {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  private static URL getBootstrapResource(String name) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private static Enumeration<URL> getBootstrapResources(String name) throws IOException {
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
  private static synchronized void initSystemClassLoader( ) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  boolean isAncestor(ClassLoader cl) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private static boolean needsClassLoaderPermissionCheck(ClassLoader from, ClassLoader to) {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  static ClassLoader getClassLoader(Class<?> caller) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  static void checkClassLoaderPermission(ClassLoader cl, Class<?> caller) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  private static ClassLoader scl;
  private static boolean sclSet;
  protected Package definePackage(String name,String specTitle,String specVersion,String specVendor,String implTitle,String implVersion,String implVendor, URL sealBase) throws IllegalArgumentException {
                                                                                                                                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                                                         }
  protected Package getPackage(String name) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  protected Package [] getPackages( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  protected String findLibrary(String libname) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static class NativeLibrary {
    long handle;
    private int jniVersion;
    private final Class<?> fromClass;
    String name;
    boolean isBuiltin;
    boolean loaded;
    native void load(String name, boolean isBuiltin) ;
    native long find(String name) ;
    native void unload(String name, boolean isBuiltin) ;
    public NativeLibrary(Class<?> fromClass,String name, boolean isBuiltin) {
    }
    protected void finalize( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    static Class<?> getFromClass( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  }
  private static Vector<String> loadedLibraryNames;
  private static Vector<NativeLibrary> systemNativeLibraries;
  private Vector<NativeLibrary> nativeLibraries;
  private static Stack<NativeLibrary> nativeLibraryContext;
  private static String usr_paths[];
  private static String sys_paths[];
  private static String [] initializePath(String propname) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  static void loadLibrary(Class<?> fromClass,String name, boolean isAbsolute) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  private static native String findBuiltinLib(String name) ;
  private static boolean loadLibrary0(Class<?> fromClass, final File file) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  static long findNative(ClassLoader loader, String name) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  final Object assertionLock;
  private boolean defaultAssertionStatus;
  private Map<String, Boolean> packageAssertionStatus;
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
  private void initializeJavaAssertionMaps( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private static native AssertionStatusDirectives retrieveDirectives( ) ;
}
class SystemClassLoaderAction implements PrivilegedExceptionAction<ClassLoader> {
  private ClassLoader parent;
  SystemClassLoaderAction(ClassLoader parent) {
  }
  public ClassLoader run( ) throws Exception {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
}