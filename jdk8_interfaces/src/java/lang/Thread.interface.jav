package java.lang;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.security.AccessControlContext;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import sun.nio.ch.Interruptible;

public class Thread implements Runnable {
  private static native void registerNatives( ) ;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  private volatile String name;
  private int priority;
  private Thread threadQ;
  private long eetop;
  private boolean single_step;
  private boolean daemon;
  private boolean stillborn;
  private Runnable target;
  private ThreadGroup group;
  private ClassLoader contextClassLoader;
  private AccessControlContext inheritedAccessControlContext;
  private static int threadInitNumber;
  private static synchronized int nextThreadNum( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  ThreadLocal. ThreadLocalMap threadLocals;
  ThreadLocal. ThreadLocalMap inheritableThreadLocals;
  private long stackSize;
  private long nativeParkEventPointer;
  private long tid;
  private static long threadSeqNumber;
  private volatile int threadStatus;
  private static synchronized long nextThreadID( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  volatile Object parkBlocker;
  private volatile Interruptible blocker;
  private final Object blockerLock;
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
  private void init(ThreadGroup g,Runnable target,String name, long stackSize) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  private void init(ThreadGroup g,Runnable target,String name,long stackSize,AccessControlContext acc, boolean inheritThreadLocals) {
                                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                    }
  protected Object clone( ) throws CloneNotSupportedException {
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
  private native void start0( ) ;
  public void run( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  private void exit( ) {
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
  private native boolean isInterrupted(boolean ClearInterrupted) ;
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
  private static final StackTraceElement [] EMPTY_STACK_TRACE;
  public StackTraceElement [] getStackTrace( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public static Map<Thread, StackTraceElement []> getAllStackTraces( ) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  private static final RuntimePermission SUBCLASS_IMPLEMENTATION_PERMISSION;
  private static class Caches {
    static final ConcurrentMap<WeakClassKey, Boolean> subclassAudits;
    static final ReferenceQueue<Class<?>> subclassAuditsQueue;
  }
  private static boolean isCCLOverridden(Class<?> cl) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private static boolean auditSubclass(final Class<?> subcl) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private native static StackTraceElement [] [] dumpThreads(Thread [] threads) ;
  private native static Thread [] getThreads( ) ;
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
  private volatile UncaughtExceptionHandler uncaughtExceptionHandler;
  private static volatile UncaughtExceptionHandler defaultUncaughtExceptionHandler;
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
  private void dispatchUncaughtException(Throwable e) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  static void processQueue(ReferenceQueue<Class<?>> queue, ConcurrentMap<? extends WeakReference<Class<?>>, ?> map) {
                                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                    }
  static class WeakClassKey extends WeakReference<Class<?>> {
    private final int hash;
    WeakClassKey(Class<?> cl, ReferenceQueue<Class<?>> refQueue) {
      super(cl, refQueue);
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
  private native void setPriority0(int newPriority) ;
  private native void stop0(Object o) ;
  private native void suspend0( ) ;
  private native void resume0( ) ;
  private native void interrupt0( ) ;
  private native void setNativeName(String name) ;
}