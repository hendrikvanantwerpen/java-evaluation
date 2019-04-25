package java.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class Formatter implements Closeable, Flushable {
  private Formatter(Locale l, Appendable a) {
  }
  private Formatter(Charset charset,Locale l, File file) throws FileNotFoundException{
    this(l, new BufferedWriter (new OutputStreamWriter (new FileOutputStream (file),charset)));
  }
  public Formatter( ) {
    this(Locale. getDefault(Locale.Category.FORMAT), new StringBuilder ( ));
  }
  public Formatter(Appendable a) {
    this(Locale. getDefault(Locale.Category.FORMAT), nonNullAppendable(a));
  }
  public Formatter(Locale l) {
    this(l, new StringBuilder ( ));
  }
  public Formatter(Appendable a, Locale l) {
    this(l, nonNullAppendable(a));
  }
  public Formatter(String fileName) throws FileNotFoundException{
    this(Locale. getDefault(Locale.Category.FORMAT), new BufferedWriter (new OutputStreamWriter (new FileOutputStream (fileName))));
  }
  public Formatter(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException{
    this(fileName, csn, Locale. getDefault(Locale.Category.FORMAT));
  }
  public Formatter(String fileName,String csn, Locale l) throws FileNotFoundException, UnsupportedEncodingException{
    this(toCharset(csn), l, new File (fileName));
  }
  public Formatter(File file) throws FileNotFoundException{
    this(Locale. getDefault(Locale.Category.FORMAT), new BufferedWriter (new OutputStreamWriter (new FileOutputStream (file))));
  }
  public Formatter(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException{
    this(file, csn, Locale. getDefault(Locale.Category.FORMAT));
  }
  public Formatter(File file,String csn, Locale l) throws FileNotFoundException, UnsupportedEncodingException{
    this(toCharset(csn), l, file);
  }
  public Formatter(PrintStream ps) {
    this(Locale. getDefault(Locale.Category.FORMAT), (Appendable ) Objects. requireNonNull(ps));
  }
  public Formatter(OutputStream os) {
    this(Locale. getDefault(Locale.Category.FORMAT), new BufferedWriter (new OutputStreamWriter (os)));
  }
  public Formatter(OutputStream os, String csn) throws UnsupportedEncodingException{
    this(os, csn, Locale. getDefault(Locale.Category.FORMAT));
  }
  public Formatter(OutputStream os,String csn, Locale l) throws UnsupportedEncodingException{
    this(l, new BufferedWriter (new OutputStreamWriter (os,csn)));
  }
  public Locale locale( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Appendable out( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void flush( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public IOException ioException( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter format(String format, Object ... args) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Formatter format(Locale l,String format, Object ... args) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public enum BigDecimalLayoutForm {
    SCIENTIFIC, DECIMAL_FLOAT
  }
  ;
}