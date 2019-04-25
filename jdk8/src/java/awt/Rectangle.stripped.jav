package java.awt;

import java.awt.geom.Rectangle2D;

public class Rectangle extends Rectangle2D implements Shape, java. io. Serializable {
  public int x;
  public int y;
  public int width;
  public int height;
  public Rectangle( ) {
    this(0, 0, 0, 0);
  }
  public Rectangle(Rectangle r) {
    this(r.x, r.y, r.width, r.height);
  }
  public Rectangle(int x,int y,int width, int height) {
  }
  public Rectangle(int width, int height) {
    this(0, 0, width, height);
  }
  public Rectangle(Point p, Dimension d) {
    this(p.x, p.y, d.width, d.height);
  }
  public Rectangle(Point p) {
    this(p.x, p.y, 0, 0);
  }
  public Rectangle(Dimension d) {
    this(0, 0, d.width, d.height);
  }
  public double getX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getWidth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getHeight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getBounds2D( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBounds(Rectangle r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBounds(int x,int y,int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setRect(double x,double y,double width, double height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reshape(int x,int y,int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getLocation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLocation(Point p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLocation(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void move(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void translate(int dx, int dy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSize(Dimension d) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSize(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void resize(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Point p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Rectangle r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(int X,int Y,int W, int H) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean inside(int X, int Y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean intersects(Rectangle r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle intersection(Rectangle r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle union(Rectangle r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(int newx, int newy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(Point pt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(Rectangle r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void grow(int h, int v) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEmpty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int outcode(double x, double y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D createIntersection(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D createUnion(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}