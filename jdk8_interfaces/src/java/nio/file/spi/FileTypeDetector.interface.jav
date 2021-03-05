package java.nio.file.spi;

import java.nio.file.Path;
import java.io.IOException;

public abstract class FileTypeDetector {
  public abstract String probeContentType(Path path) throws IOException ;
}