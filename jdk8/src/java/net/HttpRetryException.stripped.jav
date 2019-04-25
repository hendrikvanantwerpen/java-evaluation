package java.net;

import java.io.IOException;

public class HttpRetryException extends IOException {
  public HttpRetryException(String detail, int code) {
    super(detail);
  }
  public HttpRetryException(String detail,int code, String location) {
    super(detail);
  }
  public int responseCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getReason( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getLocation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}