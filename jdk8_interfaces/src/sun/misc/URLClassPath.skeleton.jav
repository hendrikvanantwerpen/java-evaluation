package sun.misc;

import java.util.*;
import java.io.*;

public class URLClassPath {
  private static class Loader implements Closeable {
  }
  static class JarLoader extends Loader {
  }
  private static class FileLoader extends Loader {
  }
}