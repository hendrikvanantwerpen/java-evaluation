package java.awt;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public final class RadialGradientPaint extends MultipleGradientPaint {
  public RadialGradientPaint(float cx,float cy,float radius,float [] fractions, Color [] colors) {
    this(cx, cy, radius, cx, cy, fractions, colors, CycleMethod.NO_CYCLE);
  }
  public RadialGradientPaint(Point2D center,float radius,float [] fractions, Color [] colors) {
    this(center, radius, center, fractions, colors, CycleMethod.NO_CYCLE);
  }
  public RadialGradientPaint(float cx,float cy,float radius,float [] fractions,Color [] colors, CycleMethod cycleMethod) {
    this(cx, cy, radius, cx, cy, fractions, colors, cycleMethod);
  }
  public RadialGradientPaint(Point2D center,float radius,float [] fractions,Color [] colors, CycleMethod cycleMethod) {
    this(center, radius, center, fractions, colors, cycleMethod);
  }
  public RadialGradientPaint(float cx,float cy,float radius,float fx,float fy,float [] fractions,Color [] colors, CycleMethod cycleMethod) {
    this(new Point2D . Float (cx,cy), radius, new Point2D . Float (fx,fy), fractions, colors, cycleMethod);
  }
  public RadialGradientPaint(Point2D center,float radius,Point2D focus,float [] fractions,Color [] colors, CycleMethod cycleMethod) {
    this(center, radius, focus, fractions, colors, cycleMethod, ColorSpaceType.SRGB, new AffineTransform ( ));
  }
  @ConstructorProperties({"centerPoint","radius","focusPoint","fractions","colors","cycleMethod","colorSpace","transform"}) public RadialGradientPaint(Point2D center,float radius,Point2D focus,float [] fractions,Color [] colors,CycleMethod cycleMethod,ColorSpaceType colorSpace, AffineTransform gradientTransform) {
    super(fractions, colors, cycleMethod, colorSpace, gradientTransform);
  }
  public RadialGradientPaint(Rectangle2D gradientBounds,float [] fractions,Color [] colors, CycleMethod cycleMethod) {
    this(new Point2D . Double (gradientBounds. getCenterX( ),gradientBounds. getCenterY( )), 1.0f, new Point2D . Double (gradientBounds. getCenterX( ),gradientBounds. getCenterY( )), fractions, colors, cycleMethod, ColorSpaceType.SRGB, createGradientTransform(gradientBounds));
  }
  public PaintContext createContext(ColorModel cm,Rectangle deviceBounds,Rectangle2D userBounds,AffineTransform transform, RenderingHints hints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point2D getCenterPoint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point2D getFocusPoint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getRadius( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}