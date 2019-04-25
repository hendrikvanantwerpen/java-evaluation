package java.util;

import java.io.IOException;

public class InvalidPropertiesFormatException extends IOException {
  public InvalidPropertiesFormatException(Throwable cause) {
    super(cause == null ? null : cause. toString( ));
  }
  public InvalidPropertiesFormatException(String message) {
    super(message);
  }
}