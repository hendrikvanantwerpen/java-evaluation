package java.io;

import java.util.Locale;
import java.nio.charset.Charset;

public class PrintStream extends FilterOutputStream implements Appendable, Closeable {
  private PrintStream(boolean autoFlush, OutputStream out) {
    super(out);
  }
  private PrintStream(boolean autoFlush,OutputStream out, Charset charset) {
    super(out);
  }
  private PrintStream(boolean autoFlush,Charset charset, OutputStream out) throws UnsupportedEncodingException{
    this(autoFlush, out, charset);
  }
  public PrintStream(OutputStream out) {
    this(out, false);
  }
  public PrintStream(OutputStream out, boolean autoFlush) {
    this(autoFlush, requireNonNull(out, "Null output stream"));
  }
  public PrintStream(OutputStream out,boolean autoFlush, String encoding) throws UnsupportedEncodingException{
    this(autoFlush, requireNonNull(out, "Null output stream"), toCharset(encoding));
  }
  public PrintStream(String fileName) throws FileNotFoundException{
    this(false, new FileOutputStream (fileName));
  }
  public PrintStream(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException{
    this(false, toCharset(csn), new FileOutputStream (fileName));
  }
  public PrintStream(File file) throws FileNotFoundException{
    this(false, new FileOutputStream (file));
  }
  public PrintStream(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException{
    this(false, toCharset(csn), new FileOutputStream (file));
  }
  public void flush( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean checkError( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(int b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(byte buf[],int off, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void print(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void print(char c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void print(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void print(long l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void print(float f) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void print(double d) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void print(char s[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void print(String s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void print(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void println( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void println(boolean x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void println(char x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void println(int x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void println(long x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void println(float x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void println(double x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void println(char x[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void println(String x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void println(Object x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintStream printf(String format, Object ... args) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintStream printf(Locale l,String format, Object ... args) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintStream format(String format, Object ... args) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintStream format(Locale l,String format, Object ... args) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintStream append(CharSequence csq) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintStream append(CharSequence csq,int start, int end) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintStream append(char c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}