package java.util;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.io.BufferedWriter;
import sun.util.spi.XmlPropertiesProvider;

public class Properties extends Hashtable<Object, Object> {
  private static final long serialVersionUID;
  protected Properties defaults;
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
  private void load0(LineReader lr) throws IOException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  class LineReader {
    public LineReader(InputStream inStream) {
    }
    public LineReader(Reader reader) {
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
  private String loadConvert(char [] in,int off,int len, char [] convtBuf) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  private String saveConvert(String theString,boolean escapeSpace, boolean escapeUnicode) {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  private static void writeComments(BufferedWriter bw, String comments) throws IOException {
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
  private void store0(BufferedWriter bw,String comments, boolean escUnicode) throws IOException {
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
  private synchronized void enumerate(Hashtable<String, Object> h) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  private synchronized void enumerateStringProperties(Hashtable<String, String> h) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  private static char toHex(int nibble) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private static final char [] hexDigit;
  private static class XmlSupport {
    private static XmlPropertiesProvider loadProviderFromProperty(ClassLoader cl) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
    private static XmlPropertiesProvider loadProviderAsService(ClassLoader cl) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
    private static XmlPropertiesProvider loadProvider( ) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
    private static final XmlPropertiesProvider PROVIDER;
    static void load(Properties props, InputStream in) throws IOException, InvalidPropertiesFormatException {
                                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                            }
    static void save(Properties props,OutputStream os,String comment, String encoding) throws IOException {
                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                          }
  }
}