package java.lang;

import java.io.*;
import java.util.*;

public class Throwable implements Serializable {
  private static final long serialVersionUID;
  private transient Object backtrace;
  private String detailMessage;
  private static class SentinelHolder {
    public static final StackTraceElement STACK_TRACE_ELEMENT_SENTINEL;
    public static final StackTraceElement [] STACK_TRACE_SENTINEL;
  }
  private static final StackTraceElement [] UNASSIGNED_STACK;
  private Throwable cause;
  private StackTraceElement [] stackTrace;
  private static final List<Throwable> SUPPRESSED_SENTINEL;
  private List<Throwable> suppressedExceptions;
  private static final String NULL_CAUSE_MESSAGE;
  private static final String SELF_SUPPRESSION_MESSAGE;
  private static final String CAUSE_CAPTION;
  private static final String SUPPRESSED_CAPTION;
  public Throwable( ) {
  }
  public Throwable(String message) {
  }
  public Throwable(String message, Throwable cause) {
  }
  public Throwable(Throwable cause) {
  }
  protected Throwable(String message,Throwable cause,boolean enableSuppression, boolean writableStackTrace) {
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
  private void printStackTrace(PrintStreamOrWriter s) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private void printEnclosedStackTrace(PrintStreamOrWriter s,StackTraceElement [] enclosingTrace,String caption,String prefix, Set<Throwable> dejaVu) {
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
    private final PrintStream printStream;
    WrappedPrintStream(PrintStream printStream) {
    }
    Object lock( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
    void println(Object o) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  }
  private static class WrappedPrintWriter extends PrintStreamOrWriter {
    private final PrintWriter printWriter;
    WrappedPrintWriter(PrintWriter printWriter) {
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
  private native Throwable fillInStackTrace(int dummy) ;
  public StackTraceElement [] getStackTrace( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private synchronized StackTraceElement [] getOurStackTrace( ) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public void setStackTrace(StackTraceElement [] stackTrace) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  native int getStackTraceDepth( ) ;
  native StackTraceElement getStackTraceElement(int index) ;
  private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  private int validateSuppressedExceptionsList(List<Throwable> deserSuppressedExceptions) throws IOException {
                                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                             }
  private synchronized void writeObject(ObjectOutputStream s) throws IOException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public final synchronized void addSuppressed(Throwable exception) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private static final Throwable [] EMPTY_THROWABLE_ARRAY;
  public final synchronized Throwable [] getSuppressed( ) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
}