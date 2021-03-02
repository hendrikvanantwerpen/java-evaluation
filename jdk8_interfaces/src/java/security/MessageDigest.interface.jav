package java.security;

import java.util.*;
import java.lang.*;
import java.security.InvalidKeyException;
import java.nio.ByteBuffer;
import sun.security.util.Debug;
import sun.security.util.MessageDigestSpi2;
import javax.crypto.SecretKey;

public abstract class MessageDigest extends MessageDigestSpi {
  private static final Debug pdebug;
  private static final boolean skipDebug;
  private String algorithm;
  private static final int INITIAL;
  private static final int IN_PROGRESS;
  private int state;
  private Provider provider;
  protected MessageDigest(String algorithm) {
  }
  public static MessageDigest getInstance(String algorithm) throws NoSuchAlgorithmException {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  public static MessageDigest getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
                                                                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                      }
  public static MessageDigest getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException {
                                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                               }
  public final Provider getProvider( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public void update(byte input) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public void update(byte [] input,int offset, int len) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public void update(byte [] input) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public final void update(ByteBuffer input) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public byte [] digest( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public int digest(byte [] buf,int offset, int len) throws DigestException {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public byte [] digest(byte [] input) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public static boolean isEqual(byte [] digesta, byte [] digestb) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public void reset( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public final String getAlgorithm( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public final int getDigestLength( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public Object clone( ) throws CloneNotSupportedException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  static class Delegate extends MessageDigest implements MessageDigestSpi2 {
    private MessageDigestSpi digestSpi;
    public Delegate(MessageDigestSpi digestSpi, String algorithm) {
      super(algorithm);
    }
    public Object clone( ) throws CloneNotSupportedException {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
    protected int engineGetDigestLength( ) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    protected void engineUpdate(byte input) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    protected void engineUpdate(byte [] input,int offset, int len) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
    protected void engineUpdate(ByteBuffer input) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    public void engineUpdate(SecretKey key) throws InvalidKeyException {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
    protected byte [] engineDigest( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    protected int engineDigest(byte [] buf,int offset, int len) throws DigestException {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
    protected void engineReset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
}