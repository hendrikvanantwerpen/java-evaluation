package java.nio.file;


public class NotLinkException extends FileSystemException {
  public NotLinkException(String file) {
    super(file);
  }
  public NotLinkException(String file,String other, String reason) {
    super(file, other, reason);
  }
}