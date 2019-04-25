package java.nio.file;


public class FileSystemAlreadyExistsException extends RuntimeException {
  public FileSystemAlreadyExistsException( ) {
  }
  public FileSystemAlreadyExistsException(String msg) {
    super(msg);
  }
}