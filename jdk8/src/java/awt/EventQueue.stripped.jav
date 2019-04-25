package java.awt;

import java.awt.event.*;
import java.lang.reflect.InvocationTargetException;
import sun.awt.*;

public class EventQueue {
  public EventQueue( ) {
  }
  public void postEvent(AWTEvent theEvent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AWTEvent getNextEvent( ) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AWTEvent peekEvent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AWTEvent peekEvent(int id) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static long getMostRecentEventTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AWTEvent getCurrentEvent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void push(EventQueue newEventQueue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SecondaryLoop createSecondaryLoop( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isDispatchThread( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void invokeLater(Runnable runnable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void invokeAndWait(Runnable runnable) throws InterruptedException, InvocationTargetException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}