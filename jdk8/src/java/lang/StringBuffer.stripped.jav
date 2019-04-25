package java.lang;


public final class StringBuffer extends AbstractStringBuilder implements java. io. Serializable, CharSequence {
  public StringBuffer( ) {
    super(16);
  }
  public StringBuffer(int capacity) {
    super(capacity);
  }
  public StringBuffer(String str) {
    super(str. length( ) + 16);
  }
  public StringBuffer(CharSequence seq) {
    this(seq. length( ) + 16);
  }
  public synchronized int length( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int capacity( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void ensureCapacity(int minimumCapacity) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void trimToSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setLength(int newLength) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized char charAt(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int codePointAt(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int codePointBefore(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int codePointCount(int beginIndex, int endIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int offsetByCodePoints(int index, int codePointOffset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void getChars(int srcBegin,int srcEnd,char [] dst, int dstBegin) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setCharAt(int index, char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(StringBuffer sb) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(CharSequence s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(CharSequence s,int start, int end) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(char [] str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(char [] str,int offset, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(char c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer appendCodePoint(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(long lng) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(float f) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer append(double d) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer delete(int start, int end) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer deleteCharAt(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer replace(int start,int end, String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized String substring(int start) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized CharSequence subSequence(int start, int end) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized String substring(int start, int end) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer insert(int index,char [] str,int offset, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer insert(int offset, Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer insert(int offset, String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer insert(int offset, char [] str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public StringBuffer insert(int dstOffset, CharSequence s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer insert(int dstOffset,CharSequence s,int start, int end) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public StringBuffer insert(int offset, boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer insert(int offset, char c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public StringBuffer insert(int offset, int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public StringBuffer insert(int offset, long l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public StringBuffer insert(int offset, float f) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public StringBuffer insert(int offset, double d) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int indexOf(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int indexOf(String str, int fromIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lastIndexOf(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int lastIndexOf(String str, int fromIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized StringBuffer reverse( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}