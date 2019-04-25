package java.net;


public interface CookiePolicy {
  public static final CookiePolicy ACCEPT_ALL
  ;
  public static final CookiePolicy ACCEPT_NONE
  ;
  public static final CookiePolicy ACCEPT_ORIGINAL_SERVER
  ;
  public boolean shouldAccept(URI uri, HttpCookie cookie) ;
}