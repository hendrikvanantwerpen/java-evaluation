package java.awt;

import java.awt.geom.AffineTransform;

public abstract class MultipleGradientPaint implements Paint {
  public static enum CycleMethod {
    NO_CYCLE, REFLECT, REPEAT
  }
  public static enum ColorSpaceType {
    SRGB, LINEAR_RGB
  }
  MultipleGradientPaint(float [] fractions,Color [] colors,CycleMethod cycleMethod,ColorSpaceType colorSpace, AffineTransform gradientTransform) {
  }
  public final float [] getFractions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Color [] getColors( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final CycleMethod getCycleMethod( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final ColorSpaceType getColorSpace( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final AffineTransform getTransform( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getTransparency( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}