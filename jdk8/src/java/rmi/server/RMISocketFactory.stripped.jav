package java.rmi.server;

import java.io.*;
import java.net.*;

public abstract class RMISocketFactory implements RMIClientSocketFactory, RMIServerSocketFactory {
  public RMISocketFactory( ) {
    super( );
  }
  public abstract Socket createSocket(String host, int port) throws IOException ;
  public abstract ServerSocket createServerSocket(int port) throws IOException ;
  public synchronized static void setSocketFactory(RMISocketFactory fac) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized static RMISocketFactory getSocketFactory( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized static RMISocketFactory getDefaultSocketFactory( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized static void setFailureHandler(RMIFailureHandler fh) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized static RMIFailureHandler getFailureHandler( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}