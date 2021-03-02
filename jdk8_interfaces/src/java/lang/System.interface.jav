package java.lang;

import java.io.*;
import java.util.Properties;
import java.nio.channels.Channel;

public final class System {
  private static native void registerNatives( ) ;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  private System( ) {
  }
  public final static InputStream in;
  public final static PrintStream out;
  public final static PrintStream err;
  private static volatile SecurityManager security;
  public static void setIn(InputStream in) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public static void setOut(PrintStream out) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public static void setErr(PrintStream err) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private static volatile Console cons;
  public static Console console( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public static Channel inheritedChannel( ) throws IOException {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  private static void checkIO( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  private static native void setIn0(InputStream in) ;
  private static native void setOut0(PrintStream out) ;
  private static native void setErr0(PrintStream err) ;
  public static void setSecurityManager(final SecurityManager s) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  private static synchronized void setSecurityManager0(final SecurityManager s) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  public static SecurityManager getSecurityManager( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public static native long currentTimeMillis( ) ;
  public static native long nanoTime( ) ;
  public static native void arraycopy(Object src,int srcPos,Object dest,int destPos, int length) ;
  public static native int identityHashCode(Object x) ;
  private static Properties props;
  private static native Properties initProperties(Properties props) ;
  public static Properties getProperties( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public static String lineSeparator( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private static String lineSeparator;
  public static void setProperties(Properties props) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public static String getProperty(String key) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public static String getProperty(String key, String def) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public static String setProperty(String key, String value) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public static String clearProperty(String key) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  private static void checkKey(String key) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public static String getenv(String name) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public static java. util. Map<String, String> getenv( ) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public static void exit(int status) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public static void gc( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public static void runFinalization( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public static void runFinalizersOnExit(boolean value) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public static void load(String filename) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public static void loadLibrary(String libname) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public static native String mapLibraryName(String libname) ;
  private static PrintStream newPrintStream(FileOutputStream fos, String enc) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  private static void initializeSystemClass( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private static void setJavaLangAccess( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
}