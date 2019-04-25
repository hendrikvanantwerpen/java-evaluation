package java.util.logging;

import java.io.*;
import java.util.*;
import java.security.*;
import java.beans.PropertyChangeListener;

public class LogManager {
  protected LogManager( ) {
    this(checkSubclassPermissions( ));
  }
  private LogManager(Void checked) {
  }
  public static LogManager getLogManager( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPropertyChangeListener(PropertyChangeListener l) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removePropertyChangeListener(PropertyChangeListener l) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean addLogger(Logger logger) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Logger getLogger(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Enumeration<String> getLoggerNames( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void readConfiguration( ) throws IOException, SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void readConfiguration(InputStream ins) throws IOException, SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getProperty(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkAccess( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static String LOGGING_MXBEAN_NAME;
  public static synchronized LoggingMXBean getLoggingMXBean( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}