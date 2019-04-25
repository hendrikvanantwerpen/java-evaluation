package java.util.jar;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Map;

public class Manifest implements Cloneable {
  public Manifest( ) {
  }
  public Manifest(InputStream is) throws IOException{
  }
  public Manifest(Manifest man) {
  }
  public Attributes getMainAttributes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map<String, Attributes> getEntries( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Attributes getAttributes(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(OutputStream out) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void read(InputStream is) throws IOException {
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
}