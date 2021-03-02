package java.util;

import java.lang.*;

public class StringTokenizer implements Enumeration<Object> {
  private int currentPosition;
  private int newPosition;
  private int maxPosition;
  private String str;
  private String delimiters;
  private boolean retDelims;
  private boolean delimsChanged;
  private int maxDelimCodePoint;
  private boolean hasSurrogates;
  private int [] delimiterCodePoints;
  private void setMaxDelimCodePoint( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public StringTokenizer(String str,String delim, boolean returnDelims) {
  }
  public StringTokenizer(String str, String delim) {
    this(str, delim, false);
  }
  public StringTokenizer(String str) {
    this(str, " \t\n\r\f", false);
  }
  private int skipDelimiters(int startPos) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private int scanToken(int startPos) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  private boolean isDelimiter(int codePoint) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public boolean hasMoreTokens( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public String nextToken( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public String nextToken(String delim) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public boolean hasMoreElements( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public Object nextElement( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public int countTokens( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}