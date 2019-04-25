package java.util.logging;


public abstract class Formatter {
  protected Formatter( ) {
  }
  public abstract String format(LogRecord record) ;
  public String getHead(Handler h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getTail(Handler h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized String formatMessage(LogRecord record) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}