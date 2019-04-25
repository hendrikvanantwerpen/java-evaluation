package java.lang;

import java.security.AccessControlContext;
import java.util.Map;

public class Thread implements Runnable {
  public final static int MIN_PRIORITY;
  public final static int NORM_PRIORITY;
  public final static int MAX_PRIORITY;
  public static native Thread currentThread( ) ;
  public static native void yield( ) ;
  public static native void sleep(long millis) throws InterruptedException ;
  public static void sleep(long millis, int nanos) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Thread( ) {
  }
  public Thread(Runnable target) {
  }
  Thread(Runnable target, AccessControlContext acc) {
  }
  public Thread(ThreadGroup group, Runnable target) {
  }
  public Thread(String name) {
  }
  public Thread(ThreadGroup group, String name) {
  }
  public Thread(Runnable target, String name) {
  }
  public Thread(ThreadGroup group,Runnable target, String name) {
  }
  public Thread(ThreadGroup group,Runnable target,String name, long stackSize) {
  }
  public synchronized void start( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void run( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void stop( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final synchronized void stop(Throwable obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void interrupt( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean interrupted( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isInterrupted( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void destroy( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final native boolean isAlive( ) ;
  public final void suspend( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void resume( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setPriority(int newPriority) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getPriority( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final synchronized void setName(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final ThreadGroup getThreadGroup( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int activeCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int enumerate(Thread tarray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public native int countStackFrames( ) ;
  public final synchronized void join(long millis) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final synchronized void join(long millis, int nanos) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void join( ) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void dumpStack( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setDaemon(boolean on) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isDaemon( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void checkAccess( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ClassLoader getContextClassLoader( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setContextClassLoader(ClassLoader cl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static native boolean holdsLock(Object obj) ;
  public StackTraceElement [] getStackTrace( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Map<Thread, StackTraceElement []> getAllStackTraces( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getId( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public enum State {
    NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED
    ;
  }
  public State getState( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public interface UncaughtExceptionHandler {
    void uncaughtException(Thread t, Throwable e) ;
  }
  public static void setDefaultUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static UncaughtExceptionHandler getDefaultUncaughtExceptionHandler( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public UncaughtExceptionHandler getUncaughtExceptionHandler( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}