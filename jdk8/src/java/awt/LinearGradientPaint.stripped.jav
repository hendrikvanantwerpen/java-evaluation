package java.awt;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public final class LinearGradientPaint extends MultipleGradientPaint {
  public LinearGradientPaint(float startX,float startY,float endX,float endY,float [] fractions, Color [] colors) {
    this(new Point2D . Float (startX,startY), new Point2D . Float (endX,endY), fractions, colors, CycleMethod.NO_CYCLE);
  }
  public LinearGradientPaint(float startX,float startY,float endX,float endY,float [] fractions,Color [] colors, CycleMethod cycleMethod) {
    this(new Point2D . Float (startX,startY), new Point2D . Float (endX,endY), fractions, colors, cycleMethod);
  }
  public LinearGradientPaint(Point2D start,Point2D end,float [] fractions, Color [] colors) {
    this(start, end, fractions, colors, CycleMethod.NO_CYCLE);
  }
  public LinearGradientPaint(Point2D start,Point2D end,float [] fractions,Color [] colors, CycleMethod cycleMethod) {
    this(start, end, fractions, colors, cycleMethod, ColorSpaceType.SRGB, new AffineTransform ( ));
  }
  @ConstructorProperties({"startPoint","endPoint","fractions","colors","cycleMethod","colorSpace","transform"}) public LinearGradientPaint(Point2D start,Point2D end,float [] fractions,Color [] colors,CycleMethod cycleMethod,ColorSpaceType colorSpace, AffineTransform gradientTransform) {
    super(fractions, colors, cycleMethod, colorSpace, gradientTransform);
  }
  public PaintContext createContext(ColorModel cm,Rectangle deviceBounds,Rectangle2D userBounds,AffineTransform transform, RenderingHints hints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point2D getStartPoint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point2D getEndPoint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}