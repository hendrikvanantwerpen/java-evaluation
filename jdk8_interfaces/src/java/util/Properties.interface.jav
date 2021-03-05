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
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Properties(Properties defaults) {
    throw new java . lang . RuntimeException ("Implementation stripped");
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
  class LineReader {
    public LineReader(InputStream inStream) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public LineReader(Reader reader) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    byte [] inByteBuf;
    char [] inCharBuf;
    char [] lineBuf;
    int inLimit;
    int inOff;
    InputStream inStream;
    Reader reader;
    int readLine( ) throws IOException {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
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
  private static class XmlSupport {
    static void load(Properties props, InputStream in) throws IOException, InvalidPropertiesFormatException {
                                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                            }
    static void save(Properties props,OutputStream os,String comment, String encoding) throws IOException {
                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                          }
  }
}