package java.io;

import java.util.Locale;
import java.nio.charset.Charset;

public class PrintWriter extends Writer {
  public PrintWriter(Writer out) {
    this(out, false);
  }
  public PrintWriter(Writer out, boolean autoFlush) {
    super(out);
  }
  public PrintWriter(OutputStream out) {
    this(out, false);
  }
  public PrintWriter(OutputStream out, boolean autoFlush) {
    this(new BufferedWriter (new OutputStreamWriter (out)), autoFlush);
  }
  public PrintWriter(String fileName) throws FileNotFoundException{
    this(new BufferedWriter (new OutputStreamWriter (new FileOutputStream (fileName))), false);
  }
  private PrintWriter(Charset charset, File file) throws FileNotFoundException{
    this(new BufferedWriter (new OutputStreamWriter (new FileOutputStream (file),charset)), false);
  }
  public PrintWriter(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException{
    this(toCharset(csn), new File (fileName));
  }
  public PrintWriter(File file) throws FileNotFoundException{
    this(new BufferedWriter (new OutputStreamWriter (new FileOutputStream (file))), false);
  }
  public PrintWriter(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException{
    this(toCharset(csn), file);
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
  public void write(int c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(char buf[],int off, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(char buf[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(String s,int off, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(String s) {
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
  public PrintWriter printf(String format, Object ... args) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintWriter printf(Locale l,String format, Object ... args) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintWriter format(String format, Object ... args) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintWriter format(Locale l,String format, Object ... args) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintWriter append(CharSequence csq) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintWriter append(CharSequence csq,int start, int end) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintWriter append(char c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}