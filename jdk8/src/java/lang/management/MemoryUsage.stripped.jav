package java.lang.management;

import javax.management.openmbean.CompositeData;

public class MemoryUsage {
  public MemoryUsage(long init,long used,long committed, long max) {
  }
  private MemoryUsage(CompositeData cd) {
  }
  public long getInit( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getUsed( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ;
  public long getCommitted( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ;
  public long getMax( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ;
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MemoryUsage from(CompositeData cd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}