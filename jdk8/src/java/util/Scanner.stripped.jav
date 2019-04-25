package java.util;

import java.nio.file.Path;
import java.util.regex.*;
import java.io.*;
import java.math.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.text.*;
import java.util.Locale;

public final class Scanner implements Iterator<String>, Closeable {
  private Scanner(Readable source, Pattern pattern) {
  }
  public Scanner(Readable source) {
    this(Objects. requireNonNull(source, "source"), WHITESPACE_PATTERN);
  }
  public Scanner(InputStream source) {
    this(new InputStreamReader (source), WHITESPACE_PATTERN);
  }
  public Scanner(InputStream source, String charsetName) {
    this(makeReadable(Objects. requireNonNull(source, "source"), toCharset(charsetName)), WHITESPACE_PATTERN);
  }
  public Scanner(File source) throws FileNotFoundException{
    this((ReadableByteChannel ) new FileInputStream (source). getChannel( ));
  }
  public Scanner(File source, String charsetName) throws FileNotFoundException{
    this(Objects. requireNonNull(source), toDecoder(charsetName));
  }
  private Scanner(File source, CharsetDecoder dec) throws FileNotFoundException{
    this(makeReadable((ReadableByteChannel ) new FileInputStream (source). getChannel( ), dec));
  }
  public Scanner(Path source) throws IOException{
    this(Files. newInputStream(source));
  }
  public Scanner(Path source, String charsetName) throws IOException{
    this(Objects. requireNonNull(source), toCharset(charsetName));
  }
  private Scanner(Path source, Charset charset) throws IOException{
    this(makeReadable(Files. newInputStream(source), charset));
  }
  public Scanner(String source) {
    this(new StringReader (source), WHITESPACE_PATTERN);
  }
  public Scanner(ReadableByteChannel source) {
    this(makeReadable(Objects. requireNonNull(source, "source")), WHITESPACE_PATTERN);
  }
  public Scanner(ReadableByteChannel source, String charsetName) {
    this(makeReadable(Objects. requireNonNull(source, "source"), toDecoder(charsetName)), WHITESPACE_PATTERN);
  }
  public void close( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public IOException ioException( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Pattern delimiter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Scanner useDelimiter(Pattern pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Scanner useDelimiter(String pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Locale locale( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Scanner useLocale(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int radix( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Scanner useRadix(int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MatchResult match( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String next( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNext(String pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String next(String pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNext(Pattern pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String next(Pattern pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextLine( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String nextLine( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String findInLine(String pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String findInLine(Pattern pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String findWithinHorizon(String pattern, int horizon) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String findWithinHorizon(Pattern pattern, int horizon) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Scanner skip(Pattern pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Scanner skip(String pattern) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextBoolean( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean nextBoolean( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextByte( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextByte(int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte nextByte( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte nextByte(int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextShort( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextShort(int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public short nextShort( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public short nextShort(int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextInt( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextInt(int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int nextInt( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int nextInt(int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextLong( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextLong(int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long nextLong( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long nextLong(int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextFloat( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float nextFloat( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextDouble( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double nextDouble( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextBigInteger( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextBigInteger(int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger nextBigInteger( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger nextBigInteger(int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasNextBigDecimal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal nextBigDecimal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Scanner reset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}