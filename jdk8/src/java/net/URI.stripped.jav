package java.net;

import java.io.Serializable;

public final class URI implements Comparable<URI>, Serializable {
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
}