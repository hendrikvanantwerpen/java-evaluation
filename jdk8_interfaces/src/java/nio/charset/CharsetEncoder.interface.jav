package java.nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.lang.ref.WeakReference;

public abstract class CharsetEncoder {
  private final Charset charset;
  private final float averageBytesPerChar;
  private final float maxBytesPerChar;
  private byte [] replacement;
  private CodingErrorAction malformedInputAction;
  private CodingErrorAction unmappableCharacterAction;
  private static final int ST_RESET;
  private static final int ST_CODING;
  private static final int ST_END;
  private static final int ST_FLUSHED;
  private int state;
  private static String stateNames[];
  protected CharsetEncoder(Charset cs,float averageBytesPerChar,float maxBytesPerChar, byte [] replacement) {
  }
  protected CharsetEncoder(Charset cs,float averageBytesPerChar, float maxBytesPerChar) {
    this(cs, averageBytesPerChar, maxBytesPerChar, new byte[]{(byte) '?'});
  }
  public final Charset charset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public final byte [] replacement( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public final CharsetEncoder replaceWith(byte [] newReplacement) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  protected void implReplaceWith(byte [] newReplacement) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  private WeakReference<CharsetDecoder> cachedDecoder;
  public boolean isLegalReplacement(byte [] repl) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public CodingErrorAction malformedInputAction( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public final CharsetEncoder onMalformedInput(CodingErrorAction newAction) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  protected void implOnMalformedInput(CodingErrorAction newAction) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public CodingErrorAction unmappableCharacterAction( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public final CharsetEncoder onUnmappableCharacter(CodingErrorAction newAction) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  protected void implOnUnmappableCharacter(CodingErrorAction newAction) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public final float averageBytesPerChar( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public final float maxBytesPerChar( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public final CoderResult encode(CharBuffer in,ByteBuffer out, boolean endOfInput) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public final CoderResult flush(ByteBuffer out) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  protected CoderResult implFlush(ByteBuffer out) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public final CharsetEncoder reset( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  protected void implReset( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  protected abstract CoderResult encodeLoop(CharBuffer in, ByteBuffer out) ;
  public final ByteBuffer encode(CharBuffer in) throws CharacterCodingException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  private boolean canEncode(CharBuffer cb) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public boolean canEncode(char c) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public boolean canEncode(CharSequence cs) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  private void throwIllegalStateException(int from, int to) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
}