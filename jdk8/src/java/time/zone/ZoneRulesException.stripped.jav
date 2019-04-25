package java.time.zone;

import java.time.DateTimeException;

public class ZoneRulesException extends DateTimeException {
  public ZoneRulesException(String message) {
    super(message);
  }
  public ZoneRulesException(String message, Throwable cause) {
    super(message, cause);
  }
}