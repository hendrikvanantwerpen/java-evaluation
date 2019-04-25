package java.lang;

import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public abstract class ClassLoader {
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
}