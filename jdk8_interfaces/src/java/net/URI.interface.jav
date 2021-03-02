package java.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public final class URI implements Comparable<URI>, Serializable {
  static final long serialVersionUID;
  private transient String scheme;
  private transient String fragment;
  private transient String authority;
  private transient String userInfo;
  private transient String host;
  private transient int port;
  private transient String path;
  private transient String query;
  private volatile transient String schemeSpecificPart;
  private volatile transient int hash;
  private volatile transient String decodedUserInfo;
  private volatile transient String decodedAuthority;
  private volatile transient String decodedPath;
  private volatile transient String decodedQuery;
  private volatile transient String decodedFragment;
  private volatile transient String decodedSchemeSpecificPart;
  private volatile String string;
  private URI( ) {
  }
  public URI(String str) throws URISyntaxException{
  }
  public URI(String scheme,String userInfo,String host,int port,String path,String query, String fragment) throws URISyntaxException{
  }
  public URI(String scheme,String authority,String path,String query, String fragment) throws URISyntaxException{
  }
  public URI(String scheme,String host,String path, String fragment) throws URISyntaxException{
    this(scheme, null, host, -1, path, null, fragment);
  }
  public URI(String scheme,String ssp, String fragment) throws URISyntaxException{
  }
  public static URI create(String str) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public URI parseServerAuthority( ) throws URISyntaxException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public URI normalize( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public URI resolve(URI uri) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public URI resolve(String str) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public URI relativize(URI uri) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public URL toURL( ) throws MalformedURLException {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public String getScheme( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public boolean isAbsolute( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public boolean isOpaque( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public String getRawSchemeSpecificPart( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public String getSchemeSpecificPart( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public String getRawAuthority( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public String getAuthority( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public String getRawUserInfo( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public String getUserInfo( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public String getHost( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public int getPort( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  public String getRawPath( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public String getPath( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public String getRawQuery( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public String getQuery( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public String getRawFragment( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public String getFragment( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public boolean equals(Object ob) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public int compareTo(URI that) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public String toASCIIString( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  private void writeObject(ObjectOutputStream os) throws IOException {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  private static int toLower(char c) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private static int toUpper(char c) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private static boolean equal(String s, String t) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  private static boolean equalIgnoringCase(String s, String t) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  private static int hash(int hash, String s) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private static int normalizedHash(int hash, String s) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private static int hashIgnoringCase(int hash, String s) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  private static int compare(String s, String t) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  private static int compareIgnoringCase(String s, String t) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private static void checkPath(String s,String scheme, String path) throws URISyntaxException {
                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                               }
  private void appendAuthority(StringBuffer sb,String authority,String userInfo,String host, int port) {
                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                       }
  private void appendSchemeSpecificPart(StringBuffer sb,String opaquePart,String authority,String userInfo,String host,int port,String path, String query) {
                                                                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                           }
  private void appendFragment(StringBuffer sb, String fragment) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  private String toString(String scheme,String opaquePart,String authority,String userInfo,String host,int port,String path,String query, String fragment) {
                                                                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                           }
  private void defineSchemeSpecificPart( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private void defineString( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  private static String resolvePath(String base,String child, boolean absolute) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  private static URI resolve(URI base, URI child) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  private static URI normalize(URI u) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  private static URI relativize(URI base, URI child) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  static private int needsNormalization(String path) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  static private void split(char [] path, int [] segs) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  static private int join(char [] path, int [] segs) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  private static void removeDots(char [] path, int [] segs) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  private static void maybeAddLeadingDot(char [] path, int [] segs) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private static String normalize(String ps) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private static long lowMask(String chars) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  private static long highMask(String chars) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private static long lowMask(char first, char last) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  private static long highMask(char first, char last) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private static boolean match(char c,long lowMask, long highMask) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  private static final long L_DIGIT;
  private static final long H_DIGIT;
  private static final long L_UPALPHA;
  private static final long H_UPALPHA;
  private static final long L_LOWALPHA;
  private static final long H_LOWALPHA;
  private static final long L_ALPHA;
  private static final long H_ALPHA;
  private static final long L_ALPHANUM;
  private static final long H_ALPHANUM;
  private static final long L_HEX;
  private static final long H_HEX;
  private static final long L_MARK;
  private static final long H_MARK;
  private static final long L_UNRESERVED;
  private static final long H_UNRESERVED;
  private static final long L_RESERVED;
  private static final long H_RESERVED;
  private static final long L_ESCAPED;
  private static final long H_ESCAPED;
  private static final long L_URIC;
  private static final long H_URIC;
  private static final long L_PCHAR;
  private static final long H_PCHAR;
  private static final long L_PATH;
  private static final long H_PATH;
  private static final long L_DASH;
  private static final long H_DASH;
  private static final long L_DOT;
  private static final long H_DOT;
  private static final long L_USERINFO;
  private static final long H_USERINFO;
  private static final long L_REG_NAME;
  private static final long H_REG_NAME;
  private static final long L_SERVER;
  private static final long H_SERVER;
  private static final long L_SERVER_PERCENT;
  private static final long H_SERVER_PERCENT;
  private static final long L_LEFT_BRACKET;
  private static final long H_LEFT_BRACKET;
  private static final long L_SCHEME;
  private static final long H_SCHEME;
  private static final long L_URIC_NO_SLASH;
  private static final long H_URIC_NO_SLASH;
  private final static char [] hexDigits;
  private static void appendEscape(StringBuffer sb, byte b) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  private static void appendEncoded(StringBuffer sb, char c) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private static String quote(String s,long lowMask, long highMask) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private static String encode(String s) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  private static int decode(char c) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  private static byte decode(char c1, char c2) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private static String decode(String s) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  private class Parser {
    private String input;
    private boolean requireServerAuthority;
    Parser(String s) {
    }
    private void fail(String reason) throws URISyntaxException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
    private void fail(String reason, int p) throws URISyntaxException {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
    private void failExpecting(String expected, int p) throws URISyntaxException {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
    private void failExpecting(String expected,String prior, int p) throws URISyntaxException {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
    private String substring(int start, int end) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    private char charAt(int p) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    private boolean at(int start,int end, char c) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    private boolean at(int start,int end, String s) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
    private int scan(int start,int end, char c) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
    private int scan(int start,int end,String err, String stop) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
    private int scanEscape(int start,int n, char first) throws URISyntaxException {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
    private int scan(int start,int n,long lowMask, long highMask) throws URISyntaxException {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
    private void checkChars(int start,int end,long lowMask,long highMask, String what) throws URISyntaxException {
                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                 }
    private void checkChar(int p,long lowMask,long highMask, String what) throws URISyntaxException {
                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                    }
    void parse(boolean rsa) throws URISyntaxException {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    private int parseHierarchical(int start, int n) throws URISyntaxException {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
    private int parseAuthority(int start, int n) throws URISyntaxException {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
    private int parseServer(int start, int n) throws URISyntaxException {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
    private int scanByte(int start, int n) throws URISyntaxException {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
    private int scanIPv4Address(int start,int n, boolean strict) throws URISyntaxException {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
    private int takeIPv4Address(int start,int n, String expected) throws URISyntaxException {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
    private int parseIPv4Address(int start, int n) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
    private int parseHostname(int start, int n) throws URISyntaxException {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
    private int ipv6byteCount;
    private int parseIPv6Reference(int start, int n) throws URISyntaxException {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
    private int scanHexPost(int start, int n) throws URISyntaxException {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
    private int scanHexSeq(int start, int n) throws URISyntaxException {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  }
}