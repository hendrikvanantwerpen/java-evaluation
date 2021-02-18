package java.lang;

import java.security.PrivilegedExceptionAction;

public abstract class ClassLoader {
  private static class ParallelLoaders {
  }
  static class NativeLibrary {
  }
}
class SystemClassLoaderAction implements PrivilegedExceptionAction<ClassLoader> {
}