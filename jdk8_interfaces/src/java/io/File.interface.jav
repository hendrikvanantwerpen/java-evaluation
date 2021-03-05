package java.io;

import java.net.URI;
import java.net.URL;
import java.net.MalformedURLException;
import java.nio.file.Path;

public class File implements Serializable, Comparable<File> {
  private static enum PathStatus {
  }
  final boolean isInvalid( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  int getPrefixLength( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public static final char separatorChar;
  public static final String separator;
  public static final char pathSeparatorChar;
  public static final String pathSeparator;
  public File(String pathname) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public File(String parent, String child) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public File(File parent, String child) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public File(URI uri) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getName( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public String getParent( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public File getParentFile( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public String getPath( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public boolean isAbsolute( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public String getAbsolutePath( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public File getAbsoluteFile( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public String getCanonicalPath( ) throws IOException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public File getCanonicalFile( ) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public URL toURL( ) throws MalformedURLException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public URI toURI( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  public boolean canRead( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean canWrite( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean exists( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public boolean isDirectory( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public boolean isFile( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public boolean isHidden( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public long lastModified( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public long length( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public boolean createNewFile( ) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public boolean delete( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public void deleteOnExit( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public String [] list( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public String [] list(FilenameFilter filter) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public File [] listFiles( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public File [] listFiles(FilenameFilter filter) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public File [] listFiles(FileFilter filter) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public boolean mkdir( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public boolean mkdirs( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public boolean renameTo(File dest) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public boolean setLastModified(long time) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public boolean setReadOnly( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public boolean setWritable(boolean writable, boolean ownerOnly) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public boolean setWritable(boolean writable) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public boolean setReadable(boolean readable, boolean ownerOnly) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public boolean setReadable(boolean readable) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public boolean setExecutable(boolean executable, boolean ownerOnly) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public boolean setExecutable(boolean executable) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public boolean canExecute( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public static File [] listRoots( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public long getTotalSpace( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public long getFreeSpace( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public long getUsableSpace( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  private static class TempDirectory {
    static File location( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    static File generateFile(String prefix,String suffix, File dir) throws IOException {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
  }
  public static File createTempFile(String prefix,String suffix, File directory) throws IOException {
                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                    }
  public static File createTempFile(String prefix, String suffix) throws IOException {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  public int compareTo(File pathname) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public Path toPath( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
}