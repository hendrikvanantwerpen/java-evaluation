package java.awt;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public abstract class Graphics {
  protected Graphics( ) {
  }
  public abstract Graphics create( ) ;
  public Graphics create(int x,int y,int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void translate(int x, int y) ;
  public abstract Color getColor( ) ;
  public abstract void setColor(Color c) ;
  public abstract void setPaintMode( ) ;
  public abstract void setXORMode(Color c1) ;
  public abstract Font getFont( ) ;
  public abstract void setFont(Font font) ;
  public FontMetrics getFontMetrics( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract FontMetrics getFontMetrics(Font f) ;
  public abstract Rectangle getClipBounds( ) ;
  public abstract void clipRect(int x,int y,int width, int height) ;
  public abstract void setClip(int x,int y,int width, int height) ;
  public abstract Shape getClip( ) ;
  public abstract void setClip(Shape clip) ;
  public abstract void copyArea(int x,int y,int width,int height,int dx, int dy) ;
  public abstract void drawLine(int x1,int y1,int x2, int y2) ;
  public abstract void fillRect(int x,int y,int width, int height) ;
  public void drawRect(int x,int y,int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void clearRect(int x,int y,int width, int height) ;
  public abstract void drawRoundRect(int x,int y,int width,int height,int arcWidth, int arcHeight) ;
  public abstract void fillRoundRect(int x,int y,int width,int height,int arcWidth, int arcHeight) ;
  public void draw3DRect(int x,int y,int width,int height, boolean raised) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void fill3DRect(int x,int y,int width,int height, boolean raised) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void drawOval(int x,int y,int width, int height) ;
  public abstract void fillOval(int x,int y,int width, int height) ;
  public abstract void drawArc(int x,int y,int width,int height,int startAngle, int arcAngle) ;
  public abstract void fillArc(int x,int y,int width,int height,int startAngle, int arcAngle) ;
  public abstract void drawPolyline(int xPoints[],int yPoints[], int nPoints) ;
  public abstract void drawPolygon(int xPoints[],int yPoints[], int nPoints) ;
  public void drawPolygon(Polygon p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void fillPolygon(int xPoints[],int yPoints[], int nPoints) ;
  public void fillPolygon(Polygon p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void drawString(String str,int x, int y) ;
  public abstract void drawString(AttributedCharacterIterator iterator,int x, int y) ;
  public void drawChars(char data[],int offset,int length,int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void drawBytes(byte data[],int offset,int length,int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract boolean drawImage(Image img,int x,int y, ImageObserver observer) ;
  public abstract boolean drawImage(Image img,int x,int y,int width,int height, ImageObserver observer) ;
  public abstract boolean drawImage(Image img,int x,int y,Color bgcolor, ImageObserver observer) ;
  public abstract boolean drawImage(Image img,int x,int y,int width,int height,Color bgcolor, ImageObserver observer) ;
  public abstract boolean drawImage(Image img,int dx1,int dy1,int dx2,int dy2,int sx1,int sy1,int sx2,int sy2, ImageObserver observer) ;
  public abstract boolean drawImage(Image img,int dx1,int dy1,int dx2,int dy2,int sx1,int sy1,int sx2,int sy2,Color bgcolor, ImageObserver observer) ;
  public abstract void dispose( ) ;
  public void finalize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getClipRect( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hitClip(int x,int y,int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getClipBounds(Rectangle r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}