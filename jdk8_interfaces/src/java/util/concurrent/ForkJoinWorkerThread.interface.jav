package java.util.concurrent;

import java.security.AccessControlContext;

public class ForkJoinWorkerThread extends Thread {
  final ForkJoinPool pool;
  final ForkJoinPool. WorkQueue workQueue;
  ForkJoinWorkerThread(ForkJoinPool pool, boolean innocuous) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ForkJoinWorkerThread(ForkJoinPool pool,ThreadGroup threadGroup, AccessControlContext acc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ForkJoinPool getPool( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public int getPoolIndex( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public void run( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  final void eraseThreadLocals( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  void afterTopLevelExec( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  static final class InnocuousForkJoinWorkerThread extends ForkJoinWorkerThread {
    InnocuousForkJoinWorkerThread(ForkJoinPool pool) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    void afterTopLevelExec( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public ClassLoader getContextClassLoader( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    public void setUncaughtExceptionHandler(UncaughtExceptionHandler x) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
    public void setContextClassLoader(ClassLoader cl) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  }
}