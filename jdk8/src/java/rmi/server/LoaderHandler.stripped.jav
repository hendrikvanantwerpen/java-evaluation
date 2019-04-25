package java.rmi.server;

import java.net.MalformedURLException;
import java.net.URL;

public interface LoaderHandler {
  final static String packagePrefix
  ;
  @Deprecated Class<?> loadClass(String name) throws MalformedURLException, ClassNotFoundException ;
  @Deprecated Class<?> loadClass(URL codebase, String name) throws MalformedURLException, ClassNotFoundException ;
  @Deprecated Object getSecurityContext(ClassLoader loader) ;
}