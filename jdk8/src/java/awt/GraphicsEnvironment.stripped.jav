package java.awt;

import java.awt.image.BufferedImage;
import java.util.Locale;

public abstract class GraphicsEnvironment {
  protected GraphicsEnvironment( ) {
  }
  public static synchronized GraphicsEnvironment getLocalGraphicsEnvironment( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isHeadless( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isHeadlessInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract GraphicsDevice [] getScreenDevices( ) throws HeadlessException ;
  public abstract GraphicsDevice getDefaultScreenDevice( ) throws HeadlessException ;
  public abstract Graphics2D createGraphics(BufferedImage img) ;
  public abstract Font [] getAllFonts( ) ;
  public abstract String [] getAvailableFontFamilyNames( ) ;
  public abstract String [] getAvailableFontFamilyNames(Locale l) ;
  public boolean registerFont(Font font) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void preferLocaleFonts( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void preferProportionalFonts( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getCenterPoint( ) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getMaximumWindowBounds( ) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}