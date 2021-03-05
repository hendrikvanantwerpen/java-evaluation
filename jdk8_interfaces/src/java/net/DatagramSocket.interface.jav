package java.net;

import java.io.IOException;
import java.nio.channels.DatagramChannel;

public class DatagramSocket implements java. io. Closeable {
  DatagramSocketImpl impl;
  boolean oldImpl;
  static final int ST_NOT_CONNECTED;
  static final int ST_CONNECTED;
  static final int ST_CONNECTED_NO_IMPL;
  int connectState;
  InetAddress connectedAddress;
  int connectedPort;
  public DatagramSocket( ) throws SocketException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DatagramSocket(SocketAddress bindaddr) throws SocketException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DatagramSocket(int port) throws SocketException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DatagramSocket(int port, InetAddress laddr) throws SocketException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static Class<?> implClass;
  void createImpl( ) throws SocketException {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  DatagramSocketImpl getImpl( ) throws SocketException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public synchronized void bind(SocketAddress addr) throws SocketException {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  void checkAddress(InetAddress addr, String op) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public void connect(InetAddress address, int port) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public void connect(SocketAddress addr) throws SocketException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public void disconnect( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean isBound( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean isConnected( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public InetAddress getInetAddress( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public int getPort( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public SocketAddress getRemoteSocketAddress( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public SocketAddress getLocalSocketAddress( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public void send(DatagramPacket p) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public synchronized void receive(DatagramPacket p) throws IOException {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public InetAddress getLocalAddress( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public int getLocalPort( ) {
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
  public synchronized void setReuseAddress(boolean on) throws SocketException {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public synchronized boolean getReuseAddress( ) throws SocketException {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public synchronized void setBroadcast(boolean on) throws SocketException {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  public synchronized boolean getBroadcast( ) throws SocketException {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  public synchronized void setTrafficClass(int tc) throws SocketException {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public synchronized int getTrafficClass( ) throws SocketException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  public void close( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public boolean isClosed( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public DatagramChannel getChannel( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  static DatagramSocketImplFactory factory;
  public static synchronized void setDatagramSocketImplFactory(DatagramSocketImplFactory fac) throws IOException {
                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                 }
}