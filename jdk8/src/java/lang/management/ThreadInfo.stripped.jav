package java.lang.management;

import javax.management.openmbean.CompositeData;

public class ThreadInfo {
  private ThreadInfo(Thread t,int state,Object lockObj,Thread lockOwner,long blockedCount,long blockedTime,long waitedCount,long waitedTime, StackTraceElement [] stackTrace) {
  }
  private ThreadInfo(Thread t,int state,Object lockObj,Thread lockOwner,long blockedCount,long blockedTime,long waitedCount,long waitedTime,StackTraceElement [] stackTrace,Object [] monitors,int [] stackDepths, Object [] synchronizers) {
  }
  private ThreadInfo(CompositeData cd) {
  }
  public long getThreadId( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getThreadName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Thread. State getThreadState( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getBlockedTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getBlockedCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getWaitedTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getWaitedCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LockInfo getLockInfo( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getLockName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getLockOwnerId( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getLockOwnerName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public StackTraceElement [] getStackTrace( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isSuspended( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isInNative( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ThreadInfo from(CompositeData cd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MonitorInfo [] getLockedMonitors( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LockInfo [] getLockedSynchronizers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}