package java.awt.image.renderable;

import java.util.*;
import java.awt.geom.*;
import java.awt.*;
import java.awt.image.*;

public class RenderContext implements Cloneable {
  public RenderContext(AffineTransform usr2dev,Shape aoi, RenderingHints hints) {
  }
  public RenderContext(AffineTransform usr2dev) {
    this(usr2dev, null, null);
  }
  public RenderContext(AffineTransform usr2dev, RenderingHints hints) {
    this(usr2dev, null, hints);
  }
  public RenderContext(AffineTransform usr2dev, Shape aoi) {
    this(usr2dev, aoi, null);
  }
  public RenderingHints getRenderingHints( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setRenderingHints(RenderingHints hints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTransform(AffineTransform newTransform) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void preConcatenateTransform(AffineTransform modTransform) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void preConcetenateTransform(AffineTransform modTransform) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void concatenateTransform(AffineTransform modTransform) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void concetenateTransform(AffineTransform modTransform) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AffineTransform getTransform( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setAreaOfInterest(Shape newAoi) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape getAreaOfInterest( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}