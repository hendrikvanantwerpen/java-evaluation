package java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.ObjectStreamField;
import java.util.Hashtable;

public final class URL implements java. io. Serializable {
  static final String BUILTIN_HANDLERS_PREFIX;
  static final long serialVersionUID;
  private static final String protocolPathProp;
  private String protocol;
  private String host;
  private int port;
  private String file;
  private transient String query;
  private String authority;
  private transient String path;
  private transient String userInfo;
  private String ref;
  transient InetAddress hostAddress;
  transient URLStreamHandler handler;
  private int hashCode;
  private transient UrlDeserializedState tempState;
  public URL(String protocol,String host,int port, String file) throws MalformedURLException{
    this(protocol, host, port, file, null);
  }
  public URL(String protocol,String host, String file) throws MalformedURLException{
    this(protocol, host, -1, file);
  }
  public URL(String protocol,String host,int port,String file, URLStreamHandler handler) throws MalformedURLException{
  }
  public URL(String spec) throws MalformedURLException{
    this(null, spec);
  }
  public URL(URL context, String spec) throws MalformedURLException{
    this(context, spec, null);
  }
  public URL(URL context,String spec, URLStreamHandler handler) throws MalformedURLException{
  }
  private boolean isValidProtocol(String protocol) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  private void checkSpecifyHandler(SecurityManager sm) {
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
  private static Object streamHandlerLock;
  static URLStreamHandler getURLStreamHandler(String protocol) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  private static final ObjectStreamField [] serialPersistentFields;
  private synchronized void writeObject(java. io. ObjectOutputStream s) throws IOException {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  private synchronized void readObject(java. io. ObjectInputStream s) throws IOException, ClassNotFoundException {
                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                 }
  private Object readResolve( ) throws ObjectStreamException {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private URL setDeserializedFields(URLStreamHandler handler) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  private URL fabricateNewURL( ) throws InvalidObjectException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  boolean isBuiltinStreamHandler(URLStreamHandler handler) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  private boolean isBuiltinStreamHandler(String handlerClassName) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  private void resetState( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  private void setSerializedHashCode(int hc) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
}
class Parts {
  String path, query, ref;
  Parts(String file) {
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
  private final String protocol;
  private final String host;
  private final int port;
  private final String authority;
  private final String file;
  private final String ref;
  private final int hashCode;
  public UrlDeserializedState(String protocol,String host,int port,String authority,String file,String ref, int hashCode) {
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