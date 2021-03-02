package java.lang;

import java.util.stream.IntStream;

public interface CharSequence {
  int length( ) ;
  char charAt(int index) ;
  CharSequence subSequence(int start, int end) ;
  public String toString( ) ;
  public default IntStream chars( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public default IntStream codePoints( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
}