package java.awt;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;

public class GradientPaint implements Paint {
  public GradientPaint(float x1,float y1,Color color1,float x2,float y2, Color color2) {
  }
  public GradientPaint(Point2D pt1,Color color1,Point2D pt2, Color color2) {
  }
  public GradientPaint(float x1,float y1,Color color1,float x2,float y2,Color color2, boolean cyclic) {
    this(x1, y1, color1, x2, y2, color2);
  }
  @ConstructorProperties({"point1","color1","point2","color2","cyclic"}) public GradientPaint(Point2D pt1,Color color1,Point2D pt2,Color color2, boolean cyclic) {
    this(pt1, color1, pt2, color2);
  }
  public Point2D getPoint1( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Color getColor1( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point2D getPoint2( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Color getColor2( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCyclic( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PaintContext createContext(ColorModel cm,Rectangle deviceBounds,Rectangle2D userBounds,AffineTransform xform, RenderingHints hints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTransparency( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}