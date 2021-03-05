package java.nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.spi.CharsetProvider;
import java.util.Locale;
import java.util.Set;
import java.util.SortedMap;

public abstract class Charset implements Comparable<Charset> {
  static boolean atBugLevel(String bl) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  private static class ExtendedProviderHolder {
    static final CharsetProvider extendedProvider;
  }
  public static boolean isSupported(String charsetName) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public static Charset forName(String charsetName) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public static SortedMap<String, Charset> availableCharsets( ) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public static Charset defaultCharset( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
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