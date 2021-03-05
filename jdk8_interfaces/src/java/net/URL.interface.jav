package java.net;

import java.io.InputStream;
import java.util.Hashtable;

public final class URL implements java. io. Serializable {
  static final String BUILTIN_HANDLERS_PREFIX;
  static final long serialVersionUID;
  transient InetAddress hostAddress;
  transient URLStreamHandler handler;
  public URL(String protocol,String host,int port, String file) throws MalformedURLException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URL(String protocol,String host, String file) throws MalformedURLException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URL(String protocol,String host,int port,String file, URLStreamHandler handler) throws MalformedURLException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URL(String spec) throws MalformedURLException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URL(URL context, String spec) throws MalformedURLException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URL(URL context,String spec, URLStreamHandler handler) throws MalformedURLException{
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  void set(String protocol,String host,int port,String file, String ref) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  void set(String protocol,String host,int port,String authority,String userInfo,String path,String query, String ref) {
                                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                       }
  public String getQuery( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public String getPath( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public String getUserInfo( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public String getAuthority( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public int getPort( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public int getDefaultPort( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public String getProtocol( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public String getHost( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public String getFile( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public String getRef( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public synchronized int hashCode( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public boolean sameFile(URL other) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public String toExternalForm( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public URI toURI( ) throws URISyntaxException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public URLConnection openConnection( ) throws java. io. IOException {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public URLConnection openConnection(Proxy proxy) throws java. io. IOException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  public final InputStream openStream( ) throws java. io. IOException {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public final Object getContent( ) throws java. io. IOException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public final Object getContent(Class [] classes) throws java. io. IOException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  static URLStreamHandlerFactory factory;
  public static void setURLStreamHandlerFactory(URLStreamHandlerFactory fac) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  static Hashtable<String, URLStreamHandler> handlers;
  static URLStreamHandler getURLStreamHandler(String protocol) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  boolean isBuiltinStreamHandler(URLStreamHandler handler) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
}
class Parts {
  String path, query, ref;
  Parts(String file) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  String getPath( ) {
                      throw new java . lang . RuntimeException ("Implementation stripped");
                    }
  String getQuery( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  String getRef( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
}
final class UrlDeserializedState {
  public UrlDeserializedState(String protocol,String host,int port,String authority,String file,String ref, int hashCode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  String getProtocol( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  String getHost( ) {
                      throw new java . lang . RuntimeException ("Implementation stripped");
                    }
  String getAuthority( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  int getPort( ) {
                   throw new java . lang . RuntimeException ("Implementation stripped");
                 }
  String getFile( ) {
                      throw new java . lang . RuntimeException ("Implementation stripped");
                    }
  String getRef( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
  int getHashCode( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  String reconstituteUrlString( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
}