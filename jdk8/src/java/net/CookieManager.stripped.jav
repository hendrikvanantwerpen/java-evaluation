package java.net;

import java.util.Map;
import java.util.List;
import java.io.IOException;

public class CookieManager extends CookieHandler {
  public CookieManager( ) {
    this(null, null);
  }
  public CookieManager(CookieStore store, CookiePolicy cookiePolicy) {
  }
  public void setCookiePolicy(CookiePolicy cookiePolicy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CookieStore getCookieStore( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map<String, List<String>> get(URI uri, Map<String, List<String>> requestHeaders) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void put(URI uri, Map<String, List<String>> responseHeaders) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}