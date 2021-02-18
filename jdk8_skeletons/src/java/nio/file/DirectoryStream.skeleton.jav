package java.nio.file;

import java.io.Closeable;

public interface DirectoryStream<T> extends Closeable, Iterable<T> {
  public static interface Filter<T> {
  }
}