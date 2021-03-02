package java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Map;
import java.util.List;
import java.security.Permission;
import sun.net.www.MessageHeader;

public abstract class URLConnection {
  protected URL url;
  protected boolean doInput;
  protected boolean doOutput;
  private static boolean defaultAllowUserInteraction;
  protected boolean allowUserInteraction;
  private static boolean defaultUseCaches;
  protected boolean useCaches;
  protected long ifModifiedSince;
  protected boolean connected;
  private int connectTimeout;
  private int readTimeout;
  private MessageHeader requests;
  private static FileNameMap fileNameMap;
  private static boolean fileNameMapLoaded;
  public static synchronized FileNameMap getFileNameMap( ) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public static void setFileNameMap(FileNameMap map) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  abstract public void connect( ) throws IOException ;
  public void setConnectTimeout(int timeout) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public int getConnectTimeout( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public void setReadTimeout(int timeout) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public int getReadTimeout( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  protected URLConnection(URL url) {
  }
  public URL getURL( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public int getContentLength( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public long getContentLengthLong( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public String getContentType( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public String getContentEncoding( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public long getExpiration( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public long getDate( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public long getLastModified( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public String getHeaderField(String name) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public Map<String, List<String>> getHeaderFields( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public int getHeaderFieldInt(String name, int Default) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public long getHeaderFieldLong(String name, long Default) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public long getHeaderFieldDate(String name, long Default) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public String getHeaderFieldKey(int n) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public String getHeaderField(int n) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public Object getContent( ) throws IOException {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public Object getContent(Class [] classes) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public Permission getPermission( ) throws IOException {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public InputStream getInputStream( ) throws IOException {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public OutputStream getOutputStream( ) throws IOException {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void setDoInput(boolean doinput) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public boolean getDoInput( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public void setDoOutput(boolean dooutput) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public boolean getDoOutput( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public void setAllowUserInteraction(boolean allowuserinteraction) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  public boolean getAllowUserInteraction( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public static void setDefaultAllowUserInteraction(boolean defaultallowuserinteraction) {
                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                         }
  public static boolean getDefaultAllowUserInteraction( ) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public void setUseCaches(boolean usecaches) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public boolean getUseCaches( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public void setIfModifiedSince(long ifmodifiedsince) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public long getIfModifiedSince( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public boolean getDefaultUseCaches( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public void setDefaultUseCaches(boolean defaultusecaches) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public void setRequestProperty(String key, String value) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public void addRequestProperty(String key, String value) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public String getRequestProperty(String key) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public Map<String, List<String>> getRequestProperties( ) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public static void setDefaultRequestProperty(String key, String value) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public static String getDefaultRequestProperty(String key) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  static ContentHandlerFactory factory;
  public static synchronized void setContentHandlerFactory(ContentHandlerFactory fac) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  private static Hashtable<String, ContentHandler> handlers;
  synchronized ContentHandler getContentHandler( ) throws UnknownServiceException {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  private String stripOffParameters(String contentType) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private static final String contentClassPrefix;
  private static final String contentPathProp;
  private ContentHandler lookupContentHandlerClassFor(String contentType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
                                                                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                        }
  private String typeToPackageName(String contentType) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private String getContentHandlerPkgPrefixes( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public static String guessContentTypeFromName(String fname) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  static public String guessContentTypeFromStream(InputStream is) throws IOException {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  static private boolean checkfpx(InputStream is) throws IOException {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  static private int readBytes(int c[],int len, InputStream is) throws IOException {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  static private long skipForward(InputStream is, long toSkip) throws IOException {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
}
class UnknownContentHandler extends ContentHandler {
  static final ContentHandler INSTANCE;
  public Object getContent(URLConnection uc) throws IOException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
}