package java.lang;

import java.io.*;
import java.util.concurrent.TimeUnit;

public abstract class Process {
  public abstract OutputStream getOutputStream( ) ;
  public abstract InputStream getInputStream( ) ;
  public abstract InputStream getErrorStream( ) ;
  public abstract int waitFor( ) throws InterruptedException ;
  public boolean waitFor(long timeout, TimeUnit unit) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int exitValue( ) ;
  public abstract void destroy( ) ;
  public Process destroyForcibly( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAlive( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}