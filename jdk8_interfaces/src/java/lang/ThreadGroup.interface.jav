package java.lang;

import java.io.PrintStream;

public class ThreadGroup implements Thread. UncaughtExceptionHandler {
  private final ThreadGroup parent;
  String name;
  int maxPriority;
  boolean destroyed;
  boolean daemon;
  boolean vmAllowSuspension;
  int nUnstartedThreads;
  int nthreads;
  Thread threads[];
  int ngroups;
  ThreadGroup groups[];
  private ThreadGroup( ) {
  }
  public ThreadGroup(String name) {
    this(Thread. currentThread( ). getThreadGroup( ), name);
  }
  public ThreadGroup(ThreadGroup parent, String name) {
    this(checkParentAccess(parent), parent, name);
  }
  private ThreadGroup(Void unused,ThreadGroup parent, String name) {
  }
  private static Void checkParentAccess(ThreadGroup parent) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public final String getName( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public final ThreadGroup getParent( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public final int getMaxPriority( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public final boolean isDaemon( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public synchronized boolean isDestroyed( ) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public final void setDaemon(boolean daemon) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public final void setMaxPriority(int pri) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public final boolean parentOf(ThreadGroup g) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public final void checkAccess( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public int activeCount( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public int enumerate(Thread list[]) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public int enumerate(Thread list[], boolean recurse) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private int enumerate(Thread list[],int n, boolean recurse) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public int activeGroupCount( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public int enumerate(ThreadGroup list[]) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public int enumerate(ThreadGroup list[], boolean recurse) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  private int enumerate(ThreadGroup list[],int n, boolean recurse) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public final void stop( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public final void interrupt( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public final void suspend( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  private boolean stopOrSuspend(boolean suspend) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public final void resume( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public final void destroy( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  private final void add(ThreadGroup g) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private void remove(ThreadGroup g) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  void addUnstarted( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  void add(Thread t) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  void threadStartFailed(Thread t) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  void threadTerminated(Thread t) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private void remove(Thread t) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public void list( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  void list(PrintStream out, int indent) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public void uncaughtException(Thread t, Throwable e) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public boolean allowThreadSuspension(boolean b) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}