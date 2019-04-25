package java.nio.file;

import java.io.IOException;

public class FileSystemException extends IOException {
  public FileSystemException(String file) {
    super((String ) null);
  }
  public FileSystemException(String file,String other, String reason) {
    super(reason);
  }
  public String getFile( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getOtherFile( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getReason( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getMessage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}