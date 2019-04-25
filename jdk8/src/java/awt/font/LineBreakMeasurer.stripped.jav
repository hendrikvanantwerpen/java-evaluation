package java.awt.font;

import java.text.BreakIterator;
import java.text.AttributedCharacterIterator;
import java.awt.font.FontRenderContext;

public final class LineBreakMeasurer {
  public LineBreakMeasurer(AttributedCharacterIterator text, FontRenderContext frc) {
    this(text, BreakIterator. getLineInstance( ), frc);
  }
  public LineBreakMeasurer(AttributedCharacterIterator text,BreakIterator breakIter, FontRenderContext frc) {
  }
  public int nextOffset(float wrappingWidth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int nextOffset(float wrappingWidth,int offsetLimit, boolean requireNextWord) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextLayout nextLayout(float wrappingWidth) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextLayout nextLayout(float wrappingWidth,int offsetLimit, boolean requireNextWord) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getPosition( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPosition(int newPosition) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void insertChar(AttributedCharacterIterator newParagraph, int insertPos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void deleteChar(AttributedCharacterIterator newParagraph, int deletePos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}