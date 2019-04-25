package java.rmi.server;

import java.net.MalformedURLException;
import java.net.URL;

public class RMIClassLoader {
  private RMIClassLoader( ) {
  }
  public static Class<?> loadClass(String name) throws MalformedURLException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Class<?> loadClass(URL codebase, String name) throws MalformedURLException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Class<?> loadClass(String codebase, String name) throws MalformedURLException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Class<?> loadClass(String codebase,String name, ClassLoader defaultLoader) throws MalformedURLException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Class<?> loadProxyClass(String codebase,String [] interfaces, ClassLoader defaultLoader) throws ClassNotFoundException, MalformedURLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ClassLoader getClassLoader(String codebase) throws MalformedURLException, SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String getClassAnnotation(Class<?> cl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static RMIClassLoaderSpi getDefaultProviderInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Object getSecurityContext(ClassLoader loader) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}