package java.lang;

import java.net.URL;
import java.util.jar.Manifest;
import java.util.Map;
import java.lang.annotation.Annotation;

public class Package implements java. lang. reflect. AnnotatedElement {
  public String getName( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public String getSpecificationTitle( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public String getSpecificationVersion( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public String getSpecificationVendor( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public String getImplementationTitle( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public String getImplementationVersion( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public String getImplementationVendor( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public boolean isSealed( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean isSealed(URL url) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public boolean isCompatibleWith(String desired) throws NumberFormatException {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public static Package getPackage(String name) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public static Package [] getPackages( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  static Package getPackage(Class<?> c) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private Class<?> getPackageInfo( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public <A extends Annotation> A getAnnotation(Class<A> annotationClass) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  public <A extends Annotation> A [] getAnnotationsByType(Class<A> annotationClass) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public Annotation [] getAnnotations( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationClass) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  public <A extends Annotation> A [] getDeclaredAnnotationsByType(Class<A> annotationClass) {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  public Annotation [] getDeclaredAnnotations( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  Package(String name,String spectitle,String specversion,String specvendor,String impltitle,String implversion,String implvendor,URL sealbase, ClassLoader loader) {
  }
  private Package(String name,Manifest man,URL url, ClassLoader loader) {
  }
  static Package getSystemPackage(String name) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  static Package [] getSystemPackages( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  private static Package defineSystemPackage(final String iname, final String fn) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  private static Manifest loadManifest(String fn) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  private static Map<String, Package> pkgs;
  private static Map<String, URL> urls;
  private static Map<String, Manifest> mans;
  private static native String getSystemPackage0(String name) ;
  private static native String [] getSystemPackages0( ) ;
  private final String pkgName;
  private final String specTitle;
  private final String specVersion;
  private final String specVendor;
  private final String implTitle;
  private final String implVersion;
  private final String implVendor;
  private final URL sealBase;
  private transient final ClassLoader loader;
  private transient Class<?> packageInfo;
}