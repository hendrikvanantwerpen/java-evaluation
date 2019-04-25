package java.awt;


public class BasicStroke implements Stroke {
  public final static int JOIN_MITER;
  public final static int JOIN_ROUND;
  public final static int JOIN_BEVEL;
  public final static int CAP_BUTT;
  public final static int CAP_ROUND;
  public final static int CAP_SQUARE;
  @ConstructorProperties({"lineWidth","endCap","lineJoin","miterLimit","dashArray","dashPhase"}) public BasicStroke(float width,int cap,int join,float miterlimit,float dash[], float dash_phase) {
  }
  public BasicStroke(float width,int cap,int join, float miterlimit) {
    this(width, cap, join, miterlimit, null, 0.0f);
  }
  public BasicStroke(float width,int cap, int join) {
    this(width, cap, join, 10.0f, null, 0.0f);
  }
  public BasicStroke(float width) {
    this(width, CAP_SQUARE, JOIN_MITER, 10.0f, null, 0.0f);
  }
  public BasicStroke( ) {
    this(1.0f, CAP_SQUARE, JOIN_MITER, 10.0f, null, 0.0f);
  }
  public Shape createStrokedShape(Shape s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getLineWidth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getEndCap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getLineJoin( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getMiterLimit( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getDashArray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getDashPhase( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}