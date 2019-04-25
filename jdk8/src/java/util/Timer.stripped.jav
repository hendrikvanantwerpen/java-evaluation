package java.util;

import java.util.Date;

public class Timer {
  public Timer( ) {
    this("Timer-" + serialNumber( ));
  }
  public Timer(boolean isDaemon) {
    this("Timer-" + serialNumber( ), isDaemon);
  }
  public Timer(String name) {
  }
  public Timer(String name, boolean isDaemon) {
  }
  public void schedule(TimerTask task, long delay) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void schedule(TimerTask task, Date time) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void schedule(TimerTask task,long delay, long period) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void schedule(TimerTask task,Date firstTime, long period) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void scheduleAtFixedRate(TimerTask task,long delay, long period) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void scheduleAtFixedRate(TimerTask task,Date firstTime, long period) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void cancel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int purge( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}