package java.net;

import java.io.IOException;
import java.util.List;

public abstract class ProxySelector {
  public static ProxySelector getDefault( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void setDefault(ProxySelector ps) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract List<Proxy> select(URI uri) ;
  public abstract void connectFailed(URI uri,SocketAddress sa, IOException ioe) ;
}