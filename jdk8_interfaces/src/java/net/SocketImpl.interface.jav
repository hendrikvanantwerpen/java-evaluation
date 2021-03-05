package java.net;

import java.io.IOException;

public abstract class SocketImpl implements SocketOptions {
  Socket socket;
  ServerSocket serverSocket;
  void setSocket(Socket soc) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  Socket getSocket( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  void setServerSocket(ServerSocket soc) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  ServerSocket getServerSocket( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  void reset( ) throws IOException {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  <T> void setOption(SocketOption<T> name, T value) throws IOException {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  <T> T getOption(SocketOption<T> name) throws IOException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
}