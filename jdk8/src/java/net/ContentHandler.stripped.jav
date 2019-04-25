package java.net;

import java.io.IOException;

abstract public class ContentHandler {
  abstract public Object getContent(URLConnection urlc) throws IOException ;
  public Object getContent(URLConnection urlc, Class [] classes) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}