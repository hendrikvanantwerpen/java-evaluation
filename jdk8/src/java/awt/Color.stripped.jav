package java.awt;

import java.awt.image.ColorModel;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.color.ColorSpace;

public class Color implements Paint, java. io. Serializable {
  public final static Color white;
  public final static Color WHITE;
  public final static Color lightGray;
  public final static Color LIGHT_GRAY;
  public final static Color gray;
  public final static Color GRAY;
  public final static Color darkGray;
  public final static Color DARK_GRAY;
  public final static Color black;
  public final static Color BLACK;
  public final static Color red;
  public final static Color RED;
  public final static Color pink;
  public final static Color PINK;
  public final static Color orange;
  public final static Color ORANGE;
  public final static Color yellow;
  public final static Color YELLOW;
  public final static Color green;
  public final static Color GREEN;
  public final static Color magenta;
  public final static Color MAGENTA;
  public final static Color cyan;
  public final static Color CYAN;
  public final static Color blue;
  public final static Color BLUE;
  public Color(int r,int g, int b) {
    this(r, g, b, 255);
  }
  @ConstructorProperties({"red","green","blue","alpha"}) public Color(int r,int g,int b, int a) {
  }
  public Color(int rgb) {
  }
  public Color(int rgba, boolean hasalpha) {
  }
  public Color(float r,float g, float b) {
    this((int) (r * 255 + 0.5), (int) (g * 255 + 0.5), (int) (b * 255 + 0.5));
  }
  public Color(float r,float g,float b, float a) {
    this((int) (r * 255 + 0.5), (int) (g * 255 + 0.5), (int) (b * 255 + 0.5), (int) (a * 255 + 0.5));
  }
  public Color(ColorSpace cspace,float components[], float alpha) {
  }
  public int getRed( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getGreen( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getBlue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getAlpha( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRGB( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Color brighter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Color darker( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Color decode(String nm) throws NumberFormatException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Color getColor(String nm) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Color getColor(String nm, Color v) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Color getColor(String nm, int v) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int HSBtoRGB(float hue,float saturation, float brightness) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static float [] RGBtoHSB(int r,int g,int b, float [] hsbvals) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Color getHSBColor(float h,float s, float b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getRGBComponents(float [] compArray) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getRGBColorComponents(float [] compArray) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getComponents(float [] compArray) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getColorComponents(float [] compArray) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getComponents(ColorSpace cspace, float [] compArray) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getColorComponents(ColorSpace cspace, float [] compArray) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ColorSpace getColorSpace( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized PaintContext createContext(ColorModel cm,Rectangle r,Rectangle2D r2d,AffineTransform xform, RenderingHints hints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTransparency( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}