package java.util;


public class Observable {
  public Observable( ) {
  }
  public synchronized void addObserver(Observer o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void deleteObserver(Observer o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void notifyObservers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void notifyObservers(Object arg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void deleteObservers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean hasChanged( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int countObservers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}