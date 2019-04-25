package java.util.logging;


public abstract class Handler {
  protected Handler( ) {
  }
  public abstract void publish(LogRecord record) ;
  public abstract void flush( ) ;
  public abstract void close( ) throws SecurityException ;
  public synchronized void setFormatter(Formatter newFormatter) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter getFormatter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setEncoding(String encoding) throws SecurityException, java. io. UnsupportedEncodingException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getEncoding( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setFilter(Filter newFilter) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Filter getFilter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setErrorManager(ErrorManager em) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ErrorManager getErrorManager( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setLevel(Level newLevel) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Level getLevel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLoggable(LogRecord record) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}