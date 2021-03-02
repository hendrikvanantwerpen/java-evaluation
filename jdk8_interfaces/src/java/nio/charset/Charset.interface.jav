package java.nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.spi.CharsetProvider;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public abstract class Charset implements Comparable<Charset> {
  private static volatile String bugLevel;
  static boolean atBugLevel(String bl) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  private static void checkName(String s) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private static CharsetProvider standardProvider;
  private static volatile Object [] cache1;
  private static volatile Object [] cache2;
  private static void cache(String charsetName, Charset cs) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  private static Iterator<CharsetProvider> providers( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private static ThreadLocal<ThreadLocal<?>> gate;
  private static Charset lookupViaProviders(final String charsetName) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  private static class ExtendedProviderHolder {
    static final CharsetProvider extendedProvider;
    private static CharsetProvider extendedProvider( ) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  }
  private static Charset lookupExtendedCharset(String charsetName) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  private static Charset lookup(String charsetName) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  private static Charset lookup2(String charsetName) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public static boolean isSupported(String charsetName) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public static Charset forName(String charsetName) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  private static void put(Iterator<Charset> i, Map<String, Charset> m) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  public static SortedMap<String, Charset> availableCharsets( ) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  private static volatile Charset defaultCharset;
  public static Charset defaultCharset( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private final String name;
  private final String [] aliases;
  private Set<String> aliasSet;
  protected Charset(String canonicalName, String [] aliases) {
  }
  public final String name( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public final Set<String> aliases( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public String displayName( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public final boolean isRegistered( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public String displayName(Locale locale) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public abstract boolean contains(Charset cs) ;
  public abstract CharsetDecoder newDecoder( ) ;
  public abstract CharsetEncoder newEncoder( ) ;
  public boolean canEncode( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public final CharBuffer decode(ByteBuffer bb) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public final ByteBuffer encode(CharBuffer cb) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public final ByteBuffer encode(String str) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public final int compareTo(Charset that) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public final int hashCode( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public final boolean equals(Object ob) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public final String toString( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
}