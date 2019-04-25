package java.nio.file;

import java.net.URI;
import java.io.IOException;
import java.util.*;

public final class FileSystems {
  private FileSystems( ) {
  }
  public static FileSystem getDefault( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static FileSystem getFileSystem(URI uri) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static FileSystem newFileSystem(URI uri, Map<String, ?> env) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static FileSystem newFileSystem(URI uri,Map<String, ?> env, ClassLoader loader) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static FileSystem newFileSystem(Path path, ClassLoader loader) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}