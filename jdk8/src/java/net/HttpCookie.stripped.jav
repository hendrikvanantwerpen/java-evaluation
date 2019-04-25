package java.net;

import java.util.List;

public final class HttpCookie implements Cloneable {
  public HttpCookie(String name, String value) {
    this(name, value, null);
  }
  private HttpCookie(String name,String value, String header) {
  }
  public static List<HttpCookie> parse(String header) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasExpired( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setComment(String purpose) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getComment( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCommentURL(String purpose) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getCommentURL( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDiscard(boolean discard) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getDiscard( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPortlist(String ports) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getPortlist( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDomain(String pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getDomain( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMaxAge(long expiry) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getMaxAge( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPath(String uri) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getPath( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSecure(boolean flag) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getSecure( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setValue(String newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getVersion( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setVersion(int v) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isHttpOnly( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setHttpOnly(boolean httpOnly) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean domainMatches(String domain, String host) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}