package java.net;

import java.io.InputStream;

public final class URL implements java. io. Serializable {
  public URL(String protocol,String host,int port, String file) throws MalformedURLException{
    this(protocol, host, port, file, null);
  }
  public URL(String protocol,String host, String file) throws MalformedURLException{
    this(protocol, host, -1, file);
  }
  public URL(String protocol,String host,int port,String file, URLStreamHandler handler) throws MalformedURLException{
  }
  public URL(String spec) throws MalformedURLException{
    this(null, spec);
  }
  public URL(URL context, String spec) throws MalformedURLException{
    this(context, spec, null);
  }
  public URL(URL context,String spec, URLStreamHandler handler) throws MalformedURLException{
  }
  public String getQuery( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getPath( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getUserInfo( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getAuthority( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getPort( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDefaultPort( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getProtocol( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getHost( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getFile( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getRef( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean sameFile(URL other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toExternalForm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URI toURI( ) throws URISyntaxException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URLConnection openConnection( ) throws java. io. IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URLConnection openConnection(Proxy proxy) throws java. io. IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final InputStream openStream( ) throws java. io. IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Object getContent( ) throws java. io. IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Object getContent(Class [] classes) throws java. io. IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void setURLStreamHandlerFactory(URLStreamHandlerFactory fac) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}