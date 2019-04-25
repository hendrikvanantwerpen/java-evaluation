package java.awt;

import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;
import java.text.CharacterIterator;

public abstract class FontMetrics implements java. io. Serializable {
  protected FontMetrics(Font font) {
  }
  public Font getFont( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FontRenderContext getFontRenderContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getLeading( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getAscent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDescent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getHeight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMaxAscent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMaxDescent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMaxDecent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMaxAdvance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int charWidth(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int charWidth(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int stringWidth(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int charsWidth(char data[],int off, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int bytesWidth(byte data[],int off, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getWidths( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasUniformLineMetrics( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LineMetrics getLineMetrics(String str, Graphics context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LineMetrics getLineMetrics(String str,int beginIndex,int limit, Graphics context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LineMetrics getLineMetrics(char [] chars,int beginIndex,int limit, Graphics context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LineMetrics getLineMetrics(CharacterIterator ci,int beginIndex,int limit, Graphics context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getStringBounds(String str, Graphics context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getStringBounds(String str,int beginIndex,int limit, Graphics context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getStringBounds(char [] chars,int beginIndex,int limit, Graphics context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getStringBounds(CharacterIterator ci,int beginIndex,int limit, Graphics context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getMaxCharBounds(Graphics context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}