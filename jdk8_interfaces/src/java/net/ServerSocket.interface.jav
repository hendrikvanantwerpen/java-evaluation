package java.net;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;

public class ServerSocket implements java. io. Closeable {
  private boolean created;
  private boolean bound;
  private boolean closed;
  private Object closeLock;
  private SocketImpl impl;
  private boolean oldImpl;
  ServerSocket(SocketImpl impl) {
  }
  private static Void checkPermission( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public ServerSocket( ) throws IOException{
  }
  public ServerSocket(int port) throws IOException{
    this(port, 50, null);
  }
  public ServerSocket(int port, int backlog) throws IOException{
    this(port, backlog, null);
  }
  public ServerSocket(int port,int backlog, InetAddress bindAddr) throws IOException{
  }
  SocketImpl getImpl( ) throws SocketException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private void checkOldImpl( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  private void setImpl( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  void createImpl( ) throws SocketException {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public void bind(SocketAddress endpoint) throws IOException {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public void bind(SocketAddress endpoint, int backlog) throws IOException {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  public InetAddress getInetAddress( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public int getLocalPort( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public SocketAddress getLocalSocketAddress( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public Socket accept( ) throws IOException {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  protected final void implAccept(Socket s) throws IOException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public void close( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public ServerSocketChannel getChannel( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public boolean isBound( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean isClosed( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public synchronized void setSoTimeout(int timeout) throws SocketException {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public synchronized int getSoTimeout( ) throws IOException {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public void setReuseAddress(boolean on) throws SocketException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public boolean getReuseAddress( ) throws SocketException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  void setBound( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
  void setCreated( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  private static SocketImplFactory factory;
  public static synchronized void setSocketFactory(SocketImplFactory fac) throws IOException {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
  public synchronized void setReceiveBufferSize(int size) throws SocketException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public synchronized int getReceiveBufferSize( ) throws SocketException {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public void setPerformancePreferences(int connectionTime,int latency, int bandwidth) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
}