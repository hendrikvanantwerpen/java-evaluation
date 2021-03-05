package java.lang;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.security.AccessControlContext;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import sun.nio.ch.Interruptible;

public class Thread implements Runnable {
  ThreadLocal. ThreadLocalMap threadLocals;
  ThreadLocal. ThreadLocalMap inheritableThreadLocals;
  volatile Object parkBlocker;
  void blockedOn(Interruptible b) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
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
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Thread(Runnable target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  Thread(Runnable target, AccessControlContext acc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Thread(ThreadGroup group, Runnable target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Thread(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Thread(ThreadGroup group, String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Thread(Runnable target, String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Thread(ThreadGroup group,Runnable target, String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Thread(ThreadGroup group,Runnable target,String name, long stackSize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
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
  private static class Caches {
    static final ConcurrentMap<WeakClassKey, Boolean> subclassAudits;
    static final ReferenceQueue<Class<?>> subclassAuditsQueue;
  }
  public long getId( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public enum State {
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
  static void processQueue(ReferenceQueue<Class<?>> queue, ConcurrentMap<? extends WeakReference<Class<?>>, ?> map) {
                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                    }
  static class WeakClassKey extends WeakReference<Class<?>> {
    WeakClassKey(Class<?> cl, ReferenceQueue<Class<?>> refQueue) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  }
  long threadLocalRandomSeed;
  int threadLocalRandomProbe;
  int threadLocalRandomSecondarySeed;
}