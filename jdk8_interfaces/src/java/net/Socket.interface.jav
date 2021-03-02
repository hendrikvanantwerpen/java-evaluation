package java.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.nio.channels.SocketChannel;

public class Socket implements java. io. Closeable {
  private boolean created;
  private boolean bound;
  private boolean connected;
  private boolean closed;
  private Object closeLock;
  private boolean shutIn;
  private boolean shutOut;
  SocketImpl impl;
  private boolean oldImpl;
  public Socket( ) {
  }
  public Socket(Proxy proxy) {
  }
  protected Socket(SocketImpl impl) throws SocketException{
  }
  private static Void checkPermission(SocketImpl impl) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public Socket(String host, int port) throws UnknownHostException, IOException{
    this(host != null ? new InetSocketAddress (host,port) : new InetSocketAddress (InetAddress. getByName(null),port), (SocketAddress ) null, true);
  }
  public Socket(InetAddress address, int port) throws IOException{
    this(address != null ? new InetSocketAddress (address,port) : null, (SocketAddress ) null, true);
  }
  public Socket(String host,int port,InetAddress localAddr, int localPort) throws IOException{
    this(host != null ? new InetSocketAddress (host,port) : new InetSocketAddress (InetAddress. getByName(null),port), new InetSocketAddress (localAddr,localPort), true);
  }
  public Socket(InetAddress address,int port,InetAddress localAddr, int localPort) throws IOException{
    this(address != null ? new InetSocketAddress (address,port) : null, new InetSocketAddress (localAddr,localPort), true);
  }
  @Deprecated public Socket(String host,int port, boolean stream) throws IOException{
    this(host != null ? new InetSocketAddress (host,port) : new InetSocketAddress (InetAddress. getByName(null),port), (SocketAddress ) null, stream);
  }
  @Deprecated public Socket(InetAddress host,int port, boolean stream) throws IOException{
    this(host != null ? new InetSocketAddress (host,port) : null, new InetSocketAddress (0), stream);
  }
  private Socket(SocketAddress address,SocketAddress localAddr, boolean stream) throws IOException{
  }
  void createImpl(boolean stream) throws SocketException {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  private void checkOldImpl( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  void setImpl( ) {
                    throw new java . lang . RuntimeException ("Implementation stripped");
                  }
  SocketImpl getImpl( ) throws SocketException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public void connect(SocketAddress endpoint) throws IOException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public void connect(SocketAddress endpoint, int timeout) throws IOException {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public void bind(SocketAddress bindpoint) throws IOException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  private void checkAddress(InetAddress addr, String op) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  final void postAccept( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  void setCreated( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  void setBound( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
  void setConnected( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public InetAddress getInetAddress( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public InetAddress getLocalAddress( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public int getPort( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public int getLocalPort( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public SocketAddress getRemoteSocketAddress( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public SocketAddress getLocalSocketAddress( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public SocketChannel getChannel( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public InputStream getInputStream( ) throws IOException {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public OutputStream getOutputStream( ) throws IOException {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public void setTcpNoDelay(boolean on) throws SocketException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public boolean getTcpNoDelay( ) throws SocketException {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public void setSoLinger(boolean on, int linger) throws SocketException {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public int getSoLinger( ) throws SocketException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public void sendUrgentData(int data) throws IOException {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public void setOOBInline(boolean on) throws SocketException {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public boolean getOOBInline( ) throws SocketException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public synchronized void setSoTimeout(int timeout) throws SocketException {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public synchronized int getSoTimeout( ) throws SocketException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public synchronized void setSendBufferSize(int size) throws SocketException {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public synchronized int getSendBufferSize( ) throws SocketException {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public synchronized void setReceiveBufferSize(int size) throws SocketException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public synchronized int getReceiveBufferSize( ) throws SocketException {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public void setKeepAlive(boolean on) throws SocketException {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public boolean getKeepAlive( ) throws SocketException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public void setTrafficClass(int tc) throws SocketException {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public int getTrafficClass( ) throws SocketException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public void setReuseAddress(boolean on) throws SocketException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public boolean getReuseAddress( ) throws SocketException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public synchronized void close( ) throws IOException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public void shutdownInput( ) throws IOException {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public void shutdownOutput( ) throws IOException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean isConnected( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public boolean isBound( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean isClosed( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean isInputShutdown( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public boolean isOutputShutdown( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private static SocketImplFactory factory;
  public static synchronized void setSocketImplFactory(SocketImplFactory fac) throws IOException {
                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                 }
  public void setPerformancePreferences(int connectionTime,int latency, int bandwidth) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
}