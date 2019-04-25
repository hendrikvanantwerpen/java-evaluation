package java.nio.file;


public final class StandardWatchEventKinds {
  private StandardWatchEventKinds( ) {
  }
  public static final WatchEvent. Kind<Object> OVERFLOW;
  public static final WatchEvent. Kind<Path> ENTRY_CREATE;
  public static final WatchEvent. Kind<Path> ENTRY_DELETE;
  public static final WatchEvent. Kind<Path> ENTRY_MODIFY;
}