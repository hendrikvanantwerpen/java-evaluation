package java.awt.geom;

import java.util.*;

public class FlatteningPathIterator implements PathIterator {
  public FlatteningPathIterator(PathIterator src, double flatness) {
    this(src, flatness, 10);
  }
  public FlatteningPathIterator(PathIterator src,double flatness, int limit) {
  }
  public double getFlatness( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRecursionLimit( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getWindingRule( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void next( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int currentSegment(float [] coords) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int currentSegment(double [] coords) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}