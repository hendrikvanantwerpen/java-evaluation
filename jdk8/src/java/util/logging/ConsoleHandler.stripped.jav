package java.util.logging;


public class ConsoleHandler extends StreamHandler {
  public ConsoleHandler( ) {
  }
  public void publish(LogRecord record) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}