package java.nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public abstract class CharsetEncoder {
  public final Charset charset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public final byte [] replacement( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public final CharsetEncoder replaceWith(byte [] newReplacement) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public boolean isLegalReplacement(byte [] repl) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public CodingErrorAction malformedInputAction( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public final CharsetEncoder onMalformedInput(CodingErrorAction newAction) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public CodingErrorAction unmappableCharacterAction( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public final CharsetEncoder onUnmappableCharacter(CodingErrorAction newAction) {
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
  public final CharsetEncoder reset( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public final ByteBuffer encode(CharBuffer in) throws CharacterCodingException {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  public boolean canEncode(char c) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public boolean canEncode(CharSequence cs) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
}