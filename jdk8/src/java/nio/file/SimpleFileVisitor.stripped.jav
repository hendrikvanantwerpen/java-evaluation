package java.nio.file;

import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;

public class SimpleFileVisitor<T> implements FileVisitor<T> {
  protected SimpleFileVisitor( ) {
  }
  public FileVisitResult preVisitDirectory(T dir, BasicFileAttributes attrs) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FileVisitResult visitFile(T file, BasicFileAttributes attrs) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FileVisitResult visitFileFailed(T file, IOException exc) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FileVisitResult postVisitDirectory(T dir, IOException exc) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}