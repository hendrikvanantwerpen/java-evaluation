package java.lang.management;

import javax.management.openmbean.CompositeData;
import java.util.concurrent.locks.*;

public class LockInfo {
  public LockInfo(String className, int identityHashCode) {
  }
  LockInfo(Object lock) {
  }
  public String getClassName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getIdentityHashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LockInfo from(CompositeData cd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}