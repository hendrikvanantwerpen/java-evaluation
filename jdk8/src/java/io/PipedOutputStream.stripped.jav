package java.io;

import java.io.*;

public class PipedOutputStream extends OutputStream {
  public PipedOutputStream(PipedInputStream snk) throws IOException{
  }
  public PipedOutputStream( ) {
  }
  public synchronized void connect(PipedInputStream snk) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(int b) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(byte b[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void flush( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}