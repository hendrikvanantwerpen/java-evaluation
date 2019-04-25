package java.net;

import java.io.InputStream;
import java.io.IOException;
import java.security.Permission;

abstract public class HttpURLConnection extends URLConnection {
  public String getHeaderFieldKey(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFixedLengthStreamingMode(int contentLength) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFixedLengthStreamingMode(long contentLength) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setChunkedStreamingMode(int chunklen) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getHeaderField(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  protected HttpURLConnection(URL u) {
    super(u);
  }
  public static void setFollowRedirects(boolean set) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean getFollowRedirects( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setInstanceFollowRedirects(boolean followRedirects) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getInstanceFollowRedirects( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setRequestMethod(String method) throws ProtocolException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getRequestMethod( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getResponseCode( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getResponseMessage( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getHeaderFieldDate(String name, long Default) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void disconnect( ) ;
  public abstract boolean usingProxy( ) ;
  public Permission getPermission( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public InputStream getErrorStream( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final int HTTP_OK;
  public static final int HTTP_CREATED;
  public static final int HTTP_ACCEPTED;
  public static final int HTTP_NOT_AUTHORITATIVE;
  public static final int HTTP_NO_CONTENT;
  public static final int HTTP_RESET;
  public static final int HTTP_PARTIAL;
  public static final int HTTP_MULT_CHOICE;
  public static final int HTTP_MOVED_PERM;
  public static final int HTTP_MOVED_TEMP;
  public static final int HTTP_SEE_OTHER;
  public static final int HTTP_NOT_MODIFIED;
  public static final int HTTP_USE_PROXY;
  public static final int HTTP_BAD_REQUEST;
  public static final int HTTP_UNAUTHORIZED;
  public static final int HTTP_PAYMENT_REQUIRED;
  public static final int HTTP_FORBIDDEN;
  public static final int HTTP_NOT_FOUND;
  public static final int HTTP_BAD_METHOD;
  public static final int HTTP_NOT_ACCEPTABLE;
  public static final int HTTP_PROXY_AUTH;
  public static final int HTTP_CLIENT_TIMEOUT;
  public static final int HTTP_CONFLICT;
  public static final int HTTP_GONE;
  public static final int HTTP_LENGTH_REQUIRED;
  public static final int HTTP_PRECON_FAILED;
  public static final int HTTP_ENTITY_TOO_LARGE;
  public static final int HTTP_REQ_TOO_LONG;
  public static final int HTTP_UNSUPPORTED_TYPE;
  public static final int HTTP_SERVER_ERROR;
  public static final int HTTP_INTERNAL_ERROR;
  public static final int HTTP_NOT_IMPLEMENTED;
  public static final int HTTP_BAD_GATEWAY;
  public static final int HTTP_UNAVAILABLE;
  public static final int HTTP_GATEWAY_TIMEOUT;
  public static final int HTTP_VERSION;
}