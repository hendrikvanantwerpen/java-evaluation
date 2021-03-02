package java.io;


public class FileNotFoundException extends IOException {
  private static final long serialVersionUID;
  public FileNotFoundException( ) {
    super( );
  }
  public FileNotFoundException(String s) {
    super(s);
  }
  private FileNotFoundException(String path, String reason) {
    super(path + (reason == null ? "" : " (" + reason + ")"));
  }
}