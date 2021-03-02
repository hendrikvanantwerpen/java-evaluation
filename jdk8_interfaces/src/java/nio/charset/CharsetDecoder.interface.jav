package java.nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public abstract class CharsetDecoder {
  private final Charset charset;
  private final float averageCharsPerByte;
  private final float maxCharsPerByte;
  private String replacement;
  private CodingErrorAction malformedInputAction;
  private CodingErrorAction unmappableCharacterAction;
  private static final int ST_RESET;
  private static final int ST_CODING;
  private static final int ST_END;
  private static final int ST_FLUSHED;
  private int state;
  private static String stateNames[];
  private CharsetDecoder(Charset cs,float averageCharsPerByte,float maxCharsPerByte, String replacement) {
  }
  protected CharsetDecoder(Charset cs,float averageCharsPerByte, float maxCharsPerByte) {
    this(cs, averageCharsPerByte, maxCharsPerByte, "\uFFFD");
  }
  public final Charset charset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public final String replacement( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public final CharsetDecoder replaceWith(String newReplacement) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  protected void implReplaceWith(String newReplacement) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public CodingErrorAction malformedInputAction( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public final CharsetDecoder onMalformedInput(CodingErrorAction newAction) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  protected void implOnMalformedInput(CodingErrorAction newAction) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public CodingErrorAction unmappableCharacterAction( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public final CharsetDecoder onUnmappableCharacter(CodingErrorAction newAction) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  protected void implOnUnmappableCharacter(CodingErrorAction newAction) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public final float averageCharsPerByte( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public final float maxCharsPerByte( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public final CoderResult decode(ByteBuffer in,CharBuffer out, boolean endOfInput) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public final CoderResult flush(CharBuffer out) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  protected CoderResult implFlush(CharBuffer out) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public final CharsetDecoder reset( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  protected void implReset( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  protected abstract CoderResult decodeLoop(ByteBuffer in, CharBuffer out) ;
  public final CharBuffer decode(ByteBuffer in) throws CharacterCodingException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  public boolean isAutoDetecting( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public boolean isCharsetDetected( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public Charset detectedCharset( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  private void throwIllegalStateException(int from, int to) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
}