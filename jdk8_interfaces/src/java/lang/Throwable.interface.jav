package java.lang;

import java.io.*;
import java.util.*;

public class Throwable implements Serializable {
  private static class SentinelHolder {
    public static final StackTraceElement STACK_TRACE_ELEMENT_SENTINEL;
    public static final StackTraceElement [] STACK_TRACE_SENTINEL;
  }
  public Throwable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable(String message) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable(String message, Throwable cause) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable(Throwable cause) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getMessage( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public String getLocalizedMessage( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public synchronized Throwable getCause( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public synchronized Throwable initCause(Throwable cause) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void printStackTrace( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public void printStackTrace(PrintStream s) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public void printStackTrace(PrintWriter s) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private abstract static class PrintStreamOrWriter {
    abstract Object lock( ) ;
    abstract void println(Object o) ;
  }
  private static class WrappedPrintStream extends PrintStreamOrWriter {
    WrappedPrintStream(PrintStream printStream) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Object lock( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
    void println(Object o) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  }
  private static class WrappedPrintWriter extends PrintStreamOrWriter {
    WrappedPrintWriter(PrintWriter printWriter) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Object lock( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
    void println(Object o) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  }
  public synchronized Throwable fillInStackTrace( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public StackTraceElement [] getStackTrace( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public void setStackTrace(StackTraceElement [] stackTrace) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  native int getStackTraceDepth( ) ;
  native StackTraceElement getStackTraceElement(int index) ;
  public final synchronized void addSuppressed(Throwable exception) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  public final synchronized Throwable [] getSuppressed( ) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
}