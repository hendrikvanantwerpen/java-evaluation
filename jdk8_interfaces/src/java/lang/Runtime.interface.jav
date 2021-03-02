package java.lang;

import java.io.*;

public class Runtime {
  private static Runtime currentRuntime;
  public static Runtime getRuntime( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  private Runtime( ) {
  }
  public void exit(int status) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public void addShutdownHook(Thread hook) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public boolean removeShutdownHook(Thread hook) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public void halt(int status) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public static void runFinalizersOnExit(boolean value) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public Process exec(String command) throws IOException {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public Process exec(String command, String [] envp) throws IOException {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public Process exec(String command,String [] envp, File dir) throws IOException {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  public Process exec(String cmdarray[]) throws IOException {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public Process exec(String [] cmdarray, String [] envp) throws IOException {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  public Process exec(String [] cmdarray,String [] envp, File dir) throws IOException {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  public native int availableProcessors( ) ;
  public native long freeMemory( ) ;
  public native long totalMemory( ) ;
  public native long maxMemory( ) ;
  public native void gc( ) ;
  private static native void runFinalization0( ) ;
  public void runFinalization( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public native void traceInstructions(boolean on) ;
  public native void traceMethodCalls(boolean on) ;
  public void load(String filename) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  synchronized void load0(Class<?> fromClass, String filename) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public void loadLibrary(String libname) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  synchronized void loadLibrary0(Class<?> fromClass, String libname) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  public InputStream getLocalizedInputStream(InputStream in) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public OutputStream getLocalizedOutputStream(OutputStream out) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
}