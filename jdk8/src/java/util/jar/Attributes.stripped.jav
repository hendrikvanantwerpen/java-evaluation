package java.util.jar;

import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Attributes implements Map<Object, Object>, Cloneable {
  public Attributes( ) {
    this(11);
  }
  public Attributes(int size) {
  }
  public Attributes(Attributes attr) {
  }
  public Object get(Object name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getValue(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getValue(Name name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object put(Object name, Object value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String putValue(String name, String value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object remove(Object name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsValue(Object value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsKey(Object name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void putAll(Map<?, ?> attr) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEmpty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<Object> keySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Collection<Object> values( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<Map. Entry<Object, Object>> entrySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static class Name {
    public Name(String name) {
    }
    public boolean equals(Object o) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int hashCode( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public String toString( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public static final Name MANIFEST_VERSION;
    public static final Name SIGNATURE_VERSION;
    public static final Name CONTENT_TYPE;
    public static final Name CLASS_PATH;
    public static final Name MAIN_CLASS;
    public static final Name SEALED;
    public static final Name EXTENSION_LIST;
    public static final Name EXTENSION_NAME;
    public static final Name EXTENSION_INSTALLATION;
    public static final Name IMPLEMENTATION_TITLE;
    public static final Name IMPLEMENTATION_VERSION;
    public static final Name IMPLEMENTATION_VENDOR;
    public static final Name IMPLEMENTATION_VENDOR_ID;
    public static final Name IMPLEMENTATION_URL;
    public static final Name SPECIFICATION_TITLE;
    public static final Name SPECIFICATION_VERSION;
    public static final Name SPECIFICATION_VENDOR;
  }
}