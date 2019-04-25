package java.lang.management;

import javax.management.openmbean.CompositeData;

public class MonitorInfo extends LockInfo {
  public MonitorInfo(String className,int identityHashCode,int stackDepth, StackTraceElement stackFrame) {
    super(className, identityHashCode);
  }
  public int getLockedStackDepth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public StackTraceElement getLockedStackFrame( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MonitorInfo from(CompositeData cd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}