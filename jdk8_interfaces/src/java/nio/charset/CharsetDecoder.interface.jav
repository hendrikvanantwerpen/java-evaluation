package java.nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public abstract class CharsetDecoder {
  public final Charset charset( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public final String replacement( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public final CharsetDecoder replaceWith(String newReplacement) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public CodingErrorAction malformedInputAction( ) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public final CharsetDecoder onMalformedInput(CodingErrorAction newAction) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public CodingErrorAction unmappableCharacterAction( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public final CharsetDecoder onUnmappableCharacter(CodingErrorAction newAction) {
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
  public final CharsetDecoder reset( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
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
}