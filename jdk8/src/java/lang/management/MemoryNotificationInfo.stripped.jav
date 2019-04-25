package java.lang.management;

import javax.management.openmbean.CompositeData;

public class MemoryNotificationInfo {
  public static final String MEMORY_THRESHOLD_EXCEEDED;
  public static final String MEMORY_COLLECTION_THRESHOLD_EXCEEDED;
  public MemoryNotificationInfo(String poolName,MemoryUsage usage, long count) {
  }
  MemoryNotificationInfo(CompositeData cd) {
  }
  public String getPoolName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MemoryUsage getUsage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MemoryNotificationInfo from(CompositeData cd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}