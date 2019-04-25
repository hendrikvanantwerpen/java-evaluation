package java.net;

import java.util.Map;
import java.util.List;
import java.io.IOException;

public abstract class CookieHandler {
  public synchronized static CookieHandler getDefault( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized static void setDefault(CookieHandler cHandler) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Map<String, List<String>> get(URI uri, Map<String, List<String>> requestHeaders) throws IOException ;
  public abstract void put(URI uri, Map<String, List<String>> responseHeaders) throws IOException ;
}