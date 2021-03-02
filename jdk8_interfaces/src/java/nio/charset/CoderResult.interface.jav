package java.nio.charset;

import java.lang.ref.WeakReference;
import java.nio.*;
import java.util.Map;

public class CoderResult {
  private static final int CR_UNDERFLOW;
  private static final int CR_OVERFLOW;
  private static final int CR_ERROR_MIN;
  private static final int CR_MALFORMED;
  private static final int CR_UNMAPPABLE;
  private static final String [] names;
  private final int type;
  private final int length;
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
  private static abstract class Cache {
    private Map<Integer, WeakReference<CoderResult>> cache;
    protected abstract CoderResult create(int len) ;
    private synchronized CoderResult get(int len) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  }
  private static Cache malformedCache;
  public static CoderResult malformedForLength(int length) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  private static Cache unmappableCache;
  public static CoderResult unmappableForLength(int length) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public void throwException( ) throws CharacterCodingException {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
}