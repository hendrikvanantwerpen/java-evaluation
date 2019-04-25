package java.util.logging;


public class MemoryHandler extends Handler {
  public MemoryHandler( ) {
  }
  public MemoryHandler(Handler target,int size, Level pushLevel) {
  }
  public synchronized void publish(LogRecord record) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void push( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void flush( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setPushLevel(Level newLevel) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Level getPushLevel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLoggable(LogRecord record) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}