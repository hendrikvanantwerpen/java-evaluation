package java.beans;

import java.io.InputStream;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.DefaultHandler;

public class XMLDecoder implements AutoCloseable {
  public XMLDecoder(InputStream in) {
    this(in, null);
  }
  public XMLDecoder(InputStream in, Object owner) {
    this(in, owner, null);
  }
  public XMLDecoder(InputStream in,Object owner, ExceptionListener exceptionListener) {
    this(in, owner, exceptionListener, null);
  }
  public XMLDecoder(InputStream in,Object owner,ExceptionListener exceptionListener, ClassLoader cl) {
    this(new InputSource (in), owner, exceptionListener, cl);
  }
  public XMLDecoder(InputSource is) {
    this(is, null, null, null);
  }
  private XMLDecoder(InputSource is,Object owner,ExceptionListener el, ClassLoader cl) {
  }
  public void close( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setExceptionListener(ExceptionListener exceptionListener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ExceptionListener getExceptionListener( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object readObject( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOwner(Object owner) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getOwner( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static DefaultHandler createHandler(Object owner,ExceptionListener el, ClassLoader cl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}