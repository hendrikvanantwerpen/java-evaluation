package java.net;

import java.util.List;

public interface CookieStore {
  public void add(URI uri, HttpCookie cookie) ;
  public List<HttpCookie> get(URI uri) ;
  public List<HttpCookie> getCookies( ) ;
  public List<URI> getURIs( ) ;
  public boolean remove(URI uri, HttpCookie cookie) ;
  public boolean removeAll( ) ;
}