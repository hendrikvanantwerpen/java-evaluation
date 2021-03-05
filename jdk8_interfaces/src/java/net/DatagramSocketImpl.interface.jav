package java.net;

import java.io.IOException;

public abstract class DatagramSocketImpl implements SocketOptions {
  int dataAvailable( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  DatagramSocket socket;
  void setDatagramSocket(DatagramSocket socket) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  DatagramSocket getDatagramSocket( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  <T> void setOption(SocketOption<T> name, T value) throws IOException {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  <T> T getOption(SocketOption<T> name) throws IOException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
}