package java.util;


public abstract class TimerTask implements Runnable {
  protected TimerTask( ) {
  }
  public abstract void run( ) ;
  public boolean cancel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long scheduledExecutionTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}