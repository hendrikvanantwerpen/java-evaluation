package java.io;

import java.lang.reflect.Field;

public class ObjectStreamField implements Comparable<Object> {
  public ObjectStreamField(String name, Class<?> type) {
    this(name, type, false);
  }
  public ObjectStreamField(String name,Class<?> type, boolean unshared) {
  }
  ObjectStreamField(String name,String signature, boolean unshared) {
  }
  ObjectStreamField(Field field,boolean unshared, boolean showType) {
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char getTypeCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getTypeString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getOffset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isPrimitive( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isUnshared( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}