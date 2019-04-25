package java.awt.geom;

import java.awt.Shape;

public class AffineTransform implements Cloneable, java. io. Serializable {
  public static final int TYPE_IDENTITY;
  public static final int TYPE_TRANSLATION;
  public static final int TYPE_UNIFORM_SCALE;
  public static final int TYPE_GENERAL_SCALE;
  public static final int TYPE_MASK_SCALE;
  public static final int TYPE_FLIP;
  public static final int TYPE_QUADRANT_ROTATION;
  public static final int TYPE_GENERAL_ROTATION;
  public static final int TYPE_MASK_ROTATION;
  public static final int TYPE_GENERAL_TRANSFORM;
  private AffineTransform(double m00,double m10,double m01,double m11,double m02,double m12, int state) {
  }
  public AffineTransform( ) {
  }
  public AffineTransform(AffineTransform Tx) {
  }
  @ConstructorProperties({"scaleX","shearY","shearX","scaleY","translateX","translateY"}) public AffineTransform(float m00,float m10,float m01,float m11,float m02, float m12) {
  }
  public AffineTransform(float [] flatmatrix) {
  }
  public AffineTransform(double m00,double m10,double m01,double m11,double m02, double m12) {
  }
  public AffineTransform(double [] flatmatrix) {
  }
  public static AffineTransform getTranslateInstance(double tx, double ty) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AffineTransform getRotateInstance(double theta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AffineTransform getRotateInstance(double theta,double anchorx, double anchory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AffineTransform getRotateInstance(double vecx, double vecy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AffineTransform getRotateInstance(double vecx,double vecy,double anchorx, double anchory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AffineTransform getQuadrantRotateInstance(int numquadrants) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AffineTransform getQuadrantRotateInstance(int numquadrants,double anchorx, double anchory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AffineTransform getScaleInstance(double sx, double sy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AffineTransform getShearInstance(double shx, double shy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getDeterminant( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void getMatrix(double [] flatmatrix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getScaleX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getScaleY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getShearX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getShearY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getTranslateX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getTranslateY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void translate(double tx, double ty) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void rotate(double theta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void rotate(double theta,double anchorx, double anchory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void rotate(double vecx, double vecy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void rotate(double vecx,double vecy,double anchorx, double anchory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void quadrantRotate(int numquadrants) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void quadrantRotate(int numquadrants,double anchorx, double anchory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void scale(double sx, double sy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void shear(double shx, double shy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setToIdentity( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setToTranslation(double tx, double ty) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setToRotation(double theta) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setToRotation(double theta,double anchorx, double anchory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setToRotation(double vecx, double vecy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setToRotation(double vecx,double vecy,double anchorx, double anchory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setToQuadrantRotation(int numquadrants) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setToQuadrantRotation(int numquadrants,double anchorx, double anchory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setToScale(double sx, double sy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setToShear(double shx, double shy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTransform(AffineTransform Tx) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTransform(double m00,double m10,double m01,double m11,double m02, double m12) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void concatenate(AffineTransform Tx) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void preConcatenate(AffineTransform Tx) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AffineTransform createInverse( ) throws NoninvertibleTransformException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void invert( ) throws NoninvertibleTransformException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point2D transform(Point2D ptSrc, Point2D ptDst) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void transform(Point2D [] ptSrc,int srcOff,Point2D [] ptDst,int dstOff, int numPts) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void transform(float [] srcPts,int srcOff,float [] dstPts,int dstOff, int numPts) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void transform(double [] srcPts,int srcOff,double [] dstPts,int dstOff, int numPts) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void transform(float [] srcPts,int srcOff,double [] dstPts,int dstOff, int numPts) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void transform(double [] srcPts,int srcOff,float [] dstPts,int dstOff, int numPts) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point2D inverseTransform(Point2D ptSrc, Point2D ptDst) throws NoninvertibleTransformException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void inverseTransform(double [] srcPts,int srcOff,double [] dstPts,int dstOff, int numPts) throws NoninvertibleTransformException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point2D deltaTransform(Point2D ptSrc, Point2D ptDst) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void deltaTransform(double [] srcPts,int srcOff,double [] dstPts,int dstOff, int numPts) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape createTransformedShape(Shape pSrc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isIdentity( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}