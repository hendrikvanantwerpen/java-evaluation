package java.net;

import java.io.IOException;
import java.util.Map;
import java.util.List;

public abstract class ResponseCache {
  public synchronized static ResponseCache getDefault( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized static void setDefault(ResponseCache responseCache) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract CacheResponse get(URI uri,String rqstMethod, Map<String, List<String>> rqstHeaders) throws IOException ;
  public abstract CacheRequest put(URI uri, URLConnection conn) throws IOException ;
}