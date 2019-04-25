package java.util;

import java.lang.*;

public class StringTokenizer implements Enumeration<Object> {
  public StringTokenizer(String str,String delim, boolean returnDelims) {
  }
  public StringTokenizer(String str, String delim) {
    this(str, delim, false);
  }
  public StringTokenizer(String str) {
    this(str, " \t\n\r\f", false);
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