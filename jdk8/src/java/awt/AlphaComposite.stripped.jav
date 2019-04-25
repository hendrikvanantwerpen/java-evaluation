package java.awt;

import java.awt.image.ColorModel;

public final class AlphaComposite implements Composite {
  public static final int CLEAR;
  public static final int SRC;
  public static final int DST;
  public static final int SRC_OVER;
  public static final int DST_OVER;
  public static final int SRC_IN;
  public static final int DST_IN;
  public static final int SRC_OUT;
  public static final int DST_OUT;
  public static final int SRC_ATOP;
  public static final int DST_ATOP;
  public static final int XOR;
  public static final AlphaComposite Clear;
  public static final AlphaComposite Src;
  public static final AlphaComposite Dst;
  public static final AlphaComposite SrcOver;
  public static final AlphaComposite DstOver;
  public static final AlphaComposite SrcIn;
  public static final AlphaComposite DstIn;
  public static final AlphaComposite SrcOut;
  public static final AlphaComposite DstOut;
  public static final AlphaComposite SrcAtop;
  public static final AlphaComposite DstAtop;
  public static final AlphaComposite Xor;
  private AlphaComposite(int rule) {
    this(rule, 1.0f);
  }
  private AlphaComposite(int rule, float alpha) {
  }
  public static AlphaComposite getInstance(int rule) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AlphaComposite getInstance(int rule, float alpha) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompositeContext createContext(ColorModel srcColorModel,ColorModel dstColorModel, RenderingHints hints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getAlpha( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRule( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AlphaComposite derive(int rule) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AlphaComposite derive(float alpha) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}