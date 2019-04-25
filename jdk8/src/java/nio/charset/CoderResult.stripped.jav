package java.nio.charset;

import java.nio.*;

public class CoderResult {
  private CoderResult(int type, int length) {
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isUnderflow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isOverflow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isError( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMalformed( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isUnmappable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int length( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final CoderResult UNDERFLOW;
  public static final CoderResult OVERFLOW;
  public static CoderResult malformedForLength(int length) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static CoderResult unmappableForLength(int length) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void throwException( ) throws CharacterCodingException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}