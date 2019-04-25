package java.util.logging;

import java.io.*;
import java.net.*;

public class SocketHandler extends StreamHandler {
  public SocketHandler( ) throws IOException{
  }
  public SocketHandler(String host, int port) throws IOException{
  }
  public synchronized void close( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void publish(LogRecord record) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}