package java.util;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Properties extends Hashtable<Object, Object> {
  public Properties( ) {
    this(null);
  }
  public Properties(Properties defaults) {
  }
  public synchronized Object setProperty(String key, String value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void load(Reader reader) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void load(InputStream inStream) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void save(OutputStream out, String comments) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void store(Writer writer, String comments) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void store(OutputStream out, String comments) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void storeToXML(OutputStream os, String comment) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void storeToXML(OutputStream os,String comment, String encoding) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getProperty(String key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getProperty(String key, String defaultValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Enumeration<?> propertyNames( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<String> stringPropertyNames( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void list(PrintStream out) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void list(PrintWriter out) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}