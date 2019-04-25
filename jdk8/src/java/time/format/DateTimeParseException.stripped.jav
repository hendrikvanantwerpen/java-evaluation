package java.time.format;

import java.time.DateTimeException;

public class DateTimeParseException extends DateTimeException {
  public DateTimeParseException(String message,CharSequence parsedData, int errorIndex) {
    super(message);
  }
  public DateTimeParseException(String message,CharSequence parsedData,int errorIndex, Throwable cause) {
    super(message, cause);
  }
  public String getParsedString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getErrorIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}