package java.nio.file.spi;

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.nio.channels.*;
import java.net.URI;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutorService;

public abstract class FileSystemProvider {
  private FileSystemProvider(Void ignore) {
  }
  protected FileSystemProvider( ) {
    this(checkPermission( ));
  }
  public static List<FileSystemProvider> installedProviders( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract String getScheme( ) ;
  public abstract FileSystem newFileSystem(URI uri, Map<String, ?> env) throws IOException ;
  public abstract FileSystem getFileSystem(URI uri) ;
  public abstract Path getPath(URI uri) ;
  public FileSystem newFileSystem(Path path, Map<String, ?> env) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public InputStream newInputStream(Path path, OpenOption ... options) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OutputStream newOutputStream(Path path, OpenOption ... options) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FileChannel newFileChannel(Path path,Set<? extends OpenOption> options, FileAttribute<?> ... attrs) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AsynchronousFileChannel newAsynchronousFileChannel(Path path,Set<? extends OpenOption> options,ExecutorService executor, FileAttribute<?> ... attrs) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract SeekableByteChannel newByteChannel(Path path,Set<? extends OpenOption> options, FileAttribute<?> ... attrs) throws IOException ;
  public abstract DirectoryStream<Path> newDirectoryStream(Path dir, DirectoryStream. Filter<? super Path> filter) throws IOException ;
  public abstract void createDirectory(Path dir, FileAttribute<?> ... attrs) throws IOException ;
  public void createSymbolicLink(Path link,Path target, FileAttribute<?> ... attrs) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void createLink(Path link, Path existing) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void delete(Path path) throws IOException ;
  public boolean deleteIfExists(Path path) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Path readSymbolicLink(Path link) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void copy(Path source,Path target, CopyOption ... options) throws IOException ;
  public abstract void move(Path source,Path target, CopyOption ... options) throws IOException ;
  public abstract boolean isSameFile(Path path, Path path2) throws IOException ;
  public abstract boolean isHidden(Path path) throws IOException ;
  public abstract FileStore getFileStore(Path path) throws IOException ;
  public abstract void checkAccess(Path path, AccessMode ... modes) throws IOException ;
  public abstract <V extends FileAttributeView> V getFileAttributeView(Path path,Class<V> type, LinkOption ... options) ;
  public abstract <A extends BasicFileAttributes> A readAttributes(Path path,Class<A> type, LinkOption ... options) throws IOException ;
  public abstract Map<String, Object> readAttributes(Path path,String attributes, LinkOption ... options) throws IOException ;
  public abstract void setAttribute(Path path,String attribute,Object value, LinkOption ... options) throws IOException ;
}