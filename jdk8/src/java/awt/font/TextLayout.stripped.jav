package java.awt.font;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.text.AttributedCharacterIterator;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Map;

public final class TextLayout implements Cloneable {
  public static class CaretPolicy {
    public CaretPolicy( ) {
    }
    public TextHitInfo getStrongCaret(TextHitInfo hit1,TextHitInfo hit2, TextLayout layout) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static final CaretPolicy DEFAULT_CARET_POLICY;
  public TextLayout(String string,Font font, FontRenderContext frc) {
  }
  public TextLayout(String string,Map<? extends Attribute, ?> attributes, FontRenderContext frc) {
  }
  public TextLayout(AttributedCharacterIterator text, FontRenderContext frc) {
  }
  TextLayout(TextLine textLine,byte baseline,float [] baselineOffsets, float justifyRatio) {
  }
  public TextLayout getJustifiedLayout(float justificationWidth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte getBaseline( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getBaselineOffsets( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getAdvance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getVisibleAdvance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getAscent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getDescent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getLeading( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getPixelBounds(FontRenderContext frc,float x, float y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLeftToRight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isVertical( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getCharacterCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getCaretInfo(TextHitInfo hit, Rectangle2D bounds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getCaretInfo(TextHitInfo hit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextHitInfo getNextRightHit(TextHitInfo hit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextHitInfo getNextRightHit(int offset, CaretPolicy policy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextHitInfo getNextRightHit(int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextHitInfo getNextLeftHit(TextHitInfo hit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextHitInfo getNextLeftHit(int offset, CaretPolicy policy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextHitInfo getNextLeftHit(int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextHitInfo getVisualOtherHit(TextHitInfo hit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape getCaretShape(TextHitInfo hit, Rectangle2D bounds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape getCaretShape(TextHitInfo hit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte getCharacterLevel(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape [] getCaretShapes(int offset,Rectangle2D bounds, CaretPolicy policy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape [] getCaretShapes(int offset, Rectangle2D bounds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape [] getCaretShapes(int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getLogicalRangesForVisualSelection(TextHitInfo firstEndpoint, TextHitInfo secondEndpoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape getVisualHighlightShape(TextHitInfo firstEndpoint,TextHitInfo secondEndpoint, Rectangle2D bounds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape getVisualHighlightShape(TextHitInfo firstEndpoint, TextHitInfo secondEndpoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape getLogicalHighlightShape(int firstEndpoint,int secondEndpoint, Rectangle2D bounds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape getLogicalHighlightShape(int firstEndpoint, int secondEndpoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape getBlackBoxBounds(int firstEndpoint, int secondEndpoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextHitInfo hitTestChar(float x,float y, Rectangle2D bounds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextHitInfo hitTestChar(float x, float y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(TextLayout rhs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void draw(Graphics2D g2,float x, float y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape getOutline(AffineTransform tx) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LayoutPath getLayoutPath( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void hitToPoint(TextHitInfo hit, Point2D point) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}