package java.rmi.server;

import java.io.*;
import java.util.*;

public class LogStream extends PrintStream {
  @Deprecated private LogStream(String name, OutputStream out) {
    super(new ByteArrayOutputStream ( ));
  }
  public static LogStream log(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized PrintStream getDefaultStream( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized void setDefaultStream(PrintStream newDefault) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized OutputStream getOutputStream( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setOutputStream(OutputStream out) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(int b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(byte b[],int off, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final int SILENT;
  public static final int BRIEF;
  public static final int VERBOSE;
  public static int parseLevel(String s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}