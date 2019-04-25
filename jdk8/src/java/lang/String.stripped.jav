package java.lang;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Locale;

public final class String implements java. io. Serializable, Comparable<String>, CharSequence {
  public String( ) {
  }
  public String(String original) {
  }
  public String(char value[]) {
  }
  public String(char value[],int offset, int count) {
  }
  public String(int [] codePoints,int offset, int count) {
  }
  @Deprecated public String(byte ascii[],int hibyte,int offset, int count) {
  }
  @Deprecated public String(byte ascii[], int hibyte) {
    this(ascii, hibyte, 0, ascii.length);
  }
  public String(byte bytes[],int offset,int length, String charsetName) throws UnsupportedEncodingException{
  }
  public String(byte bytes[],int offset,int length, Charset charset) {
  }
  public String(byte bytes[], String charsetName) throws UnsupportedEncodingException{
    this(bytes, 0, bytes.length, charsetName);
  }
  public String(byte bytes[], Charset charset) {
    this(bytes, 0, bytes.length, charset);
  }
  public String(byte bytes[],int offset, int length) {
  }
  public String(byte bytes[]) {
    this(bytes, 0, bytes.length);
  }
  public String(StringBuffer buffer) {
  }
  public String(StringBuilder builder) {
  }
  String(char [] value, boolean share) {
  }
  public int length( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEmpty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char charAt(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int codePointAt(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int codePointBefore(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int codePointCount(int beginIndex, int endIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int offsetByCodePoints(int index, int codePointOffset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void getChars(int srcBegin,int srcEnd,char dst[], int dstBegin) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void getBytes(int srcBegin,int srcEnd,byte dst[], int dstBegin) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getBytes(String charsetName) throws UnsupportedEncodingException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getBytes(Charset charset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getBytes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object anObject) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contentEquals(StringBuffer sb) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contentEquals(CharSequence cs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equalsIgnoreCase(String anotherString) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(String anotherString) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final Comparator<String> CASE_INSENSITIVE_ORDER;
  public int compareToIgnoreCase(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean regionMatches(int toffset,String other,int ooffset, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean regionMatches(boolean ignoreCase,int toffset,String other,int ooffset, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean startsWith(String prefix, int toffset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean startsWith(String prefix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean endsWith(String suffix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int indexOf(int ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int indexOf(int ch, int fromIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lastIndexOf(int ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lastIndexOf(int ch, int fromIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int indexOf(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int indexOf(String str, int fromIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lastIndexOf(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lastIndexOf(String str, int fromIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String substring(int beginIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String substring(int beginIndex, int endIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CharSequence subSequence(int beginIndex, int endIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String concat(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String replace(char oldChar, char newChar) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean matches(String regex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(CharSequence s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String replaceFirst(String regex, String replacement) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String replaceAll(String regex, String replacement) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String replace(CharSequence target, CharSequence replacement) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String [] split(String regex, int limit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String [] split(String regex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String join(CharSequence delimiter, CharSequence ... elements) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toLowerCase(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toLowerCase( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toUpperCase(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toUpperCase( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String trim( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char [] toCharArray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String format(String format, Object ... args) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String format(Locale l,String format, Object ... args) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String valueOf(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String valueOf(char data[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String valueOf(char data[],int offset, int count) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String copyValueOf(char data[],int offset, int count) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String copyValueOf(char data[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String valueOf(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String valueOf(char c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String valueOf(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String valueOf(long l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String valueOf(float f) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String valueOf(double d) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public native String intern( ) ;
}