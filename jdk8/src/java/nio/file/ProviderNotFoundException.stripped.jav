package java.nio.file;


public class ProviderNotFoundException extends RuntimeException {
  public ProviderNotFoundException( ) {
  }
  public ProviderNotFoundException(String msg) {
    super(msg);
  }
}